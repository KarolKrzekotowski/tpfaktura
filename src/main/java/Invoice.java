/**
 * klasa arraylist Invoice
 */

import java.util.ArrayList;

public class Invoice {

    private final int id;
    private final Client client;
    private final ArrayList<InvoiceElement> invoiceElements;

    public Invoice( final int id, final Client client, final ArrayList<InvoiceElement> invoiceElements) {

        this.id = id;
        this.client = client;
        this.invoiceElements = invoiceElements;
    }

    public Client getClient() {
        return client;
    }

    public int getId() {
        return id;
    }

    public ArrayList<InvoiceElement> getInvoiceElements() {
        return invoiceElements;
    }

    public double totalValue() {
        double ac = 0;
        for (final InvoiceElement element : invoiceElements) {
            ac += element.totalValue();
        }
        return  Math.floor(ac * 100) / 100;
    }


}