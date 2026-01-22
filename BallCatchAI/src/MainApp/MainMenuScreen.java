//WID(22/01/2026)(Sarthak Mittal)(degamieSign)
public class MainMenuScreen extends SimpleApplication{
    public MainMenuScreen menuScreen;
    public String MainMenu(String[] args){
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public Strng getmenu(FileMenu menu){return menu;}

                filemenu.getItems().addAll(openMenu,SaveMenu,exitMenu);
        public String getOpenMenu(String openMenu){return openMenu;}
    }
    public String EditMenu(String[] args){
        EditMenu editMenu=new EditMenu();

        EditMenu soundMenu=new FileMenu("soundMenu");
        EditMenu VideoMenu=new FileMenu("=VideoMenu");
        EditMenu OptionsMenu=new FileMenu("OptionsMenu");

        filemenu.getItems().addAll(editMenu,soundMenu,VideoMenu,OptionsMenu);
    }
}