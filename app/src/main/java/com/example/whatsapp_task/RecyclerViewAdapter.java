package com.example.whatsapp_task;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolderAdapter> {
ArrayList<ChatItem> arrayList;

    public RecyclerViewAdapter(ArrayList<ChatItem> arrayList) {
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public ViewHolderAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return  new ViewHolderAdapter(LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_model,null,false));
    }

    @NonNull

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAdapter holder, int position) {
final ChatItem chatItem=arrayList.get(position);
holder.chat_name.setText(chatItem.getNanme());
holder.chat_message.setText(chatItem.getMessage());
holder.chat_image.setImageResource(chatItem.getImage());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class ViewHolderAdapter extends RecyclerView.ViewHolder {
TextView chat_name;
TextView chat_message;
ImageView chat_image;

        public ViewHolderAdapter(@NonNull View itemView) {
            super(itemView);
chat_name=itemView.findViewById(R.id.chat_name);
chat_message=itemView.findViewById(R.id.chat_message);
chat_image=itemView.findViewById(R.id.chat_image);

        }
    }
}
