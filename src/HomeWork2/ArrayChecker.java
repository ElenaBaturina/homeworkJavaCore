package HomeWork2;

public class ArrayChecker {
    private String[][] height;

    public void setStrings(String[][] strings) {
        try {
            checkSizeArray(strings);
            this.height = strings;
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (NullPointerException ne) {
            System.out.println("В параметр массива передан null!");
            ne.printStackTrace();
        }
    }

    private void checkSizeArray(String[][] strings) throws MyArraySizeException {
        if (strings.length != 4 || checkLengthStrings(strings)){
            throw new MyArraySizeException("Размер массива не 4х4");
        }
    }

    private boolean checkLengthStrings(String[][] strings) {
        for (String [] str: strings){
            if (str.length!=4){return true;}
        } return false;
    }

    public void summ() {
        if (height == null) {
            System.out.println("Cуммировать нечего");
            return;
        }  try {
            summArray();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private void summArray() throws MyArrayDataException {
        int result = 0;
        for (int j = 0; j <= height.length; j++) {
            String[] str = height[j];
            for (int f = 0; f < str.length; f++) {
                try {
                    result+=Integer.parseInt(str[f]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException("Массив содержит не только числа, суммирование не возможно. Ошибка в ячейке: " + f + ":" + j);
                }
            }
        }
        System.out.println("Сумма элементов массива: " + result);
    }
}
