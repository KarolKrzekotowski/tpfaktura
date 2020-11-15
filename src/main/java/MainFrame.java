/**
*główne okno, wybieramy tu pomiedzy opcjami dodaj i pokaz fakture
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    private final JButton DodajFakture = new JButton("dodaj fakture") {
        @Override
        protected void fireActionPerformed(final ActionEvent event) {
            CreateInvoices();
        }
    };

    private final JButton Pokazfakture = new JButton("Pokaz fakture") {
        @Override
        protected void fireActionPerformed(final ActionEvent event) {
            ShowInvoices();
        }
    };

    public MainFrame() {
        super();
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0, 0, 300, 200);
        add(Pokazfakture);
        add(DodajFakture);
        setVisible(true);
    }

    private void ShowInvoices() {
        new ShowInvoicesFrame();
    }

    private void CreateInvoices() {
       new NewInvoiceFrame().setVisible(true);
    }


}