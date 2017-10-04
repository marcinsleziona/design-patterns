package pl.ms.designpatterns.proxy;

import org.springframework.boot.ImageBanner;
import org.springframework.core.env.Environment;
import org.springframework.core.io.InputStreamResource;

import java.io.InputStream;
import java.io.PrintStream;

/*
 * Created by Marcin on 2017-10-04 10:00
 */
public class RealImagePrinter implements ImagePrinter {

    private InputStream inputStream;

    public RealImagePrinter(String fileName) {
        inputStream = ImagePrinter.class.getResourceAsStream(fileName);
    }

    @Override
    public void print(Environment environment, PrintStream printStream) {
        ImageBanner imageBanner = new ImageBanner(new InputStreamResource(inputStream));
        imageBanner.printBanner(environment, getClass(), printStream);
    }
}
