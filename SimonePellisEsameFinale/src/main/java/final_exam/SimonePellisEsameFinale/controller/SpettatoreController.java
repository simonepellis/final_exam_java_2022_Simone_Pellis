package final_exam.SimonePellisEsameFinale.controller;

import final_exam.SimonePellisEsameFinale.data.model.Spettatore;
import final_exam.SimonePellisEsameFinale.data.request.essentials.SpettatoreInsertRequest;
import final_exam.SimonePellisEsameFinale.service.impl.SpettatoreServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/spettatore")
public class SpettatoreController {

    SpettatoreServiceImpl spettatoreService;

    public SpettatoreController(SpettatoreServiceImpl spettatoreService) {
        this.spettatoreService = spettatoreService;
    }

    @GetMapping("getAllSpettatori")
    public List<Spettatore> getAllSpettatori () {
        return spettatoreService.getAllSpettatori();
    }

    @GetMapping("getSpettaoreById")
    public Optional<Spettatore> getSpettatoreById (String idSpettatore) {
        return spettatoreService.getSpettatoreById(idSpettatore);
    }

    @GetMapping("/get-eta")
    public long getEtaSpettatore(String idSpettatore) {
        return spettatoreService.getEtaSpettatoreById(idSpettatore);
    }

    @GetMapping("/get-spettatori-maggiorenni")
    public List<Spettatore> getSpettatoriMaggiorenni() {
        return spettatoreService.getAllSpettatoriMaggiorenni();
    }

    @GetMapping("/is-spettatore-maggiorenne")
    public boolean isSpettatoreMaggiorenne(String idspettatore){
        return spettatoreService.isSpettatoreMaggiorenne(spettatoreService.getSpettatoreById(idspettatore).get());
    }
    @PostMapping("/insert-spettatore")
    public Spettatore insertSpettatore(@RequestBody SpettatoreInsertRequest request) {
        return spettatoreService.save(request.toSpettatore());
    }

}
