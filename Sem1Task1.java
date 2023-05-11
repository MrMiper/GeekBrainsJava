// Написать програмум, которая запросит пользователя ввести <Имя> в консоли
// Получит введенную строку и выведет в консоль сообщение "Привет, <Имя>!"

// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

import java.time.LocalTime;
import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ваше имя ");
        String name = iScanner.nextLine();
        iScanner.close();
        LocalTime time = LocalTime.now();
        if(time.getHour() >= 5 && time.getHour() < 12)
        {
            System.out.printf("Доброе утро, %s!", name);
        }
        if(time.getHour() >= 12 && time.getHour() < 18)
        {
            System.out.printf("Добрый день, %s!", name);
        }
        if(time.getHour() >= 18 && time.getHour() < 23)
        {
            System.out.printf("Добрый вечер, %s!", name);
        }
        if(time.getHour() >= 23 || time.getHour() < 5)
        {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}