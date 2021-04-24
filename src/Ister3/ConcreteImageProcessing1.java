package Ister3;

public class ConcreteImageProcessing1 extends BaseImageProcessing{
    protected ConcreteImageProcessing1(ImageProcessing imageProcessing) {
        super(imageProcessing);
    }

    @Override
    public void doImageProcessing() {
        System.out.println("doImageProcessing is called in ConcreteImageProcessing1");
        super.imageProcessing.doImageProcessing();
    }

}
