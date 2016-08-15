package ChapterFour;

import java.util.Scanner;

public class FourSeventeen {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year (Ex: 2013): " );
        int year = input.nextInt();
        System.out.print("Enter a month (Ex: May): " );
        String month = input.next();
        input.close();

        if (getMonthNumber(month) == 0) {
            System.out.println("Month name is case sensitive...");
            System.out.println("Invalid month input.");
            System.exit(0);
        }

        System.out.println(month + " " + year + " has " +
                getNumOfDaysInMonth(year, getMonthNumber(month)) + " days.");
    }

    static int getNumOfDaysInMonth(int year, int month) {

        switch (month) {
            case 1: return 31;
            case 2: return leapYear(year) ? 28 : 29;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
                default: return 0;
        }

    }

    public static int getMonthNumber(String month) {
        
        int month;
        
        switch (month) {
            case "Jan":
                month = 1;
                break;
            case "Feb":
                month = 2;
                break;
            case "Mar":
                month = 3;
                break;
            case "Apr":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "Jun":
                month = 6;
                break;
            case "Jul":
                month = 7;
                break;
            case "Aug":
                month = 8;
                break;
            case "Sep":
                month = 9;
                break;
            case "Oct":
                month = 10;
                break;
            case "Nov":
                month = 11;
                break;
            case "Dec":
                month = 12;
                break;
            default:
                month = 0;
                break;
        }

        return month;
    }


    static boolean leapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

}
