/**
 * Tu zaczynamy
 */
public abstract class Faktura {
    public static void main(final String[] args) {
        new MainFrame();
        InvoiceHandler.loadInvoicesFromDB();
    }
}