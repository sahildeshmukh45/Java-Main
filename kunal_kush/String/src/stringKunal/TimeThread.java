package stringKunal;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeThread extends Thread {
		    public void run() {
		        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		        while (true) {
		            LocalDateTime now = LocalDateTime.now();
		            System.out.println(dtf.format(now));
		            try {
		                Thread.sleep(1000); // Sleep for 1 second
		            } catch (InterruptedException e) {
		                System.out.println("Thread interrupted: " + e.getMessage());
		            }
		        }
		    }

		    public static void main(String[] args) {
		        TimeThread clock = new TimeThread();
		        clock.start();
		    }
		}
