package GB_2.l2_exception.hw.newHW;

public class MyArrayDataException extends RuntimeException{
    private int row;//строка
    private int column;//столбец

    public MyArrayDataException(int row, int column) {
        super("Invalid data [row= "+ row + " column = " + column +
                      "]");//текст при выбросе исключения с
        // указанием строоки и столбца ошибки

        this.row = row;
        this.column = column;
    }
}
