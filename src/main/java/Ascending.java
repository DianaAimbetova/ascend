import java.util.InputMismatchException;
import java.util.Scanner;
public class Ascending {


    private int num;
    public Ascending(int num){
         this.num = num;

      }

            public static boolean isAscendingSequence(int number){
                    String intToStr = Integer.toString(number);
                    int length = intToStr.length();
                    for(int i = 0; i < length-1; i++){
                                if ((intToStr.charAt(i) > intToStr.charAt((i + 1))) ) {
                                       return false;
                                   }
                            }

                            return true;

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
                                        }else{
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
