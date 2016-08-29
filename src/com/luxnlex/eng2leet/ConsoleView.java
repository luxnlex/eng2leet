package com.luxnlex.eng2leet;

import java.io.IOException;

public class ConsoleView {

    public void showConsole() throws IOException {
        TextHandler th = new TextHandler();
        Reader rd = new Reader();
        Translator tr = new Translator();
        System.out.println(tr.toLeet(th.textHandler(rd.getString())));
    }
}
