package ToyStore;
import javax.swing.*;
import java.awt.event.*;

 class Checkout extends JFrame implements ActionListener {
    static int[] Price = new int[5];
    static String[] FinOrder = new String[5];
    JLabel l;
    JCheckBox cb1, cb2, cb3, cb4, cb5;
    JButton b;

    Checkout(String[] order, int[] price)
    //Checkout is to pop a window with all the category Toys and Let the user choose it and order.
    {
        for (int i = 0; i < 5; i++) {
            Price[i] = price[i];
            FinOrder[i] = order[i];
        }
        int i = 0;
        l = new JLabel("Toy Selection System");
        l.setBounds(100, 50, 1080, 50);
        while (i == 0) {
            cb1 = new JCheckBox(" " + order[i] + " \t@" + price[i]+ '€');
            cb1.setBounds(100, 100, 150, 20);
            cb2 = new JCheckBox(" " + order[i + 1] + " \t@" + price[i + 1] + '€');
            cb2.setBounds(100, 150, 150, 20);
            cb3 = new JCheckBox(" " + order[i + 2] + " \t@" + price[i + 2] + '€');
            cb3.setBounds(100, 200, 200, 20);
            cb4 = new JCheckBox(" " + order[i + 3] + " \t@" + price[i + 3] + '€');
            cb4.setBounds(100, 250, 150, 20);
            cb5 = new JCheckBox(" " + order[i + 4] + " \t@" + price[i+4]  + '€');
            cb5.setBounds(100, 300, 150, 20);
            b = new JButton("Order");
            b.setBounds(100, 400, 80, 30);
            b.addActionListener(this);
            add(l);add(cb1);add(cb2);add(cb3);add(cb4);add(cb5);add(b);
            setSize(500, 700);
            setLayout(null);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            i++;
        }
    }

    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = " ";
        if (cb1.isSelected()) {
            amount += Checkout.Price[0];
            msg = Checkout.FinOrder[0] + " : " + Checkout.Price[0] + "€\n";
        }
        if (cb2.isSelected()) {
            amount += Checkout.Price[1];

            msg += Checkout.FinOrder[1] + " : " + Checkout.Price[1] + "€\n";
        }
        if (cb3.isSelected()) {
            amount += Checkout.Price[2];
            msg += Checkout.FinOrder[2] + " : " + Checkout.Price[2] + "€\n";
        }
        if (cb4.isSelected()) {
            amount += Checkout.Price[3];
            msg += Checkout.FinOrder[3] + " : " + Checkout.Price[3] + "€\n";
        }
        if (cb5.isSelected()) {
            amount += Checkout.Price[4];
            msg += Checkout.FinOrder[4] + " : " + Checkout.Price[4] + "€\n";
        }
        msg += "-----------------\n";
        JOptionPane.showMessageDialog(this, msg + "Total: " + amount+"€");
        if(amount<=Customers.priceInput)
        {
            JOptionPane.showMessageDialog(this, msg + "Transaction Successful: " + amount+"€");
        }
        else{
            JOptionPane.showMessageDialog(this, msg + "Transaction Unsuccessful: " + amount+"€");
        }
    }
}



