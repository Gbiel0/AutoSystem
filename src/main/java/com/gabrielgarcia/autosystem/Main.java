package com.gabrielgarcia.autosystem;

import com.gabrielgarcia.autosystem.model.vehicle.*;
import com.gabrielgarcia.autosystem.model.interfaces.Actions;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe principal do projeto AutoSystem.
 * <p>
 * Responsável por inicializar o programa, criar instâncias de veículos
 * (Car, Truck, Motorcycle) e executar suas ações.
 * Mostra informações completas de cada veículo no console, incluindo
 * comportamento (acelerar, frear, parar, estacionar) e dados (modelo, tipo, preço, ano e motor).
 * </p>
 *
 * <p>
 * Utiliza listas polimórficas de {@link Actions} para armazenar e iterar sobre diferentes tipos de veículos.
 * Também demonstra o uso de {@link AutoTrunk} para carros e caminhões.
 * </p>
 *
 * @author Gabriel Garcia
 * @version 1.0
 * @since 04/10/2025
 */
public class Main {
    /**
     * Método principal que inicia a execução do programa.
     * <p>
     * Cria veículos e porta-malas, adiciona-os a uma lista polimórfica
     * e imprime suas informações e ações no console.
     * </p>
     *
     * @param args argumentos da linha de comando (não utilizados neste projeto)
     */
    public static void main(String[] args) {
        // Criando porta-malas genéricos para Carro e Caminhão
        AutoTrunk<String, Integer> carTrunk = new AutoTrunk<>("pairs of gloves", 3);
        AutoTrunk<String, Integer> truckTrunk = new AutoTrunk<>("hardwares", 15);

        // Lista polimórfica de veículos que implementam Actions
        List<Actions> auto = new ArrayList<>();

        // Adicionando diferentes veículos
        auto.add(new Car<>("Beetle", 1978, "1600", 12_880.0, carTrunk));
        auto.add(new Motorcycle("Kawasaki Ninja 500", 2010, "500cc", 8_340.0));
        auto.add(new Truck<>("Ford C4", 2022, "V3", 44_220.0, truckTrunk));

        // Para cada veículo, imprimir informações e ações
        for (Actions ac : auto) {
            print(ac);
        }
    }

    /**
     * Método utilitário que imprime informações e ações de um veículo.
     * <p>
     * Mostra no console:
     * <ul>
     *   <li>Dados do veículo (via {@link Object#toString()})</li>
     *   <li>Ações: acelerar, frear, parar e estacionar</li>
     *   <li>Separador visual no console para facilitar leitura</li>
     * </ul>
     * </p>
     *
     * @param a veículo que implementa a interface {@link Actions}
     */
    private static void print(Actions a) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(System.lineSeparator())
                .append(a.speedUp()).append(System.lineSeparator())
                .append(a.brake()).append(System.lineSeparator())
                .append(a.stop()).append(System.lineSeparator())
                .append(a.park()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("+".repeat(38))
                .append(System.lineSeparator());
        System.out.println(sb);
    }
}
