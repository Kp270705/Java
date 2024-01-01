import java.awt.*;
import java.awt.event.*;

public class AWT extends Frame implements ActionListener{

    Frame f1 = new Frame("AWT window widget");

    Label l1 = new Label("Name:");
    Label l2 = new Label("Course:");
    Label l3 = new Label("Semester:");
    Label l4 = new Label("");

    TextField tf1 = new TextField(); 
    TextField tf2 = new TextField(); 
    TextField tf3 = new TextField(); 

    Button btn = new Button("Ok");

    AWT(){

        f1.setAlwaysOnTop(true);

        l1.setBounds(30, 40, 100, 50);
        tf1.setBounds(200, 40, 250, 50);

        l2.setBounds(30, 120, 100, 50);
        tf2.setBounds(200, 120, 250, 50);

        l3.setBounds(30, 200, 100, 50);
        tf3.setBounds(200, 200, 250, 50);

        btn.setBounds(120, 280, 40, 50);

        l4.setBounds(70, 360, 250, 50);

        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);

        f1.add(tf1);
        f1.add(tf2);
        f1.add(tf3);

        f1.add(btn);
        btn.addActionListener(this);

        f1.setSize(700, 700);
        f1.setLayout(null);
        f1.setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        l4.setText("Data stored Successfully. ");
    }

    public static void main(String[] args) {
        new AWT();
    }
}