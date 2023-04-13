public class Lumberjack{
    public Lumberjack(String name) {
        this.name = name;
    }

    String name;

    public Wood cutThree(Plant plant, LumberjackKits kits) {
        if (kits.status == LumberjackKits.Status.Valid)  {
            if (plant instanceof Oak) {
                plant.type = Plant.Type.TreeStump;
                return ((Oak) plant).cutIt();
            }
            if (plant instanceof Pine) {
                plant.type = Plant.Type.TreeStump;
                return ((Pine) plant).cutIt();
            }
            if (plant.type == Plant.Type.YoungTree) {
                System.out.println(plant.getClass().getName() +" is too young");
                return new Wood(0);
            }
            if (plant.type == Plant.Type.TreeStump) {
                System.out.println(plant.getClass().getName() +" already cut down");
                return new Wood(0);
            }
        }
        return new Wood(0);
    }
}
