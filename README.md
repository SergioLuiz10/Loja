Sou um desenvolvedor de software e recentemente escrevi um programa em Java para simular o uso de diferentes tipos de veículos. O objetivo principal do programa é permitir que o usuário escolha entre veículos terrestres e aquáticos, e depois execute várias ações com esses veículos.

No início, implementei uma interface chamada fa, que define os métodos básicos que qualquer veículo deve ter: ligar, moverFrente, moverTras e desligar. Essa interface garante que todos os tipos de veículos no sistema tenham essas funcionalidades básicas.

Criei duas classes, terrestre e aquatico, que implementam a interface fa. Cada uma dessas classes possui um atributo chamado nome, que representa o nome do veículo. O construtor de cada classe inicializa esse nome, permitindo que cada instância de veículo tenha um nome único. Essas classes também implementam os métodos definidos na interface fa, exibindo mensagens apropriadas para cada ação (como ligar, mover para frente, dar ré e desligar).

O ponto central do programa é a classe inter, que contém o método main. Essa classe usa um objeto Scanner para ler a entrada do usuário. Primeiramente, o programa pergunta ao usuário se ele deseja usar um veículo terrestre ou aquático. Dependendo da escolha, o programa solicita o nome do veículo e cria uma instância da classe apropriada (terrestre ou aquatico).

Após a criação do veículo, o programa entra em um loop onde o usuário pode escolher diferentes ações para realizar com o veículo, como andar, dar ré, frear, ligar e desligar. O loop continua até que o usuário escolha a opção "Desligar".

Este programa demonstra conceitos fundamentais de programação orientada a objetos, como interfaces, classes e métodos, além de permitir uma interação básica com o usuário através de entradas de teclado.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

As a software developer, I recently created a Java program to simulate the usage of different types of vehicles. The main goal is to let users choose between land and water vehicles and perform various actions with them.

I began by implementing an interface called fa, defining basic methods all vehicles must have: start, moveForward, moveBackward, and stop. This ensures consistency across all vehicle types.

I crafted two classes, LandVehicle and WaterVehicle, both implementing the fa interface. Each class has a unique attribute called name, representing the vehicle's name. The constructor initializes this name, ensuring each vehicle instance has a distinct name. These classes also implement methods from the fa interface, displaying appropriate messages for actions like starting, moving forward, reversing, and stopping.

The core of the program lies in the inter class, housing the main method. It employs a Scanner object to read user input. Initially, the program asks users to select a land or water vehicle. Based on their choice, it prompts for the vehicle's name and creates an instance of the corresponding class (LandVehicle or WaterVehicle).

Once the vehicle is created, the program enters a loop where users can choose various actions such as moving forward, reversing, stopping, starting, and turning off the vehicle. The loop continues until users opt to "turn off" the vehicle.

This program showcases fundamental concepts of object-oriented programming, including interfaces, classes, and methods. Additionally, it enables basic user interaction through keyboard inputs.
