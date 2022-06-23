package o.after.Applicants;

import o.after.Accounts.CreateAccount;
import o.after.Accounts.StaffAccount;

public class StaffAplicant implements Applicant {
    String firstName;
    String lastName;
    CreateAccount createAccount;


    public StaffAplicant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createAccount = new StaffAccount();
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
