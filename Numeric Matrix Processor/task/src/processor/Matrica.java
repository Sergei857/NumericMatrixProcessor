package processor;

public class Matrica {
    int x_size;
    int y_size;

    Integer[][] arr;

    public Matrica(int x_size, int y_size) {
        this.x_size = x_size;
        this.y_size = y_size;
        this.arr = new Integer[x_size][y_size];
    }
}
