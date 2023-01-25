import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkYear(1600);
        installApp(0, 2022);
        bankcardDelivery(10);
    }

    public static void checkYear(int year) {
        System.out.println("\nЗадание: 1");
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год — високосный год");
        }
        else if (year % 400 == 0){
            System.out.println(year + " год — високосный год");
        }
        else {
            System.out.println(year + " год — невисокосный год");
        }
    }


    public static void installApp(int clientOS, int clientDeviceYear) {
        System.out.println("\nЗадание: 2");
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                throw new RuntimeException ("Неправильно задан год выпуска устройства!");
            }
        }
        else if (clientOS == 1) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                throw new RuntimeException ("Неправильно задан год выпуска устройства!");
            }
        }
    }

    public static void bankcardDelivery(int deliveryDistance) {
        System.out.println("\nЗадание: 3");
        int deliveryTimeInDays;
        if (deliveryDistance < 20) {
            deliveryTimeInDays = 1;
            System.out.println("Для доставки потребуется дней: " + deliveryTimeInDays);
        }
        else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTimeInDays = 2;
            System.out.println("Для доставки потребуется дней: " + deliveryTimeInDays);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTimeInDays = 3;
            System.out.println("Для доставки потребуется дней: " + deliveryTimeInDays);
        }
        else {
            System.out.println("Доставки нет.");
        }

    }
}