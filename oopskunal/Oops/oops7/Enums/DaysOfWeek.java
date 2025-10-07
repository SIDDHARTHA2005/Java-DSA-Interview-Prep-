package oopskunal.Oops.oops7.Enums;
// import java.lang.Enum;

enum Day implements A{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    Day(){
        System.out.println("Constructor called for " + this);
    }

    public void hello(){
        System.out.println("Hey, how are you?");
    }
}

public class DaysOfWeek{
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is : " + today);
        today.hello();

        // for(Day d : Day.values()){
        //     System.out.println(d);
        // }
    }
}