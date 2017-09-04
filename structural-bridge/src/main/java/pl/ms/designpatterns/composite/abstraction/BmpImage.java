package pl.ms.designpatterns.composite.abstraction;

import pl.ms.designpatterns.composite.implementor.ImageConverter;

/*
 * Created by Marcin on 2017-09-01 15:22
 */
public class BmpImage extends Image {

    public BmpImage(ImageConverter converter) {
        super(converter);
    }

    @Override
    public void convert() {
        getConverter().convert();
    }
}
