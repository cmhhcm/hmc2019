package com.hmc.domain.java8test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Author:meice Huang
 * Time: 2019-10-31 21:32
 */
public class SortSymptoms {

    public List<Spec> specList = new ArrayList<>();

    @Test
    public void testSortSymptoms() {
        List<String> caseSymptoms = Arrays.asList("发烧", "流鼻涕");
        List<Object[]> toRank = new ArrayList<>();
        init();
        specList.forEach((spec -> {
            toRank.add(new Object[]{rankByRetain(caseSymptoms, spec.getSymptoms())});
        }));

        toRank.sort(Comparator.comparing(Objects::hash));
        toRank.forEach(objects -> System.out.println(objects.toString()));

    }

    private void init() {
        List<String> spec1 = Arrays.asList("发烧", "流鼻涕");
        List<String> spec2 = Arrays.asList("发烧", "流鼻涕", "头痛");
        List<String> spec3 = Arrays.asList("发烧", "流鼻涕", "头痛", "抑郁");
        List<String> spec4 = Arrays.asList("发烧", "流鼻涕", "头痛", "抑郁", "心慌");
        List<String> spec5 = Arrays.asList("发烧", "心悸", "头痛", "抑郁", "心慌");
        List<String> spec6 = Arrays.asList("流鼻涕", "气短", "头痛", "抑郁", "心慌");

        specList.add(new Spec(UUID.randomUUID().toString(), spec1));
        specList.add(new Spec(UUID.randomUUID().toString(), spec2));
        specList.add(new Spec(UUID.randomUUID().toString(), spec3));
        specList.add(new Spec(UUID.randomUUID().toString(), spec4));
        specList.add(new Spec(UUID.randomUUID().toString(), spec5));
        specList.add(new Spec(UUID.randomUUID().toString(), spec6));
    }

    private int rankByRetain(List<String> caseSymptoms, List<String> specSymptoms) {
        if (caseSymptoms.isEmpty() || specSymptoms.isEmpty()) {
            return 0;
        }
        int caseSize = caseSymptoms.size();
        int specSize = specSymptoms.size();
        List<String> toRetainList = new ArrayList<>();
        toRetainList.addAll(caseSymptoms);
        toRetainList.retainAll(specSymptoms);
        return toRetainList.size();
    }
}
