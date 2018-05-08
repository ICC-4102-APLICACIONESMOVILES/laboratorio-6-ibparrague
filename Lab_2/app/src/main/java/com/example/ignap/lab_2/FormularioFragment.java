package com.example.ignap.lab_2;


import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment {


    public FormularioFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_formulario, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        final String DATABASE_NAME = "Test_db";
        final MyDatabase database;
        database = Room.databaseBuilder(getActivity().getApplicationContext(),MyDatabase.class, DATABASE_NAME).build();
        List<Form> all_forms;
        new Thread(new Runnable() {
            @Override
            public void run() {
                database.daoAccess().fetchAllForms();
            }
        });
       // Form test = database.daoAccess().fetchHighestId();

        /*
        for(Form forma: all_forms) {

        }
        */
        /*
        Spinner spinner = (Spinner) view.findViewById(R.id.spinnerCategoriaNuevoForm);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getContext(), R.array.categories_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        */

    }

}
