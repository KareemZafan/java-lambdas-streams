package chapter_4;

public class Dish {
    private final String name;
    private final boolean vegetarian;
    private final double calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, double caloires, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = caloires;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type {MEAT, FISH, OTHER}

}
