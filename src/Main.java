import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2024);
        recomendApplicationVersion(0, 2022);
        System.out.println(calculateDeliveryDays(55));
    }

        private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }


    private static boolean isLeap(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static void recomendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.println("Установите ");
        if (deviceIsOld) {
            System.out.println("Lite ");
        }
        System.out.println("версию для ");
        if (clientOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    public static void printSetSystem(int clientDeviceYear, int clientDevice) {
        String version = "";
        if (clientDeviceYear < 2015) {
            version = "облегченную";
        }
        String device = "";
        if (clientDevice == 0) {
            device = "iOS";
        } else if (clientDevice == 1) {
            device = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", version, device);
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    private static void choosingVersion(int oS, int yearManufacture) {
        String osType = "";
        switch (oS) {
            case 0:
                osType = "iOS";
                break;
            case 1:
                osType = "Android";
        }
        System.out.printf("Установите %s версию приложения для %s по ссылке", getVersionByYear(yearManufacture), osType);
    }

    private static String getVersionByYear(int year) { return year < LocalDate.now().getYear() ? "Lite" : "";
    }

    public static String calculateDeliveryDays(int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
          return "Невозможно рассчитать срок доставки";
        }
        return "Потребуется дней " + deliveryDays;
    }

}