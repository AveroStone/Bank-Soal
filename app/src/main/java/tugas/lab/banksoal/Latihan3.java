package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Latihan3 extends AppCompatActivity {
    private RadioGroup RGl3_1, RGl3_2;
    public RadioButton L3_1;
    public RadioButton L3_2;
    byte scoreL3_1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3);

        RGl3_1 = findViewById(R.id.L3S1);
        RGl3_2 = findViewById(R.id.L3S2);

        L3_1 = findViewById(R.id.Jwb_3_1D);
        L3_2 = findViewById(R.id.Jwb_3_2A);
    }

    public void radioCheked1(View view) {

        if (L3_1.isChecked()){
            scoreL3_1++;
        }
        if (L3_2.isChecked()){
            scoreL3_1++;
        }
    }

    public void nextL3(View view) {
        radioCheked1(null);
        Intent intent = new Intent(this, Latihan3_2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
        intent.putExtra("scoreL3_1", scoreL3_1);
        startActivity(intent);
        finish();
    }
}