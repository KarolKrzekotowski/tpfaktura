import java.util.ArrayList;

public interface Loader {

    ArrayList<Invoice> loadInvoices();
    int updateID();
}