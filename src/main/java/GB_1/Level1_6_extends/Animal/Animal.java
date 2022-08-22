package GB_1.Level1_6_extends.Animal;

public abstract class Animal {
    String name;//модификатор доступа по умолчанию default/package
    // тк в одном пакете, appMain в другом и из него ничего менять
    // нельзя а в наследниках можно
    int age;


    public void jump(){
        System.out.println("animal " + name + " jump");
    }

    public void info(){
        System.out.println("animal name: " + name + " age: " + age);
    }

  public abstract void voice();//метод без тела тк переопределяется
    // в налследнике

}
