package Ister3;

public class ConcreteImageProcessing2 extends BaseImageProcessing{
    protected ConcreteImageProcessing2(ImageProcessing imageProcessing) {
        super(imageProcessing);
    }

    @Override
    public void doImageProcessing() {
        System.out.println("doImageProcessing is called in ConcreteImageProcessing2");
        super.imageProcessing.doImageProcessing();
    }
}
