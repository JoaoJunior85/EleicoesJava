package model;

public class Candidato extends Pessoa {

    private String numero;
    private Partido partido;
    private int votos;

    public Candidato(String numero, Partido partido, int votos) {
        this.numero = numero;
        this.partido = partido;
        this.votos = votos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

}
