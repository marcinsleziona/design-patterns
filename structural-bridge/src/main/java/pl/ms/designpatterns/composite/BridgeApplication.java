package pl.ms.designpatterns.composite;

import pl.ms.designpatterns.composite.abstraction.BmpImage;
import pl.ms.designpatterns.composite.abstraction.Image;
import pl.ms.designpatterns.composite.abstraction.TiffImage;
import pl.ms.designpatterns.composite.implementor.BmpToTiffImageConverter;
import pl.ms.designpatterns.composite.implementor.ImageConverter;
import pl.ms.designpatterns.composite.implementor.TiffToBmpImageConverter;

/*
 * Created by Marcin on 2017-08-31 15:10
 */
public class BridgeApplication {

    public static void main(String[] args) {
        ImageConverter bmpToTiffImageConverter = new BmpToTiffImageConverter();
        Image bmpImage = new BmpImage(bmpToTiffImageConverter);
        bmpImage.convert();

        ImageConverter tiffToBmpImageConverter = new TiffToBmpImageConverter();
        Image tiffImage = new TiffImage(tiffToBmpImageConverter);
        tiffImage.convert();
    }
}
