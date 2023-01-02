package processor;

public class PrintMatrix {

    public static void printM(Matrica m) {
        for (int row = 0; row < m.rows_size; row++) {
            for (int col = 0; col < m.columns_size; col++) {
                System.out.print(m.arr[row][col] + " ");
            }
            System.out.print("\b\n");
        }
    }
}
