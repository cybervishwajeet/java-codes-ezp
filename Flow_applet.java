import java.applet.*;
import java.awt.*;
class Flow_applet extends Applet
{
    FlowLayout f1= new FlowLayout();
   
    Button b1=new Button("submit1");
    Button b2=new Button("submit2");
    Button b3=new Button("submit3");
    Button b4=new Button("submit4");
    Button b5=new Button("submit5");
    Button b6=new Button("submit6");

public void init()
{
    setLayout(f1);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);

}

}