package EXERCICIOS08;

import java.util.Scanner;

public class EXERCICIOS08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Double quilos1, quilos, libras1, libras;

        System.out.print("Digite uma quantidade de quilos: ");
        quilos1 = input.nextDouble();

        System.out.print("Digite uma quantidade de libras: ");
        libras1 = input.nextDouble();

        quilos = libras1*0.454;
        libras = quilos1/0.454;

        System.out.println(quilos1+" quilos = "+libras+" libras");
        System.out.println(libras1+" libras = "+quilos+" quilos");
    }        
}


