import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingForm extends JFrame implements ActionListener {
    JPanel panel,displayPanel;
    JLabel title, name, father, age, gen, dept, quali, addr, t1;
    JTextField tname, tfather;
    JSlider tage;
    JTextArea tadd;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JComboBox<String> deptComboBox;
    JCheckBox ct1, ct2, ct3, ct4;
    JButton save, clear;
    String msg = " ";
    JTabbedPane tp1;
    public SwingForm() {
        super("USER REGISTRATION FORM");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tp1=new JTabbedPane();
        panel = new JPanel();
 	panel.setBackground(Color.GRAY);
        panel.setLayout(null);
        getContentPane().add(tp1);

        title = new JLabel("Registration Form");
        title.setBounds(450, 40, 300, 50);
        title.setFont(new Font("Arial", Font.BOLD, 25));
        title.setForeground(Color.CYAN);
        panel.add(title);

        name = new JLabel("Name");
        name.setBounds(250, 100, 150, 30);
        name.setFont(new Font("Arial", Font.PLAIN, 18));
        name.setForeground(Color.WHITE);
        panel.add(name);

        tname = new JTextField();
        tname.setBounds(400, 100, 400, 30);
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(tname);

        father = new JLabel("Last Name");
        father.setBounds(250, 150, 150, 30);
        father.setFont(new Font("Arial", Font.PLAIN, 18));
        father.setForeground(Color.WHITE);
        panel.add(father);

        tfather = new JTextField();
        tfather.setBounds(400, 150, 400, 30);
        tfather.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(tfather);

        age = new JLabel("Age");
        age.setBounds(250, 200, 150, 30);
        age.setFont(new Font("Arial", Font.PLAIN, 18));
        age.setForeground(Color.WHITE);
        panel.add(age);

        tage = new JSlider(0, 100);
        tage.setBounds(400, 200, 400, 30);
        tage.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(tage);

        gen = new JLabel("Gender");
        gen.setBounds(250, 250, 150, 30);
        gen.setFont(new Font("Arial", Font.PLAIN, 18));
        gen.setForeground(Color.WHITE);
        panel.add(gen);

        genderGroup = new ButtonGroup();
        male = new JRadioButton("Male");
        male.setBounds(400, 250, 100, 30);
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setForeground(Color.BLACK);
        genderGroup.add(male);
        panel.add(male);

        female = new JRadioButton("Female");
        female.setBounds(500, 250, 100, 30);
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setForeground(Color.BLACK);
        genderGroup.add(female);
        panel.add(female);

        dept = new JLabel("Department");
        dept.setBounds(250, 300, 150, 30);
        dept.setFont(new Font("Arial", Font.PLAIN, 18));
        dept.setForeground(Color.WHITE);
        panel.add(dept);

        deptComboBox = new JComboBox<>();
        deptComboBox.setFont(new Font("Arial", Font.PLAIN, 15));
        deptComboBox.setBounds(400, 300, 300, 50);
        deptComboBox.addItem("Comp");
        deptComboBox.addItem("IT");
        deptComboBox.addItem("Mech");
        deptComboBox.addItem("Meta");
        deptComboBox.addItem("E&TC");
        deptComboBox.addItem("Electric");
        deptComboBox.addItem("DDJM");
        panel.add(deptComboBox);

        quali = new JLabel("Qualification");
        quali.setBounds(250, 350, 150, 30);
        quali.setFont(new Font("Arial", Font.PLAIN, 18));
        quali.setForeground(Color.WHITE);
        panel.add(quali);

        ct1 = new JCheckBox("10th Pass");
        ct1.setBounds(400, 350, 100, 50);
        ct1.setFont(new Font("Arial", Font.PLAIN, 15));
        ct1.setForeground(Color.BLACK);
        panel.add(ct1);

        ct2 = new JCheckBox("12th Pass");
        ct2.setBounds(530, 350, 100, 50);
        ct2.setFont(new Font("Arial", Font.PLAIN, 15));
        ct2.setForeground(Color.BLACK);
        panel.add(ct2);

        ct3 = new JCheckBox("ITI");
        ct3.setBounds(650, 350, 100, 50);
        ct3.setFont(new Font("Arial", Font.PLAIN, 15));
        ct3.setForeground(Color.BLACK);
        panel.add(ct3);

        ct4 = new JCheckBox("Others");
        ct4.setBounds(750, 350, 100, 50);
        ct4.setFont(new Font("Arial", Font.PLAIN, 15));
        ct4.setForeground(Color.BLACK);
        panel.add(ct4);

        addr = new JLabel("Address");
        addr.setBounds(250, 400, 150, 30);
        addr.setFont(new Font("Arial", Font.PLAIN, 18));
        addr.setForeground(Color.BLACK);
        panel.add(addr);

        tadd = new JTextArea();
        tadd.setBounds(400, 400, 400, 100);
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        panel.add(tadd);
	JScrollPane scrollTextArea = new JScrollPane(tadd);
        scrollTextArea.setBounds(400, 400, 400, 100);
        panel.add(scrollTextArea);

        save = new JButton("Submit");
        save.setBounds(400, 530, 150, 30);
        save.setFont(new Font("Arial", Font.PLAIN, 18));
        save.setBackground(Color.CYAN);
        save.setForeground(Color.RED);
        panel.add(save);

        t1 = new JLabel();
        t1.setBounds(450, 570, 200, 30);
        t1.setFont(new Font("Arial", Font.PLAIN, 18));
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        panel.add(t1);
	tp1.add("Form",panel);
tp1.setVisible(true);

	displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout());
	JScrollPane scrollDisplayPanel = new JScrollPane(displayPanel);
        scrollDisplayPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollDisplayPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        tp1.add("Information", scrollDisplayPanel);
        

        save.addActionListener(this);
        clear = new JButton("Clear All");
        clear.setBounds(560, 530, 150, 30);
        clear.setFont(new Font("Arial", Font.PLAIN, 18));
        clear.setBackground(Color.CYAN);
        clear.setForeground(Color.RED);
        panel.add(clear);

    }

    public void actionPerformed(ActionEvent e) {
        t1.setText("Submitted Successfully");
        if (e.getSource() == save) {
            String n = tname.getText();
            String f = tfather.getText();
            int a = tage.getValue();
            String gen = male.isSelected() ? "Male" : "Female";
            String address = tadd.getText();
            msg = "Qualification:  ";
            if (ct1.isSelected()) {
                msg += "10th Pass ";
            }
            if (ct2.isSelected()) {
                msg += "12th Pass ";
            }
            if (ct3.isSelected()) {
                msg += "ITI ";
            }
            if (ct4.isSelected()) {
                msg += "others";
            }
	String displayInfo = "Name: " + n + "<br>"
                    + "Father name: " + f + "<br>"
                    + "Gender: " + gen + "<br>"
                    + "Address: " + address + "<br>"
                    + "Age: " + a + "<br>"
                    + msg;
	JLabel infoLabel = new JLabel("<html><body>" + displayInfo + "</body></html>");

            displayPanel.add(infoLabel);
		tp1.add("Information", displayPanel);
            // Refresh the display
            tp1.setSelectedIndex(1);

        }
    }

    public static void main(String args[]) {
        SwingForm form = new SwingForm();
        form.setVisible(true);
    }
}