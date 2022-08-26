package GB_2.l3_collection.Task3;

import java.util.Objects;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    //alt ins
    @Override
    public boolean equals(Object o) {//на проверку вставляем объект
        if (this == o)//если равны то тру
            return true;
        if (o == null || getClass() != o.getClass())//если объект
            // равен нулю или другого класса фолс
            return false;
        Box box = (Box) o;//при тру коробка стала box
        return size == box.size && color.equals(box.color);
        //сравниваем по конструктору в данном случае размер цвет
    }

    //вставился с equals
    @Override//при переопределении екуалс и хэшкода надо иметь
    // ввиду что одинаковые коробки должны иметь одинаковый хэшкод,
    // разные коробки разный хэшкод
    public int hashCode() {//метод преобразующий объект в число
        return/*вставляем как хотим*/ color.hashCode() + size * 71;
        //в ДС хэш код цвета + размер * 71(из головы-ничеого не
        // значит)
    }
}
