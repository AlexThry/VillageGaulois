import java.util.zip.ZipEntry;

enum Status{EN_STOCK, PERDU, EMPRUNTE};
public abstract class Trophee {
    private Villager owner;
    private Battle battle;
    private Status status;
    private String name;

    public Trophee(Villager owner, Battle battle, Status status, String name) {
        this.owner = owner;
        this.battle = battle;
        this.status = status;
        this.name = name;
    }

    @Override
    public String toString() {

        return "Trophee{" +
                "owner=" + owner +
                ", name" + name +
                ", battle=" + battle +
                ", status='" + status + '\'' +
                ", shape='" + this.getShape() +
                "'}";
    }


    public Villager getOwner() {
        return owner;
    }

    public Battle getBattle() {
        return battle;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getShape();
}
