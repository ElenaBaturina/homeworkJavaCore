package HomeWork4;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("лето");
        wordList.add("море");
        wordList.add("горы");
        wordList.add("рафтинг");
        wordList.add("река");
        wordList.add("море");
        wordList.add("июль");
        wordList.add("жара");
        wordList.add("море");
        wordList.add("август");
        wordList.add("солнце");
        wordList.add("горы");
        wordList.add("ветер");

        System.out.println("=========================");

        for (int i = 0; i < wordList.size(); i++) {
            if (calcWord(wordList, wordList.get(i)) == 1) {
                System.out.println(wordList.get(i));
            }
        }

        System.out.println("=========================");

        phoneBook();

    }
    public static int calcWord(ArrayList<String> arrList, String word) {
        return Collections.frequency(arrList, word);
     }


    private static void phoneBook() {
        HomeWork4.PhoneBook phoneBook = new PhoneBook();
        phoneBook.addElementPhoneBook("Julia","89185563512");
        phoneBook.addElementPhoneBook("Sonia","89281154433");
        phoneBook.addElementPhoneBook("Julia","89775226374");
        phoneBook.addElementPhoneBook("Alex","876544");
        phoneBook.addElementPhoneBook("Alex","8 765 44");


        System.out.println("Julia: " + phoneBook.getPhonesByName("Julia"));
        System.out.println("Alex: " + phoneBook.getPhonesByName("Alex"));
        System.out.println("Sofia: " + phoneBook.getPhonesByName("Sofia"));
        System.out.println("Sonia: " + phoneBook.getPhonesByName("Sonia"));
    }


}
