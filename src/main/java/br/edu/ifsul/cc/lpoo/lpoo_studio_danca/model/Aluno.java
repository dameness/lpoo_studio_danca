/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_studio_danca.model;

import java.util.Calendar;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;

/**
 *
 * @author damen
 */
@Entity
@DiscriminatorValue("A")
public class Aluno extends Pessoa {
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataInicio;
    private Integer diaPgto;

    public Aluno() {
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getDiaPgto() {
        return diaPgto;
    }

    public void setDiaPgto(Integer diaPgto) {
        this.diaPgto = diaPgto;
    }

}
