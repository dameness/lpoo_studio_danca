package br.edu.ifsul.cc.lpoo.lpoo_studio_danca;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import br.edu.ifsul.cc.lpoo.lpoo_studio_danca.dao.PersistenciaJPA;
import br.edu.ifsul.cc.lpoo.lpoo_studio_danca.model.Modalidade;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author damen
 */
public class TestPersistenciaModalidade {
    
    PersistenciaJPA jpa = new PersistenciaJPA();
    
    public TestPersistenciaModalidade() {
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
        Modalidade m = new Modalidade();
        m.setDescricao("teste");
        jpa.persist(m);
        
        Modalidade persistidaM = (Modalidade)jpa.find(Modalidade.class, m.getId());
        
        Assert.assertEquals(m, persistidaM);
    }
}
