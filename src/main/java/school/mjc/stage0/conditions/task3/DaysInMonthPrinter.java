package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month>=1 && month<=7){
            if(month%2==0){
                System.out.println("30");
            }
        } else if (month >=8 && month <=12) {
            System.out.println("31");
        }else{
            System.out.println("wrong number!");
        }
    }
}
