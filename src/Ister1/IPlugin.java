package Ister1;

//Context
public class IPlugin {
    private ImageProcessing imageProcessing;
    public IPlugin(ImageProcessing imageProcessing){
        this.imageProcessing = imageProcessing;
    }
    public void performAction(IpluginContext ipluginContext){
        if(ipluginContext == IpluginContext.HEAD_SCAN)
            imageProcessing = new ImageProcessingStrategy1();
        else if(ipluginContext == IpluginContext.FOOT_SCAN)
            imageProcessing = new ImageProcessingStrategy2();
        imageProcessing.doImageProcessing(ipluginContext);
    }
}
