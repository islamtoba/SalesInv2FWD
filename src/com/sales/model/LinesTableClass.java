
package com.sales.model;
/**
 * 
 * @author IslamAmin
*/

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesTableClass extends AbstractTableModel {

    private ArrayList<LineClass> linesObj;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesTableClass(ArrayList<LineClass> lines) {
        this.linesObj = lines;
    }
    public ArrayList<LineClass> getLines() {
        return linesObj;
    }
    
    @Override
    public int getRowCount() {
        return linesObj.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LineClass X = linesObj.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return X.getInvoice().getIdNumber();
            case 1: return X.getLineItem();
            case 2: return X.getLinePrice();
            case 3: return X.getLineCount();
            case 4: return X.getLineTotal();
            default : return "";
        }
    }
    
}