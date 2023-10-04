public class Main {
    public static void main(String[] args) {
        Village village = Village.getInstance();
        Villager obelix = new Villager(1, "Obelix");
        Battle battleOfTheSaintCropField = new Battle("Battle of the saint cropfield", 12031200, "Village");
        Trophee usedSergentGoldenHelmet = new Helmet(obelix, battleOfTheSaintCropField, Status.EN_STOCK, "Casque de sergent usé","Sergent", "used");

        usedSergentGoldenHelmet = new ColorDecorator(usedSergentGoldenHelmet, "Blue");
        usedSergentGoldenHelmet = new ColorDecorator(usedSergentGoldenHelmet, "Green");


        System.out.println(usedSergentGoldenHelmet.getShape());

        Museum museum = village.getMuseum();

        museum.itemRegistration(usedSergentGoldenHelmet);
        System.out.println(museum.getTrophees());

    }
}