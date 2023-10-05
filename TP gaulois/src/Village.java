import java.util.ArrayList;

public class Village {
    private Museum museum = Museum.getInstance();
    static Village instance;

    private ArrayList<Neighborhood> neighborhoods = new ArrayList<>();

    private Village() {}

    static Village getInstance() {
        if (instance == null) {
            instance = new Village();
        }
        return instance;
    }

    public Museum getMuseum() {
        return this.museum;
    }

    public void createNeighborhood(String name) {
        this.neighborhoods.add(new Neighborhood(name));
    }

    public ArrayList<Neighborhood> getNeighborhoods() {
        return neighborhoods;
    }

    public Neighborhood getNeighborhood(String name) {
        for (Neighborhood neighborhood: neighborhoods) {
            if (neighborhood.getName() == name) {
                return neighborhood;
            }
        }
        return null;
    }
}
