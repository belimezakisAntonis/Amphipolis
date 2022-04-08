package Model;

/**
 * interface Character represents the special cards assistant,professor,digger,archaeologist which differ from color.
 */
public  interface Character {
    String color = null;

    /**
     * accessor returns color of the special card assistant
     * @return color
     * @post returns color
     */
    public String getColor();

    /**
     * transformer
     * @pre color must be black or red or green or blue
     * @param color
     * @post sets on assistant one color
     */
    public void setColor(String color);
}
