package ibodov.smile.tajik_kitchen;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FirstMealAdapter extends RecyclerView.Adapter<FirstMealAdapter.FirstMealViewHolder>{

//----------------------------------------------------------
// 3. Создаем массив
   private FirstMeals[] local_firstMeals; //этот массив пустой
// 4. Создаем конструктор для нашего адаптера:
    public FirstMealAdapter(FirstMeals[] firstMeals) {

        local_firstMeals = new FirstMeals[firstMeals.length];

        for (int i = 0; i<firstMeals.length; i++) { // этот массив полный
            local_firstMeals[i] = firstMeals[i]; //заполняем local_firstMeals из firstMeals
        }
    }



//------------------------------------------------------------
    // 2. Имплементируем 3 метода

    @Override
    public FirstMealViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // 5. реализуем метод
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first_meal, parent, false);
        return new FirstMealViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FirstMealViewHolder holder, int position) {
    // 6. реализуем метод / переоопределение
        holder.textView.setText(local_firstMeals[position].getName() + " ");

    }

    @Override
    public int getItemCount() {
        //7. реализуем метод / возвращаем количество элементов массива
        return local_firstMeals.length;
    }

    //-------------------------------------------
//    1. реализация ViewHolder -а
    class FirstMealViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

    public FirstMealViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
    }
    //--------------------------------------------------


}
}
