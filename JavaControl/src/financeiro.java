import java.util.Scanner;

public class financeiro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        
        double saldo = 0;

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Receber");
        System.out.println("2 - Pagar");
        System.out.println("3 - visualizar");
        System.out.println("4 - Sair");


        switch (leitor.nextLine()) {
            case "1":
                System.out.println("Quantidade a receber: ");
                saldo = saldo + leitor.nextDouble();
                System.out.println("Saldo atual: " + saldo);
                break;
            case "2":
                System.out.println("Quantidade a pagar: ");
                saldo = saldo - leitor.nextDouble();
                System.out.println("Saldo atual: " + saldo);
                break;
            case "3":
                System.out.println("Visualizar saldo em conta:");
                System.out.println(saldo);
                break;
            case "4":
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}