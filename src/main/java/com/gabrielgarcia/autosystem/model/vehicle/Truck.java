package com.gabrielgarcia.autosystem.model.vehicle;

import com.gabrielgarcia.autosystem.model.enums.Type;

/**
 * Classe concreta que representa um caminhão no sistema AutoSystem.
 * <p>
 * Herda os comportamentos padrões de {@link Auto} e adiciona suporte a um {@link AutoTrunk}.
 * </p>
 *
 * @param <T> Tipo do item armazenado no porta-malas
 * @param <V> Tipo da quantidade do item
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public class Truck<T, V> extends Auto {
    private AutoTrunk<T, V> trunk;

    public Truck(String model, int year, String engine, double price, AutoTrunk<T, V> trunk) {
        super(Type.TRUCK, model, year, engine, price);
        this.trunk = trunk;
    }

    public void showTruckTrunk() {
        trunk.showTrunk();
    }
}
