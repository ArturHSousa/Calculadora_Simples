import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Num n1 = new Num();
        Num n2 = new Num();
        Num res = new Num();

    try {

        System.out.println("Deseja somar, subtrair dividir ou multiplicar? ");
        System.out.println("Para somar       digite 1");
        System.out.println("Para subtrair    digite 2");
        System.out.println("Para dividir     digite 3");
        System.out.println("Para multiplicar digite 4");
        int tipo = sc.nextInt();

        if (tipo == 1) {
            System.out.printf("%nDigite o primeiro número: ");
            n1.setValor(sc.nextInt());

            System.out.printf("%nDigite o segundo número: ");
            n2.setValor(sc.nextInt());

            res.setValor(n1.getValor() + n2.getValor());
            //print(A soma de " + n1 + " com " + n2 + " é:"); NÂO se pode usar assim pois as variaveis não são dessa classe
            System.out.printf("%nA soma de %d + %d é: %d", n1.getValor(), n2.getValor(), res.getValor());
        }
        if (tipo == 2) {
            System.out.printf("%nDigite o primeiro número: ");
            n1.setValor(sc.nextInt());

            System.out.printf("%nDigite o segundo número: ");
            n2.setValor(sc.nextInt());

            res.setValor(n1.getValor() - n2.getValor());
            System.out.printf("%nA subtração de %d - %d é: %d", n1.getValor(), n2.getValor(), res.getValor());
        }
        if (tipo == 3) {
            System.out.printf("%nDigite o primeiro número: ");
            n1.setValor(sc.nextInt());

            System.out.printf("%nDigite o segundo número: ");
            n2.setValor(sc.nextInt());

            res.setValor(n1.getValor() / n2.getValor());
            System.out.printf("%nA divisão de %d / %d é: %d", n1.getValor(), n2.getValor(), res.getValor());
        }
        if (tipo == 4) {
            System.out.printf("%nDigite o primeiro número: ");
            n1.setValor(sc.nextInt());

            System.out.printf("%nDigite o segundo número: ");
            n2.setValor(sc.nextInt());

            res.setValor(n1.getValor() * n2.getValor());
            System.out.printf("%nA multiplicação de %d * %d é: %d", n1.getValor(), n2.getValor(), res.getValor());
        }
        if (tipo > 4 || tipo == 0){
            System.out.println("Digite números validos");
        }
        else {
            System.out.println();
            System.out.println("Calculo concluido!");
            }
        }
    catch(InputMismatchException e){

        System.out.println("Não digite letras");
        System.out.println("Digite apenas números inteiros");
        }
    }
}