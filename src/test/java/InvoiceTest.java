import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    @Test
        void testTotalValue1() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item1", 14.90,  10));
        testTab.add(new InvoiceElement("item2", 35,  10));
        testTab.add(new InvoiceElement("item3", 23.47, 10));
        Invoice test = new Invoice( 1, new Client(), testTab);
        assertEquals(733.7, test.totalValue());
    }

    @Test
        void testTotalValue2() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item4", 14,  10));
        testTab.add(new InvoiceElement("item5", 0.01,  10));
        testTab.add(new InvoiceElement("item6", 43,  10));
        testTab.add(new InvoiceElement("item7", 5.99,  10));
        Invoice test = new Invoice( 1, new Client(), testTab);
        assertEquals(630, test.totalValue());
    }

    @Test
        void testTotalValue3() {
        ArrayList<InvoiceElement> testTab = new ArrayList<>();
        testTab.add(new InvoiceElement("item8", 500,  10));
        testTab.add(new InvoiceElement("item9", 10.01, 10));
        Invoice test = new Invoice( 1, new Client(), testTab);
        assertEquals(5100.1, test.totalValue());
    }

}