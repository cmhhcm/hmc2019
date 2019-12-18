package com.hmc.domain.user;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Author:meice Huang
 * Time: 2019-11-15 10:00
 */
public class TestOrder {

    public static void main(String[] args) {
        updateA("weight");
        updateB("weight");
    }

    public static void updateA(String field){
        if(!field.equals("height")){
            return;
        }
    }
    public static void updateB(String field) {
        System.out.println("111");
        if (!field.equals("weight")) {
            System.out.println("dd");
            return;
        }
    }
    @Test
    public void testLength(){
        System.out.println("GREATER_THAN_ONCE_A_MONTH_BUT_LESS_THAN_ONCE_A_WEEK".length());
    }

    @Test
    public void testRemoveNull(){
        List<String> list1 = new ArrayList<>();
        list1.add("ddfad");
        list1.add(null);
        list1.add("fdakfaoeifqfoq");
        list1.add(null);
        list1.add("uururquq");
        list1.add(null);
        list1.removeAll(Collections.singleton(null));
        System.out.println(list1.toString());
    }
}
