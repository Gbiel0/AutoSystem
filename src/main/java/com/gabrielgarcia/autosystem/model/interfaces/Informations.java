package com.gabrielgarcia.autosystem.model.interfaces;

import com.gabrielgarcia.autosystem.model.enums.Type;

/**
 * Interface que define informações básicas de um veículo.
 * <p>
 * Contém métodos para obter tipo, modelo, motor, preço e ano de fabricação.
 * É estendida por {@link Actions} para fornecer informações junto com comportamentos.
 * </p>
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
interface Informations {
    Type getType();
    String getModel();
    String getEngine();
    String getFormattedPrice();
    int getYear();
    double getPrice();
}
