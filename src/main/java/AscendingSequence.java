import java.util.InputMismatchException;
import java.util.Scanner;

public class AscendingSequence {
    private int num;
    public AscendingSequence(int num){
         this.num = num;

    }


    public static boolean isAscendingSequence(int num) {
        int lastNumber = num%10;
        //System.out.println("последняя цифра: " + lastNumber);
        int remain = num/10;
      //  System.out.println("остаток без последней цифры: " + remain);
        boolean ascend = false;
        boolean descend = false;
        while(remain>0){
            int currentNumber = remain%10;
            //System.out.println("предпоследняя цифра: " + currentNumber);
            if(currentNumber > lastNumber) {
              //  System.out.println("if1");
                descend = true;
            } else if(currentNumber < lastNumber) {
             //   System.out.println("if2");
                ascend = true;
            }
            lastNumber = currentNumber;
            //System.out.println(lastNumber);
            remain /= 10;
            //System.out.println(remain);
        }
        if(ascend && !descend) {
            return true;
        }
        return false;

    }


    public static void main(String[] args){
        try{
        Scanner reader = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = reader.nextInt();
        if((number>=0)) {
            isAscendingSequence(number);
            if(Integer.toString(number).length()>2){
            if(isAscendingSequence(number)){
                System.out.println("Образуют");
            }else if(!isAscendingSequence(number)){
                System.out.println("Не образуют");
            }
            }else{
                System.out.println("Введите минимум двузначное число..");
            }
        }else {
            System.out.println("Введите положительное число...");
        }
            reader.close();
        } catch (InputMismatchException e){
                System.out.println("Введите целое число(integer)...");

            }


    }

}
