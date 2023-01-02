package processor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] size_m1 = InputStr().split("\\s+");
        Matrica m1 = new Matrica(Integer.parseInt(size_m1[0]), Integer.parseInt(size_m1[1]));
        for (int row = 0; row < m1.rows_size; row++) {
            String[] line_of_m = InputStr().split("\\s+");
            for (int col = 0; col < m1.columns_size; col++) {
                m1.arr[row][col] = Integer.parseInt(line_of_m[col]);
            }
        }
        //PrintMatrix.printM(m1);
        String[] size_m2 = InputStr().split("\\s+");
        Matrica m2 = new Matrica(Integer.parseInt(size_m2[0]), Integer.parseInt(size_m2[1]));
        for (int row = 0; row < m2.rows_size; row++) {
            String[] line_of_m = InputStr().split("\\s+");
            for (int col = 0; col < m2.columns_size; col++) {
                m1.arr[row][col] = Integer.parseInt(line_of_m[col]);
            }
        }
        Matrica m = AddMatrix.addmm(m1, m2);
        if (m == null) {
            System.out.print("ERROR");

        } else {
            PrintMatrix.printM(m);
        }
    }


    public static String InputStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
