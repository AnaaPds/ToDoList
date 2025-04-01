package com.List.service;

import com.List.entity.Tarefas;
import com.List.repository.TarefasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {

    // Repositório para acessar as tarefas no banco de dados
    public TarefasRepository tarefasRepository;

    // Construtor que injeta o repositório de tarefas
    public TarefasService(TarefasRepository tarefaRepository) {
        this.tarefasRepository = tarefaRepository;
    }

    // Método para listar todas as tarefas
    public List<Tarefas> listarTarefas() {
        return tarefasRepository.findAll();
    }

    // Método para buscar uma tarefa por ID
    public Tarefas buscarTarefaPorId(Long id) {
        return tarefasRepository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }


    // Método para salvar uma nova tarefa
    public Tarefas salvarTarefa(Tarefas tarefa) {
        return tarefasRepository.save(tarefa);
    }
}
