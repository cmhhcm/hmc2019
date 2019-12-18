package com.hmc.domain.java8test;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:meice Huang
 * Time: 2019-11-01 09:24
 */
public class Spec {

    private String specId;

    private List<String> symptoms;

    public Spec() {
    }

    public Spec(String specId,List<String> symptoms) {
        this.specId = specId;
        this.symptoms = symptoms;
    }

    public String getSpecId() {
        return specId;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Spec{" +
                "specId='" + specId + '\'' +
                ", symptoms=" + symptoms +
                '}';
    }
}
