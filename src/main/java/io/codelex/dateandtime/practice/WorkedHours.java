package io.codelex.dateandtime.practice;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class WorkedHours {
    public static final long HOURS_WORKED_IN_A_DAY = 8;


    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 5, 23);
        LocalDate endDate = LocalDate.of(2023, 10, 23);

        List<LocalDate> holidays = new ArrayList<>();
        holidays.add(LocalDate.of(2023, 5, 5));

        long businessDays = countBusinessDays(startDate, endDate, holidays);
        System.out.println(businessDays + " total work days");
        long hoursWorked = businessDays * HOURS_WORKED_IN_A_DAY;
        System.out.println(hoursWorked + " total hours worked");

    }

    public static long countBusinessDays(LocalDate startDate, LocalDate endDate, List<LocalDate> holidays) {
        long totalDays = ChronoUnit.DAYS.between(startDate, endDate);
        long businessDays = 0;

        for (long i = 0; i <= totalDays; i++) {
            LocalDate currentDate = startDate.plusDays(i);
            DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
            if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY && !isHoliday(currentDate, holidays)) {
                businessDays++;
            }
        }
        return businessDays;
    }

    private static boolean isHoliday(LocalDate date, List<LocalDate> holidays) {
        for (LocalDate holiday : holidays) {
            if (date.equals(holiday)) {
                return true;
            }
        }
        return false;
    }

}
