//WID(8/02/2026)(Sarthak Mittal)(degamieSign)#1.1.1.1.1,1.1

public class MainMenuScreen extends SimpleApplication{
    public MainMenuScreen menuScreen;
    public void updateByMenuScreen(MainMenuScreen menuScreen){getMenuScreen(menuScreen)+setMenuScreen(menuScreen)+1;}//Updating MenuScreen in App
    public void setMenuScreen(MainMenuScreen menuScreen){this.menuScreen=menuScreen;}//Binding MenuScreen in App
    public MainMenuScreen getMenuScreen(MainMenuScreen menuScreen){return menuScreen;}
    public String EditMenu(String[] args){
        EditMenu editMenu=new EditMenu();
        EditMenu soundMenu=new FileMenu("soundMenu");
        EditMenu VideoMenu=new FileMenu("=VideoMenu");
        EditMenu OptionsMenu=new FileMenu("OptionsMenu");
        public EditMenu getVideoMenu(EditMenu VideoMenu){return VideoMenu;}
        public EditMenu getOptionsMenu(EditMenu opionsMenu){
             return opionsMenu;
        }

        filemenu.getItems().addAll(editMenu,soundMenu,VideoMenu,OptionsMenu);
    }
    public String MainMenu(String[] args){
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public void updateByExitMenu(FileMenu exitMenu){getMenuScreen(exitMenu)+setMenuScreen(exitMenu)+1;}
        public   FileMenu getExit(FileMenu exitMenu){return exitMenu;}//Fethcing ExitMenu in App
        public void setOpenMenu(FileMenu openMenu){this.openMenu=openMenu;}//Binding OpenMenu in App
        public FileMenu getMenu(FileMenu menu){return menu;}//Fetching Men
        // u in App
        public FileMenu getSaveMenu(FileMenu saveMenu){return saveMenu;}//Fetching SaveMenu in App
        public void setsaveMenu(FileMenu SaveMenu){return SaveMenu;}//Binding SaveMenu in App
        public FileMenu getOpenMenu(FileMenu openMenu){return openMenu;}//Fetching OpenMenu in App
        public Strng getmenu(FileMenu menu){return menu;}
        public void setMenu(FileMenu openMenu){this.openmenu=openMenu;}//Binding OpenMenu in App

            filemenu.getItems().addAll(openMenu,SaveMenu,exitMenu);
        public String getOpenMenu(String openMenu){return openMenu;}
    }

}