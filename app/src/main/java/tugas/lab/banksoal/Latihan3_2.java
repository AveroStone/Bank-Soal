package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Latihan3_2 extends AppCompatActivity {

    private RadioGroup RGl3_3, RGl3_4;
    public RadioButton L3_3;
    public RadioButton L3_4;
    byte scoreL3_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3_2);

        RGl3_3 = findViewById(R.id.L3S3);
        RGl3_4 = findViewById(R.id.L3S4);

        L3_3 = findViewById(R.id.Jwb_3_2_3D);
        L3_4 = findViewById(R.id.Jwb_3_2C);

    }

    public void radiocheked2(View view) {

        Intent intent = getIntent();
        scoreL3_2 = intent.getByteExtra("scoreL3_1", (byte) 0);

        if (L3_3.isChecked()){
            scoreL3_2++;
        }
        if (L3_4.isChecked()){
            scoreL3_2++;
        }
        //just for testing, does variable scoreL1_1 receive value that was passed from ActivityLatihan1.
        //Toast.makeText(this, ""+ scoreL1_2, Toast.LENGTH_LONG).show();
    }

    public void Finish3(View view) {
        radiocheked2(null);
        Intent intent = new Intent();

        intent.putExtra("score", scoreL3_2);
        setResult(RESULT_OK, intent);
        finish();
    }
}