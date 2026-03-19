package org.example;

import java.util.Random;

/**
 * Clase concreta que representa un sensor de aceleración en 3 ejes.
 * Hereda de la clase Sensor y calcula la magnitud de la aceleración.
 * * @author Ramiro Maldonado Mandujano
 * @matricula 1184001
 */
public class SensorAceleracion extends Sensor {
    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    /**
     * Constructor para inicializar un Sensor de Aceleración.
     * Asigna automáticamente "m/s^2" como unidad de medida.
     * * @param modelo Identificador del modelo.
     * @param fabricante Nombre del fabricante.
     * @param consumoEnergia Consumo en vatios (W).
     */
    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    /**
     * Simula la lectura en los 3 ejes (X, Y, Z) generando valores aleatorios,
     * los imprime en consola y retorna la magnitud del vector de aceleración.
     * * @return La magnitud de la aceleración calculada como la raíz cuadrada
     * de la suma de los cuadrados de los tres ejes.
     */
    @Override
    public double leerValor() {
        System.out.println("Leyendo aceleración en 3 ejes...");
        Random rand = new Random();

        // Simula valores entre -10.0 y 10.0 para cada eje
        this.valorEjeX = -10.0 + 20.0 * rand.nextDouble();
        this.valorEjeY = -10.0 + 20.0 * rand.nextDouble();
        this.valorEjeZ = -10.0 + 20.0 * rand.nextDouble();

        System.out.printf("   Eje X: %.2f | Eje Y: %.2f | Eje Z: %.2f%n", valorEjeX, valorEjeY, valorEjeZ);

        return Math.sqrt(Math.pow(valorEjeX, 2) + Math.pow(valorEjeY, 2) + Math.pow(valorEjeZ, 2));
    }
}