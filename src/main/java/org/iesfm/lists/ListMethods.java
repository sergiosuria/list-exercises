package org.iesfm.lists;

import java.util.List;

public class ListMethods {

    /**
     * Ejercicio 2. Escribe un método que dada una lista de String y un String y lo inserte en la primera posición.
     * Crea tests para probar este método
     *
     * @param words La lista original
     * @param word  La palabra que se va a añadir
     * @return La lista modificada
     */
    public static List<String> addToBeginning(List<String> words, String word) {
        words.add(0, word);
        return words;
    }
}
