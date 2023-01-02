package processor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String input_str = InputStr();
        String[] size_m1 = input_str.split("\\s+");
        Matrica m1 = new Matrica(Integer.parseInt(size_m1[0]), Integer.parseInt(size_m1[1]));
        for (int i, i<)


    }


    public static String InputStr() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}
