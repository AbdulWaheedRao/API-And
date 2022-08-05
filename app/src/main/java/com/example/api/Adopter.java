package com.example.api;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Retrofit;

public class Adopter extends RecyclerView.Adapter<Adopter.APIViewHolder> {
    private List<Album> albums;
    Adopter adopter;
    public Adopter(List<Album> albums) {
        this.albums = albums;
    }

    @NonNull
    @Override
    public APIViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootview= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_layout,null);
        return new APIViewHolder(rootview);
    }

    @Override
    public void onBindViewHolder(@NonNull APIViewHolder holder, int position) {
        Album album=albums.get(position);
        holder.tvUser.setText(Integer.toString(album.getUserId()));
        holder.tvId.setText(Integer.toString(album.getId()));
        holder.tvTitle.setText(album.getTitle());
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    class APIViewHolder extends RecyclerView.ViewHolder{
        TextView tvUser,tvId,tvTitle;

        public APIViewHolder(@NonNull View itemView) {
            super(itemView);
            tvUser=itemView.findViewById(R.id.tvUser);
            tvId=itemView.findViewById(R.id.tvId);
            tvTitle=itemView.findViewById(R.id.tvTitle);
        }
    }
}
