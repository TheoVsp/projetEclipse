package git;

/*
 * Classe avec diff�rents calculs se rapportant aux cercles
 * Cercle.java                                              02/21
 */


/**
 * Cette classe contient des m�thodes permettant de calculer le p�rim�tre d'un
 * cercle, la surface d'un disque. Aucune v�rification n'est faite sur la validit�
 * des param�tres.
 * @author INFO1
 * @version 1.0
 */
public class Cercle {

    
    /**
     * D�termine le p�rim�tre d'un cercle
     * @param leRayon un double �gal au rayon du cercle
     * @return un double �gal au p�rim�tre du cercle
     */
    public static double perimetre(double leRayon) {
        return 2*Math.PI*leRayon;
    }

    
    /**
     * D�termine la surface d'un disque
     * @param leRayon un double �gal au rayon du disque
     * @return un double �gal � la surface du dsique
     */
    public static double surface(double leRayon) {
        return Math.PI*leRayon*leRayon;
    }
    
    /**
     * D�termine le volume d'un cylindre
     * @param leDiametre un double �gal au diam�tre du cylindre
     * @param laHauteur un double �gal � la hauteur du cylindre
     * @return un double �gal au volume du cylindre
     */
    public static double volume(double leDiametre, double laHauteur) {
        return surface(leDiametre / 2) * laHauteur;
    }

    
    /**
     * D�termine la surface de l'enveloppe du cylindre
     * @param leDiametre un double �gal au diam�tre du cylindre
     * @param laHauteur un double �gal � la hauteur du cylindre
     * @return un double �gal � la surface de l'enveloppe du cylindre
     */
    public static double enveloppe(double leDiametre, double laHauteur) {
        
        /*
         * on additionne la surface de la base multipli�e par 2 et la 
         * surface du pourtour du cylindre
         */
        return surface(leDiametre / 2 ) * 2 
                       + perimetre(leDiametre / 2) * laHauteur;
    }

    
   


}
