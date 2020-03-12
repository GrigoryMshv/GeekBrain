package Lesson_2;

public class StringArr {
    public static void main(String[] args) {

        String[][] stringArr = {
                {"1", "2", "3", "four", "7"},
                {"5", "six", "7", "8"},
                {"9", "ten", "11", "12"},
                {"13", "14", "fifteen", "16"},
        };

        myArraySizeException(stringArr);
    }

    static void myArraySizeException(String[][] stringArr)  {
        int i = 0; // Не понятно почему IDE попросила инициализировать i. Ошибка была вызвана в строке 36
        int j;

        // проверка массива на размер 4 х 4
        try {
            if(stringArr.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив не равен размеру 4 x 4.\nЧисло строк массива не равно 4.");
          }

        try {
            for (i = 0; i < stringArr.length; i++) {
                if (stringArr[i].length != 4) {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Массив не равен размеру 4 x 4.\nЧисло элементов в строке № " + (i + 1) + " не равно 4.");
        }

        // преобразование и суммирование элементов массива
        int n = 0;

        for (i = 0; i < stringArr[0].length; i++) {
            for (j = 0; j < stringArr[0].length; j++) {

                try {
                    n += Integer.parseInt(stringArr[i][j]); // считаем сумму массива
                } catch (NumberFormatException e) {
                    System.out.println("Исключение в ячейки " + i + " " + j);
                } catch (ArrayIndexOutOfBoundsException e) {
                }
            }
        }
        System.out.println("Сумма элементов массива = " + n);
    }
}

