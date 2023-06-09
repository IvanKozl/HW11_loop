import java.time.LocalDate;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void delyvery (int deliveryDistance) {
        deliveryDistance = deliveryDistance;
        int threeDayDelyvery = 100;
        int twoDayDelyvery = 60;
        int oneDayDelivery = 20;
        int deliveryDay = 1;

        if (deliveryDistance < oneDayDelivery) {
            System.out.println("Потребуется дней " + (deliveryDay) + " , срок доставки");
        } else if (deliveryDistance >= oneDayDelivery && deliveryDistance <= twoDayDelyvery){
            System.out.println("Потребуется дней " + (deliveryDay + 1) + " , срок доставки");
        } else if (deliveryDistance > twoDayDelyvery && deliveryDistance <= threeDayDelyvery){
            System.out.println("Потребуется дней " + (deliveryDay + 2) + " , срок доставки");
        } else if (deliveryDistance > threeDayDelyvery){
            System.out.println("Доставка не осуществляется");
        }
    }

    public static void year(int leapYear) {
        int four = 4;
        int one = 100;
        int oneFour = 400;
        if (leapYear % oneFour != 0 && (leapYear % four != 0 || leapYear % one == 0)) {
            System.out.println("год не является високостным");
        } else {
            System.out.println("Год является високостным");
        }

    }

    public static void clients(int clientOs, int clientYear) {
        int android = 1;
        int current_Year = LocalDate.now().getYear();
        int iOs = 0;
        if (clientOs == iOs) {
            if (clientYear >= current_Year) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else if (clientYear < current_Year) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOs == android) {
            if (clientYear >= current_Year) {
                System.out.println("Установите обычную версию приложения для Андроид по ссылке");

        } else if (clientYear < current_Year) {
            System.out.println("Установите облегченную версию приложения для Андроид по ссылке");
            }
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int leapYear = 2001;
        year(leapYear);
        --leapYear;
        year(leapYear);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientYear = 2018;
        int clientOs = 1;
        clients(clientOs, clientYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 50;
        delyvery (deliveryDistance);
    }
    }
