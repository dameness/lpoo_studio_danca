package br.edu.ifsul.cc.lpoo.lpoo_studio_danca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.edu.ifsul.cc.lpoo.lpoo_studio_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_studio_danca.model.Modalidade;
import br.edu.ifsul.cc.lpoo.lpoo_studio_danca.model.Pagamento;
import java.util.Calendar;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damen
 */
public class TestPersistenciaPagamentos {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestPersistenciaPagamentos() {
    }
    
    @Before
    public void setUp() {
        jpa.conexaoAberta();
    }
    
    @After
    public void tearDown() {
        jpa.fecharConexao();
    }

    @Test
    public void testarPersistenciaProduto() throws Exception{
        Pagamento p = new Pagamento();
        p.setDataVcto(Calendar.getInstance());
        p.setValor(200.50);
        p.setDataPgto(Calendar.getInstance());
        jpa.persist(p);
        
        Pagamento persistidoP = (Pagamento)jpa.find(Pagamento.class, p.getId());
        
        Assert.assertEquals(p, persistidoP);
    }
}
