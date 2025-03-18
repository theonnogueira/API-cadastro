package com.project.pessoal.apicadastro.repository;

import com.project.pessoal.apicadastro.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
