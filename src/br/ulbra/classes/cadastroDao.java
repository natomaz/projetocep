package br.ulbra.classes;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class cadastroDao {
        Connection con;

    public cadastroDao() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
//create
    public void create(cadastro c) throws NoSuchAlgorithmException {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbcrud (nome, email, celular, sexo, datanasc, cep) VALUE (?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setInt(3, c.getCelular());
            stmt.setString(4, c.getSexo());
            stmt.setInt(5, c.getDatanasc());
            stmt.setInt(6, c.getCep());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa " + c.getNome()
                    + " cadastrada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
//update
    public void update(cadastro c) throws NoSuchAlgorithmException {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbcrud SET nome = ?,email = ?, celular = ? ,"
                    + "sexo = ?, datanasc = ?, cep = ? WHERE id = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getEmail());
            stmt.setInt(3, c.getCelular());
            stmt.setString(4, c.getSexo());
            stmt.setInt(5, c.getDatanasc());
            stmt.setInt(6, c.getId());
            stmt.setInt(7, c.getCep());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa " + c.getNome()
                    + " modificada com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
//delete    
    public void delete(cadastro c){
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbcrud WHERE id = ?");
           
            stmt.setInt   (1, c.getId());
            
            if (JOptionPane.showConfirmDialog(null,"Exclusão", "Tem certeza que"
                    + " deseja excluir "+c.getNome()+"?",
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, c.getNome()
                    +" foi excluída com sucesso!!");
                stmt.executeUpdate();
            }else{
                JOptionPane.showMessageDialog(null, "A exclusão de "+c.getNome()
                    +" foi cancelada com sucesso!");
            }
   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
//arraylist
        public ArrayList<cadastro> read(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        java.util.List<cadastro> cadastros = new ArrayList<cadastro>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbcrud");
            rs = stmt.executeQuery();
            while(rs.next()){
                cadastro Cadastro = new cadastro();
                Cadastro.setId(rs.getInt("id"));
                Cadastro.setNome(rs.getString("nome"));
                Cadastro.setCelular(rs.getInt("celular"));
                Cadastro.setSexo(rs.getString("sexo"));
                Cadastro.setEmail(rs.getString("email"));      
		Cadastro.setCep(rs.getInt("cep"));   
		Cadastro.setDatanasc(rs.getInt("data de nascimento"));         
                cadastros.add(Cadastro);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<cadastro>) cadastros;
    }
//pesquisar    
    public ArrayList<cadastro> readPesq(int nome){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        java.util.List<cadastro> cadastros = new ArrayList<cadastro>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbcrud WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
                cadastro Cadastro = new cadastro();
                Cadastro.setId(rs.getInt("id"));
                Cadastro.setNome(rs.getString("nome"));
                Cadastro.setCelular(rs.getInt("celular"));
                Cadastro.setSexo(rs.getString("sexo"));
                Cadastro.setEmail(rs.getString("email"));      
		Cadastro.setCep(rs.getInt("cep"));   
		Cadastro.setDatanasc(rs.getInt("data de nascimento"));         
                cadastros.add(Cadastro);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro: "+e.getMessage());
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<cadastro>) cadastros;
    }

    public Iterable<cadastro> readPesq(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
