package l.after;

import l.after.Emp.CreateEmployee;
import l.after.Man.Manager;

public class CEO extends CreateEmployee implements Manager {
    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;
        salary = baseAmount * rank;
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
