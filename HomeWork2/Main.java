package HomeWork2;

public class Main {


    public static void main(String[] args) {
        String[][] strings = createArray();
        HomeWork2.ArrayChecker arrayChecker = new ArrayChecker();
        arrayChecker.setStrings(strings);
        arrayChecker.summ();
    }


    private static String[][] createArray() {
        String[][] array = new String[4][4];
       for (int y = 1; y < 5; y++, System.out.println()){
            for (int x = 1; x < 5; x++) {
                System.out.print(x * y + " ");
            }
        } return array;
    }

}

