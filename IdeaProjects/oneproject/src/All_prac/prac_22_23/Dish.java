package All_prac.prac_22_23;

public final class Dish implements Item {
    private static final int DEFAULT_COST = 0;

    private final int cost;
    private final String name;
    private final String description;

    // Конструкторы
    public Dish(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Dish(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    // Методы
    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}