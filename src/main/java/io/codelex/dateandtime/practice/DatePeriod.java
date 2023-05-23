package io.codelex.dateandtime.practice;

import java.time.LocalDate;


public class DatePeriod {

    private LocalDate start;
    private LocalDate end;


    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod other) {
        LocalDate intersectionStart = start.isAfter(other.start) ? start : other.start;
        LocalDate intersectionEnd = end.isBefore(other.end) ? end : other.end;

        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        }
        return new DatePeriod(intersectionStart, intersectionEnd);
    }


}
