package br.engcompjr.Controllers;

import br.engcompjr.Entities.Servico;
import br.engcompjr.Services.ServicosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServicosController {
    @Autowired
    ServicosService servicosService;
    @GetMapping("/servicos")
    public List<Servico> findAll() {
        return servicosService.findAll();
    }

    @PostMapping("/servicos")
    public Servico save(@RequestBody Servico servico) {
        return servicosService.save(servico);
    }

    @DeleteMapping("/servicos/{id}")
    public void delete(@PathVariable Long id) {
        servicosService.delete(id);
    }

    @PutMapping("/servicos/{id}")
    public Servico update(@PathVariable Long id, @RequestBody Servico servico) {
        return servicosService.update(id, servico);
    }
}