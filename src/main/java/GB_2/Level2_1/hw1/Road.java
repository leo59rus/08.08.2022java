package GB_2.Level2_1.hw1;

public class Road implements Let {
    private int length;
    Sportsmens s;

    public Road(int length) {
        this.length = length;
    }


    @Override
    public void overcome(Sportsmens s) {
        this.s = s;

        if (s.isReady() == true) {
            s.run();
            if (length < s.getRunMax()) {

                System.out.println(s.getName() + " пробежал " +
                                           "дистанцию " + length);

            } else {
                System.out.println(s.getName() + " не смог " +
                                           "пробежать " +
                                           "дистанцию " + length);
                s.setReady(false);
            }
        } else {
            System.out.println(s.getName() + " не дошёл до " +
                                       "следующего препятсвия" +
                                       " ");
        }
    }
}