package br.ufsm.csi.aulaspring.model;

import br.ufsm.csi.aulaspring.estaticos.Curso;
import br.ufsm.csi.aulaspring.estaticos.Status;
import br.ufsm.csi.aulaspring.estaticos.Turno;
import com.sun.istack.NotNull;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.Entity;


@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome")
    @Size(min = 5, max = 35, message = "O Nome deve conter entre 5 a 35 caracteres")
    @NotBlank(message = "O nome não pode ser vazio")
    @NotNull
    private String nome;

    @Column(name = "matricula")
    @NotNull
    @Size(min = 3, message = "É necessário Gerar o número de matricula")
    private String matricula;

    @Column(name = "curso")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Curso curso;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Status status;

    @Column(name = "turno")
    @Enumerated(EnumType.STRING)
    @NotNull
    private Turno turno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
