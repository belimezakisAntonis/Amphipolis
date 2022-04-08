package Model;

import java.util.ArrayList;

/**
 *this class computes all components that needs every player of the game(cards that he keeps,points,color,name,tiles)
 */
public class Player {
    private   Player player;
    private  BlueAmphora blueAmphora;
    private  RedAmphora redAmphora;
    private  YellowAmphora yellowAmphora;
    private  PurpleAmphora purpleAmphora;
    private  GreenAmphora greenAmphora;
    private  BrownAmphora brownAmphora;
    private  GreenMosaic greenMosaic;
    private  RedMosaic redMosaic;
    private  YellowMosaic yellowMosaic;
    private  Sphinx sphinx;
    private  Caryatid caryatid;
    private  BigBottomSkeleton BBS;
    private  BigTopSkeleton BTS;
    private  SmallBottomSkeleton SBS;
    private  SmallTopSkeleton STS;
    private  ArrayList<BlueAmphora> bl_amphoras=new ArrayList<BlueAmphora>();
    private  ArrayList<YellowAmphora> yl_amphoras=new ArrayList<YellowAmphora>();
    private  ArrayList<GreenAmphora> gr_amphoras=new ArrayList<GreenAmphora>();
    private  ArrayList<BrownAmphora> br_amphoras=new ArrayList<BrownAmphora>();
    private  ArrayList<RedAmphora> red_amphoras=new ArrayList<RedAmphora>();
    private  ArrayList<PurpleAmphora> purple_amphoras=new ArrayList<PurpleAmphora>();
    private  ArrayList<Sphinx> sphinxs=new ArrayList<Sphinx>();
    private  ArrayList<Caryatid> caryatids=new ArrayList<Caryatid>();
    private  ArrayList<BigBottomSkeleton> bbs=new ArrayList<BigBottomSkeleton>();
    private  ArrayList<BigTopSkeleton> bts=new ArrayList<BigTopSkeleton>();
    private  ArrayList<SmallBottomSkeleton> sbs=new ArrayList<SmallBottomSkeleton>();
    private  ArrayList<SmallTopSkeleton> sts=new ArrayList<SmallTopSkeleton>();
    private  ArrayList<GreenMosaic> gr_mosaics=new ArrayList<GreenMosaic>();
    private  ArrayList<RedMosaic> red_mosaics=new ArrayList<RedMosaic>();
    private  ArrayList<YellowMosaic> yl_mosaics=new ArrayList<YellowMosaic>();
    private  ArrayList<Landslide> landslides=null;
    private static int counter=0;
    private static int score=0;
    private String color=null;
    private ArrayList<Tiles> card=null;
    private String name=null;
    private int tiles=0;
    private static boolean hasPlayed1=false,hasPlayed2=false,hasPlayed3=false,hasPlayed4=false;

    /**
     * constructor
     * @post creates a new player
     */
    public Player(){
        this.player=player;
    }

    /**
     * accessor
     * @returns a blue amphora
     * @post returns a blue amphora
     */
    public  BlueAmphora getBlueAmphora() {
        return blueAmphora;
    }

    /**
     * accessor
     * @returns a sphinx
     * @post returns a sphinx
     */
    public  Sphinx getSphinx() {
        return sphinx;
    }

    /**
     * accessor
     * @returns a red mosaic
     * @post returns a red mosaic
     */
    public  RedMosaic getRedMosaic() {
        return redMosaic;
    }

    /**
     * accessor
     * @returns a red amphora
     * @post returns a red amphora
     */
    public  RedAmphora getRedAmphora() {
        return redAmphora;
    }

    /**
     * accessor
     * @returns a purple amphora
     * @post returns a purple amphora
     */
    public PurpleAmphora getPurpleAmphora() {
        return purpleAmphora;
    }

    /**
     * accessor
     * @returns a green mosaic
     * @post returns a green mosaic
     */
    public  GreenMosaic getGreenMosaic() {
        return greenMosaic;
    }

    /**
     * accessor
     * @returns a green amphora
     * @post returns a green amphora
     */
    public  GreenAmphora getGreenAmphora() {
        return greenAmphora;
    }

    /**
     * accessor
     * @returns a caryatid
     * @post returns a caryatid
     */
    public  Caryatid getCaryatid() {
        return caryatid;
    }

    /**
     * accessor
     * @returns a brown amphora
     * @post returns a brown amphora
     */
    public  BrownAmphora getBrownAmphora() {
        return brownAmphora;
    }

    /**
     * accessor
     * @returns a yellow amphora
     * @post returns a yellow amphora
     */
    public   YellowAmphora getYellowAmphora(){
        return yellowAmphora;
    }

    /**
     * accessor
     * @returns ayellow mosaic
     * @post returns a yellow mosaic
     */
    public  YellowMosaic getYellowMosaic(){
        return yellowMosaic;
    }

    /**
     * accessor
     * @returns a big bottom skeleton
     * @post returns a big bottom skeleton
     */
    public  BigBottomSkeleton getBig_Bottom(){
        return BBS;
    }

    /**
     * accessor
     * @post returns a big top skeleton
     * @returns a big top skeleton
     */
    public  BigTopSkeleton getBig_Top(){
        return BTS;
    }

    /**
     * accessor
     * @post returns a small bottom skeleton
     * @returns a small bottom skeleton
     */
    public SmallBottomSkeleton getSmall_Bottom(){
        return SBS;
    }

    /**
     * accessor
     * @post returns a small top skeleton
     * @returns a small top skeleton
     */
    public  SmallTopSkeleton getSmall_Top(){
        return STS;
    }
    /**
     * constructor initializes a player
     * @pre tiles should be zero hasPlayed1 should be false,hasPlayed2 should be false,hasPlayed3 should be false
     * @pre hasPlayed4 should be false
     * @param name
     * @param tiles
     * @param hasPlayed1
     * @param hasPlayed2
     * @param hasPlayed3
     * @param hasPlayed4
     * @post creates a player with name,zero tiles,professor,assistant,digger and archaeologist all these cards available.
     */
    public Player(String name,int tiles,boolean hasPlayed1,boolean hasPlayed2,boolean hasPlayed3,
           boolean hasPlayed4){
        this.name=name;
        this.tiles=tiles;
        this.hasPlayed1 =hasPlayed1;
        this.hasPlayed2=hasPlayed2;
        this.hasPlayed3=hasPlayed3;
        this.hasPlayed4=hasPlayed4;
    }


    /**
     * transformer sets a color on the player
     * @pre color should be "black" or "blue" or "red" or "green".
     * @param color
     * @post player has the color "black" or "blue" or "red" or "green"
     */
    public void setColor(String color ){
        this.color=color;
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
    public  ArrayList<BlueAmphora> getBl_amphoras(){
        return bl_amphoras;
    }

    /**
     * accessor
     * @returns the array list with amphoras which have been played by the player
     * @post returns the array list with amphoras which have been played by the player
     */
    public  ArrayList<BrownAmphora> getBr_amphoras(){
        return br_amphoras;
    }

    /**
     * accessor
     * @returns the array list with amphoras which have been played by the player
     * @post returns the array list with amphoras which have been played by the player
     */
    public  ArrayList<PurpleAmphora> getPurple_amphoras(){
        return purple_amphoras;
    }

    /**
     * accessor
     * @returns the array list with amphoras which have been played by the player
     * @post returns the array list with amphoras which have been played by the player
     */
    public  ArrayList<GreenAmphora> getGr_amphoras(){
        return gr_amphoras;
    }

    /**
     * accessor
     * @returns the array list with amphoras which have been played by the player
     * @post returns the array list with amphoras which have been played by the player
     */
    public  ArrayList<RedAmphora> getRed_amphoras(){
        return red_amphoras;
    }

    /**
     * accessor
     * @returns the array list with amphoras which have been played by the player
     * @post returns the array list with amphoras which have been played by the player
     */
    public  ArrayList<YellowAmphora> getYl_amphoras(){ return yl_amphoras;}

    /**
     * accessor
     * @returns the array list with statues which have been played by the player
     * @post the array list with statues which have been played by the player
     */
    public  ArrayList<Sphinx> getSphinxs(){
        return sphinxs;
    }

    /**
     * accessor
     * @returns the array list with mosaics which have been played by the player
     * @post the array list with mosaics which have been played by the player
     */
    public  ArrayList<GreenMosaic> getGr_mosaics(){
        return gr_mosaics;
    }

    /**
     * accessor
     * @returns the array list with mosaics which have been played by the player
     * @post the array list with mosaics which have been played by the player
     */
    public  ArrayList<RedMosaic> getRed_mosaics(){
        return red_mosaics;
    }

    /**
     * accessor
     * @returns the array list with mosaics which have been played by the player
     * @post the array list with mosaics which have been played by the player
     */
    public  ArrayList<YellowMosaic> getYl_mosaics(){
        return yl_mosaics;
    }

    /**
     * accessor
     * @returns the array list with skeletons which have been played by the player
     * @post the array list with skeletons which have been played by the player
     */
    public  ArrayList<BigBottomSkeleton> getBBS(){
        return bbs;
    }

    /**
     * accessor
     * @returns the array list with skeletons which have been played by the player
     * @post the array list with skeletons which have been played by the player
     */
    public  ArrayList<BigTopSkeleton> getBTS(){
        return bts;
    }

    /**
     * accessor
     * @returns the array list with skeletons which have been played by the player
     * @post the array list with skeletons which have been played by the player
     */
    public ArrayList<SmallBottomSkeleton> getSBS(){
        return sbs;
    }

    /**
     * accessor
     * @returns the array list with skeletons which have been played by the player
     * @post the array list with skeletons which have been played by the player
     */
    public  ArrayList<SmallTopSkeleton> getSTS(){
        return sts;
    }

    /**
     *accessor
     * @returns caryatids of the player
     * @post  returns caryatids of the player
     * */

    public ArrayList<Caryatid> getCaryatids(){
        return caryatids;
    }

    /**
     * transformer
     * @param counter
     * @post computes how many moves do the player in order to doesn't surpass a specific number
     */
    public  void setCounter(int counter) {
        this.counter = counter;
    }

    /**
     * accessor
     * @returns how many moves did by the player
     * @post returns how many moves did by the player
     */
    public  int getCounter(){
        return counter;
    }

    /**
     * accessor
     * @returns the color that has the player
     * @post returns the color that has the player
     */
    public String getColor(){
        return color;
    }

    /**
     * transformer
     * @param score2 should be non negative integer number
     * @pre score2 should be non negative integer number
     * @post computes the total score of the player until now
     */
    public void setScore(int score2){
        score=score2;
    }

    /**
     * accessor
     * @returns the total score of the player until now
     * @post returns the total score of the player until now
     */
    public int getScore(){
        return score;
    }

    /**
     * transformer
     * @param hasPlayed1
     * @post changes the state of card assistant in true if this card be played
     */
    public  void setHasPlayed1(boolean hasPlayed1) {
        this.hasPlayed1 = hasPlayed1;
    }

    /**
     * transformer
     * @param hasPlayed2
     * @post changes the state of card archaeologist in true if this card be played
     */
    public void setHasPlayed2(boolean hasPlayed2) {
        this.hasPlayed2 = hasPlayed2;
    }

    /**
     * transformer
     * @param hasPlayed3
     * @post changes the state of card digger in true if this card be played
     */
    public void setHasPlayed3(boolean hasPlayed3) {
        this.hasPlayed3 = hasPlayed3;
    }

    /**
     * transformer
     * @param hasPlayed4
     * @post changes the state of card professor in true if this card be played
     */
    public void setHasPlayed4(boolean hasPlayed4) {
        this.hasPlayed4 = hasPlayed4;
    }

    /**
     * observer
     * @returns the state of card assistant
     * @post returns the state of card assistant
     */
    public boolean getHasPlayed1(){
        return hasPlayed1;
    }

    /**
     * observer
     * @returns the state of card archaeologist
     * @post returns the state of card archaeologist
     */
    public boolean getHasPlayed2(){
        return hasPlayed2;
    }

    /**
     * observer
     * @returns the state of card digger
     * @post returns the state of card digger
     */
    public boolean getHasPlayed3(){
        return hasPlayed3;
    }

    /**
     * observer
     * @returns the state of card professor
     * @post returns the ste of card professor
     */
    public boolean getHasPlayed4(){
        return hasPlayed4;
    }

    /**
     * transformer
     * @param tiles
     * @post increments the number of tiles of the player by one
     */
    public void setTiles(int tiles){
        this.tiles=tiles;
    }


    /**
     * accessor
     * @returns the name of the player
     * @post returns the name of the player
     */
    public String getName(){
        return name;
    }
}
