package com.List.controller;

import com.List.entity.Tarefas;
import com.List.service.TarefasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefasController {

    // Declara o serviço de tarefas
    public TarefasService tarefasService;

    // Construtor que injeta o serviço de tarefas
    public TarefasController(TarefasService tarefaService) {
        this.tarefasService = tarefaService;
    }

    // Método GET para listar todas as tarefas
    @GetMapping
    public List<Tarefas> listarTarefas() {
        return tarefasService.listarTarefas();
    }

    // Método GET para buscar uma tarefa pelo ID
    @GetMapping("/{id}")
    public Tarefas buscarTarefaPorId(@PathVariable Long id) {
        return tarefasService.buscarTarefaPorId(id);
    }


    // Método POST para criar uma nova tarefa
    @PostMapping
    public Tarefas criarTarefa(@RequestBody Tarefas tarefa) {
        return tarefasService.salvarTarefa(tarefa);
    }
}

