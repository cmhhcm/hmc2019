package com.hmc.domain.java8test;

/**
 * Author:meice Huang
 * Time: 2019-10-31 16:43
 */
public class Apple {
    private String color;

    private double weight;

    private Integer intVar;

    public Apple() {

    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple(String color, double weight,int intVar) {
        this.color = color;
        this.weight = weight;
        this.intVar = intVar;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Integer getIntVar() {
        return intVar;
    }

    public void setIntVar(Integer intVar) {
        this.intVar = intVar;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", intVar=" + intVar +
                '}';
    }
}
