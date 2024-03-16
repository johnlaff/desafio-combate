package application;

import entities.Champion;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Champion championA = null;
        Champion championB = null;

        System.out.println("Digite os dados do primeiro campeão: ");
        System.out.print("Nome: ");
        String nomeA = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vidaA = sc.nextInt();
        System.out.print("Ataque: ");
        int ataqueA = sc.nextInt();
        System.out.print("Armadura: ");
        int armaduraA = sc.nextInt();

        championA = new Champion(nomeA, vidaA, ataqueA, armaduraA);

        System.out.println("\nDigite os dados do segundo campeão: ");
        sc.nextLine();
        System.out.print("Nome: ");
        String nomeB = sc.nextLine();
        System.out.print("Vida inicial: ");
        int vidaB = sc.nextInt();
        System.out.print("Ataque: ");
        int ataqueB = sc.nextInt();
        System.out.print("Armadura: ");
        int armaduraB = sc.nextInt();

        championB = new Champion(nomeB, vidaB, ataqueB, armaduraB);

        System.out.print("\nQuantos turnos você deseja executar? ");
        int turnos = sc.nextInt();
        int cont = 1;

        while (cont <= turnos && (championA.getLife() != 0 && championB.getLife() != 0)){
            championA.takeDamage(championB);
            championB.takeDamage(championA);

            System.out.println("\nResultados do turno " + cont + ":");
            System.out.println(championA.status());
            System.out.println(championB.status());

            cont++;
        }
        System.out.println("\nFIM DO COMBATE");

        sc.close();
    }
}
