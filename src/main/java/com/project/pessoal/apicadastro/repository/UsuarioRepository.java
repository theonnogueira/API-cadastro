package com.project.pessoal.apicadastro.repository;

import com.project.pessoal.apicadastro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
