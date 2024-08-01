package codewars;

public class Block {

    private int width;
    private int length;
    private int height;

    private int[] data = new int[3];

    public Block(int[] data) {
        this.data = new int[]{width, length, height};
        this.width = data[0];
        this.length = data[1];
        this.height = data[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length + length * height + width * height);
    }

    public static void main(String[] args) {
        Block b = new Block(new int[]{2,2,2});
        System.out.println(b.getWidth());
        System.out.println(b.getLength());
        System.out.println(b.getHeight());
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());
    }

}
