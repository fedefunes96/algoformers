/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoformers;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author joaquintz
 */
public class AlgoformerTest {
    @Test(expected=NoSuperponibleException.class)
    public void testSuperponerLanzaExcepcion() {
        FabricaAlgoformers fabrica = new FabricaAlgoformers();	
        Algoformer alf = fabrica.crearOptimus();
        
        alf.superponer(alf);
    }
    
    @Test(expected=AtaqueInvalidoException.class)
    public void testAtacarAlgoformerMismoBando() {
    	FabricaAlgoformers fabrica = new FabricaAlgoformers();
    	Algoformer optimus = fabrica.crearOptimus();
    	Algoformer otro_optimus = fabrica.crearOptimus();
    	
    	optimus.atacar(otro_optimus);
    }
    @Test
    public void testAtacarAlgoformerDiferenteBando() {
    	FabricaAlgoformers fabrica = new FabricaAlgoformers();
    	Algoformer optimus = fabrica.crearOptimus();
    	Algoformer megatron = fabrica.crearMegatron();
    	
    	optimus.atacar(megatron);
    	
    	Assert.assertTrue(megatron.obtenerVida() == 500);	
    }  
}