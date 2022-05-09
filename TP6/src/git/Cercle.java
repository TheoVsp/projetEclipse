package git;

/*
 * Classe avec différents calculs se rapportant aux cercles
 * Cercle.java                                              02/21
 */


/**
 * Cette classe contient des méthodes permettant de calculer le périmètre d'un
 * cercle, la surface d'un disque. Aucune vérification n'est faite sur la validité
 * des paramètres.
 * @author INFO1
 * @version 1.0
 */
public class Cercle {

    
    /**
     * Détermine le périmètre d'un cercle
     * @param leRayon un double égal au rayon du cercle
     * @return un double égal au périmètre du cercle
     */
    public static double perimetre(double leRayon) {
        return 2*Math.PI*leRayon;
    }

    
    /**
     * Détermine la surface d'un disque
     * @param leRayon un double égal au rayon du disque
     * @return un double égal à la surface du dsique
     */
    public static double surface(double leRayon) {
        return Math.PI*leRayon*leRayon;
    }
    
    /**
     * Détermine le volume d'un cylindre
     * @param leDiametre un double égal au diamètre du cylindre
     * @param laHauteur un double égal à la hauteur du cylindre
     * @return un double égal au volume du cylindre
     */
    public static double volume(double leDiametre, double laHauteur) {
        return surface(leDiametre / 2) * laHauteur;
    }

    
    /**
     * Détermine la surface de l'enveloppe du cylindre
     * @param leDiametre un double égal au diamètre du cylindre
     * @param laHauteur un double égal à la hauteur du cylindre
     * @return un double égal à la surface de l'enveloppe du cylindre
     */
    public static double enveloppe(double leDiametre, double laHauteur) {
        
        /*
         * on additionne la surface de la base multipliée par 2 et la 
         * surface du pourtour du cylindre
         */
        return surface(leDiametre / 2 ) * 2 
                       + perimetre(leDiametre / 2) * laHauteur;
    }

    
   


}
