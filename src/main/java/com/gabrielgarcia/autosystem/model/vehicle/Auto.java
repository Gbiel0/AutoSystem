package com.gabrielgarcia.autosystem.model.vehicle;

import com.gabrielgarcia.autosystem.model.interfaces.Actions;
import com.gabrielgarcia.autosystem.model.enums.Type;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe abstrata base para qualquer veículo do sistema AutoSystem.
 * <p>
 * Esta classe implementa a maior parte dos métodos da interface {@link Actions},
 * fornecendo comportamento padrão para acelerar, frear, parar e estacionar.
 * Subclasses concretas como {@link Car}, {@link Truck} e {@link Motorcycle}
 * herdam essas funcionalidades e podem adicionar comportamentos específicos.
 * </p>
 *
 * <p>
 * Esta classe também gerencia atributos comuns como tipo, modelo, ano, motor e preço,
 * garantindo validações básicas na construção do objeto.
 * </p>
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 10/04/2025
 */
abstract class Auto implements Actions {
    // Formato de moeda padronizado
    private static final NumberFormat MONEY_CURRENCY = NumberFormat.getCurrencyInstance(Locale.US);

    // Atributos imutáveis comuns a todos os veículos
    private final Type type;
    private final String model;
    private final String engine;
    private final int year;
    private final double price;

    Auto(Type type, String model, int year, String engine, double price) {
        // Validações simples para garantir dados corretos
        if(model == null || model.isBlank()) {
            throw new IllegalArgumentException("The model cannot be null or blank");
        }

        if(engine == null || engine.isBlank()) {
            throw new IllegalArgumentException("The engine cannot be null or blank");
        }

        if(year < 1886) {
            throw new IllegalArgumentException("The first auto was invented in 1886");
        }

        if(price < 0) {
            throw new IllegalArgumentException("The price cannot be under zero");
        }

        this.type = type;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.price = price;
    }

    // Getters da interface Informations
    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getFormattedPrice() {
        return MONEY_CURRENCY.format(price);
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // Helper para gerar frases das ações
    protected String action(String act) {
        return "The " + getModel() + " is " + act + ".";
    }

    // Implementações padrão das ações
    @Override
    public String speedUp() {
        return action("speeding up");
    }

    @Override
    public String brake() {
        return action("braking");
    }

    @Override
    public String stop() {
        return action("stopping");
    }

    @Override
    public String park() {
        return action("parking");
    }

    // toString para mostrar dados
    @Override
    public String toString() {
        return "== " + getClass().getSimpleName() + " ==" + System.lineSeparator() +
                "Type: " + getType() + System.lineSeparator() +
                "Model: " + getModel() + System.lineSeparator() +
                "Year: " + getYear() + System.lineSeparator() +
                "Engine: " + getEngine() + System.lineSeparator() +
                "Price: " + getFormattedPrice();
    }
}
