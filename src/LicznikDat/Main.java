package LicznikDat;

public class Main {
    public static void main(String[] args) {

        SimpleDate date = new SimpleDate(30,10,2017);
        SimpleDate date2 = new SimpleDate(29,10,2017);

        System.out.println("Friday of the examined week is " );

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week++;
        }

        System.out.println(date.before(date2));

        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println("Try " + date.afterNumberOfDays(790));
    }
}