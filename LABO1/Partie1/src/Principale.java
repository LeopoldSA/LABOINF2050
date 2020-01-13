import java.util.Scanner;

public class Principale {
    public static void main (String[] args){
        //Faire un HelloWorld
        System.out.println ("Hello world");

        //Permuter deux valeurs de deux variables de type int
        System.out.println("Veuillez entrer 2 entiers:");
        Scanner sc1 = new Scanner(System.in);
        int valeur1 = sc1.nextInt();
        Scanner sc2 = new Scanner (System.in);
        int valeur2 = sc2.nextInt();
        System.out.println ("Avant permutation:"+valeur1+" "+valeur2);

        int temp = valeur1 ;
        valeur1 = valeur2;
        valeur2 = temp;

        System.out.println ("Après permutation:"+valeur1+" "+valeur2);

        //Lecture et affichage d'un fichier text
        TraitementFichier.traitement();

    }
}
