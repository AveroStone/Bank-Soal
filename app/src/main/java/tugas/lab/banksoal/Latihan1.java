package tugas.lab.banksoal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Latihan1 extends AppCompatActivity {

    private Button finishL1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan1);

        finishL1 = (Button) findViewById(R.id.btn_Finish1);

        finishL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMain();
            }
        });
    }

    public void nextL1(View view) {
        setContentView(R.layout.activity_latihan1_2);
    }

    private void backToMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}