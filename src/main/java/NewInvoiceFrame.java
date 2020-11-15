/**
 * okno tworzenia nowej faktury
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class NewInvoiceFrame extends JFrame {
    private final NewItemFrame newItem = new NewItemFrame();
    private final JTextField Imie = new JTextField(15);
    private final JTextField Nazwisko = new JTextField(20);
    private final JTextField Ulica = new JTextField(30);
    private final JTextField Miasto = new JTextField(15);
    private final JTextField Kraj = new JTextField(15);
    private final JTextField Kodpocztowy = new JTextField(6);
    private final JTextField Numerdomu = new JTextField(5);
    private final JTextField Numerlokalu = new JTextField(5);

    NewInvoiceFrame() {
        super();
        setLayout(new GridLayout(10, 2));
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(0, 0, 300, 600);
        add(new JLabel("Imie: "));
        add(Imie);
        add(new JLabel("Nazwisko: "));
        add(Nazwisko);
        add(new JLabel("Adres"));
        add(new JLabel());
        add(new JLabel("Ulica: "));
        add(Ulica);
        add(new JLabel("numer domu: "));
        add(Numerdomu);
        add(new JLabel("numer lokalu: "));
        add(Numerlokalu);
        add(new JLabel("Miasto: "));
        add(Miasto);
        add(new JLabel("Kraj: "));
        add(Kraj);
        add(new JLabel("Kod pocztowy: "));
        add(Kodpocztowy);
        add(new JButton("dodaj artykul") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                addItemToInvoice();
            }
        });
        add(new JButton("zatwierdz") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                confirmInvoice();
            }
        });
        setVisible(false);
    }

    private void addItemToInvoice() {
        newItem.setVisible(true);
    }
    private void confirmInvoice() {
        final Address adres = CreationAdapter.createAddress(Ulica.getText(), Numerdomu.getText(), Numerlokalu.getText(), Miasto.getText(), Kraj.getText(), Kodpocztowy.getText());
        if (adres != null) {
            CreationAdapter.createClient(Imie.getText(), Nazwisko.getText(), adres);
            CreationAdapter.createInvoice();
        }
        setVisible(false);
    }
}