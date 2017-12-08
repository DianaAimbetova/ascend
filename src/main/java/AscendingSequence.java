import java.util.InputMismatchException;
import java.util.Scanner;

public class AscendingSequence {
    private int num;
    public AscendingSequence(int num){
         this.num = num;

    }


    public static boolean isAscendingSequence(int num) { //num - число, например 123
        //последнее число, например: 3
        int lastNumber = num%10;
        //число без последнего числа, например: 12
        int remain = num/10;
        //флаги для установки возрастающий или нет, по умолчанию false
        boolean ascend = false;
        boolean descend = false;
        //пока не осталось последней цифры
        while(remain>0){
            //последнее число остатка, например: 2
            int currentNumber = remain%10;
            //если следующее число меньше предыдущего, например: 2>3(значит тут false)
            if(currentNumber > lastNumber) {
                descend = true; //значит убывающий
                //если следующее число больше предыдущего, например 2<3(значит тут true)
            } else if(currentNumber < lastNumber) {
                ascend = true;//значит возрастающий
            }
            //пересохраняем данные для перехощда на следующие цифры
            lastNumber = currentNumber; // теперь lastNumber = 2
            remain /= 10; // теперь remain=1
        }
        //если флаг возрастающего true и флаг убывающего false
        if(ascend && !descend) {
            //возвращаем true
            return true;
        }
        //иначе false
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
