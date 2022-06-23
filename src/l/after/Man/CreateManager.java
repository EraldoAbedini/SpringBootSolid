package l.after.Man;

import l.after.Emp.CreateEmployee;

public class CreateManager extends CreateEmployee {
    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 19.75;
        salary = baseAmount + (rank * 4);
    }
}
