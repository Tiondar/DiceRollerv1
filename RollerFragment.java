package com.example.matteo.diceroller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RollerFragment extends Fragment {


    public RollerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_roller, container, false);

        final Button button_d4 = (Button) v.findViewById(R.id.buttonD4);
        final Button button_d6 = (Button) v.findViewById(R.id.buttonD6);
        final Button button_d8 = (Button) v.findViewById(R.id.buttonD8);
        final Button button_d10 = (Button) v.findViewById(R.id.buttonD10);
        final Button button_d12 = (Button) v.findViewById(R.id.buttonD12);
        final Button button_d20 = (Button) v.findViewById(R.id.buttonD20);
        final Button button_d100 = (Button) v.findViewById(R.id.buttonD100);
        final Button button_setPlayer = (Button) v.findViewById(R.id.buttonSetPlayer);
        final Button button_goToSetPlayer = (Button) v.findViewById(R.id.goToSetPlayer);
        final TextView resultTextView = (TextView) v.findViewById(R.id.risultato);


        button_d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(4);
                int d4Int = dice.roll();
                //int d4Int = Dices.dices4();
                //Toast.makeText(getContext(),"Hai lanciato un d4!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d4, il risultato è:  " + d4Int);
            }
        });

        button_d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(6);
                int d6Int = dice.roll();

                //int d6Int = Dices.dices6();
                //Toast.makeText(getContext(),"Hai lanciato un d6!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d6, il risultato è:  " + d6Int);

            }
        });

        button_d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(8);
                int d8Int = dice.roll();

                //int d8Int = Dices.dices8();
                //Toast.makeText(getContext(),"Hai lanciato un d8!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d8, il risultato è:  " + d8Int);

            }
        });

        button_d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(10);
                int d10Int = dice.roll();

                //int d10Int = Dices.dices10();
                //Toast.makeText(getContext(),"Hai lanciato un d10!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d10, il risultato è:  " + d10Int);

            }
        });

        button_d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(12);
                int d12Int = dice.roll();

                //int d12Int = Dices.dices12();
                //Toast.makeText(getContext(),"Hai lanciato un d12!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d12, il risultato è:  " + d12Int);

            }
        });

        button_d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(20);
                int d20Int = dice.roll();

                //int d20Int = Dices.dices20();
                //Toast.makeText(getContext(),"Hai lanciato un d20!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d20, il risultato è:  " + d20Int);

            }
        });

        button_d100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dice dice = new Dice();
                dice.setFaces(100);
                int d100Int = dice.roll();

                //int d100Int = Dices.dices100();
                //Toast.makeText(getContext(),"Hai lanciato un d100!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d100, il risultato è:  " + d100Int);

            }
        });

        button_setPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int d4Int = Dices.dices4();
                Toast.makeText(getContext(),"Not yet implemented!!", Toast.LENGTH_SHORT).show();
                //resultTextView.setText("Hai lanciato un d4, il risultato è:  " + d4Int);

            }
        });

        button_goToSetPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int d4Int = Dices.dices4();
                //Toast.makeText(getContext(),"Not yet implemented!!", Toast.LENGTH_LONG).show();
                //resultTextView.setText("Hai lanciato un d4, il risultato è:  " + d4Int);

                PlayerSetFragment playerSetFragment = new PlayerSetFragment();
                FragmentTransaction fragmentTransactionRoller = getFragmentManager().beginTransaction().replace(R.id.mainLayout,playerSetFragment).addToBackStack(null);
                fragmentTransactionRoller.commit();


            }
        });


        return v;
    }

}
