public class Position {
    public Position(int width, int height){
        this.width = width;
        this.height = height;
    }

    private int width;
    private int height;

    @Override
    public String toString() {
        return "Position{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public int getwidth() {
        return width;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int height) {
        this.height = height;
    }
}
