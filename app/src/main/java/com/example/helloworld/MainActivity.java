package com.example.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
     protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
                //new exampleDialog().show(getSupportFragmentManager(),"exampleDialog");
            }
        });
    }
    public void openDialog() {
      ExampleDialog exampleDialog = new ExampleDialog();
      exampleDialog.show(getSupportFragmentManager(),"exampleDialog");
    }
}
