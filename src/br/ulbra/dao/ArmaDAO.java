package br.ulbra.dao;

import br.ulbra.entity.Armas;
import java.sql.Connection;
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
            stmt.setString(5, a.getPrecoArm());
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

            stmt = (PreparedStatement) con.prepareStatement("DELETE FROM tbArmas WHERE idArm =  ?");

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

            stmt = (PreparedStatement) con.prepareStatement(
                    "UPDATE tbArmas SET nomeArm = ?, tipoArm = ?, calibreArm =  ?,  FuncArm =  ?, precoArm = ?, numArm = ? WHERE  idArm = ? ");
            stmt.setString(1, arm.getNomeArm());

            stmt.setString(2, arm.getTipoArm());

            stmt.setString(3, arm.getCalibreArm());

            stmt.setString(4, arm.getFuncArm());

            stmt.setString(5, arm.getPrecoArm());

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
                arma.setPrecoArm(rs.getString("precoArm"));
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

    public List<Armas> ListarCD(String nome, int tipo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Armas> armas = new ArrayList<>();
        try {
            if (tipo == 1) {
                stmt = con.prepareStatement("SELECT * FROM tbarmas order by nomeArm");
            } else {
                stmt = con.prepareStatement("SELECT * FROM tbarmas order by nomeArm DESC");
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                Armas a = new Armas();
                a.setIdArm(rs.getInt("idarm"));
                a.setNomeArm(rs.getString("nomeArm"));
                a.setTipoArm(rs.getString("tipoArm"));
                a.setCalibreArm(rs.getString("calibreArm"));
                a.setFuncArm(rs.getString("FuncArm"));
                a.setPrecoArm(rs.getString("precoArm"));
                a.setNumArm(rs.getString("numArm"));
                armas.add(a);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage() + " EStou aqui"
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return armas;
    }

    public List<Armas> ListarNome(String nome, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Armas> armas = new ArrayList<>();
        try {

            stmt = con.prepareStatement("SELECT idArm, nomearm, precoarm, numarm FROM tbarmas WHERE nomearm LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Armas a = new Armas();
                a.setIdArm(rs.getInt("idArm"));
                a.setNomeArm(rs.getString("nomeArm"));
                a.setTipoArm("");
                a.setCalibreArm("");
                a.setFuncArm("");
                a.setPrecoArm(rs.getString("precoArm"));
                a.setNumArm(rs.getString("numArm"));
                armas.add(a);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return armas;

    }

    public List<Armas> ListarCalibre(String calibre, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Armas> armas = new ArrayList<>();
        try {

            stmt = con.prepareStatement("SELECT idarm, calibrearm, precoarm, numarm FROM tbarmas WHERE calibrearm LIKE ?");
            stmt.setString(1, "%" + calibre + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Armas a = new Armas();
                a.setIdArm(rs.getInt("idArm"));
                a.setNomeArm("");
                a.setTipoArm("");
                a.setCalibreArm(rs.getString("calibreArm"));
                a.setFuncArm("");
                a.setPrecoArm(rs.getString("precoArm"));
                a.setNumArm(rs.getString("numArm"));
                armas.add(a);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return armas;

    }

    public List<Armas> ListarFuncionamento(String funcionamento, int tipo) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Armas> armas = new ArrayList<>();
        try {

            stmt = con.prepareStatement("SELECT idarm, funcarm, precoarm, numarm FROM tbarmas WHERE funcarm LIKE ?");
            stmt.setString(1, "%" + funcionamento + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Armas a = new Armas();
                 a.setIdArm(rs.getInt("idArm"));
                a.setNomeArm("");
                a.setTipoArm("");
                a.setCalibreArm("");
                a.setFuncArm(rs.getString("FuncArm"));
                a.setPrecoArm(rs.getString("precoArm"));
                a.setNumArm(rs.getString("numArm"));
                armas.add(a);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return armas;

    }
}
