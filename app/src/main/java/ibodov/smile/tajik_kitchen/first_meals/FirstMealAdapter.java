package ibodov.smile.tajik_kitchen.first_meals;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import ibodov.smile.tajik_kitchen.R;

public class FirstMealAdapter extends RecyclerView.Adapter<FirstMealAdapter.FirstMealViewHolder>{

//----------------------------------------------------------
// 3. Создаем массив
   private FirstMeals[] local_firstMeals; //этот массив пустой



    private OnItemClickListener localListener;

// 4. Создаем конструктор для нашего адаптера:
    public FirstMealAdapter(FirstMeals[] firstMeals, OnItemClickListener listener) {
        local_firstMeals = new FirstMeals[firstMeals.length];
        localListener = listener;

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

        //  реализуем метод / переоопределение для картинки в RecyclerView
        holder.imageView.setImageResource(local_firstMeals[position].getImageId());
        Log.i("TAG", "onBindViewHolder: local_firstMeals image id: " +local_firstMeals[position].getImageId() );
    }

    @Override
    public int getItemCount() {
        //7. реализуем метод / возвращаем количество элементов массива
        return local_firstMeals.length;
    }

    //-------------------------------------------
//    1. реализация ViewHolder -а
    class FirstMealViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ImageView imageView;

    public FirstMealViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textView);
        imageView = itemView.findViewById(R.id.mealImage);

        itemView.setOnClickListener(this); //при нажатии
    }
    //--------------------------------------------------

        // Это Имплиментировает класс ViewHolder
        @Override
    public void onClick(View view) {
        localListener.onItemClick(getAdapterPosition());
    }

}
    //Интерфейс между ContactAdapter и MainActivity
    interface OnItemClickListener {
        public void onItemClick(int position);
    }
}
