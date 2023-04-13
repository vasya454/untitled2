public class Lumberjack{
    String name;

    public Wood cutThree(Plant plant, LumberjackKits kits) {
        if (plant.type == Plant.Type.Tree && kits.status == LumberjackKits.Status.Valid)  {
            if (plant instanceof Oak) {
                plant.type = Plant.Type.TreeStump;
                return ((Oak) plant).cutIt();
            }
            if (plant instanceof Pine) {
                plant.type = Plant.Type.TreeStump;
                return ((Pine) plant).cutIt();
            }
        }
        if (plant.type == Plant.Type.YoungTree) {
            System.out.println(plant.getClass().getName() +" ещё рано рубить");
            return new Wood(0);
        }
        if (plant.type == Plant.Type.TreeStump) {
            System.out.println(plant.getClass().getName() +" уже вырублен");
            return new Wood(0);
        }
        return new Wood(0);
    }
}
