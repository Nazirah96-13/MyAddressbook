package sg.edu.rp.c346.id17032457.myaddressbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText name, mobile, email;
    TextView pref;
    RadioGroup rbtnsms, rbtnemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        mobile = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextEmail);

        rbtnemail = findViewById(R.id.radioPreferredMode);
        rbtnsms = findViewById(R.id.radioPreferredMode);







    }
}
