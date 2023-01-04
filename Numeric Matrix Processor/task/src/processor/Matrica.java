package processor;

public class Matrica {
    int rows_size;
    int columns_size;

    Integer[][] arr;

    public Matrica(int rows_size, int columns_size) {
        this.rows_size = rows_size;
        this.columns_size = columns_size;
        this.arr = new Integer[rows_size][columns_size];
    }

    public static Matrica add(Matrica madd1, Matrica madd2) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[r][c] + madd2.arr[r][c];
            }
        }
        return m;
    }

    public static Matrica mulconstant(Matrica madd1, int cons) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[r][c] * cons;
            }
        }
        return m;
    }


    public static Matrica mulmatrix(Matrica madd1, Matrica madd2) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[r][c];
            }
        }
        return m;
    }


    public static void printM(Matrica m) {
        for (int row = 0; row < m.rows_size; row++) {
            for (int col = 0; col < m.columns_size; col++) {
                System.out.print(m.arr[row][col] + " ");
            }
            System.out.print("\n");
        }
    }
}
