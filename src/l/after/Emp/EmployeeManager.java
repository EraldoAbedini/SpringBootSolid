package l.after.Emp;

import l.after.Man.Manager;

public interface EmployeeManager extends Employee {
    Employee getManager();
    void assignManager(Manager man);
}
