package Stepik.SecondsConverterHours;

import java.util.Scanner;

public class SecondsInHours {
    public static void main(String[] args) {
        System.out.println("введите скколько прошло секунд, чтобы " +
                                   "узнать сколько сейчас времени");
        Scanner scanner = new Scanner(System.in);
        int mySeconds = scanner.nextInt();
        int minutes, vHourse, vSeconds, vMinutes, h24;
        minutes = mySeconds / 60;
        //System.out.println("min " + minutes);
        vHourse = minutes / 60;//36
        h24 = vHourse % 24;
        //  System.out.println(h24);//для часов

        //  System.out.println("hou " + vHourse);

        vMinutes = minutes % 60;
        //  System.out.println("min " + vMinutes);

        vSeconds = mySeconds % 60;
        //   System.out.println("sec " + vSeconds);//для часов

        if (vMinutes < 10 & vSeconds < 10) {
            System.out.printf("%d" + ":" + "0" + "%d" + ":" + "0" + "%d", h24, vMinutes,
                              vSeconds);


        } else if (vMinutes < 10) {
            System.out.printf("%d" + ":" + "0" + "%d" + ":" + "%d",
                              h24, vMinutes,
                              vSeconds);
        } else if (vSeconds < 10) {
            System.out.printf("%d" + ":" + "%d" + ":" + "0" + "%d",
                              h24, vMinutes,
                              vSeconds);
        } else {
            System.out.printf("%d" + ":" + "%d" + ":" + "%d", h24,
                              vMinutes, vSeconds);
        }

    }

}
