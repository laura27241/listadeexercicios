package EXERCICIOS05;

public class EXERCICIOS05{
    public static void main(String[] args) {
        for(Integer i=1;i<=123;i++){
            if((i%2==0) || (i%3==0)){
                System.out.println(i+" não é número primo");
            }else{
                System.out.println(i+" é número primo");
            }
        }
    }
}
