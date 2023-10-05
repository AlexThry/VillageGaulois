import java.util.ArrayList;

public class Neighborhood {
    private String name;
    private String flagPath;
    private ArrayList<Villager> villagers = new ArrayList<>();

    public Neighborhood(String name, String flagPath) {
        this.name = name;
        this.flagPath = flagPath;
    }

    public Neighborhood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFlagPath() {
        return flagPath;
    }

    public ArrayList<Villager> getVillagers() {
        return villagers;
    }

    public Villager getVillager(int NNIG) {
        for (Villager villager: villagers) {
            if (villager.getNNIG() == NNIG) {
                return villager;
            }
        }
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlagPath(String flagPath) {
        this.flagPath = flagPath;
    }

    public void addVillager(int NNIG, String name) {
        villagers.add(new Villager(NNIG, name));
    }

    public void removeVillager(int NNIG) {
        for (Villager villager: villagers) {
            if (villager.getNNIG() == NNIG) {
                this.villagers.remove(villager);
            }
        }
    }
}
