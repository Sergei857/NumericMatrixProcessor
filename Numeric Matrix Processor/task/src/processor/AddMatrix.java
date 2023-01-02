package processor;

public class AddMatrix {


    public static Matrica addmm(Matrica madd1, Matrica madd2) {
        if ((madd1.rows_size != madd2.rows_size) || (madd1.columns_size != madd2.columns_size)) {
            return null;
        }
        Matrica m = new Matrica(madd1.rows_size, madd1.columns_size);
        for (int r = 0; r < madd1.rows_size; r++) {
            for (int c = 0; c < madd1.columns_size; c++) {
                m.arr[r][c] = madd1.arr[r][c] + madd2.arr[r][c];
            }
        }
        return m;
    }
}
