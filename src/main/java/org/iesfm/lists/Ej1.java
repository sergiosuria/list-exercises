package org.iesfm.lists;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {

    private final static Logger log = LoggerFactory.getLogger(Ej1.class);

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("hola");
        words.add("adiós");
        words.add("qué");
        words.add("tal");

        for(String word: words) {
            log.info(word);
        }

    }
}
