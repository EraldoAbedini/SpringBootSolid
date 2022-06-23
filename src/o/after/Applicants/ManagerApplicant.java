package o.after.Applicants;

import o.after.Accounts.CreateAccount;
import o.after.Accounts.ManagerAccount;

public class ManagerApplicant implements Applicant {
    String firstName;
    String lastName;
    CreateAccount createAccount;

    public ManagerApplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createAccount = new ManagerAccount();
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public CreateAccount createAccount() {
        return createAccount;
    }
}
