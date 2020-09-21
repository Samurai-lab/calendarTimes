import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
/*
Перед запуском программы поменяйте месяц на свой месяц рождения!!!
 */
public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день своего рождения: ");
        Integer age = scanner.nextInt();
        System.out.println("Введите год своего рождения: ");
        Integer year = scanner.nextInt();

        //Формат даты
        Calendar calendar = Calendar.getInstance();
        //Задаем дату дня рождения, от которой пойдет отсчет
        //Поменяйте месяу здесь!!!! (Calendar.)
        calendar.set(year, Calendar.JANUARY, age);
        //Данная переменная будет считать года
        int i = 0;
        //Если дата рождения раньше текущей даты, то верно
        for (; Instant.now().compareTo(calendar.getTime().toInstant()) > 0; i++) {
            //Вывод даты
            System.out.println(i + new SimpleDateFormat(" - dd.MM.yyyy - EEEE",Locale.getDefault()).format(calendar.getTime()) + new SimpleDateFormat(" - EEEE",Locale.ENGLISH).format(calendar.getTime()));
            //Прибовляем года при верном условии
            calendar.add(Calendar.YEAR, +1);
        }
    }
}