/**
 *klasa arraylist naszych elementow wewnatrz faktury
 */
public class InvoiceElement {
    private final String nazwa;
    private final double cena;
    private final int ilosc;

    public InvoiceElement(final String nazwa, final double cena,  final int ilosc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.ilosc = ilosc;
    }

    public double getPrice() {
        return cena;
    }
    public String getName() {
        return nazwa;
    }
    public int getQuantity() {
        return ilosc;
    }

    double totalValue() {
        return ilosc * cena;
    }
}