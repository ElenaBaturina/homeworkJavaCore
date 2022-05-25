package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Elena");
        name.add("Dmitry");
        name.add("Julia");

        System.out.println("Массив изначально:");
        for (String a : name) {
            System.out.println(a);
        }
            Collections.swap(name, 0, 2);
        System.out.println("Массив после замены элементов местами:");
        for (String b : name) {
            System.out.println(b);
        }
    }

}

