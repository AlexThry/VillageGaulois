public class Battle {
    private String name;
    private int date;
    private String location;
    private int endDate;

    public Battle(String name, int date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.endDate = date;
    }

    public Battle(String name, int date, String location, int endDate) {
        this.name = name;
        this.date = date;
        this.location = location;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Battle{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public int getEndDate() {
        return endDate;
    }
}
