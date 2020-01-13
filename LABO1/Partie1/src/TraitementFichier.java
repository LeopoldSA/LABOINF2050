import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TraitementFichier {
   public static Scanner fichier;

    static {
        try {
            fichier = new Scanner (new File("ListeLivres.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable");
        }
    }

    public TraitementFichier() throws FileNotFoundException {

    }


    public static void traitement(){
        while (fichier.hasNextLine()){
            String line = fichier.nextLine();
            System.out.println(line);
        }
        fichier.close();
    }

}
