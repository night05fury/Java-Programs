package STORYGAME;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class player
{
    protected String name;
    protected int age;
    protected int gamesWon;
    protected int score;
    abstract void setname(String newName);
    abstract void setage(int newage);
    abstract void incrementgameswon();
    abstract void incrementscore();
    abstract String returnname();
    abstract int returnage();
    abstract int returngameswon();
    abstract int returnscore();

}

class player1 extends player
{
    ArrayList<String> gamesplayed1 = new ArrayList<String>();
    Iterator itl1 = gamesplayed1.iterator();

    player1()
    {
        name = "Player_1";
        age = 10;
        gamesWon = 0;
        score = 0;
    }

    @Override
    public void setname(String newname) {
        this.name = newname;
        System.out.println(name);

    }

    @Override
    public void setage(int newage) {
        this.age = newage;
        System.out.println(age);

    }

    @Override
    public void incrementgameswon() {
        this.gamesWon += 1;
    }

    @Override
    public void incrementscore() {
        this.score += score;

    }

    @Override
    public String returnname() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int returnage() {
        // TODO Auto-generated method stub
        return age;
    }

    @Override
    public int returngameswon() {
        // TODO Auto-generated method stub
        return gamesWon;
    }

    @Override
    public int returnscore() {
        // TODO Auto-generated method stub
        return score;
    }
}

class player2 extends player
{
    ArrayList<String> gamesplayed2 = new ArrayList<String>();
    Iterator itl2 = gamesplayed2.iterator();

    player2()
    {
        name = "Player_2";
        age = 10;
        gamesWon = 0;
        score = 0;
    }

    @Override
    public void setname(String newname) {
        this.name = newname;
        System.out.println(name);

    }

    @Override
    public void setage(int newage) {
        this.age = newage;
        System.out.println(age);
    }

    @Override
    public void incrementgameswon() {
        this.gamesWon += 1;
    }

    @Override
    public void incrementscore() {
        this.score += score;

    }

    @Override
    public String returnname() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int returnage() {
        // TODO Auto-generated method stub
        return age;
    }

    @Override
    public int returngameswon() {
        // TODO Auto-generated method stub
        return gamesWon;
    }

    @Override
    public int returnscore() {
        // TODO Auto-generated method stub
        return score;
    }
}





class gamemanager
{
    static player1 P1 = new player1();
    static player2 P2 = new player2();

    public void runManager()
    {
        new Welcome();
    }
}


class Welcome extends JFrame implements ActionListener
{
    JLabel l1, l2, l3, l4;
    JButton b1,b2;



    Welcome()
    {

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        l4= new JLabel(""+ date);
        l4.setBounds(10, 220, 250, 20);

        l3= new JLabel("Site Name aaega.");
        l3.setBounds(150, 10, 250, 20);
        l2= new JLabel("Welcome Gamer!");
        l2.setBounds(30, 30, 250, 20);

        l1 = new JLabel("Choose.");
        l1.setBounds(70, 90, 250, 20);
        b1 = new JButton("Player Login");
        b1.setBounds(60, 120, 130, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PlayerLogin();

                dispose();
            }
        });
        b2 = new JButton("Manager Login");
        b2.setBounds(200, 120, 130, 30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //new ManagerLogin();
                dispose();
            }
        });

        add(l1);add(b1);add(b2);add(l2);add(l3);add(l4);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e)
    {

    }



}

class PlayerLogin extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6;
    JButton b;
    JTextField tf1,tf2,tf3,tf4;
    String S1,S2,s1 ,s2;




    PlayerLogin() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        l4= new JLabel(""+ date);
        l4.setBounds(10, 220, 250, 20);

        l3= new JLabel("Site Name aaega.");
        l3.setBounds(150, 10, 250, 20);
        l1 = new JLabel("Player1 Enter Name.");
        l1.setBounds(10,60,200,20);
        tf1 = new JTextField();
        tf1.setBounds(150, 60, 150, 20);
        l2 = new JLabel("Enter your Age.");
        l2.setBounds(10,85,200,20);
        tf2 = new JTextField();
        tf2.setBounds(150, 85, 150, 20);

        l5 = new JLabel("Player2 Enter Name.");
        l5.setBounds(10,110,200,20);
        tf3 = new JTextField();
        tf3.setBounds(150, 110, 150, 20);
        l6 = new JLabel("Enter your Age.");
        l6.setBounds(10,135,200,20);
        tf4 = new JTextField();
        tf4.setBounds(150, 135, 150, 20);

        b = new JButton("Login");
        b.setBounds(120, 170, 130, 30);
        b.addActionListener(this);

        add(l2);add(l3);add(l4);add(tf2);add(l1);add(tf1);add(b);add(l5);add(l6);add(tf3);add(tf4);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        S1 = tf1.getText();
        s1 = tf2.getText();
        S2 = tf3.getText();
        s2 = tf4.getText();

        gamemanager.P1.setname(S1);
        gamemanager.P1.setage(Integer.parseInt(s1));
        gamemanager.P2.setname(S2);
        gamemanager.P2.setage(Integer.parseInt(s2));

    }
}

 class Erp {

    public static void main(String[] args)
    {
        gamemanager G1 = new gamemanager();
        G1.runManager();
    }
}