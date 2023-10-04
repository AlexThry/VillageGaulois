public class Helmet extends Trophee {
    private String grade;
    private String Condition;

    public Helmet(Villager owner, Battle battle, Status status, String name, String grade, String condition) {
        super(owner, battle, status, name);
        this.grade = grade;
        Condition = condition;
    }

    @Override
    public String getShape() {
        return "casque";
    }
}
