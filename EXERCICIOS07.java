package EXERCICIOS07;

import java.util.Scanner;

public class EXERCICIOS07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double horas, salario;

        System.out.print("Digite quantas horas foram trabalhadas: ");
        horas = input.nextDouble();

        salario = horas*10.25;

        if(salario < 50){
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        }else{
            System.out.print("O valor do salário será de: R$"+salario);
        }
    }    
}


