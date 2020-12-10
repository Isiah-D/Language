package com.zaycodes;

public class Main {

    public static void main(String[] args) {
        Language spanish = new Language ("Spanish", 555000000, "Spain and Latin America", "subject-verb-object");
        spanish.getInfo();

        Mayan Huastec = new Mayan("Huastec", 161120);
        Huastec.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        burmese.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920000000);
        mandarin.getInfo();
    }
}
