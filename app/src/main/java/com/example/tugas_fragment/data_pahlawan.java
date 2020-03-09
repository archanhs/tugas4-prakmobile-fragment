package com.example.tugas_fragment;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class data_pahlawan extends Fragment {


    public data_pahlawan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data_pahlawan, container, false);
    }

    private RecyclerView recyclerView;
    private ArrayList<PahlawanModel> modelPahlawans = new ArrayList<>();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rvPahlawan);
        recyclerView.setHasFixedSize(true);
        modelPahlawans.addAll(PahlawanData.getListData());

        showRecyclerList();

    }

    private void showRecyclerList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Adapter adapterPahlawan = new Adapter(getActivity());
        adapterPahlawan.setModelPahlawans(modelPahlawans);
        recyclerView.setAdapter(adapterPahlawan);
    }

}
