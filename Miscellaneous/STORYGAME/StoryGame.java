package STORYGAME;
import javax.swing.*;

class StoryGame extends JFrame
{
    // creating instances of Frame class and Button class
    JFrame frmObj;
    JLabel displayk ,dispcrowbar, note ,disprunaway, disprunawayEnd, display;
    JButton but1, but2, but3, pickCbar;
    int key=0, crow=0, Out=0, silhtt=0, run=0;
    // instantiating using the constructor
    void DarkRoom() {
        int i = 0;
        while (i == 0) {
            display=new JLabel("You wake up in a dark room. There’s a window, a table and a portrait on the wall.");
            display.setBounds(50,20,800,40);
            add(display);
            setLayout(null);
            setVisible(true);

            if(key == 1)
            {
                remove(display);
                displayk=new JLabel("There’s a window, a table and a portrait on the wall " +
                        "in the unfamiliar dark room you’re in." +
                        " You have a silver key with you.");
                displayk.setBounds(50,20,800,40);
                add(displayk);
                setLayout(null);
                setVisible(true);
            }
            frmObj = new JFrame("Frame to display buttons");
            but1 = new JButton("Go to window");
            but2 = new JButton("Go to table");
            but3 = new JButton("Go to portrait");
            //but3.setLabel("Button 3");
            but1.setBounds(50, 50, 150, 30);
            but2.setBounds(250, 50, 150, 30);
            but3.setBounds(450, 50, 150, 30);

            add(but1);
            add(but2);
            add(but3);
            setLayout(null);
            setSize(900, 500);
            setVisible(true);
            /* listener part  down below */
            but1.addActionListener(e -> {
                remove(but1);
                remove(but2);
                remove(but3);
                remove(display);
                if(key==1)
                    remove(displayk);
                dispose();
                Window();
            });
            but2.addActionListener(e -> {
                remove(but1);
                remove(but2);
                remove(but3);
                remove(display);
                if(key == 1)
                    remove(displayk);
                dispose();
                Table();
            });
            but3.addActionListener(e -> {
                remove(but1);
                remove(but2);
                remove(but3);
                remove(display);
                if(key == 1)
                    remove(displayk);
                dispose();
                Go2Portrait();

            });
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            i++;
        }
    }
    //going near the window
    void Window()
    {
        if(key == 1 && crow == 1)
        {
            displayk = new JLabel("You go to the window and tear apart the wooden boards with the crowbar." +
                    " A bright blue light illuminates the room. " +
                    "Your eyes hurt from the exposure. " +
                    "There’s something different about the room you’re in now.");
            displayk.setBounds(50,20,1300,100);
            add(displayk);
            JButton Look = new JButton("Look Around");
            Look.setBounds(300,100,150,30);
            add(Look);
            JButton Getout = new JButton("Get Out of Window");
            Getout.setBounds(600,100,200,30);
            add(Getout);
            setSize(1500,500);
            setLayout(null);
            setVisible(true);
            Look.addActionListener(q->{
                remove(displayk);
                if(Out ==  1)  // if he is out of window then this will run
                {
                    remove(Getout);
                    displayk = new JLabel("Several huge cone-shaped masses are ascending to the sky high above. " +
                            "The buildings and structures you remember are dust and rubble. " +
                            "The atmosphere is in flames. You don’t know what to do anymore.");
                    displayk.setBounds(50, 20, 1250, 60);
                    add(displayk);
                    JButton conti = new JButton("Continue");
                    conti.setBounds(100, 100, 100, 30);

                    add(conti);
                    setSize(1300, 300);
                    setLayout(null);
                    setVisible(true);
                    remove(Look);
                    conti.addActionListener(w -> {
                        remove(displayk);
                        if (silhtt == 1) //if he goes to silhouette then this will run
                        {
                            displayk = new JLabel("It opens its mouth and a bright light fills up your entire vision. " +
                                    "You feel a sharp pain in your stomach, and liquid oozing out of your belly. It hurts so bad. " +
                                    "Suddenly, you feel a thud on your head, and the world blacks out.");
                            displayk.setBounds(10, 20, 1300, 50);
                            JLabel End = new JLabel("[THE END]");
                            End.setBounds(50, 60, 800, 40);
                            add(End);
                            add(displayk);
                            setSize(1300, 400);
                            setLayout(null);
                            setVisible(true);
                            remove(conti);
                            // calling of main function can be written here
                            //
                            //calling of main function can be written here
                            //
                        }
                        else
                        {
                            displayk = new JLabel("You spot a silhouette in the distance." +
                                    " It seems to be beckoning you towards itself. And it doesn't look human.");
                            displayk.setBounds(50, 20, 800, 60);
                            JButton silhouette = new JButton("Go to Silhouette");
                            silhouette.setBounds(100, 100, 200, 30);
                            JButton runaway = new JButton("Run Away");
                            runaway.setBounds(400, 100, 100, 30);
                            add(runaway);
                            add(silhouette);
                            add(displayk);
                            setSize(900, 300);
                            setLayout(null);
                            setVisible(true);
                            remove(conti);
                            silhouette.addActionListener(f -> {
                                remove(displayk);
                                silhtt = 1;
                                displayk = new JLabel("You slowly walk up to the figure and reveal its true form to your eyes." +
                                        " It’s seven feet tall and has a smooth, lustrous texture to its skin." +
                                        " It has a triangular head with deep, black gorges in place of its eyes.");
                                displayk.setBounds(50, 20, 1300, 60);
                                add(conti);
                                add(displayk);
                                setSize(1500, 300);
                                setLayout(null);
                                setVisible(true);
                                remove(silhouette);
                                remove(runaway);
                            });
                            runaway.addActionListener(i -> {
                                remove(displayk);
                                remove(silhouette);
                                run = 1;
                                displayk = new JLabel("Terrified, you turn back and run as far as your legs can carry you. " +
                                        "The flames, the destruction and the gut-wrenching screams of innocent civilians make your head spin.");
                                displayk.setBounds(50, 20, 1000, 60);
                                JButton continu = new JButton("Continue further");
                                continu.setBounds(100, 100, 150, 30);
                                add(continu);
                                add(displayk);
                                setSize(1300, 300);
                                setLayout(null);
                                setVisible(true);
                                remove(runaway);
                                continu.addActionListener(ro ->
                                {
                                    remove(displayk);
                                    remove(continu);
                                    dispose();
                                    RunAwayConti();
                                });

                            });
                        }
                    });
                }
                else
                {
                    displayk = new JLabel("The room is filled with fluorescent paint in the form of writing on the walls." +
                            " They say: " +
                            "“They’re here to take us.” " +
                            "You have to get out of this place.");
                    displayk.setBounds(50,20,900,60);
                    add(displayk);
                    setSize(1500,300);
                    setLayout(null);
                    setVisible(true);
                }
            });

            Getout.addActionListener(t->{
                remove(displayk);
                remove(Getout);
                Out=1;
                displayk=new JLabel("You vault out of the window and walk off into the light. " +
                        "You can’t believe what you see.");
                displayk.setBounds(50,20,800,40);
                add(displayk);

                setSize(1000,300);
                setLayout(null);
                setVisible(true);

            });
        }
        else
        {
            JLabel area = new JLabel("The window is bordered shut. " +
                    "You can see blueish light shafts " +
                    "seeping through the gaps. ");
            area.setBounds(50, 20, 800, 20);
            JButton gb = new JButton("Go Back to Room");
            gb.setBounds(200, 50, 170, 30);
            add(gb);
            add(area);
            //setLayout(new FlowLayout());
            setSize(900, 200);
            setVisible(true);
            gb.addActionListener(k -> {
                remove(gb);
                remove(area);
                dispose();
                DarkRoom();
            });
        }
    }
    // going to the table without key
    void Table()
    {
        JLabel area = new JLabel("There’s a wooden table in the room. " +
                "It has a big drawer attached to it. ");
        area.setBounds(50, 20, 500, 20);
        JButton gb = new JButton("Go Back");
        JButton Drawer=new JButton("Open Drawer");
        Drawer.setBounds(250,50,150,30);
        gb.setBounds(100, 50, 100, 30);
        add(gb);
        add(Drawer);
        add(area);
        //setLayout(new FlowLayout());
        setSize(700, 200);
        setVisible(true);
        if(key==1)
        {
            remove(area);
            displayk = new JLabel("You go to the wooden table once again. " +
                    "This time, you have a key that could hopefully open the drawer.");
            displayk.setBounds(50,20,800,40);
            add(displayk);
            setLayout(null);
            setVisible(true);
        }
        gb.addActionListener(k -> {
            remove(gb);
            remove(area);
            remove(Drawer);
            if (key==1)
                remove(displayk);
            dispose();
            DarkRoom();
        });
        Drawer.addActionListener(m->{
            remove(gb);
            remove(area);
            remove(Drawer);
            dispose();
            OpnDrawer();
        });
    }
    //trying to open drawer
    void OpnDrawer()
    {
        if (key == 1)
        {
            remove(displayk);
            JLabel areaK = new JLabel("You find a rusty crowbar and a note in the drawer. ");
            areaK.setBounds(50, 20, 500, 30);
            JButton gb = new JButton("Go Back");
            gb.setBounds(100, 50, 100, 30);
            JButton readNote = new JButton("Read Note");
            readNote.setBounds(250,50,100,30);
            pickCbar = new JButton("Pick Up Crowbar");
            pickCbar.setBounds(400,50,150,30);
            add(areaK);
            add(readNote);
            add(pickCbar);
            add(gb);
            setLayout(null);
            setSize(700, 200);
            setVisible(true);

            gb.addActionListener(k -> {
                remove(gb);
                remove(areaK);
                remove(readNote);
                remove(pickCbar);
                dispose();
                Table();
            });

            readNote.addActionListener(k->{
                remove(areaK);
                remove(gb);
                dispose();
                note=new JLabel("The note reads: 'GET OUT GET OUT GET OUT GET OUT GET OUT GET OUT GET OUT'");
                JButton gbR = new JButton("Go Back");
                gbR.setBounds(100, 50, 100, 30);
                add(note);
                add(gbR);
                note.setBounds(50, 20, 500, 30);
                setLayout(null);
                setSize(700, 200);
                setVisible(true);
                remove(readNote);
                remove(pickCbar);

                gbR.addActionListener(m->{{
                    remove(gb);
                    remove(note);
                    remove(gbR);
                    remove(readNote);
                    dispose();
                    OpnDrawer();
                }
                });
            });

            pickCbar.addActionListener(a->{
                remove(readNote);
                crow = 1;

                if(note!=null)
                    remove(note);

                remove(areaK);
                dispose();
                dispcrowbar = new JLabel("You pick up the crowbar. This could be helpful to you.");
                dispcrowbar.setBounds(50,20,500,30);
                JButton GBPBar = new JButton("Go back to the room");
                GBPBar.setBounds(100, 50, 200, 30);

                add(dispcrowbar);
                add(GBPBar);
                setSize(700, 200);
                setLayout(null);
                setVisible(true);
                remove(pickCbar);
                remove(gb);

                GBPBar.addActionListener(l->{
                    remove(dispcrowbar);
                    remove(pickCbar);
                    remove(GBPBar);
                    dispose();
                    DarkRoom();
                });
            });
        }
        else
        {
            JLabel area = new JLabel("The drawer is locked. You’ll need a key to open it. ");
            area.setBounds(50, 20, 500, 20);
            JButton gb = new JButton("Go Back");
            gb.setBounds(200, 50, 100, 30);

            add(gb);
            add(area);
            setSize(700, 200);
            setVisible(true);

            gb.addActionListener(k -> {
                remove(gb);
                remove(area);
                dispose();
                DarkRoom();
            });
        }
    }
    void Go2Portrait()
    {
        JLabel area = new JLabel("It’s the portrait of a lady who seems to look a lot like your mother. ");
        area.setBounds(50, 20, 500, 20);
        JButton gb = new JButton("Go Back");
        JButton InspPort=new JButton("Inspect the Portrait");
        InspPort.setBounds(250,50,150,30);
        gb.setBounds(100, 50, 100, 30);
        add(area);
        add(gb);
        add(InspPort);
        setLayout(null);
        setSize(700, 200);
        setVisible(true);
        //GB is "GO BACK"
        gb.addActionListener(k -> {
            remove(gb);
            remove(InspPort);
            remove(area);
            dispose();
            DarkRoom();
        });
        InspPort.addActionListener(k -> {
            remove(gb);
            remove(InspPort);
            remove(area);
            dispose();
            InspectPortrait();
        });
    }
    void InspectPortrait()
    {
        JLabel area1 = new JLabel("You move it a bit and a silver key falls from behind the portrait." +
                " You pick it up. ");
        key = 1;
        area1.setBounds(50, 20, 500, 20);
        JButton gb = new JButton("Go Back");
        gb.setBounds(200, 50, 100, 30);

        add(gb);
        add(area1);
        setSize(700, 200);
        setLayout(null);
        setVisible(true);
        gb.addActionListener(k->{
            remove(gb);
            remove(area1);
            DarkRoom();
        });
    }
    void RunAwayConti()
    {
        disprunaway=new JLabel("You run into a forest. It’s dark; pitch-black. You can’t see a thing around yourself.");
        disprunaway.setBounds(50,20,1000,60);
        JButton continu1 = new JButton("Continue further");
        continu1.setBounds(100,100,150,30);

        add(continu1);
        add(disprunaway);
        setSize(1300,300);
        setLayout(null);
        setVisible(true);

        continu1.addActionListener(z->{
            remove(disprunaway);
            remove(continu1);
            dispose();
            disprunaway=new JLabel("You walk slowly, trying to find your way around. " +
                    "The rustling of dead leaves beneath your feet sound deafening in the dark, but you keep moving on.");
            disprunaway.setBounds(50,20,1000,60);
            JButton continu2=new JButton("Continue further");
            continu2.setBounds(100,100,200,30);
            add(continu2);
            add(disprunaway);
            setSize(1300,300);
            setLayout(null);
            setVisible(true);
            continu2.addActionListener(n->{

                remove(disprunaway);
                dispose();
                disprunaway=new JLabel("Suddenly, you feel a hand on your shoulder. Your world fades to black.");
                disprunaway.setBounds(50,20,1000,60);
                JButton continu3 = new JButton("Continue Further");
                continu3.setBounds(100,100,150,30);
                add(continu3);
                add(disprunaway);
                setSize(1300,300);
                setLayout(null);
                setVisible(true);
                remove(continu2);
                continu3.addActionListener(j->{
                    remove(disprunaway);
                    dispose();
                    disprunaway=new JLabel("You fling yourself out of your bed." +
                            " You’re in your room. It’s 6 o’clock in the morning.");
                    disprunaway.setBounds(50,20,1000,60);
                    JButton Go2Sleep=new JButton("Go back to sleep");
                    Go2Sleep.setBounds(100,100,150,30);
                    add(Go2Sleep);

                    add(disprunaway);
                    setSize(1300,300);
                    setLayout(null);
                    setVisible(true);
                    remove(continu3);
                    Go2Sleep.addActionListener(c->{
                        remove(disprunaway);
                        dispose();
                        disprunaway=new JLabel("It’s just a stupid dream,” " +
                                "you think to yourself, and go back to sleep.");
                        disprunaway.setBounds(50,20,1000,60);
                        JButton continu4=new JButton("Continue further");
                        continu4.setBounds(100,100,150,30);
                        add(disprunaway);
                        add(continu4);
                        setSize(1300,300);
                        setLayout(null);
                        setVisible(true);
                        remove(Go2Sleep);
                        continu4.addActionListener(s->{

                            remove(disprunaway);
                            dispose();
                            disprunaway=new JLabel("You wake up once again, and your room is dark. " +
                                    "Apparently, you overslept.");
                            disprunaway.setBounds(50,20,1000,60);
                            JButton lookaround=new JButton("Look around");
                            lookaround.setBounds(100,100,200,30);
                            add(lookaround);
                            add(disprunaway);

                            setSize(1300,300);
                            setLayout(null);
                            setVisible(true);
                            remove(continu4);
                            lookaround.addActionListener(v->{
                                remove(disprunaway);
                                dispose();
                                disprunaway=new JLabel("You get out of the bed and draw the curtains of your window.");
                                disprunaway.setBounds(50,20,1000,60);
                                JButton continu5 = new JButton("Continue further");
                                continu5.setBounds(100,100,150,30);
                                add(disprunaway);
                                add(continu5);
                                setSize(1300,300);
                                setLayout(null);
                                setVisible(true);
                                remove(continu4);
                                remove(lookaround);
                                continu5.addActionListener(fuk->{
                                    remove(disprunaway);
                                    dispose();
                                    disprunaway = new JLabel("Bright blue light illuminates your room and you see the words " +
                                            "“They’re here to take us” written on your wall.");
                                    disprunaway.setBounds(50,20,1000,60);
                                    disprunawayEnd = new JLabel("[THE END]");
                                    disprunawayEnd.setBounds(50, 40,1000, 60);
                                    add(disprunaway);
                                    add(disprunawayEnd);
                                    setSize(1300,300);
                                    setLayout(null);
                                    setVisible(true);
                                    remove(continu5);
                                });
                            });
                        });
                    });
                });
            });
        });
    }
}

class driver
{
    public static void main(String[] args)
    {
        StoryGame obj=new StoryGame();
        //gameManager gm=new gameManager();
        //gm.runManager();
        //System.out.println(gameManager.P1.returnName());

        obj.DarkRoom();
        //obj.Window();
    }
}



