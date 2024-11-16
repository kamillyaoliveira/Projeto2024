/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import dao.Kea_fornecedorDAO;
import bean.Kea_fornecedor;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author HP
 */
public class Controller_kea_fornecedor extends AbstractTableModel{

    List lista;
    
    public void setLista (List lista){
    this.lista = lista;
    }
            
            
    @Override
    public int getRowCount() {
     return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kea_fornecedor kea_fornecedor =  (Kea_fornecedor) lista.get(rowIndex);
        
        if(columnIndex == 0){
        return kea_fornecedor.getKea_id_fornecedor();
        }
        
      else  if(columnIndex == 1){
        return kea_fornecedor.getKea_nome_fantasia();  }
        
       else  if(columnIndex == 2){
        return kea_fornecedor.getKea_cnpj();
         } else 
             return "";
    }
    
}
