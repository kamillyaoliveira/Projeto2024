/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.Kea_fornecedor;
import dao.Kea_fornecedorDAO;
import java.sql.ResultSet;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HP
 */
public class Kea_fornecedorDAO extends DAO_abstract{
    
    private Connection cnt;
        public Kea_fornecedorDAO(){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url, user, pass;
         // url = "jdbc:mysql://localhost:3306/db_kamilly_oliveira";
        ///  user = "root";
        //   pass = "";
           url = "jdbc:mysql://10.7.0.51:33062/db_kamilly_oliveira";
           user = "kamilly_oliveira";
          pass = "kamilly_oliveira";
       
            
          cnt = DriverManager.getConnection(url, user, pass);
         } catch (ClassNotFoundException ex) {
            System.out.println("erro no class" + ex.getMessage());
            System.exit(0);
        } catch (SQLException ex) {
             System.out.println("Erro de SQL:" + ex.getMessage());
            System.exit(0);
        }
        }
    
     @Override
    public void insert(Object object) {
        Kea_fornecedor kea_fornecedor  = (Kea_fornecedor) object;
        try {
            String sql = "insert into kea_fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, kea_fornecedor.getKea_id_fornecedor());
            pst.setString(2, kea_fornecedor.getKea_razao_social());
            pst.setString(3, kea_fornecedor.getKea_email());
            pst.setString(4, kea_fornecedor.getKea_celular());
            pst.setString(5, kea_fornecedor.getKea_logradouro());
            pst.setString(6, kea_fornecedor.getKea_numero());
            pst.setString(7, kea_fornecedor.getKea_bairro());
            pst.setString(8, kea_fornecedor.getKea_cidade());
            pst.setString(9, kea_fornecedor.getKea_uf());
            pst.setString(10, kea_fornecedor.getKea_cep());
            pst.setString(11, kea_fornecedor.getKea_nome_fantasia());
            pst.setString(12, kea_fornecedor.getKea_cnpj());
            pst.setString(13, kea_fornecedor.getKea_reputacao());
            pst.setString(14, kea_fornecedor.getKea_situacao());
            pst.setString(15, kea_fornecedor.getKea_inscri_municip());
            pst.setInt(16, kea_fornecedor.getKea_condicao_pagamento());
            pst.setString(17, kea_fornecedor.getKea_quali_comp());
            pst.setString(18, kea_fornecedor.getKea_tipo_fornecedor());
            pst.executeUpdate();
        } catch (SQLException ex) {
              System.out.println("erro no SQL: " + ex.getMessage());
              System.exit(0);
        }
    }


    @Override
    public void update(Object object) {
         Kea_fornecedor kea_fornecedor = (Kea_fornecedor) object;
        try {
            String sql = "update kea_fornecedor set kea_razao_social=?, kea_email=?, kea_celular=?, "
                    + "kea_logradouro=?, kea_numero=?, kea_bairro=?, kea_cidade= ?, kea_uf= ?, kea_cep= ?, kea_nome_fantasia= ?"
                    + "kea_cnpj= ?, kea_reputacao= ?, kea_situacao= ?, kea_inscri_municip= ?, kea_condicao_pagamento= ?"
                    + "kea_quali_comp= ?, kea_tipo_fornecedor= ? where kea_id_fornecedor=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(18, kea_fornecedor.getKea_id_fornecedor());
            pst.setString(1, kea_fornecedor.getKea_razao_social());
            pst.setString(2, kea_fornecedor.getKea_email());
            pst.setString(3, kea_fornecedor.getKea_celular());
            pst.setString(4, kea_fornecedor.getKea_logradouro());
            pst.setString(5, kea_fornecedor.getKea_numero());
            pst.setString(6, kea_fornecedor.getKea_bairro());
            pst.setString(7, kea_fornecedor.getKea_cidade());
            pst.setString(8, kea_fornecedor.getKea_uf());
            pst.setString(9, kea_fornecedor.getKea_cep());
            pst.setString(10, kea_fornecedor.getKea_nome_fantasia());
            pst.setString(11, kea_fornecedor.getKea_cnpj());
            pst.setString(12, kea_fornecedor.getKea_reputacao());
            pst.setString(13, kea_fornecedor.getKea_situacao());
            pst.setString(14, kea_fornecedor.getKea_inscri_municip());
            pst.setInt(15, kea_fornecedor.getKea_condicao_pagamento());
            pst.setString(16, kea_fornecedor.getKea_quali_comp());
            pst.setString(17, kea_fornecedor.getKea_tipo_fornecedor());
            pst.executeUpdate();
        } catch (SQLException ex) {
             System.out.println("erro no SQL" + ex.getMessage());
             System.exit(0);
        }
     
    }

    @Override
    public void delete(Object object) {
        Kea_fornecedor kea_fornecedor = (Kea_fornecedor) object;
        try {
            String sql = "delete from kea_fornecedor where kea_id_fornecedor=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, kea_fornecedor.getKea_id_fornecedor());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("erro no SQL" + ex.getMessage());
             System.exit(0);
        }
    }

    @Override
    public Object list(int id) {
         Kea_fornecedor kea_fornecedor = new Kea_fornecedor();
       try{
            String sql = "select * from kea_fornecedor where kea_id_fornecedor=?";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            
           if (rs.next() == true){
               kea_fornecedor.setKea_id_fornecedor(rs.getInt("kea_id_fornecedor"));
               kea_fornecedor.setKea_razao_social(rs.getString("kea_razao_social"));
               kea_fornecedor.setKea_email(rs.getString("kea_email"));
               kea_fornecedor.setKea_celular(rs.getString("kea_celular"));
               kea_fornecedor.setKea_logradouro(rs.getString("kea_logradouro"));
               kea_fornecedor.setKea_bairro(rs.getString("kea_bairro"));
               kea_fornecedor.setKea_cidade(rs.getString("kea_cidade"));
               kea_fornecedor.setKea_nome_fantasia(rs.getString("kea_nome_fantasia"));
               kea_fornecedor.setKea_cnpj(rs.getString("kea_cnpj"));
               kea_fornecedor.setKea_inscri_municip(rs.getString("kea_inscri_municip"));
               kea_fornecedor.setKea_uf(rs.getString("kea_uf"));
               kea_fornecedor.setKea_numero(rs.getString("kea_numero"));
               kea_fornecedor.setKea_cep(rs.getString("kea_cep"));
               kea_fornecedor.setKea_condicao_pagamento(rs.getInt("kea_condicao_pagamento"));
               kea_fornecedor.setKea_reputacao(rs.getString("kea_reputacao"));
               kea_fornecedor.setKea_situacao(rs.getString("kea_situacao"));
               kea_fornecedor.setKea_quali_comp(rs.getString("kea_quali_comp"));
               kea_fornecedor.setKea_tipo_fornecedor(rs.getString("kea_tipo_fornecedor"));
               
           } else{
              kea_fornecedor = null;
           }
           
        } catch (SQLException ex) {
            System.out.println("erro no SQL" + ex.getMessage());
             System.exit(0);
        }
       return kea_fornecedor;
          }

    @Override
    public ArrayList listAll() {
        ArrayList lista = new ArrayList();
        try {
        PreparedStatement pstm;
        pstm = cnt.prepareStatement("select * from kea_fornecedor");
        ResultSet rs;
        rs = pstm.executeQuery();
        while (rs.next()){
        Kea_fornecedor kea_fornecedor = new Kea_fornecedor();
         kea_fornecedor.setKea_id_fornecedor(rs.getInt("kea_id_fornecedor"));
               kea_fornecedor.setKea_razao_social(rs.getString("kea_razao_social"));
               kea_fornecedor.setKea_email(rs.getString("kea_email"));
               kea_fornecedor.setKea_celular(rs.getString("kea_celular"));
               kea_fornecedor.setKea_logradouro(rs.getString("kea_logradouro"));
               kea_fornecedor.setKea_bairro(rs.getString("kea_bairro"));
               kea_fornecedor.setKea_cidade(rs.getString("kea_cidade"));
               kea_fornecedor.setKea_nome_fantasia(rs.getString("kea_nome_fantasia"));
               kea_fornecedor.setKea_cnpj(rs.getString("kea_cnpj"));
               kea_fornecedor.setKea_inscri_municip(rs.getString("kea_inscri_municip"));
               kea_fornecedor.setKea_uf(rs.getString("kea_uf"));
               kea_fornecedor.setKea_numero(rs.getString("kea_numero"));
               kea_fornecedor.setKea_cep(rs.getString("kea_cep"));
               kea_fornecedor.setKea_condicao_pagamento(rs.getInt("kea_condicao_pagamento"));
               kea_fornecedor.setKea_reputacao(rs.getString("kea_reputacao"));
               kea_fornecedor.setKea_situacao(rs.getString("kea_situacao"));
               kea_fornecedor.setKea_quali_comp(rs.getString("kea_quali_comp"));
               kea_fornecedor.setKea_tipo_fornecedor(rs.getString("kea_tipo_fornecedor"));
               lista.add(kea_fornecedor);
        }
        } catch (SQLException ex){
            System.out.println("Erro de SQL:" + ex.getMessage());
        }
 return lista;
    }
    
 //public static void main(String[] args)    
    
 // {
    //     Kea_fornecedor kea_fornecedor = new Kea_fornecedor();
    //     kea_fornecedor.setKea_id_fornecedor(10);
      //   kea_fornecedor.setKea_razao_social("sim");
        // kea_fornecedor.setKea_email("balinhadegude45@gmail.com");
     //    kea_fornecedor.setKea_celular("67996649751");
      //   kea_fornecedor.setKea_logradouro("la na roça");
       //  kea_fornecedor.setKea_numero("39");
        // kea_fornecedor.setKea_bairro("centro");
        // kea_fornecedor.setKea_cidade("Antonio Joao");
       //  kea_fornecedor.setKea_uf("MS");
       //  kea_fornecedor.setKea_cep("79910000");
       //  kea_fornecedor.setKea_nome_fantasia("casa das makes");
       //  kea_fornecedor.setKea_cnpj("769325920");
       //  kea_fornecedor.setKea_reputacao("b");
        // kea_fornecedor.setKea_situacao("ativo");
       //  kea_fornecedor.setKea_inscri_municip("10");
       //  kea_fornecedor.setKea_condicao_pagamento("cartao");
       //  kea_fornecedor.setKea_quali_comp("bom");
       //  kea_fornecedor.setKea_tipo_fornecedor("tradicional");
        
        
       //  Kea_fornecedorDAO kea_fornecedorDAO = new Kea_fornecedorDAO();
       //  kea_fornecedorDAO.insert(kea_fornecedor);
       //   kea_fornecedorDAO.update(kea_fornecedor);
     //    kea_fornecedorDAO.delete(kea_fornecedor);
       //  System.out.println("rodou");
    // }
}
