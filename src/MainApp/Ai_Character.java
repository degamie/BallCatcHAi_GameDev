//WID(15/02/2026)(Sarthak Mittal)(DegamieSign)#1.1
import javax.swing.plaf.nimbus.State;
public class Ai_Character {
    public Ai_Character aiCharacter;
    public void setAiCharacter(Ai_Character aiCharacter){this.aiCharacter=aiCharacter;}
    public Ai_Character getAiCharacter(Ai_Character aiCharacter){return aiCharacter;}
    public State currState;
    public State moveAiChar(Ai_Character aiCharacter,State currState){return currState+=currState.toString("MOVING AI_cHARACTER");}
public void setCurrState(State currState){this.currState=currState;}
    public State getCurrState() {
        return currState;
    }

    public Ai_Character(){
        this.currState=currState.IDKE;
    }
    public void Upoate*(){
        if(currState==currState.MOVING)
    }
}