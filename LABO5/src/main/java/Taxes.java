import java.lang.Throwable;

public class Taxes {




    public static long calculTaxes (long sous, boolean taxeFed, boolean taxeProv){
        long resultat = sous;
        if (resultat <= 0){
           throw new IllegalArgumentException("Montant incorrect");
        }else {

            if (taxeFed) resultat += Math.round(sous * 0.05);
            if (taxeProv) resultat += Math.round(sous * 0.09975);

        }
        return resultat;
    }
}
