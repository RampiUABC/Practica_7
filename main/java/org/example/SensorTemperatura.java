package org.example;

import java.util.Random;

/**
 * Clase concreta que representa un sensor de temperatura.
 * Hereda de la clase Sensor e implementa su propia lógica de medición.
 * * @author Ramiro Maldonado Mandujano
 * @matricula 1184001
 */
public class SensorTemperatura extends Sensor {
    private double valorActual;

    /**
     * Constructor para inicializar un Sensor de Temperatura.
     * Asigna automáticamente "°C" como unidad de medida.
     * * @param modelo Identificador del modelo.
     * @param fabricante Nombre del fabricante.
     * @param consumoEnergia Consumo en vatios (W).
     */
    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
    }

    /**
     * Genera e imprime un mensaje de lectura simulada y retorna un valor
     * aleatorio entre 20.0 y 35.0 para simular la medición de temperatura.
     * * @return Valor simulado de la temperatura actual.
     */
    @Override
    public double leerValor() {
        System.out.print("Leyendo temperatura... ");
        Random rand = new Random();
        this.valorActual = 20.0 + (35.0 - 20.0) * rand.nextDouble();
        return this.valorActual;
    }
}
