package br.ulbra.dao;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import br.ulbra.entity.Usuario;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author M.F.Mello
 */
public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = (Connection) ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario WHERE emailUsu = ? and senhaUsu = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
    //MÉTODO CRIADO PARA INSERIR USUÁRIO NO BANCO DE DADOS

    public void create(Usuario u) {

        PreparedStatement stmt = null;

        try {

            stmt = con.prepareStatement("INSERT INTO tbUsuario(nomeUsu,cepUsu,logUsu,numUsu,bairroUsu,cidadeUsu,estadoUsu,emailUsu,telUsu,sexoUsu,senhaUsu) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getCepUsu());
            stmt.setString(3, u.getLogUsu());
            stmt.setInt(4, u.getNumUsu());
            stmt.setString(5, u.getBairroUsu());
            stmt.setString(6, u.getCidadeUsu());
            stmt.setString(7, u.getEstadoUsu());
            stmt.setString(8, u.getEmailUsu());
            stmt.setString(9, u.getTelUsu());
            stmt.setInt(10, u.getSexoUsu());
            stmt.setString(11, u.getSenhaUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso");
        } catch (SQLException ex) {

            System.out.println(ex);

        } finally {

            ConnectionFactory.closeConnection(con, stmt);

        }

    }
    // MÉTODO CRIADO PARA EXCLUIR DO BANCO DE DADOS

    public void delete(Usuario u) {
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement("DELETE FROM tbUsuario WHERE idUsu = ?");

            stmt.setInt(1, u.getIdUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao excluir:" + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    //MÉTODO CRIADO PARA MODIFICAR NO BANCO DE DADOS
    public void update(Usuario u) {
        PreparedStatement stmt = null;
        try {

            stmt = con.prepareStatement(
                    "UPDATE tbUsuario SET nomeUsu = ?, cepUsu = ?, logUsu = ?,"
                    + "numUsu = ?, bairroUsu = ?, cidadeUsu = ?,"
                    + "estadoUsu = ?, emailUsu = ?,"
                    + " telUsu =  ?, sexoUsu =  ?,"
                    + " senhaUsu =  ? WHERE  idUsu =  ?  ");
            stmt.setString(1, u.getNomeUsu());

            stmt.setString(2, u.getCepUsu());

            stmt.setString(3, u.getLogUsu());

            stmt.setInt(4, u.getNumUsu());

            stmt.setString(5, u.getBairroUsu());

            stmt.setString(6, u.getCidadeUsu());

            stmt.setString(7, u.getEstadoUsu());

            stmt.setString(8, u.getEmailUsu());

            stmt.setString(9, u.getTelUsu());

            stmt.setInt(10, u.getSexoUsu());

            stmt.setString(11, u.getSenhaUsu());

            stmt.setInt(12, u.getIdUsu());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Usuario> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM tbUsuario ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idUsu"));
                usuario.setNomeUsu(rs.getString("nomeUsu"));
                usuario.setCepUsu(rs.getString("cepUsu"));
                usuario.setLogUsu(rs.getString("logUsu"));
                usuario.setNumUsu(rs.getInt("numUsu"));
                usuario.setBairroUsu(rs.getString("bairroUsu"));
                usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                usuario.setEstadoUsu(rs.getString("estadoUsu"));
                usuario.setEmailUsu(rs.getString("emailUsu"));
                usuario.setTelUsu(rs.getString("telUsu"));
                usuario.setSexoUsu(rs.getInt("sexoUsu"));
                usuario.setSenhaUsu(rs.getString("senhaUsu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null,
                    ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }

   

    public List<Usuario> readForDesc(String nome, String tipo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList <Usuario> usuarios = new ArrayList<>();
        try {
            if (tipo.equals("Completa Cresc.")) {
                stmt = con.prepareStatement("SELECT * FROM tbUsuario order by nomeUsu ASC");
                rs = stmt.executeQuery();
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsu(rs.getInt("idUsu"));
                    usuario.setNomeUsu(rs.getString("nomeUsu"));
                    usuario.setCepUsu(rs.getString("cepUsu"));
                    usuario.setLogUsu(rs.getString("logUsu"));
                    usuario.setNumUsu(rs.getInt("numUsu"));
                    usuario.setBairroUsu(rs.getString("bairroUsu"));
                    usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                    usuario.setEstadoUsu(rs.getString("estadoUsu"));
                    usuario.setEmailUsu(rs.getString("emailUsu"));
                    usuario.setTelUsu(rs.getString("telUsu"));
                    usuario.setSexoUsu(rs.getInt("sexoUsu"));
                    usuario.setSenhaUsu(rs.getString("SenhaUsu"));
                    usuarios.add(usuario);
                }
            } else if (tipo.equals("Completa Decresc.")) {
                stmt = con.prepareStatement("SELECT * FROM tbUsuario order by nomeUsu Desc");
                rs = stmt.executeQuery();

                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsu(rs.getInt("idUsu"));
                    usuario.setNomeUsu(rs.getString("nomeUsu"));
                    usuario.setCepUsu(rs.getString("cepUsu"));
                    usuario.setLogUsu(rs.getString("logUsu"));
                    usuario.setNumUsu(rs.getInt("numUsu"));
                    usuario.setBairroUsu(rs.getString("bairroUsu"));
                    usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                    usuario.setEstadoUsu(rs.getString("estadoUsu"));
                    usuario.setEmailUsu(rs.getString("emailUsu"));
                    usuario.setTelUsu(rs.getString("telUsu"));
                    usuario.setSexoUsu(rs.getInt("sexoUsu"));
                    usuario.setSenhaUsu(rs.getString("SenhaUsu"));
                    usuarios.add(usuario);
                }
            } else if (tipo.equals("Cidade")) {
                stmt = con.prepareStatement("SELECT idUsu,nomeUsu,bairroUsu,cidadeUsu,estadoUsu,emailUsu FROM tbUsuario");
                rs = stmt.executeQuery();

                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsu(rs.getInt("idUsu"));
                    usuario.setNomeUsu(rs.getString("nomeUsu"));
                    usuario.setCepUsu("");
                    usuario.setLogUsu("");
                    usuario.setNumUsu(0);
                    usuario.setBairroUsu(rs.getString("bairroUsu"));
                    usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                    usuario.setEstadoUsu(rs.getString("estadoUsu"));
                    usuario.setEmailUsu(rs.getString("emailUsu"));
                    usuario.setTelUsu("");
                    usuario.setSexoUsu(0);
                    usuario.setSenhaUsu("");
                    usuarios.add(usuario);
                }
            }else if(tipo.equals("Estado")) {
                stmt = con.prepareStatement("SELECT idUsu,nomeUsu,cidadeUsu,estadoUsu,telUsu FROM tbUsuario");
                rs = stmt.executeQuery();

                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setIdUsu(rs.getInt("idUsu"));
                    usuario.setNomeUsu(rs.getString("nomeUsu"));
                    usuario.setCepUsu("");
                    usuario.setLogUsu("");
                    usuario.setNumUsu(0);
                    usuario.setBairroUsu("");
                    usuario.setCidadeUsu(rs.getString("cidadeUsu"));
                    usuario.setEstadoUsu(rs.getString("estadoUsu"));
                    usuario.setEmailUsu("");
                    usuario.setTelUsu(rs.getString("telUsu"));
                    usuario.setSexoUsu(0);
                    usuario.setSenhaUsu("");
                    usuarios.add(usuario);
                }
            }else if(tipo.equals("Telefone")) {
                stmt = con.prepareStatement("SELECT idUsu,nomeUsu,telUsu FROM tbUsuario");
                rs = stmt.executeQuery();

                while (rs.next()) {
                    Usuario usuario = new Usuario();
                   usuario.setIdUsu(rs.getInt("idUsu"));
                    usuario.setNomeUsu(rs.getString("nomeUsu"));
                    usuario.setCepUsu("");
                    usuario.setLogUsu("");
                    usuario.setNumUsu(0);
                    usuario.setBairroUsu("");
                    usuario.setCidadeUsu("");
                    usuario.setEstadoUsu("");
                    usuario.setEmailUsu("");
                    usuario.setTelUsu(rs.getString("telUsu"));
                    usuario.setSexoUsu(0);
                    usuario.setSenhaUsu("");
                    usuarios.add(usuario);
                }
            }
            

            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage()
            );
        }finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
            return usuarios;
        }

    }
