package com.gabrielgarcia.autosystem.model.interfaces;

/**
 * Interface que define ações comuns a qualquer veículo.
 * <p>
 * Fornece métodos para acelerar, frear, parar e estacionar.
 * Deve ser implementada por qualquer classe que represente um veículo.
 * </p>
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public interface Actions extends Informations {
    String speedUp();
    String brake();
    String stop();
    String park();
}
