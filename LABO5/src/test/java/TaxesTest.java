import org.junit.jupiter.api.Test;
import java.lang.Throwable;
import static org.junit.jupiter.api.Assertions.*;

class TaxesTest {
    @Test
    public void testCalculTaxes0(){
     Throwable exception = assertThrows(IllegalArgumentException.class,()->Taxes.calculTaxes(0,true,true));
    }

    @Test
    public void testCalculTaxes1(){
        assertEquals(105,Taxes.calculTaxes(100,true,false));
    }

    @Test
    public void testCalculTaxes2(){
        assertEquals(110,Taxes.calculTaxes(100,false,true));
    }

    @Test
    public void testCalculTaxes3(){
        assertEquals(115,Taxes.calculTaxes(100,true,true));
    }
    @Test
    public void testCalculTaxesNeg(){
        Throwable exception = assertThrows(IllegalArgumentException.class,()->Taxes.calculTaxes(-3,true,true));
    }


}