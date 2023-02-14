package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if((year <= 2023 && year > 0) && (month <=12 && month > 0) && (year % 4 !=0) && (month !=2)){
            System.out.println(30);
        } else if ((year <= 2023 && year > 0) && (month <=12 && month > 0) && (year % 4 == 0) && (month == 2)){
            System.out.println(29);
        } else if ((year <= 2023 && year > 0) && (month <=12 && month > 0) && (year % 4 == 0) && (month != 2)){
            System.out.println(30);
        } else {
            System.out.println("invalid date");
        }

    }
}
