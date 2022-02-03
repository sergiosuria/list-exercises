package org.iesfm.lists;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethodsTests {

    @Test
    public void addToBeginningTest() {
        // Preparación del escenario
        List<String> words = new LinkedList<>();
        words.add("Hola");
        words.add("Mundo");
        String word = "Adiós";
        // Ejecución del test
        List<String> res = ListMethods.addToBeginning(words, word);
        // Comprobaciones
        Assert.assertEquals(List.of("Adiós", "Hola", "Mundo"), res);
    }
}
