package Ister3;

public abstract class BaseImageProcessing extends ImageProcessing{
    protected final ImageProcessing imageProcessing;
    protected BaseImageProcessing(ImageProcessing imageProcessing) {
        this.imageProcessing = imageProcessing;
    }
    @Override
    public void doImageProcessing() {
        this.imageProcessing.doImageProcessing();
    }
}
