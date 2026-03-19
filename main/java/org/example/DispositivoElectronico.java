package org.example;

/**
 * Clase base que modela los atributos y comportamientos genéricos de
 * cualquier componente del Sistema de Monitoreo de Hardware Distribuido.
 * * @author Ramiro Maldonado Mandujano
 * @matricula 1184001
 */
public class DispositivoElectronico {
    protected String modelo;
    protected String fabricante;
    protected double consumoEnergia;
    protected boolean encendido;

    /**
     * Constructor que inicializa todos los atributos del dispositivo.
     * Por defecto, el dispositivo se inicializa apagado.
     * * @param modelo Identificador del modelo (ej: "DTH11").
     * @param fabricante Nombre del fabricante.
     * @param consumoEnergia Consumo en vatios (W).
     */
    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    /**
     * Imprime un mensaje y establece el estado del dispositivo a encendido (true).
     */
    public void encender() {
        this.encendido = true;
        System.out.println(modelo + " ha sido encendido.");
    }

    /**
     * Imprime un mensaje y establece el estado del dispositivo a apagado (false).
     */
    public void apagar() {
        this.encendido = false;
        System.out.println(modelo + " ha sido apagado.");
    }

    /**
     * Retorna la información básica del dispositivo y su estado actual.
     * * @return String con modelo, fabricante y estado (encendido/apagado).
     */
    public String obtenerEstado() {
        String estado = encendido ? "Encendido" : "Apagado";
        return "Modelo: " + modelo + " | Fabricante: " + fabricante + " | Estado: " + estado;
    }
}

