package GB_2.l2_exception.hw.newHW;

public class MainApp {
    public static void main(String[] args) {
        String[][] testData = {
                {"1", "2f", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            System.out.println(analyze(testData));

        }catch(MyArraySizeException e){//
            e.printStackTrace();
        }catch(MyArrayDataException e){
            e.printStackTrace();
        }
    }

    public static int analyze(String[][] array) {
        int sum = 0;

        if (array.length != 4) {//если колво строк не 4 исключение
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4; i++) {
            if (array[i].length != 4) {//проверка длины в каждой
                // строке(столбцы)
                throw new MyArraySizeException();

            }
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);//Integer
                    // .parseInt преобразоание строки в число

                } catch (NumberFormatException e) {//если в строке не
                    // число
                    throw new MyArrayDataException(i, j);//с
                    // указанием координат ошибочной ячейки

                }

            }
        }
        return sum;

    }
}
