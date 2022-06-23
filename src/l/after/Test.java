package l.after;

import l.after.Emp.Employer;
import l.after.Man.CreateManager;

public class Test {
    public static void main(String[] args) {
        CreateManager eraldo = new CreateManager();
        Employer employee = new Employer();

        eraldo.setFirstName("Eraldo");
        eraldo.setLastName("Abedin");
        eraldo.calculatePerHourRate(4);

        employee.setFirstName("Xhonatan");
        employee.setLastName("Hoxha");
        try {
            employee.assignManager(eraldo);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        employee.calculatePerHourRate(2);

        System.out.printf("%s salary is %s/hour%n", employee.getFirstName(), employee.getSalary());
    }
}
