package com.example.custommusicplayer.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.custommusicplayer.R;
import com.example.custommusicplayer.model.Music;

import java.util.ArrayList;

public class PlayListAdapter extends RecyclerView.Adapter<PlayListAdapter.ItemViewHoler> {

    ArrayList<Music> musicList;

    public PlayListAdapter(ArrayList<Music> playList) {
        this.musicList = playList;
    }

    @NonNull
    @Override
    public ItemViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.music_item, parent, false);
        PlayListAdapter.ItemViewHoler viewHolder = new PlayListAdapter.ItemViewHoler(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHoler holder, int position) {
        Music item = musicList.get(position);
        holder.bindItems(item.getName(), item.getSinger());
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class ItemViewHoler extends RecyclerView.ViewHolder {

        private TextView name;
        private TextView singer;
        private ImageView albumImage;

        public ItemViewHoler(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.item_music_name);
            this.singer = itemView.findViewById(R.id.item_singer_name);
            this.albumImage = itemView.findViewById(R.id.item_album_image);
        }

        public void bindItems(String name, String singer){
            this.name.setText(name);
            this.singer.setText(singer);
        }
    }
}
