/*
 * Classe pour tester les méthodes de la classe Cercle
 * UtiliseCercle.java
 */
package git;

import java.util.Scanner;

/**
 * Cette classe contient une fonction pour effectuer quelques tests des méthodes
 * perimetre et surface de la classe Cercle. 
 * @author INFO1
 * @version 1.0
 */
public class UtiliseCercle {

   
    /**
     * Programme principal
     * @param args non utilisé
     */
    public static void main(String[] args) {
        
        // déclaration d'un objet Scanner pour effectuer les saisies
        Scanner entree = new Scanner(System.in);

        double rayon;           // rayon du cercle entré par l'utilisateur
               

        // saisie du rayon du cercle
        System.out.print("Donnez le rayon du cercle : ");
        rayon = entree.nextDouble();

        // affichage des résultats : périmètre et surface du cercle
        System.out.println("Le perimetre du cercle est "
                           + Cercle.perimetre(rayon) 
                           + "\nLa surface du disque est "
                           + Cercle.surface(rayon));       

    }

}
