package com.example.whatsapp_task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsFragment extends Fragment {
    View v;
    RecyclerView recyclerView;
   DataBase dataBase;
    ArrayList<ChatItem> arrayList;
    public ChatsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_chats, container, false);
        recyclerView = v.findViewById(R.id.ChatsRecyclerView);
//       dataBase=new DataBase(getContext());
        arrayList = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        arrayList.add(new ChatItem("Rahma", "12", R.drawable.ic_person_black_24dp));
        arrayList.add(new ChatItem("Rahma", "12", R.drawable.ic_person_black_24dp));
        arrayList.add(new ChatItem("Rahma", "12", R.drawable.ic_person_black_24dp));
        arrayList.add(new ChatItem("Rahma", "12", R.drawable.ic_person_black_24dp));
        arrayList.add(new ChatItem("Rahma", "12", R.drawable.ic_person_black_24dp));
      RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);

        return v;
    }

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        arrayList = dataBase.getAllChats();
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(layoutManager);
//        dataBase.insertItem(new ChatItem("Rahma", "12", R.drawable.ic_launcher_foreground));
//        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(arrayList);
//        recyclerView.setAdapter(recyclerViewAdapter);
//    }
}
