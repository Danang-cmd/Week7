public class Employ extends Calculate {
    String name;
    float salary;
    Employ(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    float calculateBonus() {
        return (0.1f * salary);
    }
}
