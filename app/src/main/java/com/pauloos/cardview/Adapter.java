package com.pauloos.cardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


/** 5) Create the class for the adapter and extend the class "RecyclerView.Adapter<Adapter<VH>" **/
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    /** 20) Create a List variable **/
    private List<Posts> myPosts;

    /** 19) Create a construtor for adapter class **/
    public Adapter(List<Posts> postsList) {
        this.myPosts = postsList;
    }

    /** 9) Implements the methods of RecyclerView class **/
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        /** 12) Create the visualization - This 'post.detail' is the layout we have created with the CardView **/
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_detail, parent, false);

        return new MyViewHolder( itemList );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        /** 21) recovery posts and update the holders... **/
        Posts post = myPosts.get( position );

        /** 14) Show the items **/
        holder.title.setText(post.getTitle());
        holder.post.setText(post.getPost());
        holder.image.setImageResource( post.getImage());

    }

    @Override
    public int getItemCount() {

        /** this method returns how many items we want to display **/
        /** 22) get the right number of posts **/
        return myPosts.size();
    }




    /** 6) Create an internal class to set the ViewHolder **/
    public class MyViewHolder extends RecyclerView.ViewHolder {

        /** 7) Define the atributtes that will be displayed in screen **/
        private TextView title, post;
        private ImageView image;

        /** 8) Create a Constructor of class MyViewHolder **/
        public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        /** 13) Capture the items by FindViewById **/
        title = itemView.findViewById(R.id.tv_title);
        post = itemView.findViewById(R.id.tv_post);
        image = itemView.findViewById(R.id.iv_picture);
    }


}


}
