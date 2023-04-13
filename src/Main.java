import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        * Сделать:
        * Класс древесина с параметром объем
        * Абстрактный класс Растения с параметром высота
        * Общий метод измерения высоты
        * Классы Дуб, Сосна, Герань
        * Интерфейс для рубки деревьев с получением древесины
        * Для Дуба и Сосны вычислять объём извлекаемой
        * при рубке древесины в зависимости от высоты
        *
        * В текстовом файле записаны строки, названия и высоту растений
        * Загрузить все растения в массив отдельно сделать список подлежащих вырубке
        * Создать лесоруба который сможет рубить только при наличии инструмента
        * Вычислить, каков суммарный объем древесины можно получить,
        * если вырубить все дубы и сосны
        * */
        ArrayList<Plant> forest = new ArrayList<>();
        forest.add(new Oak(10));
        forest.add(new Oak(15));
        forest.add(new Oak(0.5, Plant.Type.TreeStump));
        forest.add(new Oak(2));
        forest.add(new Oak(0.2, Plant.Type.TreeStump));
        forest.add(new Pine(0.1, Plant.Type.YoungTree));
        forest.add(new Pine(0.3, Plant.Type.TreeStump));
        forest.add(new Pine(13));
        forest.add(new Geranium(0.2));
        forest.add(new Geranium(0.15));
        Lumberjack l1 = new Lumberjack("Вася");
        LumberjackKits k1 = new LumberjackKits();
        Wood totalWood = new Wood(0);
        for (Plant p:
             forest) {
            totalWood.addWood(l1.cutThree(p, k1));
//            System.out.println(l1.cutThree(p, k1).volume);
        }
        System.out.println(totalWood.volume);
    }
}