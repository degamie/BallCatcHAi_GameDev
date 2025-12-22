//WID(22/12/2025)
public class Ai_Character {

    public Ai_Character aiCharacter;//Ai_Character Cls nd Obj Declare
    public KeyBoardInput userInp=new KeyBoardInput();

    public String getKeyBoardInput(KeyBoardInput userInp){return userInp;}//Fetching UserInput in AI_Character
    public String no_move=null;
    public State currState;
    public   void setCurrState(State currState){return currState;}// Binding Current State in App
    public State getCurrState(State currState){return currState;}//Fetching Current State in App
    public Ai_Character(){
        this.currState=currState.IDKE;
    }
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
    //Animating AI_Character Model
    public Group animatearms(Group model){//Animating 3d Model Declare
        model.getChildren().stream()//Model's Children Stream's Fetching
                .filter(view->view.getId().equals("LEFT_ARM") || view.getId().equals("RIGHT_ARM"))//Filtering Left and Right Arm
                .foreach(view->RotateTransition rot=new  RotateTransition(Duration.seconds(.33),view)//Rotating Obj's Durational Rotation
                        rot.setCycleCount(Integer.MAX_VALUE)//Rotational  Maximum CycleCount Binding
                        rot.setAxis(Rotate.X_AXIS)//X_AXIS's Rotational Binding
                        rot.setByAngle(360)//Angular Rotation's Bin6ding
                        rot.setInterpolator(Interpolator.LINEAR))};//Linear Rotational Interpolaration Binding
    public Group animatelegs(Group model){//Animating 3d Model Declare
        model.getChildren().stream()//Model's Children Stream's Fetching
                .filter(view->view.getId().equals("LEFT_LEG") || view.getId().equals("RIGHT_LEG"))//Filtering Left and Right Arm
                .foreach(view->RotateTransition rot=new  RotateTransition(Duration.seconds(.33),view)//Rotating Obj's Durational Rotation
                        rot.setCycleCount(Integer.MAX_VALUE)//Rotational  Maximum CycleCount Binding
                        rot.setAxis(Rotate.X_AXIS)//X_AXIS's Rotational Binding
                        rot.setByAngle(180)//Angular Rotation's Binding
                        rot.setInterpolator(Interpolator.LINEAR))};//Linear Rotational Interpolaration Binding

    public Group animatehead(Group model){//Animating 3d Model Declare
        model.getChildren().stream()//Model's Children Stream's Fetching
                .filter(view->view.getId().equals("HEAD_AT_LEFT") || view.getId().equals("HEAD_AT__ARM"))//Filtering  head at Left and Right
                .foreach(view->RotateTransition rot=new  RotateTransition(Duration.seconds(.33),view)//Rotating Obj's Durational Rotation
                        rot.setCycleCount(Integer.MAX_VALUE)//Rotational  Maximum CycleCount Binding
                        rot.setAxis(Rotate.X_AXIS)//X_AXIS's Rotational Binding
                        rot.setByAngle(180)//)Angular Rotation's Binding
                        rot.setInterpolator(Interpolator.LINEAR))};//Linear Rotational Interpolaration Binding
    public Group animateAIBody(Group model){//Animating AIChar's Body
        for(int i=0;i<=model.size();i++) {
            String move = null;
            if (userInp.KEYBOARD_A)model.filter=animatearms(model+1) + animatelegs(model+1);move="UserInput At A";
            else if (userInp.KEYBOARD_D)model.filter=animatearms(model-1) + animatelegs(model-1);move="UserInput At D";
            else if (userInp.KEYBOARD_W)model.filter=animatearms(model+1) + animatelegs(model+1);move="UserInput At W";
            else if (userInp.KEYBOARD_S)model.filter=animatearms(model-1) + animatelegs(model-1);move="UserInput At S";
            else move = "no UserInput";
        }return model.filter+move;
    }
    public void Upoate(){
        if(currState==currState.MOVING)
    }
}