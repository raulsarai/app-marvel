package br.com.marvel_app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.marvel_app.R;
import br.com.marvel_app.adapter.ListaAdapter;
import br.com.marvel_app.model.ListaPersonagem;


public class ListHerosActivity extends AppCompatActivity {

    private RecyclerView recyclerLista;
    private List<ListaPersonagem> listaPersonagens = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_heros);
        getSupportActionBar().hide();

        recyclerLista = findViewById(R.id.recyclerLista);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerLista.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararLista();
        ListaAdapter adapter = new ListaAdapter(listaPersonagens);
        recyclerLista.setAdapter(adapter);
        

    }

    public void prepararLista(){

        ListaPersonagem listaPersonagens = new ListaPersonagem("1943-1945 - Capitão América: O Primeiro Vingador", R.drawable.capitao1);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("1995 - Capitã Marvel", R.drawable.capitamarvel);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2010 - Homem de Ferro", R.drawable.iron_man);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2011 - O Incrível Hulk", R.drawable.incrivel_hulk);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2011 - Homem de Ferro 2", R.drawable.homem_de_ferro_2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2011 - Thor", R.drawable.thor);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2012 - Os Vingadores", R.drawable.vingadores1);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2012 - Homem de Ferro 3", R.drawable.homem_de_ferro_3);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2013 - Thor: O Mundo Sombrio", R.drawable.thor2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2014 - Capitão América 2 - O Soldado Invernal", R.drawable.capitao2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2014 - Guardiões da Galáxia", R.drawable.guardioes1);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2014 - Guardiões da Galáxia Vol. 2", R.drawable.guardioes2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2015 - Vingadores: Era de Ultron", R.drawable.vingadores2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2015 - Homem-Formiga", R.drawable.homemformiga);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2016 - Capitão América: Guerra Civil", R.drawable.capitao2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2016 - Viúva Negra", R.drawable.viuva);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2016 - Homem-Aranha: De Volta ao Lar", R.drawable.homemaranha2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2016/2017 - Doutor Estranho", R.drawable.doutorestranho);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2017 - Pantera Negra", R.drawable.pantera);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2017 - Thor: Ragnarok", R.drawable.tho3);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2017 - Homem-Formiga e a Vespa", R.drawable.homemformigaeavespa);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2017 - Vingadores: Guerra Infinita", R.drawable.vingadores3);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2018-2023 - Vingadores: Ultimato", R.drawable.vingadores4);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2023 - WandaVision", R.drawable.wandavision);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2023 - Falcão e o Soldado Invernal", R.drawable.falcao);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2024 - Homem-Aranha: Longe de Casa", R.drawable.homemaranha2);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2024 - Homem-Aranha: Sem Volta para Casa", R.drawable.homemaranha3);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2024 - Eternos", R.drawable.eternos);
        this.listaPersonagens.add( listaPersonagens);
        listaPersonagens = new ListaPersonagem("2024 - Gavião Arqueiro ", R.drawable.gaviao);
        this.listaPersonagens.add( listaPersonagens);
    }
}
