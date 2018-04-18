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
 * Convert to decimal is no longer a function of this program
 * The second button will convert a decimal to hex or octal.
 */
public class FragmentTwo extends Fragment {

    EditText bin_et;
    Button convertToDecimal;
    TextView output;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        bin_et = (EditText)v.findViewById(R.id.binary_et);
        convertToDecimal = (Button)v.findViewById(R.id.convert_to_decimal);
        output = (TextView)v.findViewById(R.id.out);

        convertToDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int dec = Integer.parseInt(bin_et.getText().toString());
                String oct = Integer.toOctalString(dec);
                String hex = Integer.toHexString(dec);
                //output.setText("OCT: "+oct+" HEX: "+hex);
                output.setText("Oct: "+oct + " Hex: "+ hex);
            }
        });


        return v;
    }

}
