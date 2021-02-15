import java.util.HashMap;

public class Animal {

    private static HashMap<String, Integer> mapAnimalCounts = new HashMap<String, Integer>();
    protected int maxSwimDistance;
    protected int maxRunDistance;
    protected String name;

    public Animal(String name) {
        this.name = name;
        if (mapAnimalCounts.containsKey(this.getClass().getName()))
            mapAnimalCounts.put(this.getClass().getName(), mapAnimalCounts.get(this.getClass().getName()) + 1);
        else
            mapAnimalCounts.put(this.getClass().getName(), 1);
    }

    public static final int getCountCreatedAnimal(String className) {
        return mapAnimalCounts.get(className);
    }

    public static final int getCountCreatedAnimalAndChilds() {
        int count = 0;
        for (int i : mapAnimalCounts.values()) {
            count = count + i;
        }
        return count;
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance)
            System.out.println(name + " проплыл " + distance + " м.");
        else
            System.out.println(name + " не может проплыть " + distance + " м. Максимальная дистанция " + maxSwimDistance + " м.");
    }

    public void run(int distance) {
        if (distance <= maxRunDistance)
            System.out.println(name + " пробежал " + distance + " м.");
        else
            System.out.println(name + " не может пробежать " + distance + " м. Максимальная дистанция " + maxRunDistance + " м.");
    }
}
