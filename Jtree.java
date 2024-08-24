import javax.swing.*;
import java.awt.*;
import javax.swing.tree.*;
public class Jtree extends JFrame{
	public static void main(String args[]){
		new Jtree();
	}
	Jtree(){
		DefaultMutableTreeNode rootNode=new DefaultMutableTreeNode("Coding");

		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("Python");
		DefaultMutableTreeNode a3=new DefaultMutableTreeNode("CPP");

		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Swing");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("AWT");
		DefaultMutableTreeNode b3=new DefaultMutableTreeNode("Networking");

		DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Operators");
		DefaultMutableTreeNode c2=new DefaultMutableTreeNode("Data Structures");
	
		DefaultMutableTreeNode d1=new DefaultMutableTreeNode("Inheritance");
		DefaultMutableTreeNode d2=new DefaultMutableTreeNode("Polymorphism");
		
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		
		a2.add(c1);
		a2.add(c2);

		a3.add(d1);
		a3.add(d2);
		
		rootNode.add(a1);
		rootNode.add(a2);
		rootNode.add(a3);

	
		JTree jt=new JTree(rootNode);
		add(new JScrollPane(jt), BorderLayout.CENTER);
		setVisible(true);
		setSize(500,500);

	}
}