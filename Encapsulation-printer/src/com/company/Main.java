package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(55,true);
        System.out.println(printer.getTonerLevel());

        printer.print(15);

        System.out.println("pages printed = " + printer.getPagesPrinted() + "\n" + "toner level = " + printer.getTonerLevel());

        printer.fillUpToner();
        System.out.println(printer.getTonerLevel());


    }
}
