package Ister4;

public class IPlugin2 extends CommandReceiver{
    private CommandManager commandManager;
    private String MRIState;

    @Override
    public void performAction() {
        if (commandManager != null){
            this.MRIState = commandManager.getMRIState();
            System.out.println("IPlugin2 is notified about the change: " + this.MRIState);
        }else{
            System.out.println("IPlugin2 is not active");
        }
    }

    @Override
    void setCommandManager(CommandManager commandManager) {
        this.commandManager = commandManager;
    }
}
