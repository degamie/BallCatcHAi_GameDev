package Classes;
import java.lang.Math;
import java.util.HashMap;

import Interfaces.Display;
import Math;
public class numMulDiv implements Display {
    public Integer grid;
    public Integer num;
    public Integer Score;
    public numMulDiv(Integer num,int Score,int[][] grid){
        this.num=num;
        this.Score=Score;
        this.grid=grid;
    }
    public String setNum(Integer num){this.num=num;}
    public Integer getNum(Integer num){return num;}//Fetching Num in Game
    public Integer getScore(Integer score){return score;}//Fethcing Score in Game
    public Integer setScore(Integer Score){this.Score=Score;}
    public numMulDiv numMulDiv=new numMulDiv();
    public Integer getGrid(int[][] grid){
        int out=0;
        for(int i=0;i<grid.length;i++){
            for(int j=i+1;j<grid[i].length;++j){
                if(grid[i][j]==0)out=0;
                else if(grid[i][j]>0){
                    out= Math.max(grid[i],grid[j]);
                }    }
        }return out;
    }
    public Integer setGrid(int[][] grid){
        this.grid=grid;
    }
    public String getAllByDisplay(int Score,Integer num)}{

display(Score, num);
            }
    public String numToSpecialChr(Integer num){//Hash Table Implementation
        final String ![]=['','!','!!','!!!'];
        final String @[]=['',' @',' @@','@@@'];
        final String #[]=['','#','##','###'];
        final String $[]=['','$','$$','$$$'];
        final String %[]=['','%','%%','%%%'];
        final String ^[]=['','^','^^','^^^'];
        final String &[]=['','&','&&','&&&'];
        final String *[]=['','*','**','***'];
        final String LBR[]=['','LBR','LBRLBR','LBRLBRLBRLBR'];
        final String RBR[]=['', "RBR",'RBRRBR','RBRRBRRBR'];

        return ![num%10]+ @[num%10/2]+#[num%10/3]++%[num%10/5]+^[num%10/6]+&[num%10/7]+*[num%10/8]+LBR[num%10/9]+RBR[(num%10)*1];
    }
    public String ScoreBoard(int Score){
        Score=0;Integer num=0;
        numToSpecialChr(num);
        Score++;
    }
    public String onPattern(int Score,Integer num){
        Score=0;
        int m; int n;
        int[][] grid=new int[m][n];
        int out=0;
        numToSpecialChr(num);
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0)return;
                else if(grid[i]==[j] || grid[j]==[j+1] || grid[j]==[j-1] ||grid[i]==[i+1]){
                    Score=  numToSpecialChr(num)+onDisplay(Score,num);
                }
                else if(grid[0][0]>=grid[i+4][j+4] || grid[i+3][j+3]>=grid[0][j+4] || grid[i+2][j+2]>=grid[0][j+4])Score*=Math.max(numToSpecialChr(num),grid[i][j]);// Diagonal grid's Display
                else Score=0;

            }
        }return Score;
    }
    //WID(28/09/2025)
    public String onDisplay(int Score,Integer num){
        int m = 0; int n=0;
        int[][] grid=new int[m][n];
        System.out.println(grid[m][n]+ScoreBoard(Score)+numToSpecialChr(Integer num));
        onPattern(Score,num);//Calling onPattern () method

    }




    public static void Main(String[] args){  
        int num=0;int Score=0;
        int m; int n;
        int[][] grid=new int[m][n];
        HashMap<Integer,Integer>hmap=new HashMap<>();
        hMap.put(0,')');
        hMap.put(1,'!');
        hMap.put(2,'@');
        hMap.put(3,'#');
        hMap.put(4,'$');
        hMap.put(5,'%');
        hMap.put(6,'^');
        hMap.put(7,'&');
        hMap.put(8,'*');
        hMap.put(9,'(');
     
        int out=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0)return;
                else if(grid[i][j]<=9){
                    grid[i][j]=hMap(i);
                    output+=Math.max(grid[i][j])+1;
                    score+=output.length;
                }
                else if(grid[i][j]>=9 && grid[i][j]<=99){
                    grid[i][j]=hMap(i);
                    output+=Math.max(grid[i][j]);
                    score+=output.length+1;
                }
                else out=0;
            }
            return score;
        }
        onDisplay(numToSpecialChr(num),Score,num,(onPattern(Score,num)),ScoreBoard(Score));//Displaying NumToSpecialChar's Patternic ScoreBoard's Methods
     }