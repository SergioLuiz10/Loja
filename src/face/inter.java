package face;

import tratamento.aquatico;
import tratamento.terrestre;

import java.util.Scanner;

public class inter {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int escolha;

        System.out.println("Boa noite, escolha seu passeio. Será em águas terrestres (1) ou aquáticas (2)?");
        escolha = ler.nextInt();
        ler.nextLine();

        if (escolha == 1) {
            System.out.println("Digite o nome do seu veículo terrestre:");
            String nome2 = ler.nextLine();
            terrestre kk = new terrestre(nome2);

            String escolhaAcao;
            do {
                System.out.println("Escolha uma ação para o seu veículo: Andar, Ré, Frear, Ligar, Desligar");
                escolhaAcao = ler.nextLine();

                switch (escolhaAcao) {
                    case "Andar":
                        kk.moverFrente();
                        break;
                    case "Ré":
                        kk.moverTras();
                        break;
                    case "Frear":
                        kk.desligar();
                        break;
                    case "Ligar":
                        kk.ligar();
                        break;
                    case "Desligar":
                        kk.desligar();
                        break;
                    default:
                        System.out.println("Ação inválida.");
                        break;
                }
            } while (!escolhaAcao.equals("Desligar"));
        } else if (escolha == 2) {
            System.out.println("Digite o nome do seu veículo aquático:");
            String nome = ler.nextLine();
            aquatico ll = new aquatico(nome);

            String escolhaAcao;
            do {
                System.out.println("Escolha uma ação para o seu veículo: Andar, Ré, Frear, Ligar, Desligar");
                escolhaAcao = ler.nextLine();

                switch (escolhaAcao) {
                    case "Andar":
                        ll.moverFrente();
                        break;
                    case "Ré":
                        ll.moverTras();
                        break;
                    case "Frear":
                        ll.desligar();
                        break;
                    case "Ligar":
                        ll.ligar();
                        break;
                    case "Desligar":
                        ll.desligar();
                        break;
                    default:
                        System.out.println("Ação inválida.");
                        break;
                }
            } while (!escolhaAcao.equals("Desligar"));
        } else {
            System.out.println("Escolha inválida.");
        }

        ler.close();
    }
}

