import java.io.IOException;
import java.util.ArrayList;




public class Principale {

    public static void main(String[] args) {
        try {


            String filename = args[0];
            ArrayList<Album> arrayAlbums = JsonParser.jsonFileToAlbums(filename);
            JsonParser.printStats(arrayAlbums);


        } catch (Exception e) {


            System.out.println("Erreur de lecture du fichier");
            System.out.println(e);

        }

        Writer.sortieJson();
    }
}