package br.ulbra.entity;

/**
 *
 * @author *****
 */
public class Armas {

    private int idArm;
    private String nomeArm;
    private String tipoArm;
    private String calibreArm;
    private String funcArm;
    private double precoArm;
    private String numArm;

    public Armas() {

    }

    public Armas(int idArm, String nomeArm, String tipoArm,
            String calibreaArm, String funcArm, double precoArm, String numArm) {

        this.idArm = idArm;
        this.nomeArm = nomeArm;
        this.tipoArm = tipoArm;
        this.calibreArm = calibreaArm;
        this.funcArm = funcArm;
        this.precoArm = precoArm;
        this.numArm = numArm;
    }

    public int getIdArm() {
        return idArm;
    }

    public void setIdArm(int idArm) {
        this.idArm = idArm;
    }

    public String getNomeArm() {
        return nomeArm;
    }

    public void setNomeArm(String nomeArm) {
        this.nomeArm = nomeArm;
    }

    public String getTipoArm() {
        return tipoArm;
    }

    public void setTipoArm(String tipoArm) {
        this.tipoArm = tipoArm;
    }

    public String getCalibreArm() {
        return calibreArm;
    }

    public void setCalibreArm(String calibreArm) {
        this.calibreArm = calibreArm;
    }

    public String getFuncArm() {
        return funcArm;
    }

    public void setFuncArm(String funcArm) {
        this.funcArm = funcArm;
    }

    public double getPrecoArm() {
        return precoArm;
    }

    public void setPrecoArm(double precoArm) {
        this.precoArm = precoArm;
    }

    public String getNumArm() {
        return numArm;
    }

    public void setNumArm(String numArm) {
        this.numArm = numArm;
    }
    
    public String toString(){
        return " ID: " + this.idArm 
                + " Nome: " + this.nomeArm
                + " Tipo: " + this.tipoArm
                + " Calibre: " + this.calibreArm
                + " Funcionamento: " + this.funcArm
                + " Preço: " + this.precoArm
                + " Numeração: " + this.numArm;
    }
    
}
