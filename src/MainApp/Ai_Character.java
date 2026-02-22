//WID(22/2/2026)//DegamieSign(Sarthak Mittal)(#1.1).1.1.1
public class Ai_Character {

    public Ai_Character aiCharacter;//Ai_Character Cls nd Obj Declare
    public String getAiCharacter(Ai_Character aiCharacter){return aiCharacter;}//Fetching Ai Character in App
    public void setAiCharacter(Ai_Character aiCharacter){this.aiCharacter=aiCharacter;}//Binding AiCharacter in App
    public String updateByAiCharacter(Ai_Character aiCharacter){getAiCharacter(aiCharacter)+setAiCharacter(aiCharacter)+1;}//Updating AiCharacter in  App
    public void existsByAiCharacter(Ai_Character aiCharacter){
        if(aiCharacter.loadAICharacter(url)!=null)getAiCharacter(aiCharacter);
        else getAiCharacter(0);
    }
    public KeyBoardInput userInp=new KeyBoardInput();
    public void setKeyBoardInput(KeyBoardInput userInp){this.userInp=userInp;}//binding KeyBoardInput in App
    public String getKeyBoardInput(KeyBoardInput userInp){return userInp;}//Fetching UserInput in AI_Character
    public String updateByKeyBoardInput(KeyBoardInput userInp){
        getKeyBoardInput(userInp)+setKeyBoardInput(userInp)+1;
    }
    public void existsByKeyBoardInput(KeyBoardInput userInp){
        if(userInp.KEYBOARD_A!=null || userInp.KEYBOARD_D!=null)getKeyBoardInput(userInp);
        else getKeyBoardInput(0);
    }
    public String no_move=null;
    public State currState;
    public   void setCurrState(State currState){return currState;}// Binding Current State in App
    public State getCurrState(State currState){return currState;}//Fetching Current State in App
    public String updateByState(State currState)[getCurrState(currState)+setCurrState(currState)+1;//updating CurrState in App
    public State existsBYCurrState(State currState){if(currState!=null)getCurrState(currState);else getCurrState(null);}//Checking CurrState's Existence IN App
    public Ai_Character(){
        this.currState=currState.IDKE;
    }
    public Group loadAICharacter(URL url){//loadAICharacter funct Declare
        View view =new View();//View Obj declare
        public void setView(View view){this.view=view;}//Bidning VIew in App
        public View getView(View view){return view;}//Fethcing View In App
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