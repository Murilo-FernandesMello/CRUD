package br.ulbra.entity;

/*
 * @author M.F.Mello
 */
public class Usuario {

    private int idUsu;
    private String nomeUsu;
    private String emailUsu;
    private String telUsu;
    private int sexoUsu;
    private String senhaUsu;
    private String ConfirmaSenhaUsu;

    public Usuario() {

    }

    //construtor de teste: 
    public Usuario(int idUsu, String nomeUsu, String emailUsu, String telUsu, int sexoUso, String senhaUso) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.emailUsu = emailUsu;
        this.telUsu = telUsu;
        this.sexoUsu = sexoUso;
        this.senhaUsu = senhaUso;
    }
    

    public int getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getTelUsu() {
        return telUsu;
    }

    public void setTelUsu(String telUsu) {
        this.telUsu = telUsu;
    }

    public int getSexoUsu() {
        return sexoUsu;
    }

    public void setSexoUsu(int sexoUsu) {
        this.sexoUsu = sexoUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    
    
    public String toString() {
        return " ID: " + this.idUsu
                + " Nome: " + this.nomeUsu
                + " E-mail: " + this.emailUsu
                + " Telefone: " + this.telUsu
                + " Sexo: " + this.sexoUsu
                + "  Senha: " + this.senhaUsu;
    }

}
