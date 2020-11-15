/**
 * okno naszej nowo otwartej faktury z klasy showinvoices
 */

import javax.swing.*;
import java.awt.*;

class InvoiceDialog extends JDialog {


     InvoiceDialog(final Invoice invoice) {
        super();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(0, 0, 300, 600);

        final JPanel info = new JPanel();
        info.setLayout(new GridLayout(9, 1));
        info.add(new JLabel("id: " + invoice.getId()));
        info.add(new JLabel("Klient"));
        info.add(new JLabel("Imie: " + invoice.getClient().getName()));
        info.add(new JLabel("Nazwisko: " + invoice.getClient().getSurname()));
        info.add(new JLabel("adres: "));
        info.add(new JLabel("Ulica: " + invoice.getClient().getAddress().getStreet() + " " + invoice.getClient().getAddress().getHouseNr() + "/" + invoice.getClient().getAddress().getFlatNr()));
        info.add(new JLabel("Miasto: " + invoice.getClient().getAddress().getCity()));
        info.add(new JLabel("Kraj:"+   invoice.getClient().getAddress().getCountry()));
        info.add(new JLabel("kod pocztowy: " + invoice.getClient().getAddress().getPostalCode()));
        add(info);

        final JPanel items = new JPanel();
        items.add(new JLabel("nazwa "));
        items.add(new JLabel("cena "));
        items.add(new JLabel("ilosc "));
        int i = 1;
        for (final InvoiceElement item : invoice.getInvoiceElements()) {
            items.add(new JLabel(item.getName()));
            items.add(new JLabel(String.valueOf(item.getPrice())));
            items.add(new JLabel(String.valueOf(item.getQuantity())));
            i++;
        }
        items.setLayout(new GridLayout(i, 3));
        add(items);
        add(new JLabel("Koszt  " + invoice.totalValue() + " zl"));
        setVisible(true);
    }
}