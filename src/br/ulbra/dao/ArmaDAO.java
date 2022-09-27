package br.ulbra.dao;

import br.ulbra.entity.Armas;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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

            stmt = (PreparedStatement) con.prepareStatement("INSERT INTO tbArmas(nomeArm,tipoArm,calibreArm,FuncArm,precoArm,numArm) "
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

    /*
 public List&lt;Usuario&gt; readForDesc(String nome) {
PreparedStatement stmt = null;
ResultSet rs = null;
ArrayList&lt;Usuario&gt; usuarios = new ArrayList&lt;&gt;();
try {
stmt = con.prepareStatement(&quot;SELECT * FROM tbusuario WHERE nomeusu LIKE ?");
stmt.setString(1, "%"+nome+"%");
rs = stmt.executeQuery();
while (rs.next()) {
Usuario usuario = new Usuario();
usuario.setIdUsu(rs.getInt(&quot;idusu&quot;));
usuario.setNomeUsu(rs.getString(&quot;nomeusu&quot;));
usuario.setEmailUsu(rs.getString(&quot;emailusu&quot;));
usuario.setSenhaUsu(rs.getString(&quot;senhausu&quot;));
usuario.setFoneUsu(rs.getString(&quot;foneusu&quot;));
usuario.setSexoUsu(rs.getInt(&quot;sexousu&quot;));
usuarios.add(usuario);
}
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, &quot;Erro:&quot; + ex.getMessage());
} finally {
ConnectionFactory.closeConnection(con, stmt, rs);
}
return usuarios;
}
}   
    
     */
    public List<Armas> readForDesc(String nome, int tipo) {
        JOptionPane.showMessageDialog(null,"Tipo:"+tipo+" Nome"+nome);
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Armas> armas = new ArrayList<>();
        String script = null;
        try {
             JOptionPane.showMessageDialog(null,tipo);
            if (tipo==1) {
                script = "SELECT idArm, nomeArm, tipoArm, calibreArm, FuncArm, numArm FROM tbArmas order by nomeArm ASC";
                JOptionPane.showMessageDialog(null,script);
            } else if (tipo == 2) {
                script = "SELECT * FROM tbArmas order by nomeArm DESC";

            } else if (tipo == 3) {
                script = "SELECT * FROM tbArmas where nomeArm like '%" + nome + "%'";

            } else if (tipo == 4) {
                script = "SELECT * FROM tbArmas";

            } else if (tipo == 5) {
                script = "SELECT * FROM tbArmas";
            }

            stmt = (PreparedStatement) con.prepareStatement(script);
            rs = stmt.executeQuery();
            while (rs.next()) {
                Armas arma = new Armas();
                arma.setIdArm(rs.getInt("idArm"));
                arma.setNomeArm("nomeArm");
                arma.setTipoArm("tipoArm");
                arma.setCalibreArm("calibreArm");
                arma.setFuncArm("FuncArm");
                arma.setPrecoArm("precoArm");
                arma.setNumArm("numArm");
                armas.add(arma);
            }
            return armas;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;

    }
}
