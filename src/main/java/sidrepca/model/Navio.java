package sidrepca.model;

public class Navio {
    private String imo;
    private String nome;
    private double cargaBruta;
    private double calado;

    // Getters e Setters
    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCargaBruta() {
        return cargaBruta;
    }

    public void setCargaBruta(double cargaBruta) {
        this.cargaBruta = cargaBruta;
    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }
}
