package Model;

/**
 * this class specializes Character and every  assistant differs from others by its color.So,every digger has
 * it's color.
 */
public class Digger implements Character{
    private String color;

    /**
     * accessor returns color of the special card assistant
     * @return color
     * @post returns color
     */
    public String getColor() {
        return color;
    }

    /**
     * transformer
     * @pre color can only has 4 values "green","red","blue","black"
     * @param color
     * @post sets on digger one color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
