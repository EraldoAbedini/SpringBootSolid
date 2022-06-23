package l.after;

public class Employer implements Employee {
    private String firstName;
    private String lastName;
    private double salary;

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {
       this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {
           this.lastName = lastName;
    }

    @Override
    public double getSalary() {
     return this.salary;
    }

    @Override
    public void setSalary(double salary) {
      this.salary = salary;
    }

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 12.50;
        salary = baseAmount + (rank * 2);
    }
}
