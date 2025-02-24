package DateAndTime;

import java.util.Date;

public class LaunchDateTime {
    public static void main(String[] args) {
        Date date =new Date();
        System.out.println(date);

        Long time =date.getTime();
        System.out.println(time);

        java.sql.Date sdate=new java.sql.Date(time);
        // here there is no empty constructor we have to pass parameter and i have passed th time which i get from get time
    }
}
