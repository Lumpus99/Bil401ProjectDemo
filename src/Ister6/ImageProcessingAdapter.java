package Ister6;

public class ImageProcessingAdapter extends ImageProcessing{
    private final ImageProcessingAlgorithm2 imageProcessingAlgorithm2 = new ImageProcessingAlgorithm2();
    @Override
    public void doImageProcessing() {
        imageProcessingAlgorithm2.performImageProcessing();
    }
}
