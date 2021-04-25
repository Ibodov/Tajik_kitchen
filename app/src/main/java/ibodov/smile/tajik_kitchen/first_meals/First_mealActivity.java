package ibodov.smile.tajik_kitchen.first_meals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import ibodov.smile.tajik_kitchen.R;

public class First_mealActivity extends AppCompatActivity implements FirstMealAdapter.OnItemClickListener  {

    RecyclerView recyclerView;
    FirstMealAdapter adapter;

    //3. массив с данными о первых блюд
   FirstMeals[] firstMeals = new FirstMeals[4];
//   ArrayList<FirstMeals> firstMeals = new ArrayList<FirstMeals>();

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
        firstMeals[0] = new FirstMeals(1, "Шурбо",  R.drawable.first_meal_icon, "Хуроки бехтарин");
        firstMeals[1] = new FirstMeals(2, "Мастоба", R.drawable.first_meal_icon, "Хуроки бехтарин2");
        firstMeals[2] = new FirstMeals(3, "Хом Шурбо", R.drawable.avatar, "Хуроки бехтарин3");
        firstMeals[3] = new FirstMeals(4, "Сиёх-алаф", R.drawable.avatar, "Хуроки бехтарин4");

    }

 /*
    private void setFirstMealsArray(){

        firstMeals.add(new FirstMeals (1, "Шурбо", R.drawable.avatar));
        firstMeals.add(new FirstMeals (2, "Шурбо", R.drawable.second_meal_icon));
        firstMeals.add(new FirstMeals (3, "Шурбо", R.drawable.first_meal_icon));
        firstMeals.add(new FirstMeals (4, "Шурбо", R.drawable.avatar));

    }
*/
    //2. создаем метод
    private void initRecyclerView() {
    recyclerView = findViewById(R.id.recyclerView_first);
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //Устаналиваем разделитель
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        //инициализация FirstMealAdapter
        adapter = new FirstMealAdapter(firstMeals, this); //передаем наш массив

        recyclerView.setLayoutManager(linearLayoutManager); // устанавливаем в recyclerView наш лейаут

        recyclerView.addItemDecoration(itemDecoration);

        recyclerView.setAdapter(adapter);//в recyclerView устанавливаем наш адаптер

        recyclerView.setHasFixedSize(true);
    }

    //имплемент (нажатия мышки в recyclerView)
    @Override
    public void onItemClick(int position) {
        // Toast.makeText(this, "some text", Toast.LENGTH_SHORT).show();

        //сюда можно добавить дополнительные методы

        Intent intent = new Intent(this, AboutFirstMeals.class);
        FirstMeals clickedFirstMeals = firstMeals[position];
        intent.putExtra(AboutFirstMeals.FIRST_MEAL_ID, clickedFirstMeals.getId());
        intent.putExtra(AboutFirstMeals.NAME_FIRST_MEAL, clickedFirstMeals.getName());
        intent.putExtra(AboutFirstMeals.DESCRIPTION_FIRST_MEAL, clickedFirstMeals.getDescription());
        intent.putExtra(AboutFirstMeals.IMAGE_ID, clickedFirstMeals.getImageId());


        startActivity(intent);
    }

}