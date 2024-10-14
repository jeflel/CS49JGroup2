import java.time.LocalDate;

/**
 * Class: Appointment
 * Purpose: To create specific appointments and implement their functions
 */
public class Appointment {
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    /**
     * Appointment constructor
     * @param description description of the appointment
     * @param startDate   start date of the appointment
     * @param endDate     end date of the appointment
     */
    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * get description of the appointment
     * @return
     */
    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * determine whether the appointment occurs on the specific time constraint
     * @param date date which we want to check
     * @return bool
     */
    public boolean occursOn(LocalDate date) {
        return ((startDate.isBefore(date) || startDate.isEqual(date)) // check if specific date is equal or after the first date
                && (endDate.isAfter(date) || endDate.isEqual(date))); // check if specific date is equal or before the end date
    }
}
