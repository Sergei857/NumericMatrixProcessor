package processor;

public class Matrica {
    int rows_size;
    int columns_size;

    double[][] arr;

    public Matrica(int rows_size, int columns_size) {
        this.rows_size = rows_size;
        this.columns_size = columns_size;
        this.arr = new double[rows_size][columns_size];
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

    public static Matrica mulconstant(Matrica madd1, Double cons) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[r][c] * cons;
            }
        }
        return m;
    }


    public static Matrica mulmatrix(Matrica madd1, Matrica madd2) {
        Matrica m = new Matrica(madd1.rows_size, madd2.columns_size);
        double temp = 0.0;
        //int dlina = 0;
        {
            for (int r_new = 0; r_new < m.rows_size; r_new++)
                for (int c_new = 0; c_new < m.columns_size; c_new++) {
                    for (int dlina = 0; dlina < madd1.columns_size; dlina++) {
                        temp = temp + madd1.arr[r_new][dlina] * madd2.arr[dlina][c_new];
                    }
                    m.arr[r_new][c_new] = temp;
                    temp = 0.0;
                }
        }
        return m;
    }

    public static Matrica transpon1(Matrica madd1) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[c][r];
            }
        }
        return m;
    }

    public static Matrica transpon2(Matrica madd1) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[m.rows_size-c-1][m.columns_size-r-1];
            }
        }
        return m;
    }

    public static Matrica transpon3(Matrica madd1) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[r][m.columns_size-c-1];
            }
        }
        return m;
    }
    public static Matrica transpon4(Matrica madd1) {
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[madd1.rows_size-r-1][c];
            }
        }
        return m;
    }


    public static void printMD(Matrica m) {
        for (int row = 0; row < m.rows_size; row++) {
            for (int col = 0; col < m.columns_size; col++) {
                System.out.print(m.arr[row][col] + " ");
            }
            System.out.print("\n");
        }
    }


}
