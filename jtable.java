import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
public class jtable extends JFrame{
	JTable table;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	jtable(){
		setSize(500,500);
		setVisible(true);

		Object[][] data={{29,"Abhay", 17},{30,"Abhi",17},{31,"Atharv",18}};
		String[] colName={"Roll No.","Name","Age"};
	
		DefaultTableModel model=new DefaultTableModel(data,colName);
	
		table=new JTable(model);

		setLayout(new GridLayout(3,1));
		JPanel panel=new JPanel();
		add(new JScrollPane(table));
		add(new JPanel());
		add(panel);
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();

		b1=new JButton("Add");
		b2=new JButton("Update");
		b3=new JButton("Delete");

		panel.setLayout(new GridLayout(3,3));
		panel.add(new JLabel("Roll No.: "));
		panel.add(t1);
		panel.add(b1);

		panel.add(new JLabel("Name: "));
		panel.add(t2);
		panel.add(b2);

		panel.add(new JLabel("Age: "));
		panel.add(t3);
		panel.add(b3);

		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
	
			if((t1.getText().toString().isEmpty()) ||(t2.getText().toString().isEmpty() )||(t3.getText().toString().isEmpty())){
				JOptionPane.showMessageDialog(null,"Please fill all details","ERROR",JOptionPane.ERROR_MESSAGE);
				return;
			}
			else{
				int roll=Integer.parseInt(t1.getText().toString());
				String name=t2.getText().toString();
				int age=Integer.parseInt(t3.getText().toString());

				Object[] newRow={roll,name,age};
				model.addRow(newRow);
	
				t1.setText(null);
				t2.setText(null);
				t3.setText(null);
			}
			}
		});	
		
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				int rowindex=table.getSelectedRow();
				int rollno=(int)model.getValueAt(rowindex,0);
				String name=(String)model.getValueAt(rowindex,1);
				int age=(int)model.getValueAt(rowindex,2);
				
				t1.setText(String.valueOf(rollno));
				t2.setText(name);
				t3.setText(String.valueOf(age));

			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if((t1.getText().toString().isEmpty()) ||(t2.getText().toString().isEmpty() )||(t3.getText().toString().isEmpty())){
					JOptionPane.showMessageDialog(null,"Please fill all details","ERROR",JOptionPane.ERROR_MESSAGE);
					return;
				}
				else{
					int roll=Integer.parseInt(t1.getText().toString());
					String name=t2.getText().toString();
					int age=Integer.parseInt(t3.getText().toString());

					int row=table.getSelectedRow();
					model.setValueAt(roll,row,0);
					model.setValueAt(name,row,1);
					model.setValueAt(age,row,2);
	
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
				}
			}
		});

		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(table.getSelectedRow()==-1){
					JOptionPane.showMessageDialog(null,"Please select a row","ERROR",JOptionPane.ERROR_MESSAGE);
				}
				model.removeRow(table.getSelectedRow());
			}
		});
				
		validate();
	}
	public static void main(String args[]){
		new jtable();
	}
}