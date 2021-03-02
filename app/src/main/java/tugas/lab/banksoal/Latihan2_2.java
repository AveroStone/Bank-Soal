package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Latihan2_2 extends AppCompatActivity {

    private RadioGroup RGl2_3, RGl2_4;
    public RadioButton L2_3;
    public RadioButton L2_4;
    byte scoreL2_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2_2);

        RGl2_3 = findViewById(R.id.L2S3);
        RGl2_4 = findViewById(R.id.L2S4);

        L2_3 = findViewById(R.id.Jwb_2_2_3D);
        L2_4 = findViewById(R.id.Jwb_2_2A);

    }

    public void radiocheked2(View view) {

        Intent intent = getIntent();
        scoreL2_2 = intent.getByteExtra("scoreL2_1", (byte) 0);

        if (L2_3.isChecked()){
            scoreL2_2++;
        }
        if (L2_4.isChecked()){
            scoreL2_2++;
        }
        //just for testing, does variable scoreL1_1 receive value that was passed from ActivityLatihan1.
        //Toast.makeText(this, ""+ scoreL1_2, Toast.LENGTH_LONG).show();
    }

    public void Finish2(View view) {
        radiocheked2(null);
        Intent intent = new Intent();

        intent.putExtra("score", scoreL2_2);
        setResult(RESULT_OK, intent);
        finish();
    }
}