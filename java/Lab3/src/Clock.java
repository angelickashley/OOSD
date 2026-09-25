import java.util.Calendar;

public class Clock {
    public static void main (String[] args){
        Calendar cal = Calendar.getInstance();
        lab3.Time t = new lab3.Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        int startingMinute = cal.get(Calendar.MINUTE);

        System.out.println("Clock started...\n");
        while (t.getMinute() == startingMinute){
            System.out.println("Current time: " + t);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
            t.tick();
        }
        System.out.println("\n Minute changed");
    }
}