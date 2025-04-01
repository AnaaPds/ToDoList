package com.List.service;

import com.List.entity.Usuario;
import com.List.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    // Repositório para acessar os usuários no banco de dados
    public UsuarioRepository usuarioRepository;

    // Construtor que injeta o repositório de usuários
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Método para listar todos os usuários
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // Método para buscar um usuário por ID
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }


    // Método para salvar um novo usuário
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}

