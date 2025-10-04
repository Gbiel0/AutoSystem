package com.gabrielgarcia.autosystem.model.vehicle;

import com.gabrielgarcia.autosystem.model.enums.Type;

/**
 * Classe concreta que representa uma motocicleta no sistema AutoSystem.
 * <p>
 * Herda os comportamentos padrões de {@link Auto}.
 * Diferentemente de {@link Car} ou {@link Truck}, não possui porta-malas.
 * </p>
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public class Motorcycle extends Auto {
    public Motorcycle(String model, int year, String engine, double price) {
        super(Type.MOTORCYCLE, model, year, engine, price);
    }
}
