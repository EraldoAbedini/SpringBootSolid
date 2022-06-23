package l.after.Emp;

import l.after.Man.Manager;

public class Employer extends CreateEmployee implements EmployeeManager {
    @Override
    public void assignManager(Manager man) {
        throw new UnsupportedOperationException("This CEO has no manager");
    }
}
