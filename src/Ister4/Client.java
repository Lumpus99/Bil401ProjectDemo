package Ister4;

public class Client {
    public static void main(String[] args) {
        CommandManager commandManager = new ConcreteCommandManager();
        IPlugin1 plugin1 = new IPlugin1();
        IPlugin2 plugin2 = new IPlugin2();

        plugin1.performAction();
        plugin2.performAction();

        commandManager.attach(plugin1, commandManager);
        System.out.println("\n> IPlugin1 is activated");
        commandManager.setMRIState("HEAD_SCAN");

        commandManager.attach(plugin2, commandManager);
        System.out.println("\n> IPlugin2 is activated");
        commandManager.setMRIState("FOOT_SCAN");

        commandManager.detach(plugin1);
        System.out.println("\n> IPlugin1 is now an deactivated.");
        commandManager.setMRIState("HEAD_SCAN");
    }
}
