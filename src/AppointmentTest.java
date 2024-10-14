import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AppointmentTest {
    /**
     * testing whether a specific date is during the time constraint of the appointment
     */
    @Test
    public void test_0() {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2021, 1, 1);
        LocalDate date = LocalDate.of(2022, 8, 1);
        Appointment dental = new Appointment("dental", startDate, endDate);
        assertEquals(dental.occursOn(date), false);
    }
}
