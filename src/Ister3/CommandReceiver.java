package Ister3;

public class CommandReceiver {
    public static void main(String[] args) {
        IPlugin iplugin = new IPlugin();
        System.out.println("Callin performAction1():");
        iplugin.performAction1();
        System.out.println("Callin performAction2():");
        iplugin.performAction2();
    }
}
