
import java.applet.Applet;
import java.awt.GraphicsConfiguration;
import java.time.Duration;

import javax.swing.GroupLayout.Group;
import javax.swing.text.View;

import sun.jvm.hotspot.ui.tree.RootTreeNodeAdapter;
//Work IN Dev Sarthak Mittal=(Degamiesign)(10/10/2025)
  //Using JavaFX

public class MainApp extends Application {//inheriting Application
      ProcessBuilder processBuilder=new ProcessBuilder();

      processBuilder.redirectErrorMessageStream(true);
      Process process=processBuilder.start();
      public String getProcess(Process process){return process;}
    ProccessBuilder proccessBuilder=new ProccessBuilder("python",
            resolvePythonScriptPath(CdssConstants.CLASSIFY_INSTANCE_SCRIPT_FILE),classifierPath,pathInputFile
    public MainApp(Group mdl1,Group mdl2,Group root1,Scene scene,View view,ModelViewObject obj,Stage Stage){
        this.mdl1=mdl1;
        this.mdl2=mdl2;
        this.root1=root1;
        this.scene=scene;
        this.view=view;
        this.obj=obj;
        this.stage=stage;
    }
      public void Start(Stage Stage)throws Exception{//Start Funct Declare
          processBuilder.redirectErrorStream(true);//Redirecting Exceptional Error Messages
          Process process=processBuilder.start();//Starting New Process
          Stage.setScene(createScrene());//Binding SceneCreation
          Stage.show();//Displaying Stage's Scene

      }
      public String getModelRoot(Group ModelRoot){
        return ModelRoot;
      }

    public String getModelViewObject(ModelViewObject obj){
        return obj;
    }    //Fetching ModelViewObject
    public String setModelViewObject(ModelViewObject obj){this.obj=obj;}//Binding obj
    public String getModelImporter(ObjModelImporter Importer){return Importer;}
      public List<String> readProcess(InputStream inputStream)throws IOException{
        try{
            BufferedReader output=new BufferedReader(new InputStreamReader.inputStream){
                return output.lines()
                        .collect(Collectors.toList());
            }
        }
      }
    public String setCamera(Camera camera){this.camera=camera;}//Binding Camera in App
    public String  setScene(Scene scene){this.scene=scene;}
    public String getCamera(Camera camera){return camera;}

      public String setView(View view){this.view=view;}//Binding View
    public Stirng getView(View view){return  view;}

    public String setMdl1(Group mdl1b){this.mdl1=mdl1;}
    public String getMdl1(Group mdl1){
        return mdl1;
    }
    public String getScene(Scene scene){
        return scene;
    }
    public String getStage(Stage stage){return stage;}
    public String setStage(Stage stage){
        this.stage=stage+"Stage  Binded Val";
    }
      public Scene createScene(){//SceneCreation Method declare
          PerspectiveCamera PerspectiveCamera=new PerspectiveCamera(true);//Perspective Camera Obj declare
          Camera camera=new Camera();//Camera obj declare
          camera.setTranslateZ(-3.5);//Camera's Opposive Z-AXis Translat    ion
          public Group mdl1=loadBallAI(getClass().getResources("Ball_AI.fbx"));
          public  Group mdl2=loadAICharacter(getClass().getResources("AI_CHARACTER.fbx"));//Mdl1 and 2 Obj declare

     mdl1.getTransforms().add(new Rotate(90,RootTreeNodeAdapter.Y_AXIS));//Model's 90 degree Y-Axis Rotation
     animate(model);//Animating Model
     Group root1=new Group(mdl1);//Root1 Obj declare
     Scene scene=new Scene(root,1280,720,true);//Scene Obj Declare
     scene.setCamera(camera);//Camera's Binding

     return Scene;//Printing Scene

  }
  //Ball Animation
  public class MainApp extends Ai_Character{//AI_Character Inherted Class
      public Group animateAI(Group model){//Animating 3d Model Declare
          model.getChildren().stream()//Model's Children Stream's Fetching
                  .filter(view->view.getId().equals("LEFT_ARM") || view.getId().equals("RIGHT_ARM"))//Filtering Left and Right Arm
                  .foreach(view->RotateTransition rot=new  RotateTransition(Duration.seconds(.33),view)//Rotating Obj's Durational Rotation
                          rot.setCycleCount(Integer.MAX_VALUE)//Rotational  Maximum CycleCount Binding
                          rot.setAxis(Rotate.X_AXIS)//X_AXIS's Rotational Binding
                          rot.setByAngle(360)//Angular Rotation's Binding
                          rot.setInterpolator(Interpolator.LINEAR))};//Linear Rotational Interpolaration Binding
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
  }
      public Group animateBallAi(Group mdl2){//Animating 3d Model Declare
           mdl2.getChildren().stream()//Model's Children Stream's Fetching
           .filter(view->view.getId().equals("BALL_AI_MOVE_STRAIGHT") || view.getId().equals("BALL_AI_ROTATE"))//Filtering Left and Right Arm
           .foreach(view->RotateTransition rot=new  RotateTransition(Duration.seconds(.33),view)//Rotating Obj's Durational Rotation
           rot.setCycleCount(Integer.MAX_VALUE)//Rotational  Maximum CycleCount Binding
           rot.setAxis(Rotate.X_AXIS)//X_AXIS's Rotational Binding
           rot.setByAngle(360)//Angular Rotation's Binding
           rot.setInterpolator(Interpolator.LINEAR))};//Linear Rotational Interpolaration Binding
 //Loading Ball Model
   public Group loadBallAI(Group mdl2){//loadAICharacter funct Declare
        View view =new View();//View Obj declare
        Group ModelRoot=new Group();//ModelReoot Obj declare
        ObjModelImporter importer =new ObjModelImporter();//ObjModelImporter Obj declare
        importer.read(url);//Url obj's Input declare
        ModelViewObject obj=import.importer.getImport();//Fetching the Import
        modelRoot.getChildren().add(view);//Adding Obj View
        modelRoot=mdl2;
        return modelRoot;//Printing Model Root
        animateBallAi(mdl2);//Calling animate Func
        }
        public String getObjectModelImporter(ObjectModelImporter objectModelImporter){
       return objectModelImporter;
        }
        public String setObjectModelImporter(ObjectModelImporter objectModelImporter){
       this.objectModelImporter=objectModelImporter;
        }

 //Loading Ball Model AI_Character

  //Animating AI_Character Model

//SCene Startup

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

