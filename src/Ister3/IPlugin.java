package Ister3;

public class IPlugin {
    public void performAction1(){
        ImageProcessing imageProcessing =
                new ConcreteImageProcessing1(
                new Processing());
        imageProcessing.doImageProcessing();
    }
    public void performAction2(){
        ImageProcessing imageProcessing =
                new ConcreteImageProcessing1(
                new ConcreteImageProcessing2(
                        new Processing()));
        imageProcessing.doImageProcessing();
    }
}
