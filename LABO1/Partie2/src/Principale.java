import java.io.IOException;

public class Principale {
    public static void main (String[] args) throws IOException {
        System.out.println(Utf8File.loadFileIntoString("ListeLivres.txt"));

    }

}

