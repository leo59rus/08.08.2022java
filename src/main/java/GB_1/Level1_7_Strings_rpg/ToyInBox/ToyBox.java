package GB_1.Level1_7_Strings_rpg.ToyInBox;

public class ToyBox {
    private Toy toy;
    private boolean opened;

    public ToyBox() {
        this.opened = true;
    }

    public void open() {
        if (!opened) {//если не открыта
            opened = true;
            System.out.println("мы открыли коробку!");
        } else {
            System.out.println("коробка уже открыта");
        }
    }

    public void close() {
        if (opened) {//если не открыта
            opened = false;
            System.out.println("мы закрыли коробку!");
        } else {
            System.out.println("коробка уже закрыта");
        }
    }

    public void putToy(Toy newToy) {//положить(
        if (!opened) {
            System.out.println("коробка закрыта, в нее нельзя " +
                                       "положить игрушку!");
            return;
        }
        if (toy != null) {
            System.out.println("в этой коробке уже лежит игрушка!");
            return;
        }
        toy = newToy;
        System.out.println(newToy.getName() + " положили в коробку!");
    }

    public void putAwayToy() {
        if (!opened) {
            System.out.println("коробка закрыта - откройте прежде " +
                                       "чем что-то достать");
            return;
        }
        if (toy == null) {
            System.out.println("ничего не достали - коробка пустая!");
            return;
        } else {
            System.out.println("мы достали из коробки игрушку: " + toy.getName());
            toy = null;
        }
    }

    public void info() {//сам дописал работает
        if (!opened) {
            System.out.println("сначала откройте, чтобы посмотреть " +
                                       "содержимое коробки!");
            return;
        }
        if (opened == true && toy != null) {
            System.out.println("в коробке лежит " + toy.getName());
            return;
        } else {
            System.out.println("коробка пустая");
        }
    }
}
