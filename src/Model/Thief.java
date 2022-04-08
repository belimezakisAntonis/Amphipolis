package Model;

import java.util.ArrayList;

public class Thief {
    private int score;

    private ArrayList<Landslide> landslides=null;

    /**
     * transformer
     * @param score
     * @pre score should be non negative integer number
     * @post updates total score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * accessor
     * @returns total score
     * @post returns total score
     */
    public int getScore() {
        return score;
    }
    /**
     * accessor
     * @returns the array list with landslides which have been played by the player
     * @post returns the array list with landslides which have been played by the player
     */
    public ArrayList<Landslide> getLandslides() {
        return landslides;
    }

    /**
     * accessor
     * @returns the array list with amphoras which have been played by the player
     * @post returns the array list with amphoras which have been played by the player
     */


    /**
     * accessor
     * @returns the array list with statues which have been played by the player
     * @post the array list with statues which have been played by the player
     */


    /**
     * accessor
     * @returns the array list with mosaics which have been played by the player
     * @post the array list with mosaics which have been played by the player
     */


    /**
     * accessor
     * @returns the array list with skeletons which have been played by the player
     * @post the array list with skeletons which have been played by the player
     */


}
