package com.cquereap.android.binaryapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {

    //decimal to binary
    EditText decimal_et;
    Button convert_to_binary_btn;
    TextView out;



    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_fragment_one, container, false);

        decimal_et = (EditText)v.findViewById(R.id.decimal_et);
        convert_to_binary_btn = (Button)v.findViewById(R.id.convert_to_binary_btn);
        out = (TextView)v.findViewById(R.id.out);

        convert_to_binary_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dec = Integer.parseInt(decimal_et.getText().toString());
                String binary = Integer.toBinaryString(dec);
                out.setText(binary);
            }
        });


        return v;
    }
    public void computeBinary(View v){

    }







}
