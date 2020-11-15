import java.util.ArrayList;

public abstract class InvoiceHandler {
    private static ArrayList<Invoice> invoices = new ArrayList<>();
    private static int invoiceId = 0;

    public static void createInvoice( final Client client, final ArrayList<InvoiceElement> invoiceElements) {
        invoiceId++;
        invoices.add(new Invoice( invoiceId, client, invoiceElements));
    }


    public static void loadInvoicesFromDB() {
        Loader loader = new MockingLoader();
        invoices = loader.loadInvoices();
        invoiceId = loader.updateID();
    }

    public static ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public static Invoice getInvoice(final int id) {
        return invoices.get(id - 1);
    }
}