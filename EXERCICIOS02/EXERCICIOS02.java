package EXERCICIOS02;
import java.util.Scanner;
public class EXERCICIOS02 {
    public static void main (String[] args) {
      Scanner input = new Scanner(System.in);
      double h, b, B, area;
      System.out.println("Digite sua altura");
      h = input.nextDouble();
      System.out.println("Digite a base menor");
      b = input.nextDouble();
      System.out.println("Digite a base maior");
      B = input.nextDouble();
      area = (h * (b + B)) /2;
      System.out.println("Valor exato da area é de " + area);
      area = (h * (b + B)) /2
      System.out.println("Valor arredondado "+area+" we get "+Math.ceil(area));
    }

    
}
