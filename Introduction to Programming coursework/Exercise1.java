import java.util.Arrays;

public class Exercise1 {
    public static int mainDiagonalElementSum(int[][] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum=sum+array[i][i];
        }
        return sum;
    }
    public static int maxRowAbsSumValue(int[][] array){
        int maxSum=0;
        for (int i=0; i<array.length; i++) {
            int rowSum=0;
            for (int c=0; c<array[i].length; c++) {
                rowSum=rowSum+Math.abs(array[i][c]);
            }
            if (rowSum>maxSum) {
                maxSum=rowSum;
            }
        }
        return maxSum;
    }
    public static int maxColumnAbsSumValue(int[][] array) {
        int maxSum=0;
        for (int i=0; i<array.length; i++) {
            int columnSum=0;
            for (int c=0; c<array[i].length; c++) {
                columnSum=columnSum+Math.abs(array[c][i]);
            }
            if (columnSum>maxSum) {
                maxSum=columnSum;
            }
        }
        return maxSum;
    }
    public static void main (String [] args) {
        int[][] a = {{3, -1, 4, 0},{5,9,-2, 6},{5, 3, 7, -8},{2, 1, 6, -2}};
        System.out.println(mainDiagonalElementSum(a));
        System.out.println(maxRowAbsSumValue(a));
        System.out.println(maxColumnAbsSumValue(a));
    }
}
