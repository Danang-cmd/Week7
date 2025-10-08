public class Staff  extends Employ {
    int bonus;

    Staff(String name, float salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    float calculateBonus() {
        return bonus * 0.05f;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Bonus: " + calculateBonus());
    }
    
}
