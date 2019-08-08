/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Escola;
/**
 *
 * @author Administrador
 */
public class DaoEscola {
     public static boolean inserir(Escola objeto) {
        String sql = "INSERT INTO Escola (sigla, nome, endereco, area, nrdealunos) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSigla());
            ps.setString(2, objeto.getNome());
            ps.setString(3, objeto.getEndereco());
            ps.setInt(4, objeto.getArea());
            ps.setInt(5, objeto.getNrdealunos());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static void main(String[] args) {
        Escola objeto = new Escola();
        objeto.setSigla("IFRS");
        objeto.setNome("Jorge Pereira");
        objeto.setEndereco("Jooj da Silva Rua bastos");
        objeto.setNrdealunos(150);
        objeto.setArea(22);
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
        public static boolean alterar(Escola objeto) {
        String sql = "UPDATE Escola SET nome = ?, endereco = ?, sigla = ?, area = ?, nrdealunos = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome()); 
            ps.setString(2, objeto.getEndereco());
            ps.setString(3, objeto.getSigla());
            ps.setInt(4, objeto.getArea());
            ps.setInt(5, objeto.getNrdealunos());
            ps.setInt(6, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
          public static boolean excluir(Escola objeto) {
        String sql = "DELETE FROM Escola WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
