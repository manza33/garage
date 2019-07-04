package com.company;

public class Hangar {


    public static void main(String[] args) {

        Vehicle zodiac = new Boat("Zodiac 66", 100);
        Vehicle Cox = new Car("WV beettle", 150);

        System.out.println(zodiac.soStuff());
        System.out.println(Cox.soStuff());
    }


}






/*
Pour chacune des références, affiche dans le terminal le résultat de l'appel de la méthode doStuff()
Compile et teste Hangar : quand tout fonctionne, crée un dépôt git et envoie le tout sur GitHub
Partage le lien du dépôt GitHub en solution
Exemple de résultat attendu lors de l'exécution de Hangar :

$ Je suis Clio et je fais vroum vroum !
$ Je suis Titanic et je fais glou glou !

 */