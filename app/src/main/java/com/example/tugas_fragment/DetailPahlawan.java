package com.example.tugas_fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailPahlawan extends Fragment {


    public DetailPahlawan() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_pahlawan, container, false);
    }

    TextView textnama, textdetail;
    Button share;

//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//        share = view.findViewById(R.id.share);
//        textnama = view.findViewById(R.id.nama);
//        textdetail = view.findViewById(R.id.deskripsi);
//
//        Bundle bundle = getActivity().getIntent().getExtras();
//
//        final String nama = bundle.getString("nama");
//        final String detail = bundle.getString("detail");
//
//        textnama.setText(nama);
//        textdetail.setText(detail);
//        textdetail.setMovementMethod(new ScrollingMovementMethod());
//        share.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent share = new Intent();
//                share.setAction(Intent.ACTION_SEND);
//                share.putExtra(Intent.EXTRA_TEXT, nama + "" + detail);
//                share.setType("text/plain");
//
//                Intent shareIntent = Intent.createChooser(share, null);
//                startActivity(share);
//
//
//            }
//        });
//    }
}