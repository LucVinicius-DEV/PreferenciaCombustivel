// Esse programa identifica a preferencia dos clientes de um posto de gasolina.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE QUAL COMBUSTIVEL DESEJA: ");
        System.out.println("1 - ALCOOL, 2 - GASOLINA, 3 - DIESEL, 4 - FIM");
        int escolha = sc.nextInt() ;

        while (escolha != 4) {
        if (escolha == 1) {
            alcool = alcool + 1;
            escolha = sc.nextInt();
            }
            else 
            if (escolha == 2) {
                gasolina = gasolina + 1;
                escolha = sc.nextInt();
            }
            else if (escolha == 3) {
                diesel = diesel + 1;
                escolha = sc.nextInt();
            }
            else {
                escolha = sc.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        System.out.println("FIM DO PROGRAMA");
        
        sc.close();
    }
}
