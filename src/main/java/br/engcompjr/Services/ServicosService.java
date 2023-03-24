package br.engcompjr.Services;

import br.engcompjr.Entities.Servico;
import br.engcompjr.Repositories.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicosService {
    @Autowired
    ServicoRepository servicoRepository;
    public List<Servico> findAll() {
        return servicoRepository.findAll();
    }

    public Servico save(Servico servico) {
        return servicoRepository.save(servico);
    }

    public Servico update(Long id, Servico servico) {
        Servico servicoFounded = servicoRepository.findById(id).get();
        servicoFounded.setNome(servico.getNome());
        servicoFounded.setContato(servico.getContato());
        servicoFounded.setTipo(servico.getTipo());
        servicoFounded.setDescricao_cliente(servico.getDescricao_cliente());
        servicoFounded.setDescricao_recebimento(servico.getDescricao_recebimento());
        servicoFounded.setStatus(servico.getStatus());
        return servicoRepository.save(servicoFounded);
    }

    public void delete(Long id) {
        Servico servico = servicoRepository.findById(id).get();
        servicoRepository.delete(servico);
    }

}
