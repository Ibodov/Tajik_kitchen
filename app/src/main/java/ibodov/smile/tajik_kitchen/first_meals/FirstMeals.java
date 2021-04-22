package ibodov.smile.tajik_kitchen.first_meals;

public class FirstMeals {
    private int id;
    private String name;
    private int imageId;
    private String description;


    //генерация конструктора
    public FirstMeals(int id, String name, int imageId, String description) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
        this.description = description;

    }
//генерация геттеров
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getImageId() { return imageId;}
    public String getDescription() {
        return description;
    }

    // генерация сеттеров
    public void setId(int id) {
        this.id = id;    }
    public void setName(String name) {
        this.name = name;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public void setDescription(String description) { this.description = description;}
}
