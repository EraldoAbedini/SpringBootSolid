package o.after.Accounts;


import o.after.Applicants.Applicant;
import o.after.Employee;

public class ExecutiveAccount implements CreateAccount {
    @Override
    public Employee create(Applicant applicant) {
        return new Employee(
                applicant.getFirstName(), applicant.getLastName(),
                String.format("%s.%s@example.com", applicant.getFirstName(), applicant.getLastName()),
                true, true
        );
    }
}
