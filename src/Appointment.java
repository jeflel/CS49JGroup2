import java.time.LocalDate;

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

    public boolean occursOn(LocalDate date) {
        return true;
    }
}
