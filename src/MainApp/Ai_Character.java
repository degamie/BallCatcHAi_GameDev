//WID(19/02/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1c 
import javax.swing.plaf.nimbus.State;
public class Ai_Character {
    public Ai_Character updateByAiChar(Ai_Character aiCharacter){getAiCharacter(aiCharacter)+setAiCharacter(aiCharacter)+1;}
    public Ai_Character aiCharacter;
    public void setAiCharacter(Ai_Character aiCharacter){this.aiCharacter=aiCharacter;}
    public Ai_Character getAiCharacter(Ai_Character aiCharacter){return aiCharacter;}
    public State currState;
    public State moveAiChar(Ai_Character aiCharacter,State currState){return currState+=currState.toString("MOVING AI_cHARACTER");}
    public void updateByAiCharacter(Ai_Character aiCharacter){if(aiCharacter!=null)getAiCharacter(Ai_Character);else getAiCharacter(null);}//Chekcing Aicharacter's Existence in App
public void setCurrState(State currState){this.currState=currState;}
    public State getCurrState() {
        return currState;
    }

    public Ai_Character(Ai_Character aiCharacter){
        this.aiCharacter=aiCharacter;
        this.currState=currState.IDKE;
    }
    public void Upoate*(){
        if(currState==currState.MOVING)
    }
}