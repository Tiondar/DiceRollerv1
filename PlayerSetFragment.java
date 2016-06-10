package com.example.matteo.diceroller;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;




public class PlayerSetFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_player_set, container, false);

        final EditText editText_d4 = (EditText) v.findViewById(R.id.dQuattroEdt);
        final EditText editText_d6 = (EditText) v.findViewById(R.id.dSeiEdt);
        final EditText editText_d8 = (EditText) v.findViewById(R.id.dOttoEdt);
        final EditText editText_d10 = (EditText) v.findViewById(R.id.dDieciEdt);
        final EditText editText_d12 = (EditText) v.findViewById(R.id.dDodiciEdt);
        final EditText editText_d20 = (EditText) v.findViewById(R.id.dVentiEdt);
        final EditText editText_d100 = (EditText) v.findViewById(R.id.dCentoEdt);
        Button buttonSave = (Button) v.findViewById(R.id.button_save);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             /*   String d4Str = editText_d4.getEditableText().toString();
                int d4Int = Integer.parseInt(d4Str);

                String d6Str = editText_d6.getEditableText().toString();
                int d6Int = Integer.parseInt(d6Str);

                String d8Str = editText_d8.getEditableText().toString();
                int d8Int = Integer.parseInt(d8Str);

                String d10Str = editText_d10.getEditableText().toString();
                int d10Int = Integer.parseInt(d10Str);

                String d12Str = editText_d12.getEditableText().toString();
                int d12Int = Integer.parseInt(d12Str);

                String d20Str = editText_d20.getEditableText().toString();
                int d20Int = Integer.parseInt(d20Str);

                String d100Str = editText_d100.getEditableText().toString();
                int d100Int = Integer.parseInt(d100Str);*/

                RollerFragment rollerFragment = new RollerFragment();
                FragmentTransaction fragmentTransactionSet = getFragmentManager().beginTransaction().replace(R.id.mainLayout,rollerFragment).addToBackStack(null);
                fragmentTransactionSet.commit();


            }
        });




        return v;

    }
}
