/**
 * nasza gotowa baza danych
 */

import javax.management.BadAttributeValueExpException;
import java.util.ArrayList;

public class MockingLoader implements Loader {
    @Override
    public ArrayList<Invoice> loadInvoices() {
        ArrayList<InvoiceElement> newTab = new ArrayList<>();
        Invoice newInvoice = null;
        newTab.add(new InvoiceElement("Lays ", 3.99,  4));
        newTab.add(new InvoiceElement("Cheetos ", 0.99,  100));
        newTab.add(new InvoiceElement("Top Chips ",2 ,  2));
        try {
            newInvoice = new Invoice( 1, new Client("Karol", "Krzekotowski", new Address("Street", 1, 1, "Olesnica", "Polska", "12-345")), newTab);
        } catch (BadAttributeValueExpException ex) {
            System.out.println("MockingLoader: exception caught" + ex);
        }

        ArrayList<Invoice> mock = new ArrayList<>();
        mock.add(newInvoice);
        return mock;
    }

    @Override
    public int updateID() {
        return 1;
    }
}