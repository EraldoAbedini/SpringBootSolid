package l.after;

import l.after.Emp.Employer;
import l.after.Man.CreateManager;

public class Test {
    public static void main(String[] args) {
        CreateManager eraldo = new CreateManager();
        Employer employer = new Employer();

        eraldo.setFirstName("Eraldo");
        eraldo.setLastName("Abedin");
        eraldo.calculatePerHourRate(4);

        employer.setFirstName("Xhonatan");
        employer.setLastName("Hoxha");
        employer.calculatePerHourRate(2);

        System.out.printf("%s salary is %s/hour%n", employer.getFirstName(), employer.getSalary());
    }
}
