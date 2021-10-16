package cat.copernic.fgascong.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etPrimerValor, etSegundoValor;
    private TextView tvResultado;
    private RadioButton rbSumar, rbRestar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrimerValor = findViewById(R.id.valor1);
        etSegundoValor = findViewById(R.id.valor2);
        tvResultado = findViewById(R.id.txt_resultado);
        rbSumar = findViewById(R.id.radiobtn_suma);
        rbRestar = findViewById(R.id.radiobtn_resta);
    }

    public void calcular(View view) {
        try {
            int valor1 = Integer.parseInt(etPrimerValor.getText().toString());
            int valor2 = Integer.parseInt(etSegundoValor.getText().toString());

            if (rbSumar.isChecked()) {
                int suma = valor1 + valor2;
                tvResultado.setText(String.valueOf(suma));
            } else if (rbRestar.isChecked()) {
                int resta = valor1 - valor2;
                tvResultado.setText(String.valueOf(resta));
            }

        } catch (Exception e) {
            Toast.makeText(this, "Te falta rellenar alguna cosa", Toast.LENGTH_SHORT).show();
        }
    }
}