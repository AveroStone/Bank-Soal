package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView label1, labelScore, labelBenar, labelSalah, sBenar, sSalah;
    private Button latihan1, latihan2, latihan3, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        label1 = findViewById(R.id.labelScore);
        labelScore = findViewById(R.id.Score);
        labelBenar = findViewById(R.id.labelBenar);
        labelSalah = findViewById(R.id.labelSalah);
        sBenar = findViewById(R.id.sBenar);
        sSalah = findViewById(R.id.sSalah);

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

        latihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLatihan2();
            }
        });

        latihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLatihan3();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetScore();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {

                byte scoreL1 = data.getByteExtra("score", (byte) 0);
                //float test = Float.valueOf(scoreL1);
                int scoreL1_int = Integer.valueOf(scoreL1);


                //scoreL1_int = (scoreL1_int/4*100);
                //int test2 = Integer.valueOf((int) scoreL1_int);

                label1.setText("SCORE");
                labelBenar.setText("BENAR");
                labelSalah.setText("SALAH");
                sBenar.setText(""+ scoreL1);
                sSalah.setText(""+(4-scoreL1));
                labelScore.setText("" + ((scoreL1_int*100)/4));
            }
            if (resultCode == RESULT_CANCELED) {
                labelScore.setText("00");
            }
        }
    }

    private void openLatihan1() {
        Intent intent = new Intent(this, Latihan1.class);
        startActivityForResult(intent, 1);
    }

    private void openLatihan2() {
        Intent intent = new Intent(this, Latihan2.class);
        startActivityForResult(intent, 1);
    }

    private void openLatihan3() {
        Intent intent = new Intent(this, Latihan3.class);
        startActivityForResult(intent, 1);
    }

    private void resetScore() {
        label1.setText("BANK SOAL");
        labelScore.setText("Matematika");
        labelBenar.setText("");
        labelSalah.setText("");
        sBenar.setText("");
        sSalah.setText("");
    }
}