package o.after.Applicants;

public class StaffAplicant implements Applicant {
    String firstName;
    String lastName;

    public StaffAplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
