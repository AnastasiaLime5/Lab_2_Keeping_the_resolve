package com.example.lab_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.graphics.Color;

public class TextFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);

        TextView textViewMessage = view.findViewById(R.id.textView_message);
        Button buttonBack = view.findViewById(R.id.button_back);

        buttonBack.setBackgroundResource(R.drawable.button_black_white);
        buttonBack.setTextColor(Color.parseColor("#FFFFFF"));

        if (getArguments() != null) {
            String message = getArguments().getString("message");
            textViewMessage.setText(message);
        }

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Возврат на StartFragment
                requireActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;
    }
}