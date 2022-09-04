package GB_2.l2_exception.hw;

//Напишите метод, на вход которого подаётся двумерный строковый
// массив размером 4х4. При
//подаче массива другого размера необходимо бросить исключение
// MyArraySizeException.
//Далее метод должен пройтись по всем элементам массива,
// преобразовать в int и
//просуммировать. Если в каком-то элементе массива преобразование
// не удалось (например, в
//ячейке лежит символ или текст вместо числа), должно быть брошено
// исключение
//MyArrayDataException с детализацией, в какой именно ячейке лежат
// неверные данные.
//В методе main() вызвать полученный метод, обработать возможные
// исключения
//MyArraySizeException и MyArrayDataException и вывести результат
// расчета (сумму элементов,
//при условии что подали на вход корректный массив).
public class MainApp {


    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String Str1[][] = {
                {"1", "2", "2", "2"},
                {"23", "12", "2", "2"},
                {"23", "12", "2", "2"},
                {"23", "12", "2", "2"}
        };
        String Str2[][] = {
                {"23", "1g2", "2", "2"},
                {"a1", "a2", "a3"},
                {"b1", "b2", "b3"},
                {"b1", "b2", "b3"}

        };
        String Str3[][] = {
                {"2;3", "1g2", "2", "2"},
                {"2;3", "12", "2", "2"},
                {"23", "1o2", "2", "2"},
                {"23", "12", "2", "2"}
        };

        try {
            mass(Str2);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива должен быть 4x4!");

        }

    }

    public static int mass(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (strings.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (strings[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("ошибка в ячейке [" + i +
                                               "][" + j + "]");
                }
            }
        }

        return sum;

    }


}
