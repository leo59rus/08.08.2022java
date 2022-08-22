package GB_2.Level2_1.comparison;

public class Box implements ObjComparble{
    private int size;

    public Box(int size) {
        this.size = size;
    }
@Override
    public int compare(Object o){
        Box another = (Box) o;//другую коробку определили как О
        // (буква)
        if(this.size > another.size){
            return 1;
        } else if (this.size == another.size){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Box[" + size + "]";
    }
}
