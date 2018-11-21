package blooddonate.com.blooddonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerifyNumber extends AppCompatActivity {

    EditText edtNumber;
    Button btnGetOPD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_number);

        edtNumber = findViewById(R.id.edtNumber);
        btnGetOPD = findViewById(R.id.btnGetOPD);

        btnGetOPD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VerifyNumber.this, BloodDetail.class);
                startActivity(intent);
            }
        });

    }
}
