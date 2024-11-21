package com.example.ex3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private Button calc;
    private TextView maior;
    private TextView menor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        calc = findViewById(R.id.calc);
        maior = findViewById(R.id.maior);
        menor = findViewById(R.id.menor);

    }

    private void calc() {
        int.parseInt(maior.getText().toString());
    }
}