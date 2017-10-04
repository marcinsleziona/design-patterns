package pl.ms.designpatterns.proxy;

import org.springframework.core.env.Environment;

import java.io.PrintStream;

/*
 * Created by Marcin on 2017-10-04 09:59
 */
public interface ImagePrinter {

    void print(Environment environment, PrintStream printStream);
}
