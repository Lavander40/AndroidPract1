package ru.mirea.astaevka.layouttype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textEdit;
    private Button actionButton;
    private CheckBox setBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textEdit = findViewById(R.id.textViewCode);
        textEdit.setText("New text in MIREA");
        actionButton = findViewById(R.id.buttonCode);
        actionButton.setText("MireaButton");
        setBox = findViewById(R.id.checkBoxCode);
        setBox.setChecked(true);
    }
}