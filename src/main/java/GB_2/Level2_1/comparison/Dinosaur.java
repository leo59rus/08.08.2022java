package GB_2.Level2_1.comparison;

public class Dinosaur implements ObjComparble{
    private int weight;

    public Dinosaur(int size) {
this.weight = size;
    }
@Override
    public int compare(Object o){
        Dinosaur another = (Dinosaur) o;//другого динозавра
        // определили как О (буква)
        if(this.weight > another.weight){
            return 1;
        } else if (this.weight == another.weight){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Dinosaur[" + weight + "]";
    }
}
