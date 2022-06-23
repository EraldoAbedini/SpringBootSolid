package o.after;

import o.after.Applicants.Applicant;
import o.after.Applicants.ExecutiveApplicant;
import o.after.Applicants.ManagerApplicant;
import o.after.Applicants.StaffAplicant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Applicant> applicants = Arrays.asList(
                new StaffAplicant("Eraldo", "Abedin"),
                new ManagerApplicant("Albi", "Mema"),
                new ExecutiveApplicant("Igli", "Koxha")
        );

        List<Employee> employees = applicants.stream().map(applicant -> applicant.createAccount().create(applicant)).collect(Collectors.toList());

        for (Employee employee : employees) {
            System.out.println(String.format("%s %s: %s IsManager: %s IsExecutive: %s", employee.getFirstName(), employee.getLastName(), employee.getEmail(), employee.isManager(), employee.isExecutive()));
        }
    }


}
