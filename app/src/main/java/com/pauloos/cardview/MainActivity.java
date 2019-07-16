package com.pauloos.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) add a RecyclerView
 * 2) Configure a layout and adapter for the recycler view
 */

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;

    /** 15) Let's create a list to keep out data **/
    private List<Posts> posts = new ArrayList<>();

    /** 16) Create a class "Posts" to set our posts **/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        /** 3) Set a layout for the recycler view **/
        LinearLayoutManager layoutManager = new LinearLayoutManager(this); // Layout
        recyclerPostagem.setLayoutManager( layoutManager);

        /** 4) Create and set an adapter ( I created the class "Adapter" ) **/


        /** 18) Before we create the adapter, we can call the method do create the posts **/
        preparePosts();

        /** 10) After create the class Adapter, now we need to set the adapter **/
        Adapter adapter  = new Adapter( posts );
        recyclerPostagem.setAdapter( adapter );

        /** 11) Create a layout, a XML file and get a CardView on that **/
    }


    /** 17) Create a method to create posts **/
    public void preparePosts(){
        Posts p = new Posts("Paulo Santos", "Good Vibes!", R.drawable.imagem1);
        this.posts.add( p );

        p = new Posts("Laisla Santos", "Beautil place!", R.drawable.imagem2);
        this.posts.add( p );

        p = new Posts("Olivia Santos", "Baby Shark!!!", R.drawable.imagem3);
        this.posts.add( p );

        p = new Posts("John Crazy Dog", "Whooooow!!", R.drawable.imagem4);
        this.posts.add( p );

    }

}
