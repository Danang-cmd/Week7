public class Main {
    public static void main(String[] args) {
        Employ e1 = new Employ("Andi", 3000);
        System.out.println("Name: " + e1.name);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Total Bonus: " + e1.calculateBonus());
        System.out.println();

        Manager m1 = new Manager("Budi", 4000, 500);
        m1.display();
        System.out.println();

        Staff s1 = new Staff("Cici", 2000, 10);
        s1.display();
    }
}
