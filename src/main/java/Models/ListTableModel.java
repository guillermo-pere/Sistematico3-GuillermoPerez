/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sistemas-08
 */
public class ListTableModel extends AbstractTableModel{
     private List<Factura> data;
    private String[] columns;

    public ListTableModel(List<Factura> data, String[] columns) {
        this.data = data;
        this.columns = columns;
    }
    
    @Override
    public int getRowCount() {
        return data == null ? 0 : data.size();
    }

    @Override
    public int getColumnCount() {
        return columns == null ? 0 : columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            return data.get(rowIndex).asArray()[columnIndex];
    }
}
