package pl.ms.designpatterns.composite.implementor;

/*
 * Created by Marcin on 2017-09-04 10:24
 */
public class TiffToBmpImageConverter implements ImageConverter {

    @Override
    public void convert() {
        System.out.println("Tiff -> Bmp");
    }
}
