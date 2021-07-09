import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void partA() {
        int correctAns=0;
        Random ranNumber = new Random();
        Scanner input = new Scanner(System.in);
        int i1=0;
        int i2=0;
        int answer=0;
        for (int i=0; i<5; i++) {
            i1=ranNumber.nextInt(11)+10;
            i2=ranNumber.nextInt(11)+10;
            System.out.println(i1 + " % " + i2 + "=?");
            answer=input.nextInt();
            if (answer==i1%i2) {
                correctAns=correctAns+1;
                System.out.println("Correct answer, Current score: " + correctAns*20 + ", performance: " + correctAns + "/" + (i+1));
            }
            else {
                System.out.println("Incorrect answer, Current score: " + correctAns*20 + ", performance: " + correctAns + "/" + (i+1));
            }
        }
    }
    public static void partB() {
        int correctAns=0;
        Random ranNumber = new Random();
        Scanner input = new Scanner(System.in);
        int i1=0;
        int i2=0;
        int answer=0;
        String textAns="";
        int i=0;
        boolean cont=true;
        while (cont==true) {
            i1=ranNumber.nextInt(11)+10;
            i2=ranNumber.nextInt(11)+10;
            System.out.println(i1 + " % " + i2 + "=?");
            if (input.hasNextInt()){
                answer = input.nextInt();
                i++;
                if (answer == i1 % i2) {
                    correctAns = correctAns + 1;
                    System.out.println("Correct answer, Current score: " + correctAns * 20 + ", performance: " + correctAns + "/" + i);
                } else {
                    System.out.println("Incorrect answer, Current score: " + correctAns * 20 + ", performance: " + correctAns + "/" + i);
                }
            }
            else {
                textAns = input.next();
                if (textAns.equals("q")) {
                    cont=false;
                }
                else {
                    System.out.println("Incorrect input, please enter a whole number");
                }
            }
        }
    }
    public static void main (String [] args) {
        System.out.println("Exercise 2A");
        //partA();
        partB();
        System.out.println(("Finish"));
    }
}
