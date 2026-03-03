package project_files;

import java.util.Scanner;

public class time_adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter current hour: ");
        int currentHour =sc.nextInt();
        System.out.println("Enter current minute: ");
        int currentMinute = sc.nextInt();
        System.out.println("Enter current second: ");
        int currentSecond = sc.nextInt();
        System.out.println("Enter hour to go forward hour: ");
        int nextHour =sc.nextInt();
        System.out.println("Enter minute to go forward: ");
        int nextMinute = sc.nextInt();
        System.out.println("Enter second to go forward: ");
        int nextSecond = sc.nextInt();
        int answerHour =0 ,answerMinute=0,answerSecond=0;
        int carrySecond=0,carryMinute=0;
        boolean isNextDay =false;
        answerSecond = currentSecond + nextSecond;
        if(answerSecond>=60){
            answerSecond-=60;
            carrySecond=1;
        }
        answerMinute = currentMinute + nextMinute + carrySecond;
        if(answerMinute>=60){
            answerMinute-=60;
            carryMinute=1;
        }
        answerHour = currentHour + nextHour + carryMinute;
        if(answerHour>=24){
            answerHour-=24;
            isNextDay=true;
        }
        if(isNextDay){
            System.out.println("The Answer is: "+answerHour+" : "+answerMinute+
            " : "+answerSecond + " on the next day");
        }
        else{
            System.out.println("The Answer is: "+answerHour+" : "+answerMinute+
                    " : "+answerSecond + "  on the same day");
        }
    }
}
