package br.ufsm.csi.aulaspring.estaticos;

public enum Turno {

    MATUTINO("Matutino"),
    NOTURNO("Noturno");

    private String turno;

    private Turno(String turno) {
        this.turno = turno;
    }
}
