import java.awt.*;
import java.awt.event.*;

class notepaddemo extends Frame
{

notepaddemo()
{
  MenuBar mb=new MenuBar();
  setMenuBar(mb);
   
       
       Menu M1=new Menu("file");     
       Menu M2=new Menu("edit");
       Menu M3=new Menu("View");
       
      mb.add(M1);
      mb.add(M2);
      mb.add(M3);

   MenuItem MI1=new MenuItem("New tab");
   MenuItem MI2=new MenuItem("New window");
   MenuItem MI3=new MenuItem("open");
   MenuItem MI4=new MenuItem("save");
   MenuItem MI5=new MenuItem("save as");
   MenuItem MI6=new MenuItem("save all");
   MenuItem MI7=new MenuItem("close tab");
   MenuItem MI8=new MenuItem("exit");
   
   MenuItem m1=new MenuItem("cut");
   MenuItem m2=new MenuItem("paste ");
   MenuItem m3=new MenuItem("close");
   MenuItem m4=new MenuItem("delete");

    MenuItem mi1=new MenuItem("zoom");
   MenuItem mi2=new MenuItem("zoom in ");
   MenuItem mi3=new MenuItem("zoom out");
   MenuItem mi4=new MenuItem("default zoom");       


  M1.add(MI1);
  M1.add(MI2);
  M1.add(MI3);
  M1.add(MI4);
  M1.add(MI5);
  M1.add(MI6);
  M1.add(MI7);
  M1.add(MI8);

  M2.add(m1);
  M2.add(m2);
  M2.add(m3);
  M2.add(m4);
      
  M3.add(mi1);
  M3.add(mi2);
  M3.add(mi3);
  M3.add(mi4);

}

  public static void main(String args[])
{
    notepaddemo N1=new notepaddemo();
    N1.setVisible(true);
    N1.setSize(800,800);
    N1.setTitle("Notepad");
}

}