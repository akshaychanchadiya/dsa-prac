package ClassesObjects;

class Block {

    private int width;
    private int length;
    private int height;

    Block(int[] a) {
        this.width = a[0];
        this.length = a[1];
        this.height = a[2];
    }

    public int getWidth () {
        return width;
    }

    public int getLength () {
        return length;
    }

    public int getHeight () {
        return height;
    }

    public int getVolume () {
        int volume = width*length*height;
        return volume;
    }

    public int getSurfaceArea () {
        int area = 2 * (width * length + width * height + length * height);
        return area;
    }

    public static void main(String[] args) {


        Block block = new Block(new int[] { 3, 4, 2 });

        System.out.println(block.getVolume());
        System.out.println(block.getSurfaceArea());

    }
}
