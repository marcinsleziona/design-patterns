package pl.ms.designpatterns.composite.abstraction;

import pl.ms.designpatterns.composite.implementor.ImageConverter;

/*
 * Created by Marcin on 2017-09-01 15:18
 */
public abstract class Image {

    private ImageConverter converter;

    public Image(ImageConverter converter) {
        this.converter = converter;
    }

    abstract public void convert();

    public ImageConverter getConverter() {
        return converter;
    }
}
