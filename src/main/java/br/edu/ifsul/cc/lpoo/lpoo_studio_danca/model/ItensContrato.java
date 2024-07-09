/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_studio_danca.model;

import java.io.Serializable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author damen
 */
public class ItensContrato implements Serializable {
    
    @ManyToOne
    @JoinColumn(name="contrato_id")
    private Contrato contrato;
    
    @ManyToOne
    @JoinColumn(name="pacote_id")
    private Pacote pacote;

    public ItensContrato() {
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }
    
    
}
