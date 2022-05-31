package br.inatel.cdg;

import br.inatel.cdg.exception.NotaInsuficienteException;

import java.util.HashMap;
import java.util.Map;

public class ListaMapa {
    private String nomeProjeto;
    private double nota;

    public ListaMapa() {
        this.nomeProjeto = nomeProjeto;
        this.nota = nota;
    }

    public ListaMapa(Map<String, Double> listaFETIN) {
        this.listaFETIN = listaFETIN;
    }

    Map<String, Double> listaFETIN = new HashMap<String, Double>();

    public void listaAdd (String nomeProjeto, double nota) throws NotaInsuficienteException {
        if (nota >= 60) {
            listaFETIN.put(this.nomeProjeto, this.nota);
        }else{
            throw new NotaInsuficienteException("Nota Insuficiente");
        }
    }

    public void setNomeProjeto(String nome) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
