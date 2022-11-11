package com.PooCourse.javaCoursePOO.controler.form;

import com.PooCourse.javaCoursePOO.modelo.Curso;
import com.PooCourse.javaCoursePOO.modelo.Topico;
import com.PooCourse.javaCoursePOO.repository.CursoRepository;
import com.PooCourse.javaCoursePOO.repository.TopicoRepository;
import org.hibernate.validator.constraints.Length;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotEmpty;

public class TopicoForm {

    @NotNull @NotEmpty @Length(min = 5)
    private String titulo;
    @NotNull @NotEmpty @Length(min = 15)
    private String mensagem;
    @NotNull @NotEmpty @Length(min = 5)
    private String nomeCurso;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
