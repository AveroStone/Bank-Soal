package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Latihan1 extends AppCompatActivity {

    private RadioGroup RGl1_1, RGl1_2;
    public RadioButton L1_1;
    public RadioButton L1_2;
    byte scoreL1_1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1);

        RGl1_1 = findViewById(R.id.L1S1);
        RGl1_2 = findViewById(R.id.L1S2);

        L1_1 = findViewById(R.id.Jwb_1_1D);
        L1_2 = findViewById(R.id.Jwb_1_2A);
    }

    public void radioCheked1(View view) {

        if (L1_1.isChecked()){
            scoreL1_1++;
        }
        if (L1_2.isChecked()){
            scoreL1_1++;
        }
    }

    public void nextL1(View view) {
        radioCheked1(null);
        Intent intent = new Intent(this, Latihan1_2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
        intent.putExtra("scoreL1_1", scoreL1_1);
        startActivity(intent);
        finish();
    }
}