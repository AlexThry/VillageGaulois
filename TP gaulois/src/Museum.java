import java.util.ArrayList;

public class Museum {
    static Museum instance;
    private ArrayList<Trophee> trophees = new ArrayList<>();

    private Museum() {}

    public static Museum getInstance() {
        if (instance == null) {
            instance = new Museum();
        }
        return instance;
    }

    public void itemRegistration(Trophee trophee) {
        this.trophees.add(trophee);
    }

    public void itemSuppression(Trophee trophee) {
        if (this.trophees.contains(trophee)) {
            this.trophees.remove(trophee);
        }
    }

    public ArrayList<Trophee> getTrophees() {
        return trophees;
    }
}
