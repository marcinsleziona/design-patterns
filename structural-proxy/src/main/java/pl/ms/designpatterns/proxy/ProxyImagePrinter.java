package pl.ms.designpatterns.proxy;

import org.springframework.core.env.Environment;

import java.io.PrintStream;

/*
 * Created by Marcin on 2017-10-04 10:11
 */
public class ProxyImagePrinter implements ImagePrinter {

    private String fileName;
    private ImagePrinter imagePrinter;

    public ProxyImagePrinter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print(Environment environment, PrintStream printStream) {
        if (imagePrinter == null) {
            imagePrinter = new RealImagePrinter(fileName);
        }
        imagePrinter.print(environment, printStream);
    }
}
