package Ister4;

import java.util.ArrayList;

public abstract class CommandManager {
    private final ArrayList<CommandReceiver> Plugins = new ArrayList<>();
    public void attach(CommandReceiver commandReceiver, CommandManager commandManager){
        commandReceiver.setCommandManager(commandManager);
        this.Plugins.add(commandReceiver);
    }

    public void detach(CommandReceiver commandReceiver){
        this.Plugins.remove(commandReceiver);
        commandReceiver.setCommandManager(null);
    }

    public void notifyPlugins(){
        for(CommandReceiver plugin : Plugins){
            plugin.performAction();
        }
    }

    public abstract String getMRIState();
    public abstract void setMRIState(String newState);

}
