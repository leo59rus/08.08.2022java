package GB_1.Level1_7_Strings_rpg.heroVSmonster;

public class RpgApplication {
    public static void main(String[] args) {
        Heroes hero = new Heroes("Рыцарь Джек", 10000000, 2, 0.9f);
        Monster mons = new Monster("DRAGON", 10000000, 2, 0.9f);
       int round = 1;
       do {
           System.out.println("ROUND: " + round);
           hero.attack(mons);
           mons.attack(hero);
           mons.info();
           hero.info();
           round++;
       } while (mons.isAlive() && hero.isAlive());
        System.out.println("THE END");








    }
}
