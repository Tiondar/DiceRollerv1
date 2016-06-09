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

                //Toast.makeText(getContext(),"Hai lanciato un d100!!", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Hai lanciato un d100, il risultato è:  " + d100Int);

            }
        });

        button_setPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d4Numb = 1;
                int d6Numb = 1;
                int d8Numb = 1;
                int d10Numb = 1;
                int d12Numb = 1;
                int d20Numb = 1;
                int d100Numb = 1;
                int modifyer = 1;



                Dice dice = new Dice();
                int sumd4 = 0;
                if (d4Numb != 0){


                    for (int i=0; i<d4Numb; i++){
                        dice.setFaces(4);
                        int d4array= dice.roll();
                        sumd4 = sumd4 + d4array;
                    }

                }
                int sumd6 = 0;
                if (d6Numb != 0){


                    for (int i=0; i<d6Numb; i++){
                        dice.setFaces(6);
                        int d6array= dice.roll();
                        sumd6 = sumd6 + d6array;
                    }

                }
                int sumd8 = 0;
                if (d8Numb != 0){


                    for (int i=0; i<d8Numb; i++){
                        dice.setFaces(8);
                        int d8array= dice.roll();
                        sumd8 = sumd8 + d8array;
                    }

                }
                int sumd10 = 0;
                if (d10Numb != 0){


                    for (int i=0; i<d10Numb; i++){
                        dice.setFaces(10);
                        int d10array= dice.roll();
                        sumd10 = sumd10 + d10array;
                    }

                }
                int sumd12 = 0;
                if (d12Numb != 0){


                    for (int i=0; i<d12Numb; i++){
                        dice.setFaces(12);
                        int d12array= dice.roll();
                        sumd12 = sumd12 + d12array;
                    }

                }
                int sumd20 = 0;
                if (d20Numb != 0){


                    for (int i=0; i<d20Numb; i++){
                        dice.setFaces(20);
                        int d20array= dice.roll();
                        sumd20 = sumd20 + d20array;
                    }

                }
                int sumd100 = 0;
                if (d100Numb != 0){


                    for (int i=0; i<d100Numb; i++){
                        dice.setFaces(100);
                        int d100array= dice.roll();
                        sumd100 = sumd100 + d100array;
                    }

                }

                int sum = sumd4 + sumd6 + sumd8 +sumd10 + sumd12 +sumd20 + sumd100 + modifyer;




                Toast.makeText(getContext(),"Dummy!! Cannot be setted", Toast.LENGTH_SHORT).show();
                resultTextView.setText("Total throws:   " + sum + "                                                   " + d4Numb + "d4: " + sumd4+ "; " + d6Numb +  "d6: " + sumd6 + "; " + d8Numb +  "d8: " + sumd8 + "; " + d10Numb + "d10: " + sumd10 +  "; " + d12Numb + "d12: " + sumd12 + "; " + d20Numb + "d20: " + sumd20 + "; " + d100Numb + "d100: " + sumd100 + " modifyer: " + modifyer);

            }
        });

        button_goToSetPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
