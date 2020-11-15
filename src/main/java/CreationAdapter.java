/**
 *tworzymy tu naszego tymczasowego klienta i jego elementy, mozemy nie podawac danych, ale jezeli podamy bledne
 */

import java.util.ArrayList;

public abstract class CreationAdapter {
    private static Client tempClient;
    private static ArrayList<InvoiceElement> tempInvoiceElements = new ArrayList<>();

    public static void createClient(final String imie, final String nazwisko, final Address adres) {
        tempClient = ClientHandler.createClient(imie, nazwisko, adres);
    }

    public static Address createAddress(final String ulica, final String numerdomu, final String nrlokalu, final String miasto, final String kraj, final String kodpocztowy) {
        Address address = null;
        try {
            address =  new Address(ulica, Integer.parseInt(numerdomu), Integer.parseInt(nrlokalu), miasto, kraj, kodpocztowy);
        } catch (Exception ex) {
            System.out.println("Adapter: Exception caught" + ex);
        }
        return address;
    }

    public static void createItem(final String nazwa, final String cena,  final String ilosc) {
        try {
            tempInvoiceElements.add(new InvoiceElement(nazwa, Double.parseDouble(cena), Integer.parseInt(ilosc)));
        } catch (Exception ex) {
            System.out.println("Adapter2: Exception caught" + ex);
        }
    }

    public static void createInvoice() {
        InvoiceHandler.createInvoice(tempClient, tempInvoiceElements);
        tempClient = new Client();
        tempInvoiceElements = new ArrayList<>();
    }
}