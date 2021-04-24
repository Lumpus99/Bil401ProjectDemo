package Ister4;

public class ConcreteCommandManager extends CommandManager{
    private String MRIState = "FOOT_SCAN";

    @Override
    public String getMRIState() {
        return MRIState;
    }

    @Override
    public void setMRIState(String newState) {
        this.MRIState = newState;
        System.out.println("ConcreteSubject MRIState has changed to: \""+ MRIState + "\" Notifying observers.");
        super.notifyPlugins();
    }
}
