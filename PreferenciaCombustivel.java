
// Descrição: Programa que registra a preferência de combustíveis dos clientes de um posto. 
// O programa encerra ao digitar 4 e mostra a quantidade de abastecimentos por tipo.

import java.util.Scanner;

public class PreferenciaCombustivel {
    public static void main(String[] args) {

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        Scanner sc = new Scanner(System.in);
        int escolha = sc.nextInt();

        while (escolha != 4) {
            if (escolha == 1) {
                alcool++;
            } else if (escolha == 2) {
                gasolina++;
            } else if (escolha == 3) {
                diesel++;
            }
            // Ignora códigos inválidos
            escolha = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
