package model;

import java.util.Date;

public abstract class Pessoa {

    protected String nome;
    protected String bI;
    protected Date dataNasc;
    protected String distrito;
    protected String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getbI() {
        return bI;
    }

    public void setbI(String bI) {
        this.bI = bI;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
