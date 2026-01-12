# AutoSystem

[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.java.com/)
[![Maven](https://img.shields.io/badge/Maven-Project-green)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

---

## 📖 Descrição

AutoSystem é um projeto em **Java Maven** que simula veículos (Carro, Caminhão e Motocicleta) com suas informações e ações básicas.  
Ele utiliza conceitos de **POO** (polimorfismo, herança, encapsulamento e abstração) para organizar os veículos e suas funcionalidades.

- Cada veículo possui tipo, modelo, motor, ano e preço.
- Carros e caminhões possuem **porta-malas** genéricos (`AutoTrunk`) que podem armazenar itens.
- Métodos de ação: acelerar, frear, parar e estacionar.

---

## 🏗 Estrutura do Projeto

O projeto **AutoSystem** possui a seguinte organização:

- **src/main/java/com/gabrielgarcia/autosystem/**
    - **Main.java** – Classe principal que inicializa o programa e executa as ações dos veículos.
    - **model/** – Contém os pacotes de modelos e definições:
        - **constants/** – Definições de constantes:
            - **message/** – Informações de exceções personalizadas:
                - `ErrorMessage.java` – Classe imutável para criação das mensagens de exceções.
            - `Type.java` – Enum com tipos de veículos.
        - **exceptions/** – Exceções personalizadas:
            - `InvalidEngineException.java` – Exception caso atributo o 'engine' seja definido como null ou esteja em branco.
            - `InvalidLabelException.java` – Exception caso 'label' for definido como null ou esteja em branco.
            - `InvalidModelException.java` – Exception caso atributo 'model' seja definido como null ou esteja em branco.
            - `InvalidPriceException.java` – Exception caso atributo 'price' seja definido abaixo de zero.
            - `InvalidTypeException.java` – Exception caso atributo 'type' seja definido como null.
            - `InvalidYearException.java` – Exception caso atributo 'year' seja definido como abaixo de zero.
        - **vehicle/** – Classes que representam os veículos:
            - `Auto.java` – Classe base para veículos.
            - `Car.java` – Classe para carros, com `AutoTrunk`.
            - `Motorcycle.java` – Classe para motocicletas.
            - `Truck.java` – Classe para caminhões, com `AutoTrunk`.
            - `AutoTrunk.java` – Classe genérica para porta-malas de carros e caminhões.
        - **interfaces/** – Define comportamentos e contratos:
            - `Actions.java` – Métodos de ação (acelerar, frear, parar, estacionar).
            - `Informations.java` – Métodos de informações sobre o veículo.
        

- **pom.xml** – Arquivo de configuração do Maven, definindo dependências e build.
- **README.md** – Documentação do projeto, incluindo descrição, execução e exemplos.

---

## ⚙️ Tecnologias

- Java 17
- Maven (gerenciamento de dependências)
- Conceitos de POO:
  - Polimorfismo
  - Herança
  - Abstração
  - Encapsulamento

---

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior instalado
- Maven instalado

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/Gbiel0/AutoSystem.git
cd AutoSystem
mvn clean install
mvn exec:java -Dexec.mainClass="com.gabrielgarcia.autosystem.Main"
```

2. Compile o Projeto:
```bash
mvn clean install
```

3. Execute a aplicação:
```bash
mvn exec:java -Dexec.mainClass="com.gabrielgarcia.autosystem.Main"
```

## 💻 Exemplo de Uso
```java
import com.gabrielgarcia.autosystem.Main;
import com.gabrielgarcia.autosystem.model.vehicle.Car;
import com.gabrielgarcia.autosystem.model.vehicle.Motorcycle;
import com.gabrielgarcia.autosystem.model.vehicle.Truck;
import com.gabrielgarcia.autosystem.model.vehicle.AutoTrunk;
import com.gabrielgarcia.autosystem.model.interfaces.Informations;

import java.util.List;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        AutoTrunk<String, Integer> carTrunk = new AutoTrunk<>("pairs of gloves", 3);
        AutoTrunk<String, Integer> truckTrunk = new AutoTrunk<>("hardwares", 15);

        List<Informations> vehicles = new ArrayList<>();
        vehicles.add(new Car<>("Beetle", 1978, "1600", 12_880.0, carTrunk));
        vehicles.add(new Motorcycle("Kawasaki Ninja 500", 2010, "500cc", 8_340.0));
        vehicles.add(new Truck<>("Ford C4", 2022, "V3", 44_220.0, truckTrunk));

        for(Informations vehicle : vehicles) {
            print(vehicle);
        }
    }

    private static void print(Informations i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(System.lineSeparator())
                .append(i.speedUp()).append(System.lineSeparator())
                .append(i.brake()).append(System.lineSeparator())
                .append(i.stop()).append(System.lineSeparator())
                .append(i.park()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("+".repeat(38))
                .append(System.lineSeparator());
        System.out.println(sb);
    }
}
```

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

---
