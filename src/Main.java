import java.time.LocalDate;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        int threeDayDelyvery = 100;
        int deliveryDays = 0;
        int twoDayDelyvery = 60;
        int oneDayDelivery = 20;
        if (deliveryDistance < oneDayDelivery) {
            deliveryDays = 1;
        } else if (deliveryDistance <= twoDayDelyvery) {
            deliveryDays = 2;
        } else if (deliveryDistance <= threeDayDelyvery) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }
        return deliveryDays;

    }

    public static void checkYearIsLeap(int leapYear) {
        int four = 4;
        int one = 100;
        int oneFour = 400;
        if (leapYear % oneFour == 0 || leapYear % four == 0 && leapYear % one != 0) {
            System.out.println("Год является високостным");
        } else {
            System.out.println("год не является високостным");
        }

    }

    public static void calculateClientsProgram(int clientOs, int clientYear) {
        int android = 1;
        int currentYear = LocalDate.now().getYear();
        int iOs = 0;
        if (clientOs == iOs) {
            if (clientYear >= currentYear) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (clientYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOs == android) {
            if (clientYear >= currentYear) {
                System.out.println("Установите обычную версию приложения для Андроид по ссылке");
            } else if (clientYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
            }
        }

    }

    public static void task1() {
        System.out.println("Задача 1");
        int leapYear = 2001;
        checkYearIsLeap(leapYear);
        --leapYear;
        checkYearIsLeap(leapYear);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientYear = 2018;
        int clientOs = 1;
        calculateClientsProgram(clientOs, clientYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int day = calculateDeliveryTime(50);
        if (day > 0) {
            System.out.println("Доставка займет " + day + " дней.");
        } else {
            System.out.println("Доставки нет");
        }
    }
}