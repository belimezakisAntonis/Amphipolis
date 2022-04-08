package Controller;


import Model.*;
import View.View;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * this class represents the initialization and the rules of the game.
 */
public class Controller {
    private static Player player1;
    private static Player player2;
    private static Player player3;
    private static Player player4;
    private static int counter2=0;
    private static int score;
    private static ArrayList<Player> players =new ArrayList<Player>(4);
    private static ArrayList<JButton> landslides = new ArrayList<JButton>(0);
    private String color;
    private ArrayList<Tiles> card=new ArrayList<Tiles>(0);
    private ArrayList<Tiles> tiles=new ArrayList<Tiles>(0);
    public  int max=3,min=0;
    private static  Player currentPlayer=null;



    /**
     * constructor initializes the players and the cards of the game
     * @post creates the players of the game sets their color,score and the cards of the game
     */
    public Controller() {
        new Board();
        player1 = new Player("Player1", 0, false,
                false, false, false);
        players.add(player1);
        player2 = new Player("Player2", 0, false,
                false, false, false);
        players.add(player2);
        player3 = new Player("Player3", 0, false,
                false, false, false);
        players.add(player3);
        player4 = new Player("Player4", 0, false,
                false, false, false);
        players.add(player4);

        player1.setScore(0);//must be 0
        player2.setScore(0);//must be 0
        player3.setScore(0);//must be 0
        player4.setScore(0);//must be 0
        setColor();

        currentPlayer=turnPlayer(0,players.size()-1);
        new View(currentPlayer);
    }

    /**
     * transformer
     * @param counter non-negative integer number
     * @post changes counter by 1(adds 1 on old counter)
     */
    public static void setCounter2(int counter){
        counter2=counter;
    }

    /**
     * accessor
     * @returns counter2
     * @post returns counter2
     */
    public static int getCounter2() {
        return counter2;
    }

    /**
     * accessor
     * @returns landslides
     * @post returns landslides
     */
    public static ArrayList<JButton> getLandslides() {
        return landslides;
    }

    /**
     * transformer computes the score of the player
     * @post: computes the score of the player
     */
    public void setScore(){
        for(int i=0;i<players.size();i++){
            if((players.get(i).getRed_mosaics().size())%4==0){
                players.get(i).setScore((players.get(i).getRed_mosaics().size()/4)*4+players.get(i).getScore());
            }
            else{
                players.get(i).setScore((players.get(i).getRed_mosaics().size()/4)*4+players.get(i).getScore());
                int a=players.get(i).getRed_mosaics().size()%4;
                int b=players.get(i).getYl_mosaics().size()%4;
                int c=players.get(i).getGr_mosaics().size()%4;
                if((a+b+c)>=8){
                    players.get(i).setScore(4+players.get(i).getScore());
                }
                else if((a+b+c)>=4){
                    players.get(i).setScore(2+players.get(i).getScore());
                }
                else{

                }
            }
            if((players.get(i).getYl_mosaics().size())%4==0){
                players.get(i).setScore((players.get(i).getYl_mosaics().size()/4)*4+players.get(i).getScore());
            }
            else{
                players.get(i).setScore((players.get(i).getYl_mosaics().size()/4)*4+players.get(i).getScore());
                int a=players.get(i).getRed_mosaics().size()%4;
                int b=players.get(i).getYl_mosaics().size()%4;
                int c=players.get(i).getGr_mosaics().size()%4;
                if((a+b+c)>=8){
                    players.get(i).setScore(4+players.get(i).getScore());
                }
                else if((a+b+c)>=4){
                    players.get(i).setScore(2+players.get(i).getScore());
                }
                else{

                }
            }
            if((players.get(i).getGr_mosaics().size())%4==0){
                players.get(i).setScore((players.get(i).getGr_mosaics().size()/4)*4+players.get(i).getScore());
            }
            else{
                players.get(i).setScore((players.get(i).getGr_mosaics().size()/4)*4+players.get(i).getScore());
                int a=players.get(i).getRed_mosaics().size()%4;
                int b=players.get(i).getYl_mosaics().size()%4;
                int c=players.get(i).getGr_mosaics().size()%4;
                if((a+b+c)>=8){
                    players.get(i).setScore(4+players.get(i).getScore());
                }
                else if((a+b+c)>=4){
                    players.get(i).setScore(2+players.get(i).getScore());
                }
                else{

                }
            }
        }
    }

    /**
     * accessor returns the score of the player
     * @return score
     * @post: returns the score of the player
     */
    public int getScore(){
        return score;
    }

    /**
     * transformer sets a color to each player
     * @post sets a color to each player
     */
    public static void setColor(){
        int max = 3, min = 0;
        Random rand = new Random();
        int num = 0;
        ArrayList<String> colors =new ArrayList<>();
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("BLACK");
        num = rand.nextInt((max - min) + 1) + min;

        player1.setColor(colors.get(num));
        colors.remove(num);
        max = 2;
        int num2 = rand.nextInt((max - min) + 1) + min;

        player2.setColor(colors.get(num2));

        colors.remove(num2);
        max = 1;
        int num3 = rand.nextInt((max - min) + 1) + min;


        player3.setColor(colors.get(num3));

        colors.remove(num3);

        player4.setColor(colors.get(0));

    }



    /**
     * tansformer
     * @post shows the main tableau of the game
     */
    public void initialize_tableau(){
        for (int i = 0; i < 24; i++) {
            Landslide landslide=new Landslide();

        }
        for (int i = 0; i < 9; i++) {
            GreenMosaic greenMosaic=new GreenMosaic();
            RedMosaic redMosaic=new RedMosaic();
            YellowMosaic yellowMosaic=new YellowMosaic();

        }
        for (int i = 0; i < 12; i++) {
            Caryatid caryatid=new Caryatid();
            Sphinx sphinx =new Sphinx();

        }
        for (int i = 0; i < 5; i++) {
            GreenAmphora greenAmphora=new GreenAmphora();
            PurpleAmphora purpleAmphora=new PurpleAmphora();
            RedAmphora redAmphora=new RedAmphora();
            YellowAmphora yellowAmphora=new YellowAmphora();
            BlueAmphora blueAmphora=new BlueAmphora();
            BrownAmphora brownAmphora=new BrownAmphora();

        }
        for (int i = 0; i < 10; i++) {
            BigBottomSkeleton bbs=new BigBottomSkeleton();
            BigTopSkeleton bts=new BigTopSkeleton();

        }
        for (int i = 0; i < 5; i++) {
            SmallBottomSkeleton sbs=new SmallBottomSkeleton();
            SmallTopSkeleton sts=new SmallTopSkeleton();

        }
    }

    /**
     * observer
     * @returns true if the professor card has been played
     * @post returns true if the professor card has been played
     */
    public boolean professor_has_been_played(){
        return true;
    }

    /**
     * observer
     * @returns true if the assistant card has been played
     * @post returns true if the assistant card has been played
     */
    public boolean assistant_has_been_played(){
        return true;
    }

    /**
     * observer
     * @returns true if the digger card has been played
     * @post reuturns true if the digger card has been played
     */
    public boolean digger_has_been_played(){
        return true;
    }

    /**
     * observer
     * @returns true if archaeologist card has been played
     * @post returns true if archaeologist card has been played
     */
    public boolean archaeologist_has_been_played(){
        return true;
    }


    /**
     * accessor that returns the color
     * @post returns color
     * @returns color
     */
    public String getColor(){
        return color;
    }

    /**
     * transformer
     * @param min
     * @param max
     * @returns the turn of the player to play
     */
    public static Player turnPlayer(int min,int max){
        Random rand = new Random();


        int randomNum = rand.nextInt((max - min) + 1) + min;
        Player player=players.get(randomNum);
        players.remove(randomNum);
        return player;
    }

    /**
     * transformer
     * initializes the components which are needed in order to start a new round
     * @post initializes the components which are needed in order to start a new round e.g moirasma kartwn
     */
    public static void setNewRound() {
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        setColor();
    }

    /**
     * observer returns true if round is over
     * @returns true or false
     * @post returns true if round is over
     */
    public  static boolean roundIsOver(){
        if(players.size()==0) {
            return true;
        }
        return false;
    }

    /**
     * transformer
     * @param player
     * @post sets a player as current player
     */
    public static void setCurrentPlayer(Player player){
        currentPlayer=player;
    }

    /**
     * observer
     *
     *
     * @returns the player who plays now
     * @post returns who player plays now
     */
    public static Player getCurrentPlayer(){

        return currentPlayer;
    }

    /**
     * transformer
     * @post changes the turn of the player who finished the round to play the next.
     */
    public void changePlayer(){
        if(playerFinishedTheRound()==true) {

            currentPlayer.setCounter(0);
            currentPlayer=turnPlayer(min,max);
        }
    }

    /**
     * observer
     * @returns true if the round has been finished
     * @post returns true if the round has been finished
     */
    public static boolean playerFinishedTheRound(){
        if(currentPlayer.getCounter()==4 || (currentPlayer.getHasPlayed1()==true || currentPlayer.getHasPlayed2()==true ||
                currentPlayer.getHasPlayed3()==true || currentPlayer.getHasPlayed4()==true)){
            return true;
        }
        return false;
    }

    /**
     * accessor
     * @pre at least one winner
     * @returns the winner of the game
     * @post returns the winner of the game
     */
    public Player theWinnerIs(){
        if(gameFinished()==true){
            for(int i=1;i<players.size();i=i+2){
                ArrayList<Player> winner=null;
                if(getPlayers().get(i).getScore()<getPlayers().get(i-1).getScore()){
                    winner.add(getPlayers().get(i-1));
                }
                else{
                    winner.add(getPlayers().get(i));
                }
                if(winner.size()==2){
                    if(winner.get(1).getScore()<winner.get(0).getScore()){
                        return(winner.get(0));
                    }
                    else{
                        return(winner.get(1));
                    }
                }
            }
        }
        return null;
    }

    /**
     * observer
     * @returns true if the condition of termination of the game is true
     * @post controls if the game is over
     */
    public boolean gameFinished(){
        if(landslideAreaisFull()==true){

            return true;
        }
        return false;
    }

    /**
     *observer
     * @returns true if area of tiles is full
     * @post returns true if area of tiles is full
     */
    public static boolean landslideAreaisFull(){
        if(landslides.size()==16){
            return true;
        }
        return false;
    }

    /**
     * accessor
     * @returns a player from the array list of players
     * @post returns a player from the array list of players
     */
    public static ArrayList<Player> getPlayers(){
        return players;
    }

    /**
     * transformer
     * @post sets 8 landslides on area with land slides(implementation with array list),initialization of thief
     * @post initialization of one player,initialization of the cards and the main tableau
     */
    public void initaliaze_the_game_with_Thief(){}

    /**
     * transformer
     * @post all the cards which are played,will be owned by thief if there are no cards thief takes nothing
     */
    public void pullAllTheCardsTief(){}

    /**
     * transformer
     * @param score
     * @pre score should be non negative number
     * @post increments score of thief
     */
    public void setScoreforThief(int score){}

    /**
     * accessor
     * @returns the score of thief
     * @post returns the score of thief
     */
     public int getScoreforThief(){return 0;}

    /**
     * accesor
     *
     * @post returns the winner thief or the player
     */
     public void GetWinnerThiefOrPlayer(){}


    /**
     * the main method which runs the application
     * @param args
     */
    public static void main(String[] args) {
        new Controller();
    }
}