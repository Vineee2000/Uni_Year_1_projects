import java.util.ArrayList;
import java.util.Arrays;

public class Exercise3 {
    public static boolean isNarcissisticNumber(int number) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int temp=number;
        while (temp>0) {
            digits.add(0, temp%10);
            temp=temp/10;
        }
        if (digits.toArray().length!=3) {
            return false;
        }
        else {
            if (Math.pow(digits.get(0), 3)+Math.pow(digits.get(1), 3)+Math.pow(digits.get(2), 3)==number) {
                return true;
            }
            else {
                return false;
            }
        }
    }
    public static int sum() {
        int sum = 0;
        for (int i=100; i<999; i++) {
            if (isNarcissisticNumber(i)) {
                sum=sum+i;
            }
        }
        return sum;
    }
    public static void main (String [] args) {
        System.out.println(isNarcissisticNumber(153));
        System.out.println(sum());
    }
}
