package br.ufsm.csi.aulaspring.estaticos;

public enum Curso {

    DIREITO("Direito"),
    ADMINISTRACAO("Administração"),
    TECNOLOGIA("Ciência da Computação"),
    CONTABILIDADE("Contabilidade"),
    ENFERMAGEM("Enfermagem"),
    HISTORIA("Historia"),
    BIOLOGIA("Biologia"),
    HUMANAS("Sociologia");



    private String curso;

    private Curso(String curso) {
        this.curso = curso;
    }

}
