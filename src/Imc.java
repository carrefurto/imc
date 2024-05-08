import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("               IMC");
        System.out.println("-----------------------------------");

        System.out.print("Digite sua massa corporal: ");
        double massaCorporal = leitor.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();

        double imc = massaCorporal / (altura*altura);

        System.out.println("-----------------------------------");
        if (imc <= 18.5) {
            System.out.println("VOCÊ ESTÁ ABAIXO DO PESO IDEAL!");
        } else if (imc >= 18.6 && imc <= 24.9 ) {
            System.out.println("VOCÊ TEM O PESO IDEAL, PARABÉNS!");
        } else if (imc >= 25.0 && imc <= 29.9 ) {
            System.out.println("VOCÊ ESTÁ LEVEMENTE ACIMA DO PESO!");
        } else if (imc >= 30.0 && imc <= 34.9 ) {
            System.out.println("VOCÊ TEM OBESIDADE GRAU 1");
        } else if (imc >= 35.0 && imc <= 39.9 ) {
            System.out.println("VOCÊ TEM OBESIDADE SEVERA, PROCURE UM MÉDICO");
        } else {
            System.out.println("VOCÊ TEM OBESIDADE MÓRBIDA, PROCURE UM MÉDICO!");
        }
        System.out.println("------------------------------------");
    }
}
