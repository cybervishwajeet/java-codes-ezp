import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class form_applet extends Applet implements ActionListener {

    Label title, name, father, age, gen, dept, quali, addr, t1;
    TextField tname, tfather;
    Scrollbar tage;
    TextArea tadd;
    Checkbox male, female, ct1, ct2, ct3, ct4;
    CheckboxGroup cbg;
    Choice Dept;
    Button save, clear;
    String msg = "";
    String n = "";  // Declare these variables at the class level
    String f = "";
    int a = 0;
    String gender = "";
    String address = "";
        Font labelfont = new Font("arial", Font.PLAIN, 18);
    public void init() {
        setLayout(null);
        Font titlefont = new Font("arial", Font.BOLD, 25);
        Font textfont = new Font("arial", Font.PLAIN, 15);
        Color formcolor = Color.GRAY;
        setBackground(formcolor);

        title = new Label("Registration Form");
        title.setBounds(450, 40, 300, 50);
        title.setFont(titlefont);
        title.setForeground(Color.CYAN);
        add(title);

        name = new Label("Name");
        name.setBounds(250, 100, 150, 30);
        name.setFont(labelfont);
        name.setForeground(Color.WHITE);
        add(name);

        tname = new TextField();
        tname.setBounds(400, 100, 400, 30);
        tname.setFont(labelfont);
        add(tname);

        father = new Label("Father Name");
        father.setBounds(250, 150, 150, 30);
        father.setFont(labelfont);
        father.setForeground(Color.WHITE);
        add(father);

        tfather = new TextField();
        tfather.setBounds(400, 150, 400, 30);
        tfather.setFont(labelfont);
        add(tfather);

        age = new Label("Age");
        age.setBounds(250, 200, 150, 30);
        age.setFont(labelfont);
        age.setForeground(Color.WHITE);
        add(age);

        tage = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 101);
        tage.setBounds(400, 200, 400, 30);
        tage.setFont(labelfont);
        add(tage);

        gen = new Label("Gender");
        gen.setBounds(250, 250, 150, 30);
        gen.setFont(labelfont);
        gen.setForeground(Color.WHITE);
        add(gen);

        cbg = new CheckboxGroup();
        male = new Checkbox("Male", cbg, true);
        male.setBounds(400, 250, 100, 30);
        male.setFont(labelfont);
        male.setForeground(Color.WHITE);
        add(male);
        female = new Checkbox("Female", cbg, false); 
        female.setBounds(500, 250, 100, 30);
        female.setFont(labelfont);
        female.setForeground(Color.WHITE);
        add(female);

        dept = new Label("Department");
        dept.setBounds(250, 300, 150, 30);
        dept.setFont(labelfont);
        dept.setForeground(Color.WHITE);
        add(dept);

        Dept = new Choice();
        Dept.setFont(labelfont);
        Dept.setBounds(400, 300, 400, 50);
        Dept.add("Comp");
        Dept.add("IT");
        Dept.add("Mech");
        Dept.add("Meta");
        Dept.add("E&TC");
        Dept.add("Electric");
        Dept.add("DDJM");
        add(Dept);

        quali = new Label("Qualification");
        quali.setBounds(250, 350, 150, 30);
        quali.setFont(labelfont);
        quali.setForeground(Color.WHITE);
        add(quali);

        ct1 = new Checkbox("10th Pass");
        ct1.setBounds(400, 350, 100, 50);
        ct1.setFont(labelfont);
        ct1.setForeground(Color.WHITE);
        add(ct1);

        ct2 = new Checkbox("12th Pass");
        ct2.setBounds(530, 350, 100, 50);
        ct2.setFont(labelfont);
        ct2.setForeground(Color.WHITE);
        add(ct2);

        ct3 = new Checkbox("ITI");
        ct3.setBounds(650, 350, 100, 50);
        ct3.setFont(labelfont);
        ct3.setForeground(Color.WHITE);
        add(ct3);

        ct4 = new Checkbox("Others");
        ct4.setBounds(750, 350, 100, 50);
        ct4.setFont(labelfont);
        ct4.setForeground(Color.WHITE);
        add(ct4);

        addr = new Label("Address");
        addr.setBounds(250, 400, 150, 30);
        addr.setFont(labelfont);
        addr.setForeground(Color.WHITE);
        add(addr);

        tadd = new TextArea(10, 30);
        tadd.setBounds(400, 400, 400, 100);
        tadd.setFont(labelfont);
        add(tadd);

        save = new Button("Submit");
        save.setBounds(400, 530, 150, 30);
        save.setFont(labelfont);
        save.setBackground(Color.cyan);
        save.setForeground(Color.red);
        add(save);

        t1 = new Label();
        t1.setBounds(450, 570, 200, 30);
        t1.setFont(labelfont);
        t1.setBackground(Color.black);
        t1.setForeground(Color.white);
        add(t1);

        save.addActionListener(this);
        clear = new Button("Clear All");
        clear.setBounds(560, 530, 150, 30);
        clear.setFont(labelfont);
        clear.setBackground(Color.cyan);
        clear.setForeground(Color.red);
        add(clear);

    }

    public void actionPerformed(ActionEvent e) {
        t1.setText("Submitted Successfully");
        if (e.getSource() == save) {
            n = tname.getText();
            f = tfather.getText();
            a = tage.getValue();
            gender = male.getState() ? "Male" : "Female";
            address = tadd.getText();
            msg = "Qualification:  ";
            if (ct1.getState()) {
                msg += "10th Pass ";
            }

            if (ct2.getState()) {
                msg += "12th Pass ";
            }

            if (ct3.getState()) {
                msg += "ITI ";
            }
            if (ct4.getState()) {
                msg += "Others";
            }
        }

        repaint();
    }

    public void paint(Graphics g) {
	g.setFont(labelfont);
        g.drawString(("Name: " + n), 460, 700);
	g.setFont(labelfont);	
        g.drawString(("Father name: ") + f, 460, 720);
	g.setFont(labelfont);
        g.drawString(("Gender: " + gender), 460, 740);
	g.setFont(labelfont);
        g.drawString(("Address: " + address), 460, 760);
	g.setFont(labelfont);
        g.drawString(("Age: " + a), 460, 780);
	g.setFont(labelfont);
        g.drawString(msg, 460, 800);
    }
}

/*
<applet code="form_applet.class" width="1000" height="1000">
</applet>
*/
