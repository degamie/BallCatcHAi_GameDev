
import java.applet.Applet;
import java.awt.GraphicsConfiguration;
import java.time.Duration;

import javax.swing.GroupLayout.Group;
import javax.swing.text.View;
  //Using JavaFX
public class MainApp extends Application {//inheriting Application
    public Group loadAICharacter(URL url){//loadAICharacter funct Declare
        View view =new View();//View Obj declare
        Group ModelRoot=new Group();//ModelReoot Obj declare
        ObjModelImporter importer =new ObjModelImporter();//ObjModelImporter Obj declare
        importer.read(url);//Url obj's Input declare
        ModelViewObject obj=import.importer.getImport();//Fetching the Import
        modelRoot.getChildren().add(view);//Adding Obj View
        return modelRoot;//Printing Model Root
        animate(GroupModel);//Calling animate Func
         }
        public Group animate(Group model){//Animating 3d Model Declare
           model.getChildren().stream()//Model's Children Stream's Fetching
           .filter(view->view.getId().equals("LEFT_ARM") || view.getId().equals("RIGHT_ARM"))//Filtering Left and Right Arm
           .foreach(view->RotateTransition rot=new  RotateTransition(Duration.seconds(.33),view)//Rotating Obj's Durational Rotation
           rot.setCycleCount(Integer.MAX_VALUE)//Rotational  Maximum CycleCount Binding
           rot.setAxis(Rotate.X_AXIS)//X_AXIS's Rotational Binding
           rot.setByAngle(360)//Angular Rotation's Binding
           rot.setInterpolator(Interpolator.LINEAR))};//Linear Rotational Interpolaration Binding

       public void Start(Stage Stage)throws Exception{//Start Funct Declare
        Stage.setScene(createScrene());//Binding SceneCreation 
        Stage.show();//Displaying Stage's Scene 
       }
         }
//Using Java3d 
// public class MainApp extends Applet implements KeyListener {//inheriting Applet and KeyListener Class
  // public BatchGroup Rootobj=new BatchGroup();
    // public TransformGroup transformGroup=new TransformGroup();
    // public Matrix matrix=new Matrix(); //Matrix Obj Declare
    // Background bg=new Background();//Background Obj declare
    // bg.setColor(.0f,.7;1.5f);//Setting up Background's Col
    // bg.setApplicationContext;//Setting Up application
    // bg.addChilden;//Adding Background's Child Nodes
    // bg.addChild(bg); //Adding  Background's Child
    // public BatchGroup createBallAI(){//createBallAI Method Declare
    //     BatchGroup Rootobj=new BatchGroup();//BatchGroup Obj declare
    //     TransformGroup transformGroup=new TransformGroup();//transformGroup Declare
    //     public Scene scene=new Scene("mdl/Ball.fbx");//Scene 's Fbx Model Declare
    // }
    // public BatchGroup createSceneGraph(){//createSceneGraph Method Declare
    //     BatchGroup BatchGroup=new BoundingSphere(new Points3d(),1500.0);//BatchGroup Obj Declare
    //     ViewTrans ViewTrans=universe.getViewingPlatform.getView('Platform transform');//ViewTrans Obj Declare
    // }      
    
    // public Canvas3d(GraphicsConfiguration GraphicsConfiguration,String OffScreen){//Canvas3d Param Constructor
    //     this.GraphicsConfiguration=GraphicsConfiguration;//Binding GraphicsConfiguration Node
    //     this.OffScreen=OffScreen;//Binding OffScreen Node
    // }

