package br.ufsm.csi.aulaspring.estaticos;

public enum Status {

    ATIVO("Ativo"),
    INATIVO("Inativo");

    private String status;

    private Status(String status) {
        this.status = status;
    }
}
