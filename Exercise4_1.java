public class Exercise4_1 {

    // American format: Saturday, July 22, 2015
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // European format: Saturday 22 July 2015
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        String day = "Saturday";
        int date = 22;
        String month = "February";
        int year = 2022;

        System.out.println("American format:");
        printAmerican(day, date, month, year);

        System.out.println("European format:");
        printEuropean(day, date, month, year);
    }
}
