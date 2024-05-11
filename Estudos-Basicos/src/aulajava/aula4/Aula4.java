package aulajava.aula4;
import java.util.Scanner;
public class Aula4 {
    public static void main(String[] args){
        Scanner arroz = new Scanner(System.in);
        System.out.println("digite um numero");
        int valor1 = arroz.nextInt();
        System.out.println("digite outro numero: ");
        int valor2 = arroz.nextInt();
        int maior = valor1 > valor2 ? valor1 : valor2;
        System.out.println(maior);
        //
        // valor1=valor1-23;
        //-=23;
        //System.out.println(valor1);

        /*if(valor1 <= valor2){
            System.out.println(valor1+" é maior");
        }*/
    }
}
