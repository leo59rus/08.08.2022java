package GB_1.Level1_5_get_set_constructor;

public class Box {
    private String color;
    private int width, height, length;  //размер
    private int x, y, z;  //координаты в пространстве
    private float weight;               //вес
    private String material;
    private boolean opened;

    public Box(String color, int width, int height, int length, String material) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.length = length;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public int getVolume() { //считаем объём
        return width * height * length;
    }

    public void open() {
        opened = true;
    }

    public void closed() {
        opened = false;
    }

    public void repaint(String newColor) { //перекрасить коробку
        color = newColor;
    }

    public void clear() { //очистили коробку
        weight = 0.0f;//вес ноль
    }

    public void addItem(float itemWeight) { //добавляем в коробку вещи
        weight += itemWeight;//увеличиваем на вес

    }
}
