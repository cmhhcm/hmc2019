package com.hmc.command;

import java.util.List;
import java.util.Set;

/**
 * Author:meice Huang
 * Time: 2019-12-26 16:04
 */
public class ConditionGroup {
    private int limit;

    private int offset;

    private Set<Integer> provinceCodes;

    private Set<String> subjects;

    public ConditionGroup() {
    }

    public ConditionGroup(int offset, int limit) {
        offset = this.offset;
        limit = this.limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public Set<Integer> getProvinceCodes() {
        return provinceCodes;
    }

    public void setProvinceCodes(Set<Integer> provinceCodes) {
        this.provinceCodes = provinceCodes;
    }

    public Set<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<String> subjects) {
        this.subjects = subjects;
    }
}
