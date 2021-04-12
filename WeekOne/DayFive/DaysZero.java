import java.time.*;

class DaysZero {

    DaysZero() {

        zones();
    }

    public void zones() {
        /*
         * Set<String> set = ZoneId.getAvailableZoneIds();
         * set.stream().distinct().forEach(System.out::println);
         * 
         * This is really long list
         */

        System.out.println(ZoneId.systemDefault());
        // Zone Ids are distinct locale styles between time zones
        // Zone Offset is the amount of difference between the zones

    }

    public void lastThurs(LocalDate date) {
        // go to last weeks date
        date = date.minusWeeks(1);
        // check if the date we just chose's day is thursday
        while (date.getDayOfWeek().ordinal() != 3)
            date = date.plusDays(1);
        // if the date isn't thursday, let check the day of the next day
        System.out.println("This date's previous Thursday is " + date);
    }

    public void birthday() {
        // my birthday is march 8, 1993
        LocalDate myBirthday = LocalDateTime.of(1993, 3, 8, 7, 23, 0).toLocalDate(),
                // My Birthday down to the minute
                today = LocalDate.now();
        // I'm going to count the Period from then to now
        System.out.println(Period.between(today, myBirthday));

    }

    public static void main(String[] args) {
        new DaysZero();
    }
}