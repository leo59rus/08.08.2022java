package GB_2.l1.ENUMeration;

public enum Month {
    //индекс в скобках прописываем только если внизу вызвали гет на
    // индекс и конструктор
    YANUARY(1),
    FEBRUAR(2),
    MART(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULE(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    //создаём индекс числовой для месяа

    private int index;
//get
    public int getIndex() {
        return index;
    }
//constr

    Month(int index) {
        this.index = index;
    }


}
