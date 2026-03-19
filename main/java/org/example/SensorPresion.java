package org.example;

import java.util.Random;

/**
 * Clase concreta que representa un sensor de presión atmosférica.
 * Hereda de la clase Sensor e implementa su propia lógica de medición.
 * * @author Ramiro Maldonado Mandujano
 * @matricula 1184001
 */
public class SensorPresion extends Sensor {
    private double valorActual;

    /**
     * Constructor para inicializar un Sensor de Presión.
     * Asigna automáticamente "hPa" como unidad de medida.
     * * @param modelo Identificador del modelo.
     * @param fabricante Nombre del fabricante.
     * @param consumoEnergia Consumo en vatios (W).
     */
    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    /**
     * Genera e imprime un mensaje de lectura simulada y retorna un valor
     * aleatorio entre 900.0 y 1100.0 para simular la presión atmosférica.
     * * @return Valor simulado de la presión actual en hPa.
     */
    @Override
    public double leerValor() {
        System.out.print("Leyendo presión atmosférica... ");
        Random rand = new Random();
        this.valorActual = 900.0 + (1100.0 - 900.0) * rand.nextDouble();
        return this.valorActual;
    }
}