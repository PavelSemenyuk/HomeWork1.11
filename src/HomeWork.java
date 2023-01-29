public class HomeWork {
    public static void leapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным!");
        } else if (year % 4 == 00 && year % 100 == 0 && year % 400 == 00) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " Не високосный");
        }

    }

    public static void softVersion (int clientOS, int clientDeviceYear) {


        int ios=0;
        int android = 1;

        if (clientOS==ios) {
            System.out.println ("Установите версию приложения для iOS по ссылке.");
            if (clientDeviceYear<2015){
                System.out.println( "ВНИМАНИЕ! Установите облегченную версию приложения для iOS по ссылке.");
            }
        }
        else if (clientOS==android) {
            System.out.println("Установите версию приложения для Android по ссылке.");
            if (clientDeviceYear<2015){
                System.out.println("ВНИМАНИЕ! Установите облегченную версию приложения для Android по ссылке.");
            }
        }
    }

    public static void deliveryService(int deliveryDistance) {

        int daysA = 1;
        int daysB = 2;
        int daysC = 3;

        if (deliveryDistance<20){
            System.out.println("Потребуется дней: " + daysA );
        } else if (deliveryDistance>20 && deliveryDistance<60) {
            System.out.println("Потребуется дней: " + daysB);
        } else if (deliveryDistance>60 && deliveryDistance<100){
            System.out.println("Потребуется дней: " + daysC);
        } else {
            System.out.println("Свыше 100 км доставки нет!");
        }
    }

    public static void main(String[] args) {

        task1();
        task2();
        task3();
    }


    /*  Задача 1
Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным,
и выводит результат в консоль.
Эту проверку вы уже реализовывали в задании по условным операторам.
Теперь проверку оберните в метод и используйте год, который приходит в виде параметра.
Результат программы выведите в консоль. Если год високосный, то напечатайте сообщение:
 «...  год — високосный год». Если год невисокосный, то: «... год — невисокосный год».*/

    public static void task1 () {
        System.out.println();
        System.out.println("Задача 1");
        leapYear(2020);
        leapYear(1900);
    }


/*Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
Если устройство старше текущего года, предложите ему установить облегченную версию.
Текущий год можно получить таким способом:
int currentYear = LocalDate.now().getYear();
Или самим задать значение вручную — ввести в переменную числовое значение.
В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
и для какой ОС (Android или iOS) установить пользователю.*/

    public static void task2() {
        System.out.println();
        System.out.println("Задача 2");
        softVersion(1,2022);
        System.out.println();
        softVersion(0,2010);
    }


/* Возвращаемся к задаче на расчет дней доставки банковской карты.
Ваша задача — доработать код, а именно написать метод,
который на вход принимает дистанцию и возвращает итоговое количество дней доставки.*/

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        deliveryService(45);

    }
}
