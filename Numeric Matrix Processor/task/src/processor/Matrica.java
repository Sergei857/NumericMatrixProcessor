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
}
