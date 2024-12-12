import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        double n1 = 0;
        double n2 = 0;
        int op = 0;
        double resp = 0;
        int loop = 1;
        while (loop == 1) {
            Scanner calc = new Scanner(System.in);
            System.out.println("__________________________________________________");
            System.out.println("Qual Operacao vamos fazer hj?");
            System.out.println("__________________________________________________");
            System.out.println("[ 1 ] Adicao");
            System.out.println("[ 2 ] Subtracao");
            System.out.println("[ 3 ] Divisao");
            System.out.println("[ 4 ] Multiplicacao");
            System.out.println("__________________________________________________");

            System.out.println("Digite o numero correspondente da operacao escolhida:");

            op = calc.nextInt();
            System.out.println("__________________________________________________");

            switch (op) {
                case 1:
                    System.out.println("Digite o primeiro numero:");
                    n1 = calc.nextDouble();
                    System.out.println("Digite o segundo numero:");
                    n2 = calc.nextDouble();
                    resp = n1 + n2;
                    System.out.println("__________________________________________________");
                    System.out.println("O resulltado da sua soma e: " + resp);
                    break;

                case 2:
                    System.out.println("Digite o primeiro numero:");
                    n1 = calc.nextDouble();
                    System.out.println("Digite o segundo numero:");
                    n2 = calc.nextDouble();
                    resp = n1 - n2;
                    System.out.println("__________________________________________________");
                    System.out.println("O resulltado da sua subtracao e: " + resp);
                    break;

                case 3:
                    System.out.println("Digite o primeiro numero:");
                    n1 = calc.nextDouble();
                    System.out.println("Digite o segundo numero:");
                    n2 = calc.nextDouble();
                    resp = n1 / n2;
                    System.out.println("__________________________________________________");
                    System.out.println("O resulltado da sua divisao e: " + resp);
                    break;

                case 4
                        :
                    System.out.println("Digite o primeiro numero:");
                    n1 = calc.nextDouble();
                    System.out.println("Digite o segundo numero:");
                    n2 = calc.nextDouble();
                    resp = n1 * n2;
                    System.out.println("__________________________________________________");
                    System.out.println("O resulltado da sua multiplicacao e: " + resp);
                    break;

                default:
                    System.out.println("Opcao invalida...");

            }
            System.out.println("__________________________________________________");
            System.out.println("Mais uma conta para fazer? [ 1 ] Sim / [ 2 ] Nao");
            loop = calc.nextInt();
            System.out.println("__________________________________________________");
			System.out.println("Obrigado por usar nossa Calculadora\n");
        }
    }
}