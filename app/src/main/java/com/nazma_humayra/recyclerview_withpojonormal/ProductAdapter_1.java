package com.nazma_humayra.recyclerview_withpojonormal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview_withpojonormal.R;

import java.util.List;

public class ProductAdapter_1 extends RecyclerView.Adapter<ProductAdapter_1.ProductViewHolderownmake> {



    public ProductAdapter_1(Context context, List<Product_1> product1List) {
        this.context = context;
        this.product1List = product1List;
    }


    private Context context;
    private List<Product_1> product1List;

    @NonNull
    @Override
    public ProductViewHolderownmake onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        LayoutInflater  inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.product_1, null);


        return new ProductViewHolderownmake(view);




    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolderownmake holder, int position) {

        Product_1 product1 = product1List.get(position);


        holder.tittle.setText(product1.getTitle());
        holder.textView.setText(product1.getShortdesc());
        holder.textView2.setText(String.valueOf(product1.getRating()));
        holder.textView3.setText(String.valueOf(product1.getPrice()));
        holder.textView4.setText(String.valueOf(product1.getName()));

        holder.imageView.setImageDrawable(context.getResources().getDrawable(product1.getImage()));


    }

    @Override
    public int getItemCount() {
        return product1List.size();
    }



    class ProductViewHolderownmake extends RecyclerView.ViewHolder{

        TextView tittle, textView, textView2, textView3,textView4;
        ImageView imageView;

        public ProductViewHolderownmake(@NonNull View itemView) {
            super(itemView);


            tittle = itemView.findViewById(R.id.tittle);
            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            imageView = itemView.findViewById(R.id.imageView);
        }


    

    }




}