package GB_2.Level2_1.hw1;

public class Wall implements Let {
    Sportsmens s;
    private int height;

    public int getHeight() {
        return height;
    }

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public void overcome(Sportsmens s) {
        this.s = s;

        if (s.isReady() == true) {
            s.jump();
            if (height < s.getJumpMax()) {

                System.out.println(s.getName() + " перепрыгнул " +
                                           "стену " +
                                           "высотой" +
                                           " " + height);

            } else {
                System.out.println(s.getName() + " не смог " +
                                           "перепрыгнуть" +
                                           " стену высотой " + height);
                s.setReady(false);
            }
        } else {
            System.out.println(s.getName() + " не дошёл до " +
                                       "следующего препятствия" +
                                       " ");
        }
    }
}
