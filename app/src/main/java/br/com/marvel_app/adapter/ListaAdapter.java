package br.com.marvel_app.adapter;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.marvel_app.R;
import br.com.marvel_app.activity.ListHerosActivity;
import br.com.marvel_app.activity.MainActivity;
import br.com.marvel_app.model.ListaPersonagem;

public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.MyViewHolder> {

    private List<ListaPersonagem> listaPersonagems;

    public ListaAdapter(List<ListaPersonagem> listaPersonagems) {
        this.listaPersonagems = listaPersonagems;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_cardview_personagens, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ListaPersonagem listaPersonagem = listaPersonagems.get(position);
        holder.textTituloPersonagem.setText(listaPersonagem.getNomePersonagem());
        holder.textImagemPersonagem.setImageResource(listaPersonagem.getImagemPersongem());

    }


    @Override
    public int getItemCount() {

        return listaPersonagems.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textTituloPersonagem;
        private ImageView textImagemPersonagem;


        public MyViewHolder(View itemView) {
            super(itemView);
            textTituloPersonagem = itemView.findViewById(R.id.textNomePersonagem);
            textImagemPersonagem = itemView.findViewById(R.id.imageViewPersonagem);

        }


    }

}


