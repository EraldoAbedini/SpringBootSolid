package l.after.Emp;

public interface Employee {
    void setFirstName(String firstName);
    String getFirstName();
    void setLastName(String lastName);
    String getLastName();
    void setSalary(double salary);
    double getSalary();
    void calculatePerHourRate(int rank);
}
