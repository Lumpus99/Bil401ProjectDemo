package Ister6;

public class IPlugin {
    private ImageProcessing imageProcessing;

    public void perfromAction1(){
        this.imageProcessing = new ImageProcessingAlgorithm1();
        this.imageProcessing.doImageProcessing();
    }

    public void perfromAction2(){
        this.imageProcessing = new ImageProcessingAdapter();
        this.imageProcessing.doImageProcessing();
    }
}
