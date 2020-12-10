package com.zaycodes;

public class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    public Language(String langName, int speakers, String regions, String wdOrder){
        this.name = langName;
        this.numSpeakers = speakers;
        this.regionsSpoken = regions;
        this.wordOrder = wdOrder;

    }

    public void getInfo(){

        System.out.println (this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");

        System.out.println("The language follows the word order: " + this.wordOrder);

    }


    /* public static void main (String [] args){
        Language spanish = new Language ("Spanish", 555000000, "Spain and Latin America", "subject-verb-object");
        spanish.getInfo();

        Mayan Huastec = new Mayan("Huastec", 161120);
        Huastec.getInfo();

        SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
        burmese.getInfo();
        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 920000000);
        mandarin.getInfo();
    } */


}
