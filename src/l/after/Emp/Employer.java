package l.after.Emp;

import l.after.Man.Manager;

public class Employer extends CreateEmployee implements EmployeeManager {
    public Employee manager;

    @Override
    public Employee getManager() {
        return manager;
    }
    @Override
    public void assignManager(Manager manager) {
        this.manager = manager;
    }

}
