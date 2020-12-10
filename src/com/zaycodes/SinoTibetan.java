package com.zaycodes;

class SinoTibetan extends Language{

    public SinoTibetan(String languageN, int speakers){

        super(languageN, speakers, "Asia", "subject-object-verb");
        if (languageN.contains("Chinese"))
        {
            this.wordOrder = "subject-verb-object";
        }



    }
}
