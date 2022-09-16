package br.ulbra.dao;

import br.ulbra.entity.Armas;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */
public class ArmaDAO {

    Connection con;

    public ArmaDAO() throws SQLException {
        con = (Connection) ConnectionFactory.getConnection();
    }

    //INSERIR NO BANCO
    public void createArm(Armas a) {

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("INSERT INTO tbArmas(nomeArm,tipoArm,calibreArm,FuncArm,precoArm,numArm) "
                    + "VALUES (?,?,?,?,?,?)");

            stmt.setString(1, a.getNomeArm());
            stmt.setString(2, a.getTipoArm());
            stmt.setString(3, a.getCalibreArm());
            stmt.setString(4, a.getFuncArm());
            stmt.setDouble(5, a.getPrecoArm());
            stmt.setString(6, a.getNumArm());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Arma Registrada com sucesso");
        } catch (SQLException ex) {

            System.out.println(ex);

        } finally {

            ConnectionFactory.closeConnection(con, stmt);

        }

    }

    //EXCLUIR DADOS
    public void deleteArm(Armas ar) {
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement("DELETE FROM tbArmas WHERE idArm =  ?");

            stmt.setInt(1, ar.getIdArm());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Arma excluída com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    //ATUALIZAR DADOS
    public void updateArm(Armas arm) {
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "UPDATE tbArmas SET nomeArm = ?, tipoArm = ?, calibreArm =  ?,  FuncArm =  ?, precoArm = ?, numArm = ? WHERE  idArm = ? ");
            stmt.setString(1, arm.getNomeArm());

            stmt.setString(2, arm.getTipoArm());

            stmt.setString(3, arm.getCalibreArm());

            stmt.setString(4, arm.getFuncArm());

            stmt.setDouble(5, arm.getPrecoArm());

            stmt.setString(6, arm.getNumArm());

            stmt.setInt(7, arm.getIdArm());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Armas> readArm() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Armas> armas = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM tbArmas");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Armas arma = new Armas();
                arma.setIdArm(rs.getInt("idArm"));
                arma.setNomeArm(rs.getString("nomeArm"));
                arma.setTipoArm(rs.getString("tipoArm"));
                arma.setCalibreArm(rs.getString("calibreArm"));
                arma.setFuncArm(rs.getString("funcArm"));
                arma.setPrecoArm(rs.getDouble("precoArm"));
                arma.setNumArm(rs.getString("numArm"));
                armas.add(arma);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ArmaDAO.class.getName()).log(Level.SEVERE, null,
                    ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Armas>) armas;
    }

    public List<Armas> readForDesc(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Armas> armas = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM tbArmas WHERE nomeArm LIKE");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Armas arma = new Armas();
                arma.setIdArm(rs.getInt("idArm"));
                arma.setNomeArm(rs.getString("nomeArm"));
                arma.setTipoArm(rs.getString("tipoArm"));
                arma.setCalibreArm(rs.getString("calibreArm"));
                arma.setFuncArm(rs.getString("funcArm"));
                arma.setPrecoArm(rs.getDouble("precoArm"));
                arma.setNumArm(rs.getString("numArm"));
                armas.add(arma);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return armas;
    }

}
