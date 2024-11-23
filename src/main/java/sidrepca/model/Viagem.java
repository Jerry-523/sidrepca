package sidrepca.model;

public class Viagem {
    private String imo;
    private String portoPartida;
    private String portoDestino;
    private String horaPartida;
    private String horaPrevistaChegada;


    public Viagem() {
    }

    // Constr com parâmetros
    public Viagem(String imo, String portoPartida, String portoDestino, String horaPartida, String horaPrevistaChegada) {
        this.imo = imo;
        this.portoPartida = portoPartida;
        this.portoDestino = portoDestino;
        this.horaPartida = horaPartida;
        this.horaPrevistaChegada = horaPrevistaChegada;
    }


    public String getImo() {
        return imo;
    }

    public void setImo(String imo) {
        this.imo = imo;
    }

    public String getPortoPartida() {
        return portoPartida;
    }

    public void setPortoPartida(String portoPartida) {
        this.portoPartida = portoPartida;
    }

    public String getPortoDestino() {
        return portoDestino;
    }

    public void setPortoDestino(String portoDestino) {
        this.portoDestino = portoDestino;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraPrevistaChegada() {
        return horaPrevistaChegada;
    }

    public void setHoraPrevistaChegada(String horaPrevistaChegada) {
        this.horaPrevistaChegada = horaPrevistaChegada;
    }

    //Exibir detalhes
    @Override
    public String toString() {
        return "Viagem{" +
                "imo='" + imo + '\'' +
                ", portoPartida='" + portoPartida + '\'' +
                ", portoDestino='" + portoDestino + '\'' +
                ", horaPartida='" + horaPartida + '\'' +
                ", horaPrevistaChegada='" + horaPrevistaChegada + '\'' +
                '}';
    }
}
