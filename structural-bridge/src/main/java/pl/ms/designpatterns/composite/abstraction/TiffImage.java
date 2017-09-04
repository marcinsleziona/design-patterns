package pl.ms.designpatterns.composite.abstraction;

import pl.ms.designpatterns.composite.implementor.ImageConverter;

/*
 * Created by Marcin on 2017-08-31 15:08
 */
public class TiffImage extends Image {

    public TiffImage(ImageConverter converter) {
        super(converter);
    }

    @Override
    public void convert() {
        getConverter().convert();
    }
}
