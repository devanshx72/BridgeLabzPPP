package Level3;

import java.util.Scanner;

class CalendarDisplay {
    // Month names
    static String[] months = {
        "January","February","March","April","May","June",
        "July","August","September","October","November","December"
    };

    // Days in month
    static int[] daysInMonth = {
        31,28,31,30,31,30,31,31,30,31,30,31
    };

    // Check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Days in specific month
    public static int getDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) return 29;
        return daysInMonth[month - 1];
    }

    // Gregorian algorithm to get first day of month
    public static int getFirstDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0)/12) % 7;
        return d0;
    }

    // Display calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("     " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(1, month, year);
        int days = getDays(month, year);

        // Indent for first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        displayCalendar(m, y);
    }
}
