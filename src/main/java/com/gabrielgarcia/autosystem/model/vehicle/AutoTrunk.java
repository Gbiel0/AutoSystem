package com.gabrielgarcia.autosystem.model.vehicle;

/**
 * Classe genérica que representa o porta-malas de um veículo.
 * <p>
 * Pode armazenar qualquer tipo de objeto e quantidade.
 * Fornece métodos para adicionar, alterar ou exibir itens do porta-malas.
 * </p>
 *
 * @param <T> Tipo do item armazenado no porta-malas
 * @param <V> Tipo da quantidade do item
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public class AutoTrunk<T, V> {
    private T thing;
    private V qtt;

    public AutoTrunk(T thing, V qtt) {
        this.thing = thing;
        this.qtt = qtt;
    }

    public T getTrunk() {
        return thing;
    }

    public V getUnity() {
        return qtt;
    }

    public void putInTrunk(T thing_init) {
        this.thing = thing_init;
    }

    public void putQtt(V qtt_init) {
        this.qtt = qtt_init;
    }

    public void showTrunk() {
        System.out.println("The trunk has " + getUnity() + " " + getTrunk() + " .");
    }
}
