package DateAndTime;

import java.util.Date;

public class LaunchDateTime {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date);

        Long time =date.getTime();
        System.out.println(time);

        Date sdate=new Date(time);
        // here there is no empty constructor we have to pass parameter and i have passed  time which i get from get time
    }
}
