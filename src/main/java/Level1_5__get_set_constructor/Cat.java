package Level1_5__get_set_constructor;

public class Cat {
    private String name;
    private String color;
    private int age;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
   // public String getColor(){
   //     return color;
   // }

    public void setAge(int age){
        this.age = age;
    }
    public Cat(String name, String color, int age){//конструктор
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void jump(){
        System.out.println(name + " подпрыгнул");
    }

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }

    public void sleep(){
        System.out.println(name + " уснул");
    }
}
