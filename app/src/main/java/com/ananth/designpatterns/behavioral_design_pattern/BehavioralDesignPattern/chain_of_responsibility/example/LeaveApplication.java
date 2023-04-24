package com.ananth.designpatterns.behavioral_design_pattern.BehavioralDesignPattern.chain_of_responsibility.example;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

//Represents the request in our chain of responsibility.
public class LeaveApplication {
    public enum Type {Sick, PTO, LOP}

    public enum Status {PENDING, APPROVED, REJECTED}

    private Type type;
    private Status status = Status.PENDING;
    private LocalDate from;
    private LocalDate to;
    private String processedBy;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public int getNoOfDays() {
        return Period.between(from, to).getDays();
    }

    public Status getStatus() {
        return status;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void approve(String approverName) {
        this.status = Status.APPROVED;
        this.processedBy = approverName;
    }

    public void reject(String approverName) {
        this.status = Status.REJECTED;
        this.processedBy = approverName;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public String toString() {
        return type + " leave for " + getNoOfDays() + " day(s) " + status
                + " by " + processedBy;
    }

    public static class Builder {
        private Type type;
        private LocalDate from;
        private LocalDate to;
        private LeaveApplication leaveApplication;

        private Builder() {

        }

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder from(LocalDate from) {
            this.from = from;
            return this;
        }

        public Builder to(LocalDate to) {
            this.to = to;
            return this;
        }

        public LeaveApplication build() {
            this.leaveApplication = new LeaveApplication(type, from, to);
            return this.leaveApplication;
        }

        public LeaveApplication getLeaveApplication() {
            return leaveApplication;
        }
    }

}

