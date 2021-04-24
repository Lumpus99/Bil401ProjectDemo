package Ister1;

public class ImageProcessingStrategy2 extends ImageProcessing {
    @Override
    void doImageProcessing(IpluginContext ipluginContext) {
        System.out.println("The context is: "+ ipluginContext + " and currently running ImageProcessingStrategy2");
    }
}
