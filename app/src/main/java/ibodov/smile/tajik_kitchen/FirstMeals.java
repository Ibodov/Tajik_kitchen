package ibodov.smile.tajik_kitchen;

public class FirstMeals {
    private int id;
    private String name;
//генерация конструктора
    public FirstMeals(int id, String name) {
        this.id = id;
        this.name = name;
    }
//генерация геттеров
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

// генерация сеттеров
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
