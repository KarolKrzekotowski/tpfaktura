import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class InvoiceElementTest {

    @Test
        void testTotalValue1() {
        InvoiceElement test = new InvoiceElement("Top Chips", 3.89,  2);
        assertEquals(7.78, test.totalValue());
    }

    @Test
        void testTotalValue2() {
        InvoiceElement test = new InvoiceElement("Lays", 1.99,  10);
        assertEquals(19.9, test.totalValue());
    }

    @Test
        void testTotalValue3() {
        InvoiceElement test = new InvoiceElement("Haribo", 5.70,  2);
        assertEquals(11.4, test.totalValue());
    }


}