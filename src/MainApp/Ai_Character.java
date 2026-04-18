//WID(18/04/2026)(Sarthak Mittal)(DegamieSign)#1.1.1.1.1.1.1.1.1.1.1.1x.1.1.1.1.1
import javax.swing.plaf.nimbus.State;
public class Ai_Character {
    public Ai_Character updateByAiactuators(State  aiactuators){getAiactuators()+setAiactuators()+1;}//Updating AiActuators in App
    public void setAiactuators(){this.aiactuators=aiactuators;}
    public State aiactuators

    public State getAiactuators() {
        return aiactuators;
    }

    public Ai_Character aiCharacter;
    public Ai_Character updateByAiCharacter(Ai_Character aiCharacter){getAiCharacter(aiCharacter)+setAiCharacter(aiCharacter)+1;}//Updating AiCharacter in Apo
    public Ai_Character existsByAiChar(Ai_Character aiCharacter){if(aiCharacter>null)getAiCharacter(aiCharacter);else getAiCharacter(null);}//Checking AICHar's Exsitnece in App
    public Ai_Character aiCharacter;
    public void setAiCharacter(Ai_Character aiCharacter){this.aiCharacter=aiCharacter;}
    public Ai_Character getAiCharacter(Ai_Character aiCharacter){return aiCharacter;}
    public State currState;
    public void updateByCurrState(State currState){getCurrState(currState)+setCurrState(currState)+1;}//Updating CurrState in App
    public void setCurrState(State currState){this.currState=currState;}//Binding CurrState in App
    public State moveAiChar(Ai_Character aiCharacter,State currState){return currState+=currState.toString("MOVING AI_cHARACTER");}
    public void updateByAiCharacter(Ai_Character aiCharacter){if(aiCharacter!=null)getAiCharacter(Ai_Character);else getAiCharacter(null);}//Chekcing Aicharacter's Existence in App
    public Ai_Character existsByCurrState(State CurrState){//Checking AiChar's Curr State
        if(CurrState!=null)getAiCharacter(CurrState);
        else getAiCharacter(null);
    }
    public State getCurrState(State currState){return  currState;}
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
