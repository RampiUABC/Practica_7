package org.example;

import java.util.ArrayList;

/**
 * Clase principal que contiene el método main para probar la jerarquía
 * de clases y demostrar el polimorfismo en acción.
 * * @author Ramiro Maldonado Mandujano
 * @matricula 1184001
 */
public class SistemaMonitoreo {

    /**
     * Método principal que ejecuta la lógica del Sistema de Monitoreo.
     * Crea un contenedor polimórfico, instancia diferentes tipos de sensores
     * y ejecuta sus métodos para demostrar la herencia y especialización.
     * * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // 1. Contenedor polimórfico que almacena referencias de tipo Sensor
        ArrayList<Sensor> listaSensores = new ArrayList<>();

        // 2. Instanciación de al menos dos objetos de cada tipo de sensor
        listaSensores.add(new SensorTemperatura("TEMP-X1", "TermoTech", 1.5));
        listaSensores.add(new SensorTemperatura("TEMP-X2", "TermoTech", 1.5));

        listaSensores.add(new SensorPresion("PRES-100", "AeroSense", 2.0));
        listaSensores.add(new SensorPresion("PRES-200", "AeroSense", 2.2));

        listaSensores.add(new SensorAceleracion("ACCEL-A", "MotionInc", 3.5));
        listaSensores.add(new SensorAceleracion("ACCEL-B", "MotionInc", 3.5));

        System.out.println("--- INICIANDO SISTEMA DE MONITOREO ---\n");

        // 3 y 4. Polimorfismo en Acción: Iteración sobre la lista de sensores
        for (Sensor sensor : listaSensores) {
            System.out.println("Dispositivo: " + sensor.obtenerEstado());

            sensor.encender();  // Invocación de método de la clase base DispositivoElectronico
            sensor.calibrar();  // Invocación de método de la clase abstracta Sensor

            // Invocación de método polimórfico (se ejecuta la versión de la subclase correspondiente)
            double lectura = sensor.leerValor();

            // Despliegue del resultado final con su respectiva unidad de medida
            System.out.printf(">> Resultado Final: %.2f %s\n", lectura, sensor.unidadMedida);
            System.out.println("--------------------------------------------------");
        }
    }
}
