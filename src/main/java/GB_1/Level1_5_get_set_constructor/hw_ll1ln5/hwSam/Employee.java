package GB_1.Level1_5_get_set_constructor.hw_ll1ln5.hwSam;

public class Employee {
    private int age;
    private String name;
    private String jobTitle;

    public Employee(int age, String name, String jobTitle) {
        this.age = age;
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }
    public void info(){
        System.out.println(age + " " + name + " " + jobTitle);
    }
}
