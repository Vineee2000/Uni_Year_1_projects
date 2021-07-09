import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WordFinder {
    public static final int N = 10;
    public static char[][] grid = new char[N][N];
    public static final String GRID_FILE = "data/grid.txt";
    public static final String WORD_FILE = "data/words.txt";
    public static void initGrid() throws FileNotFoundException {
        Scanner file = new Scanner(new File(GRID_FILE));
        for (int row=0; file.hasNextLine(); row++) {
            grid[row]=file.nextLine().toCharArray();
        }
    }
    public static void printGrid() {
        for (int i=0; i<grid.length; i++) {
            System.out.println(Arrays.toString(grid[i]));
        }
    }
    public static void find() throws FileNotFoundException {
        Scanner words = new Scanner(new File(WORD_FILE));
        String word;
        String rowString;
        String columnString="";
        for (int i=0; words.hasNextLine(); i++) {
            word = words.nextLine();
            for (int row=0; row<grid.length; row++) {
                rowString = new String(grid[row]);
                if (rowString.indexOf(word) != -1) {
                    System.out.println(word+ ": "+ "row "+row+", position "+rowString.indexOf(word));
                }
            }
            for (int column=0; column<grid.length; column++) {
                for (int row=0; row<grid.length; row++) {
                    columnString=columnString+grid[row][column];
                }
                if (columnString.indexOf(word) != -1) {
                    System.out.println(word+ ": "+ "column "+column+", position "+columnString.indexOf(word));
                }
                columnString="";
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        initGrid();
        printGrid();
        find();
    }
}