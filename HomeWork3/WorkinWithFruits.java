package HomeWork3;

import java.util.Arrays;


public class WorkinWithFruits {

        public static void main(String[] args) {
            doLesson_Fruits();

        }

        private static void doLesson_Fruits() {
            HomeWork3.BoxFruit<Apple> appleBox = new HomeWork3.BoxFruit<Apple>(150);
            HomeWork3.BoxFruit<Orange> orangeBox = new HomeWork3.BoxFruit<>(250);
            HomeWork3.BoxFruit<Apple> appleBox2 = new BoxFruit<>(150);

            for (int i = 0; i < 3; i++) {
                orangeBox.addFruit(new Orange());
                appleBox.addFruit(new HomeWork3.Apple());
                appleBox2.addFruit(new HomeWork3.Apple());
            }

            appleBox.addFruit(new HomeWork3.Apple());
            appleBox.addFruit(new HomeWork3.Apple());

            appleBox2.addFruit(new Apple());


            System.out.println("Вес коробки с яблоками : " + appleBox.getBoxWeight());
            System.out.println("Вес коробки с апельсинами : " + orangeBox.getBoxWeight());
            System.out.println("Вес равен : " + appleBox.compare(orangeBox));
            System.out.println("|_______|");

            appleBox.addFruits(appleBox2);

        }

        private static void printArray(Object[] array) {
            System.out.println(Arrays.toString(array));
        }

}
