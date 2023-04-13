public class Lumberjack{
    public Lumberjack(String name) {
        this.name = name;
    }

    String name;

    public Wood cutThree(Plant plant, LumberjackKits kits) {
        if (plant.type == Plant.Type.TreeStump) {
            System.out.println(this.name+": "+plant.getClass().getName() +" already cut down");
            return new Wood(0);
        }
        if (plant.type == Plant.Type.YoungTree) {
            System.out.println(this.name+": "+plant.getClass().getName() +" is too young. Рубить не буду!");
            return new Wood(0);
        }
        if (kits.status == LumberjackKits.Status.NotValid) {
            System.out.println(this.name+": Инструмент сломан. Отдыхаем");
            return new Wood(0);
        }
        if (kits.status == LumberjackKits.Status.Valid && plant.type == Plant.Type.Tree)  {
            if (plant instanceof Oak) {
                Wood result = ((Oak) plant).cutIt();
                plant.type = Plant.Type.TreeStump;
                return result;
            }
            if (plant instanceof Pine) {
                Wood result = ((Pine) plant).cutIt();
                plant.type = Plant.Type.TreeStump;
                return result;
            }
        }
        return new Wood(0);
    }
}
