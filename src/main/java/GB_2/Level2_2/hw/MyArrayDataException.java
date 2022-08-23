package GB_2.Level2_2.hw;

public class MyArrayDataException extends NumberFormatException {
    int i;
    int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
