public class Main {

    //Task 1
    public static void calculateLeapYear() {
        int year = 2024;
        boolean leapYear = (year >= 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)));
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}