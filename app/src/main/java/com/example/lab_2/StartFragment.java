package com.example.lab_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import java.util.Random;
import android.graphics.Color;

public class StartFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_start, container, false);

        Button buttonSave = view.findViewById(R.id.button_save);
        buttonSave.setBackgroundResource(R.drawable.button_black_white);
        buttonSave.setTextColor(Color.parseColor("#FFFF00"));

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] messages = {
                        "Тень от руин нависает над вами, наполняя вас решимостью.",
                        "Вы чувствуете успокаивающую безмятежность. Вы полны решимости.",
                        "Понимая, что однажды мышь найдёт способ разогреть спагетти, вы наполняетесь решимостью.",
                        "Воздух полон запаха озона, это наполняет вас решимостью.",
                        "Под весёлый шорох листвы вы наполняетесь решимостью.",
                        "Понимая, что однажды мышь может покинуть свою нору и взять сыр, вы наполняетесь решимостью.",
                        "Удобство той лампы по прежнему наполняет вас решимостью.",
                        "Понимая, что собака никогда не бросит попытки слепить идеального снежного пса, вы наполняетесь решимостью.",
                        "Вид такого дружелюбного города наполняет вас решимостью.",
                        "Понимая, что однажды мышь найдёт способ извлечь сыр из таинственного кристалла, вы наполняетесь решимостью.",
                        "Ветер пронзительно воет, вы полны решимости.",
                        "Свист пара и лязг шестерёнок наполняют вас решимостью.",
                        "Понимая, что однажды мышь взломает электронный сейф и достанет сыр, вы наполняетесь решимостью.",
                        "За этой дверью должен быть лифт к замку короля. Вы полны решимости.",
                        "Любование таким милым, аккуратным домом в руинах придаёт вам решимости.",
                        "Шум бегущей воды наполняет вас решимостью.",
                        "Воющий ветер утих до лёгкого бриза, это придаёт вам решимости."
                };


                Random random = new Random();
                String message = messages[random.nextInt(messages.length)];


                TextFragment textFragment = new TextFragment();
                Bundle args = new Bundle();
                args.putString("message", message);
                textFragment.setArguments(args);


                ((MainActivity) requireActivity()).replaceFragment(textFragment);
            }
        });

        return view;
    }
}