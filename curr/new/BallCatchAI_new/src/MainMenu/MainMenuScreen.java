import javax.swing.event.MenuEvent;

//WID(3/11/2025)
public class MainMenuScreen extends SimpleApplication{
    MainMenuScreen menuScreen=new MainMenuScreen();
    public String MainMenu(String[] args){
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public String getMenu(MenuBar menuBar){return menuBar;}//Fetching menuBar

        public String setMenu(MenuBar menuBar){this.menuBar=menuBar;}//Binding MenuBar
        filemenu.getItems().addAll(openMenu,SaveMenu,exitMenu);
        MainMenuScreen(MenuBar menuBar){
            this.menuBar=menuBar;
        }

        public MenuEvent onMenuStrart(UserInput userInp,MenuBar menuBar,String[] path){
            while(userInp!=notifyAll()){   
                    if(!userInp.KEYBOARD_RIGHT_CLICK==null ||!userInp.KEYBOARD_LEFT_CLICK==null )openMenu.show();
                    else if(!userInp.KEYBOARD_RIGHT_CLICK==null ||!userInp.KEYBOARD_LEFT_CLICK==null )SaveMenu.show();
                    else if(!userInp.KEYBOARD_RIGHT_CLICK==null ||!userInp.KEYBOARD_LEFT_CLICK==null )exitMenu.show();
                    else menuBar.hide();}
     
         return menuBar;    

        }

    }//     menuBar.getMenus().addAll(filemenu,editMenu,viewMenu,helpMenu);
          
    public String EditMenu(String[] args){
        EditMenu editMenu=new EditMenu();
        EditMenu soundMenu=new FileMenu("soundMenu");
        EditMenu VideoMenu=new FileMenu("=VideoMenu");
        EditMenu OptionsMenu=new FileMenu("OptionsMenu");

        filemenu.getItems().addAll(editMenu,soundMenu,VideoMenu,OptionsMenu);
    }
}