package com.hmc.domain.redisTest;

import org.junit.Test;

/**
 * Author:meice Huang
 * Time: 2019-11-27 20:19
 */
public class JdkSerializable {

    @Test
    public void testJdkSerializationRedisSerializer(){
        String str = "我爱中国五千年的风和月藏了多少梦，黑色眼镜黄色皮肤不变是笑容";
        System.out.println(str.getBytes()[1]);

        double a = 0.5;
        Integer b;
        b= Integer.valueOf(Double.toString(a));
        System.out.println(b);

        Double smokeAmount;
        Integer dd = 234;
         int loop = 10;
        for(int i=0;i<10;i++){

        }
    }
}
