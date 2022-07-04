package EXERCICIOS04;

public class EXERCICIOS04{
    public static void main(String[] args) {

        Integer somaimpar=0;
        Long multipar=(long) 1;

        for(int i=1;i<30;i++){
            if((i%2)==1){
                somaimpar += i;
            }else{
                multipar *= i;
            }
        }
        System.out.print("O valor da soma sequencial é de: "+somaimpar+"\n");
        System.out.print("O valor da multiplicação sequencial é de: "+multipar+"\n");
    }
}