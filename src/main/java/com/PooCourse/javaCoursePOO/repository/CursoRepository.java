package com.PooCourse.javaCoursePOO.repository;

import com.PooCourse.javaCoursePOO.modelo.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso,Long> {
    Curso findByNome(String nome);
}
