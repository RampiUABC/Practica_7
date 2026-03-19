package org.example;

/**
 * Clase abstracta que hereda de DispositivoElectronico. Representa un sensor
 * genérico en el sistema. Al ser abstracta, no puede ser instanciada directamente
 * y requiere que sus subclases definan la función de medición concreta.
 * * @author Ramiro Maldonado Mandujano
 * @matricula 1184001
 */
public abstract class Sensor extends DispositivoElectronico {
    protected String unidadMedida;
    protected boolean estaCalibrado;

    /**
     * Constructor que llama al constructor de la clase base (super) e
     * inicializa los nuevos atributos específicos del sensor.
     * * @param modelo Identificador del modelo.
     * @param fabricante Nombre del fabricante.
     * @param consumoEnergia Consumo en vatios (W).
     * @param unidadMedida Unidad de la medición (ej: "°C", "Pa", "m/s^2").
     */
    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    /**
     * Simula el proceso de calibración del sensor. Imprime un mensaje en
     * consola y establece el atributo estaCalibrado a true.
     */
    public void calibrar() {
        this.estaCalibrado = true;
        System.out.println("Calibrando sensor " + modelo + "... ¡Calibración exitosa!");
    }

    /**
     * Método abstracto que define la operación clave que toda subclase
     * de Sensor debe implementar de forma obligatoria.
     * * @return Un valor de tipo double que representa la lectura del sensor.
     */
    public abstract double leerValor();
}
