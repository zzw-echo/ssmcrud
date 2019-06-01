package com.wfq.crud.test;

import org.junit.Test;

public class testRandom {

    /**
     * 做了一个随机数的小测试
     */
    @Test
    public void random(){

        int count1 = 0;
        int count2 = 0;
        int countElse = 0;

        for (int i = 0; i < 1000; i++) {
            int rid = (int)(1+Math.random()*(2-1+1));
            if (rid == 1){
                count1++;
            }else if(rid == 2){
                count2++;
            }else {
                countElse++;
            }
            System.out.print(rid+"  ");
        }
        System.out.println();
        System.out.println("count1:"+count1);
        System.out.println("count2:"+count2);
        System.out.println("count3:"+countElse);

    }
}
