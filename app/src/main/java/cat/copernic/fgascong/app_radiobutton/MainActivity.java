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
    private RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPrimerValor = findViewById(R.id.valor1);
        etSegundoValor = findViewById(R.id.valor2);
        tvResultado = findViewById(R.id.txt_resultado);
        rbSumar = findViewById(R.id.radiobtn_suma);
        rbRestar = findViewById(R.id.radiobtn_resta);
        rbMultiplicar = findViewById(R.id.rb_multiplicar);
        rbDividir = findViewById(R.id.rb_dividir);
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
            } else if (rbMultiplicar.isChecked()){
                int multiplication = valor1 * valor2;
                tvResultado.setText(String.valueOf(multiplication));
            } else if (rbDividir.isChecked()){
                if(valor2 != 0){
                    int division = valor1 / valor2;
                    tvResultado.setText(String.valueOf(division));
                }else{
                    Toast.makeText(this, "El segundo valor no puede ser 0", Toast.LENGTH_SHORT).show();
                }
            }

        } catch (Exception e) {
            Toast.makeText(this, "Te falta rellenar un valor o marcar una opcion", Toast.LENGTH_SHORT).show();
        }
    }
}