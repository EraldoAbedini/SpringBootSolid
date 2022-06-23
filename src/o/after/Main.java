package o.after;

import o.after.Applicants.Applicant;
import o.after.Applicants.ExecutiveApplicant;
import o.after.Applicants.ManagerApplicant;
import o.after.Applicants.StaffAplicant;

import java.util.Arrays;
import java.util.List;

public class Main {
    List<Applicant> applicants = Arrays.asList(
            new StaffAplicant("Eraldo", "Abedin"),
            new ManagerApplicant("Albi", "Mema"),
            new ExecutiveApplicant("Igli", "Koxha")
    );

}
