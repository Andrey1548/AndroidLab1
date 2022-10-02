package com.example.lab1kpi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editTextQuestion;
    EditText editTextResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextQuestion = findViewById(R.id.editTextQuestion);
        editTextResult = findViewById(R.id.editTextResult);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        Button button_OK = (Button) findViewById(R.id.button_OK);
        button_OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = radioGroup.findViewById(radioId);

                editTextResult.setText(editTextQuestion.getText() + " " + radioButton.getText());
            }
        });
    }

    public void checkButton(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = radioGroup.findViewById(radioId);

        Toast.makeText(this, "Selected: " + radioButton.getText(), Toast.LENGTH_LONG).show();
    }
}