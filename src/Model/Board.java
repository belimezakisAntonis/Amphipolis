package Model;

import java.util.ArrayList;
import java.util.Random;

public class Board {
    private static Landslide landslide;

    private static ArrayList<Tiles> card=new ArrayList<Tiles>(0);
    private static ArrayList<Tiles> tiles=new ArrayList<Tiles>(0);
    Player currentPlayer=null;
    private ArrayList<Player> players=new ArrayList<Player>(0);
    private Player player1=new Player("Player1",0,false,
            false,false,false);
    private Player player2=new Player("Player2",0,false,
            false,false,false);
    private Player player3=new Player("Player3",0,false,
            false,false,false);
    private Player player4=new Player("Player4",0,false,
            false,false,false);
    private static ArrayList<Tiles> landslides = new ArrayList<Tiles>(0);
    private static ArrayList<Tiles> amphoras = new ArrayList<Tiles>(0);
    private static ArrayList<Tiles> skeletons = new ArrayList<Tiles>(0);
    private static ArrayList<Tiles> statues = new ArrayList<Tiles>(0);
    private static ArrayList<Tiles> mosaics = new ArrayList<Tiles>(0);


    /**
     * constructor: initializes the stack with the cards
     * @post creates the stack with the cards
     */
    public Board() {

        for (int i = 0; i < 24; i++) {
            landslide=new Landslide();
            getTiles().add(landslide);
        }
        for (int i = 0; i < 9; i++) {
            GreenMosaic greenMosaic=new GreenMosaic();
            RedMosaic redMosaic=new RedMosaic();
            YellowMosaic yellowMosaic=new YellowMosaic();
            getTiles().add(greenMosaic);
            getTiles().add(redMosaic);
            getTiles().add(yellowMosaic);
        }
        for (int i = 0; i < 12; i++) {
            Caryatid caryatid=new Caryatid();
            Sphinx sphinx =new Sphinx();
            getTiles().add(sphinx);
            getTiles().add(caryatid);
        }
        for (int i = 0; i < 5; i++) {
            GreenAmphora greenAmphora=new GreenAmphora();
            PurpleAmphora purpleAmphora=new PurpleAmphora();
            RedAmphora redAmphora=new RedAmphora();
            YellowAmphora yellowAmphora=new YellowAmphora();
            BlueAmphora blueAmphora=new BlueAmphora();
            BrownAmphora brownAmphora=new BrownAmphora();
            getTiles().add(greenAmphora);
            getTiles().add(purpleAmphora);
            getTiles().add(redAmphora);
            getTiles().add(yellowAmphora);
            getTiles().add(blueAmphora);
            getTiles().add(brownAmphora);
        }
        for (int i = 0; i < 10; i++) {
            BigBottomSkeleton bbs=new BigBottomSkeleton();
            BigTopSkeleton bts=new BigTopSkeleton();
            getTiles().add(bbs);
            getTiles().add(bts);
        }
        for (int i = 0; i < 5; i++) {
            SmallBottomSkeleton sbs=new SmallBottomSkeleton();
            SmallTopSkeleton sts=new SmallTopSkeleton();
            getTiles().add(sts);
            getTiles().add(sbs);
        }
    }

    /**
     * transformer
     * @post adds landslides on the main tableau
     */
    public static void putOnTableau() {
        for (int i = 0; i < 135; i++) {
            if (getTiles().get(i).equals(landslide)) {
                getLandslides().add(landslide);
            }
        }
    }




    /**
     * observer
     * @returns true if the player has finished his round
     * @post returns true if the player finished his round
     */
    public boolean playerFinishedTheRound(){
        if(currentPlayer.getCounter()==6 && (currentPlayer.getHasPlayed1()==true || currentPlayer.getHasPlayed2()==true ||
                currentPlayer.getHasPlayed3()==true || currentPlayer.getHasPlayed4()==true)){
            return true;
        }
        return false;
    }

    /**
     * observer
     * @param min
     * @param max
     * @returns the player who's is the turn to play
     * @post returns the player who's is the turn to play
     */
    public Player turnPlayer(int min,int max){
        Random rand = null;


        int randomNum = rand.nextInt((max - min) + 1) + min;
        Player player=getCurrentPlayer(randomNum);
        return player;
    }



    /**
     * transformer
     * @post initializes what is necessary to start a new round
     */
    public void setNewRound(){
        players.add(player1);
        player1.setCounter(0);
        players.add(player2);
        player2.setCounter(0);
        players.add(player3);
        player3.setCounter(0);
        players.add(player4);
        player4.setCounter(0);
    }

    /**
     * observer
     * @returns true if the round is over
     */
    public boolean roundIsOver(){
        return true;
    }

    /**
     * accessor
     * @param num
     * @returns the player who plays now
     * @post returns the player who plays now
     */
    public Player getCurrentPlayer(int num){
        currentPlayer=getPlayers().get(num);
        getPlayers().remove(num);
        return currentPlayer;
    }




    /**
     * accessor
     * @returns the object tiles which is array list of Tiles
     * @post returns the object tiles which is array list of Tiles
     */
    public static ArrayList<Tiles> getTiles() {
        return tiles;
    }

    /**
     * accessor
     * @returns the array list with land slides of the main tableau
     * @post return the array list with landslides of the main tableau
     */
    public static ArrayList<Tiles> getLandslides() {
        return landslides;
    }

    /**
     * accessor
     * @returns the array list with amphoras of the main tableau
     * @post returns the array list with amphoras of the main tableau
     */
    public static ArrayList<Tiles> getAmphoras(){
        return amphoras;
    }


    /**
     * accessor
     * @returns the array list with players of the game
     * @post returns the array list with the players of the game
     */
    public ArrayList<Player> getPlayers(){
        return players;
    }
}