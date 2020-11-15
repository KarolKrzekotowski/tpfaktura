import javax.management.BadAttributeValueExpException;

/**
 * klasa z danymi naszego klienta
 */
public class Client {
    private final String Imie;
    private final String Nazwisko;
    private final Address Adres;

    public Client() {
        Imie = "";
        Nazwisko = "";
        Adres = new Address();
    }

    public Client(final String Imie, final String Nazwisko, final Address Adres) throws BadAttributeValueExpException {
        if (!(validate( Adres))) {
            throw new BadAttributeValueExpException("adres");
        }
        this.Imie = Imie;
        this.Nazwisko = Nazwisko;
        this.Adres = Adres;
    }

    public String getName() {
        return Imie;
    }

    public Address getAddress() {
        return Adres;
    }


    public String getSurname() {
        return Nazwisko;
    }

    private boolean validate( final Address address) {
        return checkAddress(address);
    }

    private boolean checkAddress(final Address address) {
        return Address.check(address);
    }
}