package com.example.helloworld;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDialog extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        String [] number = getActivity().getResources().getStringArray(R.array.number);

//        builder.setTitle("information")
//                .setMessage("This is a Dialog")
//                .setPositiveButton("ok",new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                    }
//                });
        builder .setTitle("Chose a number");
        builder.setItems(number, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"you choose"+number [i],Toast.LENGTH_LONG).show();
            }
        });
        return builder.create();
    }
}
