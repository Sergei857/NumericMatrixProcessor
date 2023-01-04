package processor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            int chois = Integer.parseInt(InputStr());
            if (chois == 0) {
                break;
            }
        }


        String[] size_m1 = InputStr().split("\\s+");
        Matrica m1 = new Matrica(Integer.parseInt(size_m1[0]), Integer.parseInt(size_m1[1]));
        for (int row = 0; row < m1.rows_size; row++) {
            String[] line_of_m = InputStr().split("\\s+");
            for (int col = 0; col < m1.columns_size; col++) {
                m1.arr[row][col] = Integer.parseInt(line_of_m[col]);
            }
        }


        int cons = Integer.parseInt(InputStr());
        Matrica m = Matrica.mulm(m1, cons);
        Matrica.printM(m);
    }

    public static Matrica inputmatrix() throws IOException {
        System.out.print("Enter size of first matrix: ");
        String[] size_m = InputStr().split("\\s+");
        Matrica m = new Matrica(Integer.parseInt(size_m[0]), Integer.parseInt(size_m[1]));
        System.out.println("Enter second matrix:");
        for (int row = 0; row < m.rows_size; row++) {
            String[] line_of_m = InputStr().split("\\s+");
            for (int col = 0; col < m.columns_size; col++) {
                m.arr[row][col] = Integer.parseInt(line_of_m[col]);
            }
        }
        return m;
    }


    public static String InputStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
