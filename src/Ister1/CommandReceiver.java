package Ister1;

public class CommandReceiver {
    public static void main(String[] args) {
        IPlugin plugin = new IPlugin(null);
        plugin.performAction(IpluginContext.HEAD_SCAN);
        plugin.performAction(IpluginContext.FOOT_SCAN);
    }
}
