package GB_2.Level2_1.comparison;

public class Block implements ObjComparble{
    private int weight;

    public Block(int size) {
this.weight = size;
    }
@Override
    public int compare(Object o){
        Block another = (Block) o;//другой блок определили как О
        // (буква)
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
        return "Block[" + weight + "]";
    }


}
