package com.hmc.domain.other;

/**
 * Author:meice Huang
 * Time: 2019-12-16 12:47
 */
public class FixedDayExerciseQuestionnaire {

    private String fixedDayDoHighStrengthExer;

    private FixedDayExerciseTimeTaken fixedDayDoHighStrengthTimeTaken;

    private String fixedDayDoMediumStrengthExer;

    private FixedDayExerciseTimeTaken fixedDayDoMediumStrengthTimeTaken;

    private FixedDayExerciseTimeTaken fixedDayWalkOverTenMinutes;

    private FixedDayExerciseTimeTaken fixedDayWalkTimeTakenOneDay;

    private FixedDayExerciseTimeTaken fixedDaySitTimeTakenOneDay;

    public String getFixedDayDoHighStrengthExer() {
        return fixedDayDoHighStrengthExer;
    }

    public void setFixedDayDoHighStrengthExer(String fixedDayDoHighStrengthExer) {
        this.fixedDayDoHighStrengthExer = fixedDayDoHighStrengthExer;
    }

    public FixedDayExerciseTimeTaken getFixedDayDoHighStrengthTimeTaken() {
        return fixedDayDoHighStrengthTimeTaken;
    }

    public void setFixedDayDoHighStrengthTimeTaken(FixedDayExerciseTimeTaken fixedDayDoHighStrengthTimeTaken) {
        this.fixedDayDoHighStrengthTimeTaken = fixedDayDoHighStrengthTimeTaken;
    }

    public String getFixedDayDoMediumStrengthExer() {
        return fixedDayDoMediumStrengthExer;
    }

    public void setFixedDayDoMediumStrengthExer(String fixedDayDoMediumStrengthExer) {
        this.fixedDayDoMediumStrengthExer = fixedDayDoMediumStrengthExer;
    }

    public FixedDayExerciseTimeTaken getFixedDayDoMediumStrengthTimeTaken() {
        return fixedDayDoMediumStrengthTimeTaken;
    }

    public void setFixedDayDoMediumStrengthTimeTaken(FixedDayExerciseTimeTaken fixedDayDoMediumStrengthTimeTaken) {
        this.fixedDayDoMediumStrengthTimeTaken = fixedDayDoMediumStrengthTimeTaken;
    }

    public FixedDayExerciseTimeTaken getFixedDayWalkOverTenMinutes() {
        return fixedDayWalkOverTenMinutes;
    }

    public void setFixedDayWalkOverTenMinutes(FixedDayExerciseTimeTaken fixedDayWalkOverTenMinutes) {
        this.fixedDayWalkOverTenMinutes = fixedDayWalkOverTenMinutes;
    }

    public FixedDayExerciseTimeTaken getFixedDayWalkTimeTakenOneDay() {
        return fixedDayWalkTimeTakenOneDay;
    }

    public void setFixedDayWalkTimeTakenOneDay(FixedDayExerciseTimeTaken fixedDayWalkTimeTakenOneDay) {
        this.fixedDayWalkTimeTakenOneDay = fixedDayWalkTimeTakenOneDay;
    }

    public FixedDayExerciseTimeTaken getFixedDaySitTimeTakenOneDay() {
        return fixedDaySitTimeTakenOneDay;
    }

    public void setFixedDaySitTimeTakenOneDay(FixedDayExerciseTimeTaken fixedDaySitTimeTakenOneDay) {
        this.fixedDaySitTimeTakenOneDay = fixedDaySitTimeTakenOneDay;
    }

    @Override
    public String toString() {
        return "{" +
                "fixedDayDoHighStrengthExer='" + fixedDayDoHighStrengthExer + '\'' +
                ", fixedDayDoHighStrengthTimeTaken=" + fixedDayDoHighStrengthTimeTaken +
                ", fixedDayDoMediumStrengthExer='" + fixedDayDoMediumStrengthExer + '\'' +
                ", fixedDayDoMediumStrengthTimeTaken=" + fixedDayDoMediumStrengthTimeTaken +
                ", fixedDayWalkOverTenMinutes=" + fixedDayWalkOverTenMinutes +
                ", fixedDayWalkTimeTakenOneDay=" + fixedDayWalkTimeTakenOneDay +
                ", fixedDaySitTimeTakenOneDay=" + fixedDaySitTimeTakenOneDay +
                '}';
    }
}
