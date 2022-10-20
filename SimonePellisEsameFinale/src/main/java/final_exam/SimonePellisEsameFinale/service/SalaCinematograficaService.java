package final_exam.SimonePellisEsameFinale.service;

import final_exam.SimonePellisEsameFinale.data.model.SalaCinematografica;

import java.util.List;
import java.util.Optional;

public interface SalaCinematograficaService {

    public List<SalaCinematografica> getAllSale();

    public Optional<SalaCinematografica> getSalaById(String idSala);

    public int calcoloIncassoSala(SalaCinematografica sala);

}
