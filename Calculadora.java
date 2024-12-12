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
            System.out.println("What operation are we going to do today?");
            System.out.println("__________________________________________________");
            System.out.println("[ 1 ] Addition");
            System.out.println("[ 2 ] Subtraction");
            System.out.println("[ 3 ] Division");
            System.out.println("[ 4 ] Multiplication");
            System.out.println("__________________________________________________");

            System.out.println("Enter the corresponding number of the chosen operation:");

            op = calc.nextInt();
            System.out.println("__________________________________________________");

            switch (op) {
                case 1:
                    System.out.println("Enter the first number:");
                    n1 = calc.nextDouble();
                    System.out.println("Enter the second number:");
                    n2 = calc.nextDouble();
                    resp = n1 + n2;
                    System.out.println("__________________________________________________");
                    System.out.println("The result of their sum is: " + resp);
                    break;

                case 2:
                    System.out.println("Digite o primeiro numero:");
                    n1 = calc.nextDouble();
                    System.out.println("Digite o segundo numero:");
                    n2 = calc.nextDouble();
                    resp = n1 - n2;
                    System.out.println("__________________________________________________");
                    System.out.println("The result of your subtraction is: " + resp);
                    break;

                case 3:
                    System.out.println("Enter the first number:");
                    n1 = calc.nextDouble();
                    System.out.println("Enter the second number:");
                    n2 = calc.nextDouble();
                    resp = n1 / n2;
                    System.out.println("__________________________________________________");
                    System.out.println("The result of your division is: " + resp);
                    break;

                case 4
                        :
                     System.out.println("Enter the first number:");
                    n1 = calc.nextDouble();
                    System.out.println("Enter the second number:");
                    n2 = calc.nextDouble();
                    resp = n1 * n2;
                    System.out.println("__________________________________________________");
                    System.out.println("The result of your multiplication is: " + resp);
                    break;

                default:
                    System.out.println("Option invalid...");

            }
            System.out.println("__________________________________________________");
            System.out.println("Do you have one more calculation to do? [ 1 ] Yes / [ 2 ] No");
            loop = calc.nextInt();
            System.out.println("__________________________________________________");
			System.out.println("Thank you for using our Calculator\n");
        }
    }
}
