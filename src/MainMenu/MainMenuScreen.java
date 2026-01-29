//WID(29/01/2026)(Sarthak Mittal)(degamieSign)#1.1.1.1

public class MainMenuScreen extends SimpleApplication{
    public MainMenuScreen menuScreen;
    public void setMenuScreen(MainMenuScreen menuScreen){this.menuScreen=menuScreen;}//Binding MenuScreen in App
    public MainMenuScreen getMenuScreen(MainMenuScreen menuScreen){return menuScreen;}
    public String MainMenu(String[] args){
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public void setOpenMenu(FileMenu openMenu){this.openMenu=openMenu;}//Binding OpenMenu in App
        public FileMenu getMenu(FileMenu menu){return menu;}//Fetching Menu in App
        public FileMenu getSaveMenu(FileMenu saveMenu){return saveMenu;}//Fetching SaveMenu in App
        public void setsaveMenu(FileMenu SaveMenu){return SaveMenu;}//Binding SaveMenu in App
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