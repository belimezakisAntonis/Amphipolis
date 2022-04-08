package View;
import Controller.*;
import Model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

/**
 * this class initializes the window and the cards of the game
 */
public class View extends JFrame implements ActionListener {
    private static BlueAmphora blueAmphora=new BlueAmphora();
    private static RedAmphora redAmphora=new RedAmphora();
    private static YellowAmphora yellowAmphora=new YellowAmphora();
    private static PurpleAmphora purpleAmphora=new PurpleAmphora();
    private static GreenAmphora greenAmphora=new GreenAmphora();
    private static BrownAmphora brownAmphora=new BrownAmphora();
    private static GreenMosaic greenMosaic=new GreenMosaic();
    private static RedMosaic redMosaic=new RedMosaic();
    private static YellowMosaic yellowMosaic=new YellowMosaic();
    private static Sphinx sphinxa=new Sphinx();
    private static Caryatid caryatida=new Caryatid();
    private static BigBottomSkeleton BBS=new BigBottomSkeleton();
    private static BigTopSkeleton BTS=new BigTopSkeleton();
    private static SmallBottomSkeleton SBS=new SmallBottomSkeleton();
    private static SmallTopSkeleton STS=new SmallTopSkeleton();
    private ClassLoader cldr;
    private JLayeredPane panel;

    private JButton professor;
    private JButton archaeologist;
    private JButton digger;
    private JButton assistant;
    private Image image;
    private JLabel choice1,choice2,choice3;
    private URL imageURL,imageURL2,imageURL3,imageURL4,imageURL5,imageURL6,imageURL7,imageURL8,
    imageURL9,imageURL10,imageURL11,imageURL12,imageURL13,imageURL14,imageURL15,imageURL16,imageURL17,imageURL18,
    imageURL19,imageURL20,imageURL21;
    private ArrayList <JButton>k_list=new ArrayList<JButton>();
    private JLabel jLabel,jLabel2,jLabel3,jLabel4;
    private JLabel label2;
    private ArrayList <String>but_list=new ArrayList<String>();
    private JButton DrawTiles;
    private JButton EndTurn;

    private JButton blue_amphora;
    private JButton brown_amphora;
    private JButton green_amphora;
    private JButton purple_amphora;
    private JButton red_amphora;
    private JButton yellow_amphora;
    private JButton mosaic_green;
    private JButton mosaic_red;
    private JButton mosaic_yellow;
    private JButton caryatid;
    private JButton sphinx;
    private JButton landslide;
    private JButton skeleton_big_bottom;
    private JButton skeleton_big_top;
    private JButton skeleton_small_bottom;
    private JButton skeleton_small_top;
    private JButton blue_amphora2;
    private JButton brown_amphora2;
    private JButton green_amphora2;
    private JButton purple_amphora2;
    private JButton red_amphora2;
    private JButton yellow_amphora2;
    private JButton mosaic_green2;
    private JButton mosaic_red2;
    private JButton mosaic_yellow2;
    private JButton caryatid2;
    private JButton sphinx2;
    private JButton landslide2;
    private JButton skeleton_big_bottom2;
    private JButton skeleton_big_top2;
    private JButton skeleton_small_bottom2;
    private JButton skeleton_small_top2;

    /**
     * postcondition:initializes the tableau of the game with the background image,5 areas of the tablo,the right panel and
     * the bottom panel
     *
     */
    public View(Player currentPlayer) {
        super("Amphipolis");
        currentPlayer.setCounter(0);
        jLabel = new JLabel("Player1");
        jLabel2=new JLabel("Player2");
        jLabel3=new JLabel("Player3");
        jLabel4 = new JLabel("Player4");
        jLabel.setFont(new Font("Consolas", Font.BOLD, 30));
        jLabel.setBounds(1150, 10, 1300, 30);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel.setVisible(false);
        if(currentPlayer.getName().equals("Player1")) {

            if(currentPlayer.getColor().equals("GREEN")) {
                jLabel.setForeground(Color.GREEN);
            }
            else if(currentPlayer.getColor().equals("BLUE")){
                jLabel.setForeground(Color.BLUE);
            }
            else if(currentPlayer.getColor().equals("RED")){
                jLabel.setForeground(Color.RED);
            }
            else{
                jLabel.setForeground(Color.BLACK);
            }

            jLabel.setVisible(true);
        }
        if(currentPlayer.getName().equals("Player2")) {

            jLabel2.setFont(new Font("Consolas", Font.BOLD, 30));
            if (currentPlayer.getColor().equals("GREEN")) {
                jLabel2.setForeground(Color.GREEN);
            } else if (currentPlayer.getColor().equals("BLUE")) {
                jLabel2.setForeground(Color.BLUE);
            } else if (currentPlayer.getColor().equals("RED")) {
                jLabel2.setForeground(Color.RED);
            } else {
                jLabel2.setForeground(Color.BLACK);
            }
            jLabel2.setBounds(1150, 10, 1300, 30);
            jLabel2.setVisible(true);

        }
        if(currentPlayer.getName().equals("Player3")) {

            jLabel3.setFont(new Font("Consolas", Font.BOLD, 30));
            if (currentPlayer.getColor().equals("GREEN")) {
                jLabel3.setForeground(Color.GREEN);
            } else if (currentPlayer.getColor().equals("BLUE")) {
                jLabel3.setForeground(Color.BLUE);
            } else if (currentPlayer.getColor().equals("RED")) {
                jLabel3.setForeground(Color.RED);
            } else {
                jLabel3.setForeground(Color.BLACK);
            }
            jLabel3.setBounds(1150, 10, 1300, 30);
            jLabel3.setVisible(true);

        }
        if(currentPlayer.getName().equals("Player4")) {

            jLabel4.setFont(new Font("Consolas", Font.BOLD, 30));
            if (currentPlayer.getColor().equals("GREEN")) {
                jLabel4.setForeground(Color.GREEN);
            } else if (currentPlayer.getColor().equals("BLUE")) {
                jLabel4.setForeground(Color.BLUE);
            } else if (currentPlayer.getColor().equals("RED")) {
                jLabel4.setForeground(Color.RED);
            } else {
                jLabel4.setForeground(Color.BLACK);
            }
            jLabel4.setBounds(1150, 10, 1300, 30);
            jLabel4.setVisible(true);

        }

        label2 = new JLabel("Use Character");
        label2.setFont(new Font("Consolas", Font.PLAIN, 50));
        label2.setBounds(1150, 60, 1300, 100);
        label2.setVisible(true);

        panel = new JLayeredPane();
        DrawTiles = new JButton("Draw Tiles");
        DrawTiles.setBounds(1100, 680, 340, 50);
        DrawTiles.addActionListener(this);
        EndTurn = new JButton("End turn");
        EndTurn.setBounds(1100, 730, 340, 50);
        EndTurn.addActionListener(this);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cldr = this.getClass().getClassLoader();

        setLayout(new FlowLayout());
        this.setResizable(false);
        this.setPreferredSize(new Dimension(1000, 800));
        imageURL = cldr.getResource("images_2020/background.png");

        this.setIconImage(new ImageIcon(imageURL).getImage());


        panel.setBounds(0, 0, 1300, 1000);
        setContentPane(new JLabel(new ImageIcon(imageURL)));

        // setLayout(new FlowLayout());
        setSize(1600, 1000);
        // panel.setVisible(true);
        setVisible(true);

        this.add(label2);
        this.add(DrawTiles);
        this.add(EndTurn);
        this.add(jLabel);
        this.add(jLabel2);
        this.add(jLabel3);
        this.add(jLabel4);

        initCards();
        this.add(professor);
        this.add(digger);
        this.add(archaeologist);
        this.add(assistant);
        this.add(green_amphora);
        this.add(brown_amphora);
        this.add(blue_amphora);
        this.add(yellow_amphora);
        this.add(purple_amphora);
        this.add(red_amphora);
        this.add(mosaic_green);
        this.add(mosaic_red);
        this.add(mosaic_yellow);
        this.add(caryatid);
        this.add(sphinx);
        this.add(landslide);
        this.add(skeleton_big_bottom);
        this.add(skeleton_big_top);
        this.add(skeleton_small_bottom);
        this.add(skeleton_small_top);

        this.add(green_amphora2);
        this.add(brown_amphora2);
        this.add(blue_amphora2);
        this.add(yellow_amphora2);
        this.add(purple_amphora2);
        this.add(red_amphora2);
        this.add(mosaic_green2);
        this.add(mosaic_red2);
        this.add(mosaic_yellow2);
        this.add(caryatid2);
        this.add(sphinx2);
        this.add(landslide2);
        this.add(skeleton_big_bottom2);
        this.add(skeleton_big_top2);
        this.add(skeleton_small_bottom2);
        this.add(skeleton_small_top2);
    }/**
     * postcondion:initializes the stack with the cards(tiles) and the special cards of the game
     */
    public void initCards(){
        cldr = this.getClass().getClassLoader();
        for(int i=0;i<4;i++) {
            professor = new JButton();
            digger = new JButton();
            archaeologist = new JButton();
            assistant = new JButton();



            imageURL2 = cldr.getResource("images_2020/professor.png");
            imageURL3 = cldr.getResource("images_2020/digger.png");
            imageURL4 = cldr.getResource("images_2020/assistant.png");
            imageURL5 = cldr.getResource("images_2020/archaeologist.png");
            professor.setBounds(1100, 130, 150, 250);
            professor.addActionListener(this);
            digger.setBounds(1250, 130, 150, 250);
            digger.addActionListener(this);
            archaeologist.setBounds(1100, 380, 150, 250);
            archaeologist.addActionListener(this);
            assistant.setBounds(1250, 380, 150, 250);
            assistant.addActionListener(this);
            professor.setIcon(new ImageIcon(imageURL2));
            digger.setIcon(new ImageIcon(imageURL3));
            assistant.setIcon(new ImageIcon(imageURL4));
            archaeologist.setIcon(new ImageIcon(imageURL5));
            professor.setVisible(true);
            archaeologist.setVisible(true);
            digger.setVisible(true);
            assistant.setVisible(true);
        }
        for(int i=0;i<5;i++){
            green_amphora=new JButton();
            green_amphora.addActionListener(this);
            red_amphora=new JButton();
            red_amphora.addActionListener(this);
            purple_amphora =new JButton();
            purple_amphora.addActionListener(this);
            yellow_amphora=new JButton();
            yellow_amphora.addActionListener(this);
            blue_amphora=new JButton();
            blue_amphora.addActionListener(this);
            brown_amphora=new JButton();
            brown_amphora.addActionListener(this);
            green_amphora2=new JButton();
            green_amphora2.addActionListener(this);
            red_amphora2=new JButton();
            red_amphora2.addActionListener(this);
            purple_amphora2 =new JButton();
            purple_amphora2.addActionListener(this);
            yellow_amphora2=new JButton();
            yellow_amphora2.addActionListener(this);
            blue_amphora2=new JButton();
            blue_amphora2.addActionListener(this);
            brown_amphora2=new JButton();
            brown_amphora2.addActionListener(this);
            imageURL6= cldr.getResource("images_2020/amphora_blue.png");

            imageURL7=cldr.getResource("images_2020/amphora_brown.png");
            imageURL8=cldr.getResource("images_2020/amphora_green.png");
            imageURL9=cldr.getResource("images_2020/amphora_purple.png");
            imageURL10=cldr.getResource("images_2020/amphora_red.png");
            imageURL11=cldr.getResource("images_2020/amphora_yellow.png");

            green_amphora.setIcon(new ImageIcon(imageURL8));
            green_amphora.setBounds(0,860,100,100);
            green_amphora.setVisible(false);

            brown_amphora.setIcon(new ImageIcon(imageURL7));
            brown_amphora.setBounds(100,860,100,100);
            brown_amphora.setVisible(false);
            blue_amphora.setIcon(new ImageIcon(imageURL6));
            blue_amphora.setBounds(200,860,100,100);
            blue_amphora.setVisible(false);
            yellow_amphora.setIcon(new ImageIcon(imageURL11));
            yellow_amphora.setBounds(300,860,100,100);
            yellow_amphora.setVisible(false);
            purple_amphora.setIcon(new ImageIcon(imageURL9));
            purple_amphora.setBounds(400,860,100,100);
            purple_amphora.setVisible(false);
            red_amphora.setIcon(new ImageIcon(imageURL10));
            red_amphora.setBounds(500,860,100,100);
            red_amphora.setVisible(false);

            green_amphora2.setIcon(new ImageIcon(imageURL8));
            green_amphora2.setBounds(600,600,50,50);
            green_amphora2.setVisible(false);
            brown_amphora2.setIcon(new ImageIcon(imageURL7));
            brown_amphora2.setBounds(550,600,50,50);
            brown_amphora2.setVisible(false);
            blue_amphora2.setIcon(new ImageIcon(imageURL6));
            blue_amphora2.setBounds(500,600,50,50);
            blue_amphora2.setVisible(false);
            yellow_amphora2.setIcon(new ImageIcon(imageURL11));
            yellow_amphora2.setBounds(600,650,50,50);
            yellow_amphora2.setVisible(false);
            purple_amphora2.setIcon(new ImageIcon(imageURL9));
            purple_amphora2.setBounds(550,650,50,50);
            purple_amphora2.setVisible(false);
            red_amphora2.setIcon(new ImageIcon(imageURL10));
            red_amphora2.setBounds(500,650,50,50);
            red_amphora2.setVisible(false);
            but_list.add("green_amphora");
            but_list.add("red_amphora");
            but_list.add("purple_amphora");
            but_list.add("yellow_amphora");
            but_list.add("blue_amphora");
            but_list.add("brown_amphora");
        }
        but_list.remove("yellow_amphora");
        yellow_amphora2.setVisible(true);
        for(int i=0;i<9;i++){
            mosaic_green=new JButton();
            mosaic_green.addActionListener(this);
            mosaic_red=new JButton();
            mosaic_red.addActionListener(this);
            mosaic_yellow=new JButton();
            mosaic_yellow.addActionListener(this);
            mosaic_green2=new JButton();
            mosaic_green2.addActionListener(this);
            mosaic_red2=new JButton();
            mosaic_red2.addActionListener(this);
            mosaic_yellow2=new JButton();
            mosaic_yellow2.addActionListener(this);
            imageURL12= cldr.getResource("images_2020/mosaic_green.png");
            imageURL13= cldr.getResource("images_2020/mosaic_red.png");
            imageURL14= cldr.getResource("images_2020/mosaic_yellow.png");
            mosaic_green.setIcon(new ImageIcon(imageURL12));
            mosaic_green.setBounds(600,860,100,100);
            mosaic_green.setVisible(false);
            mosaic_red.setIcon(new ImageIcon(imageURL13));
            mosaic_red.setBounds(700,860,100,100);
            mosaic_red.setVisible(false);
            mosaic_yellow.setIcon(new ImageIcon(imageURL14));
            mosaic_yellow.setBounds(800,860,100,100);
            mosaic_yellow.setVisible(false);

            mosaic_green2.setIcon(new ImageIcon(imageURL12));
            mosaic_green2.setBounds(620,340,50,50);
            mosaic_green2.setVisible(false);
            mosaic_red2.setIcon(new ImageIcon(imageURL13));
            mosaic_red2.setBounds(570,340,50,50);
            mosaic_red2.setVisible(false);
            mosaic_yellow2.setIcon(new ImageIcon(imageURL14));
            mosaic_yellow2.setBounds(520,340,50,50);
            mosaic_yellow2.setVisible(false);
            but_list.add("mosaic_green");
            but_list.add("mosaic_red");
            but_list.add("mosaic_yellow");
        }
        but_list.remove("mosaic_green");
        mosaic_green2.setVisible(true);
        for(int i=0;i<24;i++){
            landslide=new JButton();
            landslide2=new JButton();
            landslide.addActionListener(this);
            landslide2.addActionListener(this);
            imageURL17=cldr.getResource("images_2020/landslide.png");
            landslide.setIcon(new ImageIcon(imageURL17));
            landslide.setBounds(1100,860,100,100);
            landslide.setVisible(false);

            landslide2.setIcon(new ImageIcon(imageURL17));
            landslide2.setBounds(750,450,50,50);
            landslide2.setVisible(false);
            but_list.add("landslide");
        }
        but_list.remove("landslide");
        landslide2.setVisible(true);
        Controller.getLandslides().add(landslide);
        for(int i=0;i<12;i++){
            caryatid=new JButton();
            caryatid.addActionListener(this);
            sphinx=new JButton();
            sphinx.addActionListener(this);
            caryatid2=new JButton();
            caryatid2.addActionListener(this);
            sphinx2=new JButton();
            sphinx2.addActionListener(this);


            imageURL15=cldr.getResource("images_2020/caryatid.png");
            imageURL16=cldr.getResource("images_2020/sphinx.png");
            caryatid.setIcon(new ImageIcon(imageURL15));
            caryatid.setBounds(900,860,100,100);
            caryatid.setVisible(false);
            sphinx.setIcon(new ImageIcon(imageURL16));
            sphinx.setBounds(1000,860,100,100);
            sphinx.setVisible(false);

            caryatid2.setIcon(new ImageIcon(imageURL15));
            caryatid2.setBounds(940,340,50,50);
            caryatid2.setVisible(false);
            sphinx2.setIcon(new ImageIcon(imageURL16));
            sphinx2.setBounds(1000,340,50,50);
            sphinx2.setVisible(false);
            but_list.add("caryatid");
            but_list.add("sphinx");
        }
        but_list.remove("caryatid");
        caryatid2.setVisible(true);
        for(int i=0;i<10;i++){
            skeleton_big_bottom=new JButton();
            skeleton_big_bottom.addActionListener(this);
            skeleton_big_top=new JButton();
            skeleton_big_top.addActionListener(this);
            skeleton_big_bottom2=new JButton();
            skeleton_big_bottom2.addActionListener(this);
            skeleton_big_top2=new JButton();
            skeleton_big_top2.addActionListener(this);

            imageURL18= cldr.getResource("images_2020/skeleton_big_bottom.png");
            imageURL19=cldr.getResource("images_2020/skeleton_big_top.png");
            skeleton_big_bottom.setIcon(new ImageIcon(imageURL18));
            skeleton_big_bottom.setBounds(1200,860,100,100);
            skeleton_big_bottom.setVisible(false);
            skeleton_big_top.setIcon(new ImageIcon(imageURL19));
            skeleton_big_top.setBounds(1300,860,100,100);
            skeleton_big_top.setVisible(false);

            skeleton_big_bottom2.setIcon(new ImageIcon(imageURL18));
            skeleton_big_bottom2.setBounds(960,700,50,50);
            skeleton_big_bottom2.setVisible(false);
            skeleton_big_top2.setIcon(new ImageIcon(imageURL19));
            skeleton_big_top2.setBounds(960,650,50,50);
            skeleton_big_top2.setVisible(false);
            but_list.add("skeleton_big_bottom");
            but_list.add("skeleton_big_top");
        }
        but_list.remove("skeleton_big_bottom");
        skeleton_big_bottom2.setVisible(true);

        for(int i=0;i<5;i++){
            skeleton_small_bottom=new JButton();
            skeleton_small_bottom.addActionListener(this);
            skeleton_small_top=new JButton();
            skeleton_small_top.addActionListener(this);
            skeleton_small_bottom2=new JButton();
            skeleton_small_bottom2.addActionListener(this);
            skeleton_small_top2=new JButton();
            skeleton_small_top2.addActionListener(this);

            imageURL20=cldr.getResource("images_2020/skeleton_small_bottom.png");
            imageURL21=cldr.getResource("images_2020/skeleton_small_top.png");

            skeleton_small_bottom.setIcon(new ImageIcon(imageURL20));
            skeleton_small_bottom.setBounds(1400,860,100,100);
            skeleton_small_bottom.setVisible(false);
            skeleton_small_top.setIcon(new ImageIcon(imageURL21));
            skeleton_small_top.setBounds(1500,860,100,100);
            skeleton_small_top.setVisible(false);

            skeleton_small_bottom2.setIcon(new ImageIcon(imageURL20));
            skeleton_small_bottom2.setBounds(960,600,50,50);
            skeleton_small_bottom2.setVisible(false);
            skeleton_small_top2.setIcon(new ImageIcon(imageURL21));
            skeleton_small_top2.setBounds(960,550,50,50);
            skeleton_small_top2.setVisible(false);
            but_list.add("skeleton_small_bottom");
            but_list.add("skeleton_small_top");
        }
    }

    /**
     * accessor
     * @post returns blue amphora
     * @returns blue amphora
     */
    public static BlueAmphora getBlueAmphora() {
        return blueAmphora;
    }

    /**
     * accessor
     * @returns a sphinx
     * @post returns a sphinx
     */
    public static Sphinx getSphinx() {
        return sphinxa;
    }

    /**
     * accessor
     * @post returns a red mosaic
     * @returns a red mosaic
     */
    public static RedMosaic getRedMosaic() {
        return redMosaic;
    }

    /**
     * accessor
     * @returns a red amphora
     * @post returns a red amphora
     */
    public static RedAmphora getRedAmphora() {
        return redAmphora;
    }

    /**
     * accessor
     * @returns a purple amphora
     * @post returns a purple amphora
     */
    public static PurpleAmphora getPurpleAmphora() {
        return purpleAmphora;
    }

    /**
     * accessor
     * @post returns a green mosaic
     * @returns a green mosaic
     */
    public static GreenMosaic getGreenMosaic() {
        return greenMosaic;
    }

    /**
     * accessor
     * @returns a green amphora
     * @post returns a green amphora
     */
    public static GreenAmphora getGreenAmphora() {
        return greenAmphora;
    }

    /**
     * accessor
     * @returns a caryatida
     * @post returns a caryatida
     */
    public static Caryatid getCaryatid() {
        return caryatida;
    }

    /**
     * accessor
     * @returns a brown amphora
     * @post returns a brown amphora
     */
    public static BrownAmphora getBrownAmphora() {
        return brownAmphora;
    }

    /**
     * accessor
     * @returns a yellow amphora
     * @post returns a yellow amphora
     */
    public static  YellowAmphora getYellowAmphora(){
        return yellowAmphora;
    }

    /**
     * accessor
     * @returns a yellow mosaic
     * @post returns a yellow mosaic
     */
    public static YellowMosaic getYellowMosaic(){
        return yellowMosaic;
    }

    /**
     * accessor
     * @returns a big bottom skeleton
     * @post returns a big bottom skeleton
     */
    public static BigBottomSkeleton getBig_Bottom(){
        return BBS;
    }

    /**
     * accessor
     * @returns a big top skeleton
     * @post returns a big top skeleton
     */
    public static BigTopSkeleton getBig_Top(){
        return BTS;
    }

    /**
     * accesssor
     * @returns a small bottom skeleton
     * @post returns a small bottom skeleton
     */
    public static SmallBottomSkeleton getSmall_Bottom(){
        return SBS;
    }

    /**
     * accessor
     * @returns a small top skeleton
     * @post returns a small top skeleton
     */
    public static SmallTopSkeleton getSmall_Top(){
        return STS;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(Controller.getCurrentPlayer().getCounter()+"\t"+Controller.getCurrentPlayer().getName()+"\t"+
                Controller.getCurrentPlayer().getColor());
        if(Controller.getCurrentPlayer().getCounter()==3){
            DrawTiles.setEnabled(false);
        }
        if(e.getSource().equals(DrawTiles) && Controller.getCurrentPlayer().getCounter()<=3) {

           if (but_list.get(0).equals("blue_amphora")) {
               but_list.remove(but_list.get(0));
               blue_amphora.setVisible(false);
               blue_amphora2.setVisible(true);
               Controller.getCurrentPlayer().getBl_amphoras().add(getBlueAmphora());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("red_amphora")) {
               but_list.remove(but_list.get(0));
               red_amphora.setVisible(false);
               red_amphora2.setVisible(true);
               Controller.getCurrentPlayer().getRed_amphoras().add(getRedAmphora());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("yellow_amphora")) {
               but_list.remove(but_list.get(0));
               yellow_amphora.setVisible(false);
               yellow_amphora2.setVisible(true);
               Controller.getCurrentPlayer().getYl_amphoras().add(getYellowAmphora());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("green_amphora")) {
               but_list.remove(but_list.get(0));
               green_amphora.setVisible(false);
               green_amphora2.setVisible(true);
               Controller.getCurrentPlayer().getGr_amphoras().add(getGreenAmphora());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);;
           }
           else if (but_list.get(0).equals("purple_amphora")) {
               but_list.remove(but_list.get(0));
               purple_amphora.setVisible(false);
               purple_amphora2.setVisible(true);
               Controller.getCurrentPlayer().getPurple_amphoras().add(getPurpleAmphora());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("brown_amphora")) {
               but_list.remove(but_list.get(0));
               brown_amphora.setVisible(false);
               brown_amphora2.setVisible(true);
               Controller.getCurrentPlayer().getBr_amphoras().add(getBrownAmphora());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("caryatid")) {
               but_list.remove(but_list.get(0));
               caryatid.setVisible(false);
               caryatid2.setVisible(true);
               Controller.getCurrentPlayer().getCaryatids().add(getCaryatid());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("sphinx")) {
               but_list.remove(but_list.get(0));
               sphinx.setVisible(false);
               sphinx2.setVisible(true);
               Controller.getCurrentPlayer().getSphinxs().add(getSphinx());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("mosaic_green")) {
               but_list.remove(but_list.get(0));
               mosaic_green.setVisible(false);
               mosaic_green2.setVisible(true);
               Controller.getCurrentPlayer().getGr_mosaics().add(getGreenMosaic());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("mosaic_yellow")) {
               but_list.remove(but_list.get(0));
               mosaic_yellow.setVisible(false);
               mosaic_yellow2.setVisible(true);
               Controller.getCurrentPlayer().getYl_mosaics().add(getYellowMosaic());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("mosaic_red")) {
               but_list.remove(but_list.get(0));
               mosaic_red.setVisible(false);
               mosaic_red2.setVisible(true);
               Controller.getCurrentPlayer().getRed_mosaics().add(getRedMosaic());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("skeleton_big_bottom")) {
               but_list.remove(but_list.get(0));
               skeleton_big_bottom.setVisible(false);
               skeleton_big_bottom2.setVisible(true);
               Controller.getCurrentPlayer().getBBS().add(getBig_Bottom());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("skeleton_big_top")) {
               but_list.remove(but_list.get(0));
               skeleton_big_top.setVisible(false);
               skeleton_big_top2.setVisible(true);
               Controller.getCurrentPlayer().getBTS().add(getBig_Top());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("skeleton_small_bottom")) {
               but_list.remove(but_list.get(0));
               skeleton_small_bottom.setVisible(false);
               skeleton_small_bottom2.setVisible(true);
               Controller.getCurrentPlayer().getSBS().add(getSmall_Bottom());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("skeleton_small_top")) {
               but_list.remove(but_list.get(0));
               skeleton_small_top.setVisible(false);
               skeleton_small_top2.setVisible(true);
               Controller.getCurrentPlayer().getSTS().add(getSmall_Top());
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else if (but_list.get(0).equals("landslide")) {
               but_list.remove(but_list.get(0));
               landslide.setVisible(false);
               landslide2.setVisible(true);
               Controller.getLandslides().add(landslide);
               Controller.getCurrentPlayer().setCounter(Controller.getCurrentPlayer().getCounter()+1);
           }
           else{

           }

       }
       else if(e.getSource().equals(yellow_amphora2)){
           yellow_amphora2.setVisible(false);
           yellow_amphora.setVisible(true);
           Controller.setCounter2(Controller.getCounter2()+1);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
           if(Controller.getCounter2()==2){
               yellow_amphora2.setEnabled(false);
               blue_amphora2.setEnabled(false);
               brown_amphora2.setEnabled(false);
               purple_amphora2.setEnabled(false);
               red_amphora2.setEnabled(false);
               green_amphora2.setEnabled(false);
               caryatid2.setEnabled(false);
               sphinx2.setEnabled(false);
               landslide2.setEnabled(false);
               mosaic_green2.setEnabled(false);
               mosaic_yellow2.setEnabled(false);
               mosaic_red2.setEnabled(false);
               skeleton_big_bottom2.setEnabled(false);
               skeleton_big_top2.setEnabled(false);
               skeleton_small_bottom2.setEnabled(false);
               skeleton_small_top2.setEnabled(false);
           }
        }
        else if(e.getSource().equals(blue_amphora2)){
            blue_amphora2.setVisible(false);
            blue_amphora.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(brown_amphora2)){
            brown_amphora2.setVisible(false);
            brown_amphora.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(red_amphora2)){
            red_amphora2.setVisible(false);
            red_amphora.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(green_amphora2)){
            green_amphora2.setVisible(false);
            green_amphora.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(purple_amphora2)){
            purple_amphora2.setVisible(false);
            purple_amphora.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(mosaic_green2)){
            mosaic_green2.setVisible(false);
            mosaic_green.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(mosaic_yellow2)){
            mosaic_yellow2.setVisible(false);
            mosaic_yellow.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(mosaic_red2)){
            mosaic_red2.setVisible(false);
            mosaic_red.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(landslide2)){
            landslide2.setVisible(false);
            landslide.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(caryatid2)){
            caryatid2.setVisible(false);
            caryatid.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(sphinx2)){
            sphinx2.setVisible(false);
            sphinx.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            skeleton_big_bottom2.setEnabled(false);
            skeleton_big_top2.setEnabled(false);
            skeleton_small_bottom2.setEnabled(false);
            skeleton_small_top2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(skeleton_big_bottom2)){
            skeleton_big_bottom2.setVisible(false);
            skeleton_big_bottom.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(skeleton_big_top2)){
            skeleton_big_top2.setVisible(false);
            skeleton_big_top.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(skeleton_small_bottom2)){
            skeleton_small_bottom2.setVisible(false);
            skeleton_small_bottom.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }
        else if(e.getSource().equals(skeleton_small_top2)){
            skeleton_small_top2.setVisible(false);
            skeleton_small_top.setVisible(true);
            Controller.setCounter2(Controller.getCounter2()+1);
            yellow_amphora2.setEnabled(false);
            blue_amphora2.setEnabled(false);
            brown_amphora2.setEnabled(false);
            purple_amphora2.setEnabled(false);
            red_amphora2.setEnabled(false);
            green_amphora2.setEnabled(false);
            caryatid2.setEnabled(false);
            sphinx2.setEnabled(false);
            landslide2.setEnabled(false);
            mosaic_green2.setEnabled(false);
            mosaic_yellow2.setEnabled(false);
            mosaic_red2.setEnabled(false);
            if(Controller.getCounter2()==2){
                yellow_amphora2.setEnabled(false);
                blue_amphora2.setEnabled(false);
                brown_amphora2.setEnabled(false);
                purple_amphora2.setEnabled(false);
                red_amphora2.setEnabled(false);
                green_amphora2.setEnabled(false);
                caryatid2.setEnabled(false);
                sphinx2.setEnabled(false);
                landslide2.setEnabled(false);
                mosaic_green2.setEnabled(false);
                mosaic_yellow2.setEnabled(false);
                mosaic_red2.setEnabled(false);
                skeleton_big_bottom2.setEnabled(false);
                skeleton_big_top2.setEnabled(false);
                skeleton_small_bottom2.setEnabled(false);
                skeleton_small_top2.setEnabled(false);
            }
        }


        else if(e.getSource().equals(yellow_amphora)){
            yellow_amphora.setVisible(false);
            yellow_amphora2.setVisible(true);
            Controller.getCurrentPlayer().getYl_amphoras().add(yellowAmphora);
        }
        else if(e.getSource().equals(blue_amphora)){
            blue_amphora.setVisible(false);
            blue_amphora2.setVisible(true);
            Controller.getCurrentPlayer().getBl_amphoras().add(blueAmphora);
        }
        else if(e.getSource().equals(brown_amphora)){
            brown_amphora.setVisible(false);
            brown_amphora2.setVisible(true);
            Controller.getCurrentPlayer().getBr_amphoras().add(brownAmphora);
        }
        else if(e.getSource().equals(red_amphora)){
            red_amphora.setVisible(false);
            red_amphora2.setVisible(true);
            Controller.getCurrentPlayer().getRed_amphoras().add(redAmphora);
        }
        else if(e.getSource().equals(green_amphora)){
            green_amphora.setVisible(false);
            green_amphora2.setVisible(true);
            Controller.getCurrentPlayer().getGr_amphoras().add(greenAmphora);
        }
        else if(e.getSource().equals(purple_amphora)){
            purple_amphora.setVisible(false);
            purple_amphora2.setVisible(true);
            Controller.getCurrentPlayer().getPurple_amphoras().add(purpleAmphora);
        }
        else if(e.getSource().equals(mosaic_green)){
            mosaic_green.setVisible(false);
            mosaic_green2.setVisible(true);
            Controller.getCurrentPlayer().getGr_mosaics().add(greenMosaic);
        }
        else if(e.getSource().equals(mosaic_yellow)){
            mosaic_yellow.setVisible(false);
            mosaic_yellow2.setVisible(true);
            Controller.getCurrentPlayer().getYl_mosaics().add(yellowMosaic);
        }
        else if(e.getSource().equals(mosaic_red)){
            mosaic_red.setVisible(false);
            mosaic_red2.setVisible(true);
            Controller.getCurrentPlayer().getRed_mosaics().add(redMosaic);
        }
        else if(e.getSource().equals(landslide)){
            landslide.setVisible(false);
            landslide2.setVisible(true);
            Controller.getLandslides().add(landslide);
        }
        else if(e.getSource().equals(caryatid)){
            caryatid.setVisible(false);
            caryatid2.setVisible(true);
            Controller.getCurrentPlayer().getCaryatids().add(caryatida);
        }
        else if(e.getSource().equals(sphinx)){
            sphinx.setVisible(false);
            sphinx2.setVisible(true);
            Controller.getCurrentPlayer().getSphinxs().add(sphinxa);
        }
        else if(e.getSource().equals(skeleton_big_bottom)){
            skeleton_big_bottom.setVisible(false);
            skeleton_big_bottom2.setVisible(true);
            Controller.getCurrentPlayer().getBBS().add(BBS);
        }
        else if(e.getSource().equals(skeleton_big_top)){
            skeleton_big_top.setVisible(false);
            skeleton_big_top2.setVisible(true);
            Controller.getCurrentPlayer().getBTS().add(BTS);
        }
        else if(e.getSource().equals(skeleton_small_bottom)){
            skeleton_small_bottom.setVisible(false);
            skeleton_small_bottom2.setVisible(true);
            Controller.getCurrentPlayer().getSBS().add(SBS);
        }
        else if(e.getSource().equals(skeleton_small_top)){
            skeleton_small_top.setVisible(false);
            skeleton_small_top2.setVisible(true);
            Controller.getCurrentPlayer().getSTS().add(STS);
            System.out.println("travikses plakidio!Synolika ta plakidia katolisthisis einai:"+
                    Controller.getLandslides().size());
        }
        else if(e.getSource().equals(assistant)){
            assistant.setEnabled(false);
        }
        else if(e.getSource().equals(digger)){
            digger.setEnabled(false);
        }
        else if(e.getSource().equals(archaeologist)){
            archaeologist.setEnabled(false);
        }
        else if(e.getSource().equals(professor)){
            professor.setEnabled(false);
        }
        else{
            if(Controller.playerFinishedTheRound() || e.getSource().equals(EndTurn)){
                yellow_amphora2.setEnabled(true);
                blue_amphora2.setEnabled(true);
                brown_amphora2.setEnabled(true);
                purple_amphora2.setEnabled(true);
                red_amphora2.setEnabled(true);
                green_amphora2.setEnabled(true);
                caryatid2.setEnabled(true);
                sphinx2.setEnabled(true);
                landslide2.setEnabled(true);
                mosaic_green2.setEnabled(true);
                mosaic_yellow2.setEnabled(true);
                mosaic_red2.setEnabled(true);
                skeleton_big_bottom2.setEnabled(true);
                skeleton_big_top2.setEnabled(true);
                skeleton_small_bottom2.setEnabled(true);
                skeleton_small_top2.setEnabled(true);
                if(Controller.roundIsOver()==true){
                    Controller.setNewRound();
                }
                if(Controller.getCurrentPlayer().getName().equals("Player1")){
                    jLabel.setVisible(false);
                    Controller.getPlayers().remove(Controller.getCurrentPlayer());
                }
                else if(Controller.getCurrentPlayer().getName().equals("Player2")){
                    jLabel2.setVisible(false);
                    Controller.getPlayers().remove(Controller.getCurrentPlayer());
                }
                else if(Controller.getCurrentPlayer().getName().equals("Player3")){
                    jLabel3.setVisible(false);
                    Controller.getPlayers().remove(Controller.getCurrentPlayer());
                }
                else if(Controller.landslideAreaisFull()==true){
                    System.out.println("To paixnidi elhkse");
                    System.exit(0);
                }
                else{
                    jLabel4.setVisible(false);
                    Controller.getPlayers().remove(Controller.getCurrentPlayer());
                }
                Controller.setCurrentPlayer(Controller.turnPlayer(0,Controller.getPlayers().size()-1));
                Controller.getCurrentPlayer().setCounter(0);
                Controller.setCounter2(0);
                DrawTiles.setEnabled(true);
                if(Controller.getCurrentPlayer().getName().equals("Player1")){
                    if(Controller.getCurrentPlayer().getColor().equals("GREEN")) {
                        jLabel.setForeground(Color.GREEN);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("BLUE")){
                        jLabel.setForeground(Color.BLUE);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("RED")){
                        jLabel.setForeground(Color.RED);
                    }
                    else{
                        jLabel.setForeground(Color.BLACK);
                    }
                    jLabel.setVisible(true);
                }
                else if(Controller.getCurrentPlayer().getName().equals("Player2")){
                    if(Controller.getCurrentPlayer().getColor().equals("GREEN")) {
                        jLabel2.setForeground(Color.GREEN);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("BLUE")){
                        jLabel2.setForeground(Color.BLUE);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("RED")){
                        jLabel2.setForeground(Color.RED);
                    }
                    else{
                        jLabel2.setForeground(Color.BLACK);
                    }
                    jLabel2.setVisible(true);
                }
                else if(Controller.getCurrentPlayer().getName().equals("Player3")){
                    if(Controller.getCurrentPlayer().getColor().equals("GREEN")) {
                        jLabel3.setForeground(Color.GREEN);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("BLUE")){
                        jLabel3.setForeground(Color.BLUE);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("RED")){
                        jLabel3.setForeground(Color.RED);
                    }
                    else{
                        jLabel3.setForeground(Color.BLACK);
                    }
                    jLabel3.setVisible(true);
                }
                else{
                    if(Controller.getCurrentPlayer().getColor().equals("GREEN")) {
                        jLabel4.setForeground(Color.GREEN);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("BLUE")){
                        jLabel4.setForeground(Color.BLUE);
                    }
                    else if(Controller.getCurrentPlayer().getColor().equals("RED")){
                        jLabel4.setForeground(Color.RED);
                    }
                    else{
                        jLabel4.setForeground(Color.BLACK);
                    }
                    jLabel4.setVisible(true);
                }
            }

        }
    }
}

