package com.example.buttontoast_mesa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Button btnHide = findViewById(R.id.btnInvisible);
        Button btnShow = findViewById(R.id.btnPanthers);
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnHide.getVisibility() == View.VISIBLE) {
                    btnHide.setVisibility(View.GONE);
                }
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnShow.getVisibility() == View.VISIBLE) {
                    btnHide.setVisibility(View.VISIBLE);

                    Toast.makeText(MainActivity.this, "to do,to do,to do...", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}