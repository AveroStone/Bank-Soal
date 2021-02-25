package tugas.lab.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button latihan1, latihan2, latihan3, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        latihan1 = (Button) findViewById(R.id.btn_Lat1);
        latihan2 = (Button) findViewById(R.id.btn_Lat2);
        latihan3 = (Button) findViewById(R.id.btn_Lat3);
        reset = (Button) findViewById(R.id.btn_Reset);

        latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLatihan1();
            }
        });

        latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLatihan2();
            }
        });

        latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLatihan3();
            }
        });

        latihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });
    }

    private void openLatihan1() {
        Intent intent = new Intent(this, Latihan1.class);
        startActivity(intent);
    }

    private void openLatihan2() {
        Intent intent = new Intent(this, Latihan2.class);
        startActivity(intent);
    }

    private void openLatihan3() {
        Intent intent = new Intent(this, Latihan3.class);
        startActivity(intent);
    }

    private void resetScore() {
    }
}