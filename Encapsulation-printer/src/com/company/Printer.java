package com.company;

public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel>=0 && tonerLevel<=100) this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public boolean isEmpty(int tonerLevel){
        if(tonerLevel<=0) return true;
        return false;
    }

    public void print(int pages){

        this.tonerLevel = this.tonerLevel - pages;
        if(isDuplex) this.pagesPrinted = (int) (this.pagesPrinted + Math.ceil(pages));
        else this.pagesPrinted = this.pagesPrinted + pages;
    }

    public void fillUpToner(){
        this.tonerLevel = 100;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
