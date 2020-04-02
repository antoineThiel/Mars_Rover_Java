public class Planet {
    public Planet(int maxHeight, int maxWidth, int minHeight, int minWidth, String name){
        this.maxHeight = maxHeight;
        this.maxWidth = maxWidth;
        this.minHeight = minHeight;
        this.minWidth = minWidth;
        this.name = name;
    }

    private String name;
    private int maxHeight;
    private int maxWidth;
    private int minHeight;
    private int minWidth;

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", maxHeight=" + maxHeight +
                ", maxWidth=" + maxWidth +
                ", minHeight=" + minHeight +
                ", minWidth=" + minWidth +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public int getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(int minWidth) {
        this.minWidth = minWidth;
    }
}
