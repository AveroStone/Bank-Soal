package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Latihan1_2 extends AppCompatActivity {

    private RadioGroup RGl1_3, RGl1_4;
    public RadioButton L1_3;
    public RadioButton L1_4;
    byte scoreL1_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1_2);

        RGl1_3 = findViewById(R.id.L1S3);
        RGl1_4 = findViewById(R.id.L1S4);

        L1_3 = findViewById(R.id.Jwb_1_1_3D);
        L1_4 = findViewById(R.id.Jwb_1_1_4A);

    }

    public void radiocheked2(View view) {

        Intent intent = getIntent();
        scoreL1_2 = intent.getByteExtra("scoreL1_1", (byte) 0);

        if (L1_3.isChecked()){
            scoreL1_2++;
        }
        if (L1_4.isChecked()){
            scoreL1_2++;
        }
        //just for testing, does variable scoreL1_1 receive value that was passed from ActivityLatihan1.
        //Toast.makeText(this, ""+ scoreL1_2, Toast.LENGTH_LONG).show();
    }

    public void Finish1(View view) {
        radiocheked2(null);
        Intent intent = new Intent();

        intent.putExtra("score", scoreL1_2);
        setResult(RESULT_OK, intent);
        finish();
    }
}