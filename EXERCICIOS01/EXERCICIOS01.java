package EXERCICIOS01;

import java.util.Scanner;

public class EXERCICIOS01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h, b, B, area;
        System.out.println("Digite a altura");
        h = input.nextDouble();
        System.out.println("Digite a base menor");
        b = input.nextDouble();
        System.out.println("Digite a base maior");
        B = input.nextDouble();
        area = (h * (b + B)) / 2;
        System.out.println("O resultado é " + area);
    }
}