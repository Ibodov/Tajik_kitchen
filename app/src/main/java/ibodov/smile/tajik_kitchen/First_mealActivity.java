package ibodov.smile.tajik_kitchen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class First_mealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FirstMealAdapter adapter;

    //3. массив с данными о первых блюд
    FirstMeals[] firstMeals = new FirstMeals[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_meal);

        //Заполняем массив
        setFirstMealsArray();

        //1. инициализируем recyclerview список
        initRecyclerView();

    }

    //иниц массива в методе
    private void setFirstMealsArray(){
        firstMeals[0] = new FirstMeals(1, "Шурбо");
        firstMeals[1] = new FirstMeals(2, "Мастоба");
        firstMeals[2] = new FirstMeals(3, "Хом Шурбо");
        firstMeals[3] = new FirstMeals(4, "Сиёх-алаф");

    }

    //2. создаем метод
    private void initRecyclerView() {
    recyclerView = findViewById(R.id.recyclerView_first);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //Устаналиваем разделитель
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        //инициализация FirstMealAdapter
        adapter = new FirstMealAdapter(firstMeals); //передаем наг массив

        recyclerView.setLayoutManager(linearLayoutManager); // устанавливаем в recyclerView наш лейаут

        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter);//в recyclerView устанавливаем наш адаптер

        recyclerView.setHasFixedSize(true);
    }

}