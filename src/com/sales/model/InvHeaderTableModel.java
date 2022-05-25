package com.sales.model;

/**
 * 
 * @author IslamAmin
*/

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InvHeaderTableModel extends AbstractTableModel {
    private ArrayList<InvHeader> invoices;
    private String[] columns = {"No.", "Date", "Customer", "Total"};
    
    public InvHeaderTableModel(ArrayList<InvHeader> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvHeader invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getIdNumber();
            case 1: return invoice.getInvoiceDate();
            case 2: return invoice.getCustomerName();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }
}