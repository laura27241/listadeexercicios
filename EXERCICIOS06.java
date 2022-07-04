package EXERCICIOS06;

import java.util.Scanner;

public class EXERCICIOS06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double horas, salario;

        System.out.print("Digite quantas horas foram trabalhadas: ");    
        horas = input.nextDouble();

        salario = horas * 10.25;

        System.out.print("O valor do salário a ser recebido é: R$"+salario);
    }
}