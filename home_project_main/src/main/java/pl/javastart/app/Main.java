package pl.javastart.app;

import pl.javastart.dao.FileMessageProducer;
import pl.javastart.dao.MessagePrinter;
import pl.javastart.dao.MessageProducer;
import pl.javastart.dao.SimpleMessageProducer;

public class Main {

    public static void main(String[] args) {

        MessageProducer fileMsgProducer = new FileMessageProducer();
        MessagePrinter filePrinter = new MessagePrinter(fileMsgProducer);
        filePrinter.printMessage();

        MessageProducer simpleMsgProducer = new SimpleMessageProducer();
        MessagePrinter simplePrinter = new MessagePrinter(simpleMsgProducer);
        simplePrinter.printMessage();

    }
}
