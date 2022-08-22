package GB_1.Level1_7_Strings_rpg.heroVSmonster;

public class Unit {
    String name;
    int hp;
    int power;//сила удара

    float avoidChance;//вероятность отвернуться

    public boolean isAlive() {//живой монстр?
        return hp > 0;//true only false
    }

    public Unit(String name, int hp, int power, float avoidChance) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.avoidChance = avoidChance;
    }

    public void takeDamage(int damage) {
        if (Math.random() < avoidChance) {//Math.random() рандомное число от
            // 0 до 1го те 10% что он увернётся
            System.out.println(name + " увернулся от удара");
            return;
        }
        hp -= damage;
        System.out.println(name + " получил " + damage + " единиц " +
                                   "урона!!!");

    }

    public void info() {
        if (hp <= 0) {

            System.out.println(name + " повержен!!");
            return;
        } else {
            System.out.println(name + " ещё жив, у него" +
                                       " осталось " + hp + " ед. " +
                                       "жизни!!");
        }
    }

    public void attack(Unit unit) {
        unit.takeDamage(power);
    }
}
