package tugas.lab.banksoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Latihan2 extends AppCompatActivity {
    private RadioGroup RGl2_1, RGl2_2;
    public RadioButton L2_1;
    public RadioButton L2_2;
    byte scoreL2_1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan2);

        RGl2_1 = findViewById(R.id.L2S1);
        RGl2_2 = findViewById(R.id.L2S2);

        L2_1 = findViewById(R.id.Jwb_2_1B);
        L2_2 = findViewById(R.id.Jwb_2_2D);
    }

    public void radioCheked2(View view) {

        if (L2_1.isChecked()){
            scoreL2_1++;
        }
        if (L2_2.isChecked()){
            scoreL2_1++;
        }
    }

    public void nextL2(View view) {
        radioCheked2(null);
        Intent intent = new Intent(this, Latihan2_2.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_FORWARD_RESULT);
        intent.putExtra("scoreL2_1", scoreL2_1);
        startActivity(intent);
        finish();
    }
}