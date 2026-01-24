//WID(24/01/2026)(Sarthak Mittal)(degamieSign)
public class MainMenuScreen extends SimpleApplication{
    public MainMenuScreen menuScreen;
    public String MainMenu(String[] args){
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public FileMenu getOpenMenu(FileMenu openMenu){return openMenu;}//Fetching OpenMenu in App
        public Strng getmenu(FileMenu menu){return menu;}
        public void setMenu(FileMenu openMenu){this.openmenu=openMenu;}//Binding OpenMenu in App

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