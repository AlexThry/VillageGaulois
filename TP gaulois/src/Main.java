public class Main {
    public static void main(String[] args) {
        // Récupération de l'instance du village (singleton)
        Village village = Village.getInstance();

        // Ajout d'un quartier
        village.createNeighborhood("Villétorix");
        Neighborhood villetorix = village.getNeighborhood("Villétorix");

        // Ajout d'un villageois
        villetorix.addVillager(1, "Obélix");
        Villager obelix = villetorix.getVillager(1);

        // Ajout d'une bataille
        Battle battleOfTheSaintCropField = new Battle("Battle of the saint cropfield", 12031200, "Village");

        //Ajout d'un trophée
        Trophee usedSergentGoldenHelmet = new Helmet(obelix, battleOfTheSaintCropField, Status.EN_STOCK, "Casque de sergent usé","Sergent", "used");

        // Décoration du trophé
        usedSergentGoldenHelmet = new ColorDecorator(usedSergentGoldenHelmet, "Blue");
        usedSergentGoldenHelmet = new ColorDecorator(usedSergentGoldenHelmet, "Green");


        // Récupération de l'instance du musée (singleton)
        Museum museum = village.getMuseum();

        // Enregistrement du trophée
        museum.itemRegistration(usedSergentGoldenHelmet);


        System.out.println(usedSergentGoldenHelmet.getShape());
        System.out.println(museum.getTrophees());

    }
}