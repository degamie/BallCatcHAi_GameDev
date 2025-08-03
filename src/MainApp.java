
import java.applet.Applet;
import java.awt.GraphicsConfiguration;

public class MainApp extends Applet implements KeyListener {//inheriting Applet and KeyListener Class
    public Matrix matrix=new Matrix(); //Matrix Obj Declare
    Background bg=new Background();//Background Obj declare
    bg.setColor(.0f,.7;1.5f);//Setting up Background's Col
    bg.setApplicationContext;//Setting Up application
    bg.addChilden;//Adding Background's Child Nodes
    bg.addChild(bg); //Adding  Background's Child

    public BatchGroup createSceneGraph(){//createSceneGraph Method Declare
        BatchGroup BatchGroup=new BoundingSphere(new Points3d(),1500.0);//BatchGroup Obj Declare
        ViewTrans ViewTrans=universe.getViewingPlatform.getView('Platform transform');//ViewTrans Obj Declare
    }      
    
    public Canvas3d(GraphicsConfiguration GraphicsConfiguration,String OffScreen){//Canvas3d Param Constructor
        this.GraphicsConfiguration=GraphicsConfiguration;//Binding GraphicsConfiguration Node
        this.OffScreen=OffScreen;//Binding OffScreen Node
    }
    
}
