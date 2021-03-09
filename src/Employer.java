public class Employer {
    private String name;
    private int age;
    private float salary;

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Employer(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}