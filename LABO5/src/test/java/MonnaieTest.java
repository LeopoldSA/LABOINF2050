import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonnaieTest {
    @Test
    public void testSoustraction(){
        Monnaie montant1 = new Monnaie(100);
        Monnaie montant2 = new Monnaie(50);
        assertEquals(50, montant1.soustraire(montant2).getSous());
    }
    @Test
    public void testAddition(){
        Monnaie montant1 = new Monnaie(100);
        Monnaie montant2 = new Monnaie(50);
        assertEquals(150, montant1.additionner(montant2).getSous());
    }
    @Test
    public void testToString(){
        Monnaie montant = new Monnaie(222222222);
        assertEquals("2222222,22$", montant.toString());
    }
    @Test
    public void testToStringDixCents(){
        Monnaie montant = new Monnaie(3505);
        assertEquals("35,05$", montant.toString());
    }

    public void testPourcentageRond(){
        Monnaie montant_1 = new Monnaie(100);
        assertEquals(25, montant_1.pourcentage(25));
    }
    public void testPourcentage(){
        Monnaie montant_1 = new Monnaie(100);
        assertEquals(33.33, montant_1.pourcentage(33.33));
    }

}