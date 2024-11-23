package sidrepca.service;

import sidrepca.model.Navio;
import sidrepca.model.Viagem;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebService(endpointInterface = "sidrepca.service.SidrepcaService")
public class SidrepcaServiceImpl implements SidrepcaService {
    private final Map<String, Navio> navios = new HashMap<>();
    private final Map<String, List<Viagem>> viagens = new HashMap<>();
    private final Map<String, Double> cargaPorViagem = new HashMap<>();
    private final Map<String, Integer> passageirosPorViagem = new HashMap<>();

    @Override
    public String registrarNavio(String imo, String nome, double cargaBruta, double calado) {
        if (navios.containsKey(imo)) {
            return "Erro: Navio com IMO " + imo + " já registrado.";
        }

        Navio navio = new Navio();
        navio.setImo(imo);
        navio.setNome(nome);
        navio.setCargaBruta(cargaBruta);
        navio.setCalado(calado);
        navios.put(imo, navio);
        return "Navio registrado com sucesso!";
    }

    @Override
    public String registrarViagem(String imo, String portoPartida, String portoDestino, String horaPartida, String horaPrevistaChegada) {
        if (!navios.containsKey(imo)) {
            return "Erro: Navio com IMO " + imo + " não encontrado.";
        }

        Viagem viagem = new Viagem();
        viagem.setImo(imo);
        viagem.setPortoPartida(portoPartida);
        viagem.setPortoDestino(portoDestino);
        viagem.setHoraPartida(horaPartida);
        viagem.setHoraPrevistaChegada(horaPrevistaChegada);

        viagens.computeIfAbsent(imo, k -> new ArrayList<>()).add(viagem);
        return "Viagem registrada com sucesso!";
    }

    @Override
    public String informarCarga(String imo, double quantidadeCarga) {
        if (!navios.containsKey(imo)) {
            return "Erro: Navio com IMO " + imo + " não encontrado.";
        }

        if (quantidadeCarga <= 0) {
            return "Erro: A quantidade de carga deve ser maior que zero.";
        }

        cargaPorViagem.put(imo, cargaPorViagem.getOrDefault(imo, 0.0) + quantidadeCarga);
        return "Carga de " + quantidadeCarga + " toneladas registrada para o navio com IMO " + imo + ".";
    }

    @Override
    public String informarPassageiros(String imo, int numeroPassageiros) {
        if (!navios.containsKey(imo)) {
            return "Erro: Navio com IMO " + imo + " não encontrado.";
        }

        if (numeroPassageiros < 0) {
            return "Erro: O número de passageiros não pode ser negativo.";
        }

        passageirosPorViagem.put(imo, passageirosPorViagem.getOrDefault(imo, 0) + numeroPassageiros);
        return "Passageiros registrados: " + numeroPassageiros + " para o navio com IMO " + imo + ".";
    }

    @Override
    public Navio consultarNavio(String imo) {
        Navio navio = navios.get(imo);
        if (navio == null) {
            throw new RuntimeException("Erro: Navio com IMO " + imo + " não encontrado.");
        }
        return navio;
    }
}
