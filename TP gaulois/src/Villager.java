public class Villager {
    private int NNIG;
    private String name;
    private String street;
    private String streetNumber;
    private String civilStatus;

    public Villager(int NNIG, String name, String street, String streetNumber, String civilStatus) {
        this.NNIG = NNIG;
        this.name = name;
        this.street = street;
        this.streetNumber = streetNumber;
        this.civilStatus = civilStatus;
    }

    public Villager(int NNIG, String name) {
        this.NNIG = NNIG;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Villager{" +
                "NNIG=" + NNIG +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNNIG() {
        return NNIG;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getCivilStatus() {
        return civilStatus;
    }
}
