/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Factura;
import Models.ListTableModel;
import Views.FrmFacturaDemo;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sistemas-08
 */
public class FacturaDemoControllers {
    private FrmFacturaDemo frmFacturaDemo;
    private ListTableModel tblFacturaModel;
    private Factura factura;
    int contador;
    Factura datos[] = new Factura [contador];
    private TableRowSorter<ListTableModel> tblRowSorter;
    public FacturaDemoControllers(){
        
        
        initComponent();
    }
    
     private void initComponent(){
     frmFacturaDemo.getBtnAdd().addActionListener((e)->{
         try {
             btnAddActionListener(e);
         } catch (IOException ex) {
             Logger.getLogger(FacturaDemoControllers.class.getName()).log(Level.SEVERE, null, ex);
         }
        });
}
     
      private void btnAddActionListener(ActionEvent e) throws IOException{
        String codproducto, nombre,cant,pr,sub;
        int cantidad;
        float precio, subtotal;
        
        codproducto = frmFacturaDemo.getTxtCodProd().getText();
        nombre = frmFacturaDemo.getTxtName().getText();
        cantidad = Integer.parseInt(frmFacturaDemo.getSpnCant().getModel().getValue().toString());
        precio = Float.parseFloat(frmFacturaDemo.getFtxtPrecio().getText());
        subtotal = precio*cantidad;
        cant=Integer.toString(cantidad);
        pr=String.valueOf(precio);
        sub=String.valueOf(subtotal);  
        contador++;
        Factura temporal = new Factura(codproducto, nombre, cantidad,precio,subtotal);
        datos[contador-1]= temporal;
        
        loadTable();
        
    }
      
       void loadTable() throws IOException{
        String column[]={"Cod. Producto","Nombre","Cantidad", "Precio", "Subtotal"};
        List datosfactura = Arrays.asList(datos);
        tblFacturaModel = new ListTableModel(datosfactura, column);
        tblRowSorter = new TableRowSorter<>(tblFacturaModel);
        
        frmFacturaDemo.getTblPrint().setModel(tblFacturaModel);
        frmFacturaDemo.getTblPrint().setRowSorter(tblRowSorter);
    }
     
     
}
