package com.hz;

public abstract class CardTemplate {

    // Lets print some cards
    Printer printer = new Console();

    public String TemplateCard(){
        printHeader();
        printText();
        printImage();
        printFooter();
       return printHeader() + System.lineSeparator() + printText() + System.lineSeparator() + printImage() + System.lineSeparator() + printFooter() + System.lineSeparator();

    }

    public void printCard(){
        printer.printLine(this.TemplateCard());
    }

    public abstract String printHeader();
    public abstract String printText();
    public abstract String printImage();
    public abstract String printFooter();


}
