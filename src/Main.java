import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        //1

        int year = 2021;
        printIsLeapYearResult(year);
    }

    private static void printIsLeapYearResult(int year) {
        if (isLeap(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

    }

    //2
    static   {
        int clientOS = 0;
        int clientDeviceYear = 2015;

        recommendAppVersion(clientOS, clientDeviceYear);

        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Неизвестная операционная система");

        } else {
            String operationSystem;
            if (clientOS == 0) {
                operationSystem = "ios";
            } else {
                operationSystem = "Android";
            }

            String message;
            if (clientDeviceYear < 2015) {
                message = "Установите облегченную версию приложения для " + operationSystem +
                        " по ссылке";
            } else {
                message = "Установите облегченную версию приложения для " + operationSystem +
                        " по ссылке";
            }
            System.out.println(message);

        }
    }

    private static void recommendAppVersion(int clientOS, int clientDeviceYear) {
    }

    static {
        //3
        int deliveryDistance = 25;

        int deliveryTime = getDeliveryTime(deliveryDistance);

        if (deliveryTime == -1) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    private static int getDeliveryTime(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance > 100){
            deliveryTime = -1;
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                deliveryTime ++;
            } else if (deliveryDistance > 60) {
                deliveryTime += 2;
            }
        }
        return deliveryTime;

    }
}

