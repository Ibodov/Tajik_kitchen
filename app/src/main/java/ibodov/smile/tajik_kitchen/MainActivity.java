package ibodov.smile.tajik_kitchen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

//    ImageButton firstMeal;
//    ImageButton secondMeal;

    Button firstMeal;
    Button secondMeal;
    Button salads;

    //    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstMeal = findViewById(R.id.first_meal);
        firstMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, First_mealActivity.class);
                startActivity(intent);
            }
        });

        secondMeal = findViewById(R.id.second_meal);
        secondMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Second_meal.class);
                startActivity(intent);
            }
        });

        salads = findViewById(R.id.salads);
        salads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Salads.class);
                startActivity(intent);
            }
        });



//        firstMeal = findViewById(R.drawable.first_meal_icon);
//        secondMeal = findViewById(R.drawable.second_meal_icon);
    }


}