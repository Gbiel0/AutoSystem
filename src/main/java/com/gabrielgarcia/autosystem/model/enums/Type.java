package com.gabrielgarcia.autosystem.model.enums;

/**
 * Enumeração que representa os tipos de veículos disponíveis no sistema AutoSystem.
 * <p>
 * Cada constante possui um rótulo legível, que pode ser usado em mensagens ou logs.
 * </p>
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public enum Type {
    CAR("Car"),
    MOTORCYCLE("Motorcycle"),
    TRUCK("Truck");

    private final String label;

    Type(String label) {
        if(label == null || label.isBlank()) {
            throw new IllegalArgumentException("The label cannot be null or blank");
        }

        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
