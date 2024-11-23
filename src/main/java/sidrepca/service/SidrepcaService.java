package sidrepca.service;

import sidrepca.model.Navio;

import javax.jws.WebService;

@WebService
public interface SidrepcaService {
    String registrarNavio(String imo, String nome, double cargaBruta, double calado);
    String registrarViagem(String imo, String portoPartida, String portoDestino, String horaPartida, String horaPrevistaChegada);
    String informarCarga(String imo, double quantidadeCarga);
    String informarPassageiros(String imo, int numeroPassageiros);
    Navio consultarNavio(String imo);
}
