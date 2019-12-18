package com.hmc.domain.other;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Author:meice Huang
 * Time: 2019-12-14 10:21
 */
public class TestOthers {

    @Test
    public void testStrLength(){

        System.out.println("OVER_THREE_MONTH_OR_THREE_DAY_PER_WEEK_OR_TWENTY_MINUTES_PER_DAY".length());

    }

    @Test
    public void testMapToString(){
        Map<String,Object[]> testMap = new HashMap<>();
        testMap.put("exerciseCondition", new String[]{"dfaf","fda"});
        System.out.println(testMap.toString());
    }

    @Test
    public void testObjectToString(){
        FixedDayExerciseQuestionnaire questionnaire = new FixedDayExerciseQuestionnaire();
        System.out.println(questionnaire.toString());
    }
}
