import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Создаем сканер
        Scanner s = new Scanner(System.in);
        // Пытаемся считать n, ессли ввели не число - завершаем программу
        int n;
        try {
            n = Integer.valueOf(s.nextLine());
        } catch (NumberFormatException e) {
            return;
        }
        // Пытаемся считать m, ессли ввели не число - завершаем программу
        int m;
        try {
            m = Integer.valueOf(s.nextLine());
        } catch (NumberFormatException e) {
            return;
        }
        int[][] arr = new int[n][n];
        Random random = new Random();
        int max = -m;
        ArrayList<Integer> rows = new ArrayList<Integer>();
        ArrayList<Integer> column = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.ints(n, -m, m).toArray();
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max == arr[i][j]) {
                    if (rows.indexOf(j) == -1)
                        rows.add(j);
                    if (column.indexOf(i) == -1)
                        column.add(i);
                }
            }
        }
        System.out.println("\nMax: " + max);
        int[][] newArr = new int[n - rows.size()][n - column.size()];
        System.out.println("Size: " + (n - rows.size()) + "x" + (n - column.size()));
        int newArrI = 0;
        int newArrJ = 0;
        for (int i = 0; i < n; i++) {
            if (rows.indexOf(i) == -1) {
                newArrJ = 0;
                for (int j = 0; j < n; j++) {
                    if (column.indexOf(j) == -1) {
                        newArr[newArrI][newArrJ]
                                = arr[j][i];
                        newArrJ++;
                    }
                }
                newArrI++;
            }
        }
    }
}
