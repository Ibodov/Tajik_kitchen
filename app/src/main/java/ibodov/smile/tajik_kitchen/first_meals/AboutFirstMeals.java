package ibodov.smile.tajik_kitchen.first_meals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import ibodov.smile.tajik_kitchen.R;

public class AboutFirstMeals extends AppCompatActivity {

    public static final String FIRST_MEAL_ID = "firstMeal_id";
    public static final String NAME_FIRST_MEAL = "firstMeal_name";
    public static final String DESCRIPTION_FIRST_MEAL = "description_first_meal";
//    public static final String IMAGE_ID = "Image_id";


    //private ImageView aboutImage;
    private TextView name_firstMeal;
    private TextView description_firstMeal;
//    private ImageView imageId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_first_meals);

       // aboutImage =findViewById(R.id.about_icon);
        name_firstMeal = findViewById(R.id.name_firstMeal);
        description_firstMeal = findViewById(R.id.description_firstMeal);
//        imageId = findViewById(R.id.about_icon);

        Intent intent = getIntent();
        String name =intent.getStringExtra(NAME_FIRST_MEAL);
        String description = intent.getStringExtra(DESCRIPTION_FIRST_MEAL);


        name_firstMeal.setText(name);
        description_firstMeal.setText(description);



    }
}