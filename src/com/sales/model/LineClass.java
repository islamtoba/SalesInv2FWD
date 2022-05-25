package com.sales.model;

/**
 * 
 * @author IslamAmin
*/

public class LineClass {
    private String lineItem;
    private double linePrice;
    private int lineCount;
    private InvHeader invoice;

    public LineClass() {
    }

    public LineClass(String item, double price, int count, InvHeader invoice) {
        this.lineItem = item;
        this.linePrice = price;
        this.lineCount = count;
        this.invoice = invoice;
    }

    public double getLineTotal() {
        return linePrice * lineCount;
    }
    
    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int count) {
        this.lineCount = count;
    }

    public String getLineItem() {
        return lineItem;
    }

    public void setLineItem(String item) {
        this.lineItem = item;
    }

    public double getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(double price) {
        this.linePrice = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getIdNumber() + ", item=" + lineItem + ", price=" + linePrice + ", count=" + lineCount + '}';
    }

    public InvHeader getInvoice() {
        return invoice;
    }
    public String getAsCSV() {
        return invoice.getIdNumber() + "," + lineItem + "," + linePrice + "," + lineCount;
    }
    
    
    
}