package com.gabrielgarcia.autosystem.model.vehicle;

import com.gabrielgarcia.autosystem.model.enums.Type;

/**
 * Classe concreta que representa um carro no sistema AutoSystem.
 * <p>
 * Herda a maior parte do comportamento da classe {@link Auto} e adiciona suporte a um {@link AutoTrunk}.
 * </p>
 *
 * @param <T> Tipo do item armazenado no porta-malas
 * @param <V> Tipo da quantidade do item
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public class Car<T, V> extends Auto {
    private AutoTrunk<T, V> trunk;

    public Car(String model, int year, String engine, double price, AutoTrunk<T, V> trunk) {
        super(Type.CAR, model, year, engine, price);
        this.trunk = trunk;
    }

    public void showCarTrunk() {
        trunk.showTrunk();
    }
}
