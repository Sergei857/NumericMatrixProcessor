package processor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a constant");
            System.out.println("3. Multiply matrices");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            String chois = InputStr();
            if (chois.equals("0")) break;
            switch (chois) {
                case "1" -> {
                    System.out.print("Enter size of first matrix: ");
                    String[] size_m1 = InputStr().split("\\s+");
                    System.out.println("Enter first matrix:");
                    Matrica m1 = inputmatrix(size_m1);
                    System.out.print("Enter size of second matrix: ");
                    String[] size_m2 = InputStr().split("\\s+");
                    System.out.println("Enter second matrix:");
                    Matrica m2 = inputmatrix(size_m2);
                    if (size_m1.equals(size_m2)) {
                        System.out.println("The result is:");
                        Matrica m_result = Matrica.add(m1, m2);
                        Matrica.printMI(m_result);
                        System.out.println("");
                    } else {
                        System.out.println("The operation cannot be performed.\n");
                    }
                }
                case "2" -> {
                    System.out.print("Enter size of matrix: ");
                    String[] size_m1 = InputStr().split("\\s+");
                    System.out.println("Enter matrix:");
                    Matrica m1 = inputmatrix(size_m1);
                    System.out.print("Enter constant: ");
                    Double constant_of_m1 = Double.valueOf(InputStr());
                    System.out.println("The result is:");
                    Matrica m_result = Matrica.mulconstant(m1, constant_of_m1);
                    Matrica.printMD(m_result);
                    System.out.println("");
                }
                case "3" -> {
                    System.out.print("Enter size of first matrix: ");
                    String[] size_m1 = InputStr().split("\\s+");
                    System.out.println("Enter first matrix:");
                    Matrica m1 = inputmatrix(size_m1);
                    System.out.print("Enter size of second matrix: ");
                    String[] size_m2 = InputStr().split("\\s+");
                    System.out.println("Enter second matrix:");
                    Matrica m2 = inputmatrix(size_m2);
                    System.out.println("The result is:");
                    Matrica m_result = Matrica.mulmatrix(m1, m2);
                    Matrica.printMI(m_result);
                    System.out.println("");
                }
            }
        }
    }


    public static Matrica inputmatrix(String[] size_m) throws IOException {
        Matrica m = new Matrica(Integer.parseInt(size_m[0]), Integer.parseInt(size_m[1]));
        for (int row = 0; row < m.rows_size; row++) {
            String[] line_of_m = InputStr().split("\\s+");
            for (int col = 0; col < m.columns_size; col++) {
                m.arr[row][col] = Double.valueOf(line_of_m[col]);
            }
        }
        return m;
    }


    public static String InputStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
