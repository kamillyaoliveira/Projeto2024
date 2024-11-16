/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */  
// usar static nao precisa instanciar os objetos
public class Util {
    public static void habilitar(boolean valor, JComponent ... comp){ //os tres pontos é para pegar todos os objetos 
    for (int i = 0; i < comp.length; i++){ // quando o metodo é static usa em maiusculo pois é classe, se fosse instanciar seria em minusculo.
    comp[i].setEnabled(valor);
    }
            }
    
    public static void limpar(JComponent ... comp){
    for(int i= 0; i < comp.length; i++){
    ((JTextField)comp[i]).setText(""); 
    }
    }
}



