package Package1;

import java.util.Arrays;
import java.util.Scanner;

/* Организовать ввод с клавиатуры даты рождения че-
          ловека, программа должна вывести знак зодиака и на-
          звание года по японскому календарю. Предполагаем,
          что пользователь всегда корректно вводит данные.
            Пример входных данных:
            5 декабря 1974 г
            Вывод:
            Знак: стрелец Год: тигра*/
public class task1 {


    public static void main(String[] args) {
        String[] years = {
                "Обезьяна ",
                "Петух",
                "Собака",
                "Кабан",
                "Крыса",
                "Бык",
                "Тигр",
                "Заяц",
                "Змея",
                "Лошадь ",
                "Овца",
                "Обезьяна",
        };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter date: ");
        String str = in.nextLine();

        String[] date = str.split(" ", -1);
        System.out.println(Arrays.toString(date));
        int dey = Integer.parseInt(date[0]);
        String month = date[1];
        int year = Integer.parseInt(date[2]);
        int tmp = year;
        while (tmp >= 12) {
            tmp %= 12;
        }
        String yearJapen = years[tmp - 1];
        System.out.println(yearJapen);
String zodiac="фф";
        if (month.equalsIgnoreCase("январь")){
            if (dey>=1&&dey<20) zodiac="козерог";
            if (dey>=20&&dey<31) zodiac="водолей";
        } else if (month.equalsIgnoreCase("февраль")) {
            if (dey>=1&&dey<18) zodiac="водолей";
            if (dey>=18&&dey<28) zodiac="рыбы";
        }else if (month.equalsIgnoreCase("март")) {
            if (dey>=1&&dey<20) zodiac="рыбы";
            if (dey>=20&&dey<31) zodiac="овен";
        }else if (month.equalsIgnoreCase("апрель")) {
            if (dey>=1&&dey<20) zodiac="овен";
            if (dey>=20&&dey<30) zodiac="телец";
        }else if (month.equalsIgnoreCase("май")) {
            if (dey>=1&&dey<20) zodiac="телец";
            if (dey>=20&&dey<31) zodiac="близнецы";
        }else if (month.equalsIgnoreCase("июнь")) {
            if (dey>=1&&dey<21) zodiac="близнецы";
            if (dey>=20&&dey<30) zodiac="рак";
        }else if (month.equalsIgnoreCase("июль")) {
            if (dey>=1&&dey<23) zodiac="рак";
            if (dey>=20&&dey<30) zodiac="лев";
        }else if (month.equalsIgnoreCase("август")) {
            if (dey>=1&&dey<21) zodiac="лев";
            if (dey>=20&&dey<30) zodiac="дева";
        }else if (month.equalsIgnoreCase("сентябрь")) {
            if (dey>=1&&dey<21) zodiac="дева";
            if (dey>=20&&dey<30) zodiac="весы";
        }else if (month.equalsIgnoreCase("октябрь")) {
            if (dey>=1&&dey<21) zodiac="весы";
            if (dey>=20&&dey<30) zodiac="скорпион";
        }else if (month.equalsIgnoreCase("ноябрь")) {
            if (dey>=1&&dey<21) zodiac="скорпион";
            if (dey>=20&&dey<30) zodiac="стрелец";
        }else if (month.equalsIgnoreCase("декабрь")) {
            if (dey>=1&&dey<21) zodiac="стрелец";
            if (dey>=20&&dey<30) zodiac="козерог";
        }
        System.out.println(zodiac);



    }
}
