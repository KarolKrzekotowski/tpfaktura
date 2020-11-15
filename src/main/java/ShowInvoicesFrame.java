/**
 * klasa odpowiedzialna za otworzenie okna z fakturami, ktore chcemy wyswietlic
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ShowInvoicesFrame extends JFrame {

     ShowInvoicesFrame() {
        super();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setBounds(0, 0, 300, 600);
        updateInvoices();
        setVisible(true);
    }

    /**
     * @funkcja, ktora w tym oknie wyswietla wszystkie zapisane faktury, klikniemy wyswietl i ja otwieramy
     */
    private void updateInvoices() {
        for (final Invoice faktury : InvoiceHandler.getInvoices()) {
            final int id = faktury.getId();
            add(new JLabel(String.valueOf(id)));
            add(new JButton("Wyswietl") {
                @Override
                protected void fireActionPerformed(final ActionEvent event) {
                    openInvoice(id);
                }
            });
        }
        setLayout(new GridLayout(InvoiceHandler.getInvoices().size(), 2));
        setBounds(0, 0, 300, 80 * InvoiceHandler.getInvoices().size());
    }

    /**
     *
     * @funkcja otwieramy wybrana fakture
     */
    private void openInvoice(final int id) {
        new InvoiceDialog(InvoiceHandler.getInvoice(id));
    }
}