package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args){
        List<Integer> op=new ArrayList<>(115);
        Random random=new Random();
        for(int i=1;i<100;i++){
            op.add(random.nextInt(100));
        }

        long starttime=System.currentTimeMillis();
        int sum1=op.stream()
                .map(i-> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return i * 2;
                })
                .mapToInt(i->i)
                .sum();
        long endtime=System.currentTimeMillis();

        long starttimep=System.currentTimeMillis();
        int sum3=op.parallelStream()
                .map(i-> {
                    try {
                        Thread.sleep(1);
                    } catch (Exception e) {
                    }
                    return i * 2;
                })
                .mapToInt(i->i)
                .sum();
        long endtimep=System.currentTimeMillis();
        System.out.println(sum1+" "+sum3);
        System.out.println("Time for withouth parallel "+(endtime-starttime));
        System.out.println("Time for  parallel "+(endtimep-starttimep));

    }
}
