import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2021, 1, 1);
        LocalDate date = LocalDate.of(2022, 8, 1);
        Appointment dental = new Appointment("dental", startDate, endDate);
        System.out.println(dental.occursOn(date));
    }
}