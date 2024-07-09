/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_studio_danca.model;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author damen
 */
@Entity
@DiscriminatorValue("P")
public class Professor extends Pessoa {

    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataAdmissao;

    @OneToMany
    private Collection<Modalidade> modalidades;

    // colooquei também o atributo de professor na folha de pagamento
    // transformando em uma agregação
    @OneToMany(mappedBy = "professor")
    private Collection<FolhaPagamento> folhasPagamento;

    public Professor() {
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Collection<Modalidade> getModalidades() {
        return modalidades;
    }

    public void setModalidades(Collection<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }

    public Collection<FolhaPagamento> getFolhaPagamento() {
        return folhasPagamento;
    }

    public void setFolhaPagamento(Collection<FolhaPagamento> folhasPagamento) {
        this.folhasPagamento = folhasPagamento;
    }

}
