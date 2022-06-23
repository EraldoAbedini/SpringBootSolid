package o.after.Applicants;

public class ManagerApplicant implements Applicant {
    String firstName;
    String lastName;

    public ManagerApplicant(String firstName, String lastName) {
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
