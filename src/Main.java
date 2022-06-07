import java.time.LocalDate;

public class Main {

    //Задача 1 - Метод про високосные года
    public static void Year (int year){
        //int year = 2021;
        float yearOstatok4 = year % 4;
        float yearOstatok100 = year % 100;
        float yearOstatok400 = year % 400;
        if (yearOstatok4 == 0 || yearOstatok400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            if (yearOstatok4 != 0 || yearOstatok100 == 0 || yearOstatok400 != 0) {
                System.out.println(year + " - не високосный год");
            }
        }
    }

    //Задача 2 - Метод по установку приложений
    public static void clientApp (String clientOS, int clientDeviceYear) {

        int currentYear = LocalDate.now().getYear();

        if (clientOS.equals("iOS")) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS.equals("Android")) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
        if (!clientOS.equals("Android") && !clientOS.equals("iOS")){
            System.out.println("Приложений для такой системы у нас нет!");
        }
    }

    //Задача 3 - Метод про доставку карт
    public static int deliveryDays (int deliveryDistance){
        int days = 0;
        if (deliveryDistance <= 20) {
            days = days + 1;
        } else {
            if (deliveryDistance <= 60) {
                days = days + 2;
            } else {
                if (deliveryDistance <= 100) {
                    days = days + 3;
                }
            }
        }
        return days;
    }


    public static void main(String[] args) {

        //Метод про высокосные года
        int year = 2022;
        Year (year);
        System.out.println(" ");

        //Метод про установку приложений
        String clientOS = "iOS";
        int clientDeviceYear = 2015;
        clientApp (clientOS, clientDeviceYear);
        System.out.println(" ");

        //Метод про доставку карт
        int deliveryDistance = 15;
        int totalDays = deliveryDays(deliveryDistance);
        System.out.println("Количество дней для доставки - " + totalDays);
        System.out.println(" ");
    }
}