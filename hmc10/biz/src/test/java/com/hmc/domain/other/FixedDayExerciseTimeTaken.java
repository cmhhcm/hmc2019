package com.hmc.domain.other;

/**
 * Author:meice Huang
 * Time: 2019-12-16 12:46
 */
public class FixedDayExerciseTimeTaken {
    private static final long serialVersionUID = -4599277159370505116L;

    private Integer daysPerWeek;

    private Integer hoursPerDay;

    private Integer minutesPerDay;

    private String notSure;

    public Integer getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(Integer daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    public Integer getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(Integer hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public Integer getMinutesPerDay() {
        return minutesPerDay;
    }

    public void setMinutesPerDay(Integer minutesPerDay) {
        this.minutesPerDay = minutesPerDay;
    }

    public String getNotSure() {
        return notSure;
    }

    public void setNotSure(String notSure) {
        this.notSure = notSure;
    }

    @Override
    public String toString() {
        return "FixedDayExerciseTimeTaken{" +
                "daysPerWeek=" + daysPerWeek +
                ", hoursPerDay=" + hoursPerDay +
                ", minutesPerDay=" + minutesPerDay +
                ", notSure='" + notSure + '\'' +
                '}';
    }
}
