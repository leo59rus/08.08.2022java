package GB_2.Level2_1.HumanInCar;

public class Human {
    private String name;
    private Transport currentTransport;//у чела есть одна машина
    //для этого задаём ссылку на текщий транспорт

    public Human(String name) {
        this.name = name;
    }

    public void ride(Transport transport){
        if (currentTransport != null){
            if(currentTransport == transport){
                System.out.println("он ужу едет на нем");
            }else {
                System.out.println("не может перепрыгнуть в " +
                                           "движении");
            }
            return;
        }
        this.currentTransport = transport;//садится он в одну машину
        System.out.println("человек сел в транспорт ");
        transport.ride(name);
    }
    public void stop() {
        if (currentTransport == null) {
            System.out.println("человек ни на чем не едет");
            return;
        } else {
            currentTransport.stop();//останавливает и выходит из той же
            // машины
            currentTransport = null;//после этого машины у него нет
        }
    }
}
