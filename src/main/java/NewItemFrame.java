/**
 * Klasa odpowiedzielna za wyswietlenia opcji dodaj artykul w oknie dodawania faktury
 * po kliknieciu dodaj zatwierdzamy itemki tymczasowe
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class NewItemFrame extends JFrame {
    private final JTextField nazwa = new JTextField(5);
    private final JTextField cena = new JTextField(5);
    private final JTextField ilosc = new JTextField(5);

     NewItemFrame() {
        super();
        setLayout(new GridLayout(5, 2));
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setBounds(0, 0, 300, 300);
        add(new Label("nazwa "));
        add(nazwa);
        add(new Label("cena "));
        add(cena);
        add(new Label("ilosc "));
        add(ilosc);
        add(new JButton("dodaj") {
            @Override
            protected void fireActionPerformed(final ActionEvent event) {
                confirmItem();
            }
        });
        setVisible(false);
    }

    private void confirmItem() {
        CreationAdapter.createItem(nazwa.getText(), cena.getText(), ilosc.getText());
        setVisible(false);
    }

}