package com.hmc.domain.user;

import org.junit.Test;

/**
 * Author:meice Huang
 * Time: 2019-11-12 21:16
 */
public class TestCAndB {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j == 2) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }

    @Test
    public void testB() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 5; j++) {
                if (j == 2) {
                    break;
                }
            }
        }
    }

    @Test
    public void testStringLen(){
        System.out.println("YES".length());
        System.out.println("是".length());
    }



}
