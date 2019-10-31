package com.example.recyclerview.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Entidades.Pelicula;
import com.example.recyclerview.R;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.NameViewHolder> {


    private List<Pelicula> data;

    public CarAdapter(List<Pelicula> data){
        this.data = data;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.custom_view,parent,false);

        NameViewHolder ViewHolder1 = new NameViewHolder(view);

        return ViewHolder1;

    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {

        TextView textTitle = holder.itemView.findViewById(R.id.textTitle);
        TextView textDescripcion = holder.itemView.findViewById(R.id.textDes);

        Pelicula valor = data.get(position);

        textTitle.setText(valor.getNombre());
        textDescripcion.setText(valor.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder{

        public NameViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
