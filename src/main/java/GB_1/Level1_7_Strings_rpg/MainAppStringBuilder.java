package GB_1.Level1_7_Strings_rpg;

public class MainAppStringBuilder {
    public static void main(String[] args) {
        sb();
        System.out.println(7 > 7);//false
        System.out.println();
        a();
        System.out.println();
        b();

    }

    public static void sb() {
        StringBuilder stb = new StringBuilder(100000);
        //изменяемая
        // строка/capacity кол-во выделенных ячеек под символы
        for (int i = 0; i < 100000; i++) {
            stb.append("a");//добавление к строке
        }
        System.out.println(stb);
    }

    public static void a() {
        String a = "A";
        String b = "A";
        String c = new String("A");
        System.out.println(a == b);//true
        System.out.println(b == c);//false тк задействовоны разные
        // участки памяти
        System.out.println("правильное сравнение");
        System.out.println(a.equals(c));//сравнение по символам
    }

    public static void b() {
        String f = "ABCDEFGHI";
        String c = "A";
        System.out.println(f.length());//9
        System.out.println(f.getBytes() + " " + c.getBytes());
        //bytesKod
        System.out.println(f.toLowerCase());//abcdefghi

        System.out.println(f.toUpperCase());//ABCDEFGHI

        f = f.toLowerCase();//поменяли строку и запомнили
        System.out.println(f);

    }
}
