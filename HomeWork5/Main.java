package HomeWork5;

import java.io.*;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args){

       try (InputStreamReader in = new InputStreamReader(new FileInputStream("example.csv"), UTF_8)) {
            int x;
            while ((x = in.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();


        AppData data = new AppData();
        data.readFile("example.csv");
        System.out.println(Arrays.toString(data.getHeader()));
        System.out.println(Arrays.deepToString(data.getData()));

        data.writeToFile("new_example.csv");


    }



}
