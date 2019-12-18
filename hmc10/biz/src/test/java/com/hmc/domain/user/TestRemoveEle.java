package com.hmc.domain.user;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Author:meice Huang
 * Time: 2019-11-21 17:33
 */
public class TestRemoveEle {


    @Test
    public void testRemoveEle(){
        Set<String> setStr = new HashSet<>();
        setStr.add("fdaf");
        setStr.add("dfdagdafd");
        setStr.add("无");
        setStr.remove("无");
       setStr.forEach(e -> {
           System.out.println(e);
       });
    }

    @Test
    public void testNullMap() {
        System.out.println(getSwitch());
    }

    private Map<String, Boolean> getSwitch() {
        Map<String,Boolean> map = new HashMap<>();
        return (Map<String, Boolean>) new HashMap<>().put("familyCharacter", true);//这里为什么为null?
        /**
         * 按照经验，Map.put结果应该是个Boolean值，如果为了简化代码，直接这么写，那么返回的是Object。
         */
    }
}
