public abstract class ClientHandler {

    public static Client createClient(final String imie, final String nazwisko, final Address adres) {
        Client client = null;
        try {
            client = new Client(imie, nazwisko, adres);
        } catch (Exception ex) {
            System.out.println("ClientHandler: Exception caught" + ex);
        }
        return client;
    }
}