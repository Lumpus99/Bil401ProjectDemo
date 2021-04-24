package Ister6;

public class CommandReceiver {
    public static void main(String[] args) {
        IPlugin iPlugin = new IPlugin();
        System.out.println("Calling perfromAction1:");
        iPlugin.perfromAction1();
        System.out.println("Calling perfromAction2:");
        iPlugin.perfromAction2();
    }
}
