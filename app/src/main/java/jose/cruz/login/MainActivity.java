package jose.cruz.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etContrasena;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // match con la vista
        setContentView(R.layout.activity_main);
        // match de los widgets
        etNombre = findViewById(R.id.editText_usuario);
        etContrasena = findViewById(R.id.editText_contrasena);
        btnIngresar = findViewById(R.id.button_ingresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuarioIngresado = etNombre.getText().toString();
                String contrasenaIngresada = etContrasena.getText().toString();
                if(usuarioIngresado.isEmpty() || contrasenaIngresada.isEmpty()) {
                    // nombre de usuario vacio
                    mensajito("El usuario o contraseña están vacíos.");
                } else
                    if(usuarioIngresado.equals("jose") && contrasenaIngresada.equals("1234")) {
                        // imprimir bienvenido
                        mensajito("Bienvenido.");
                    } else {
                        // usuario o contrsena incorrectos
                        mensajito("Usuario o contraseña incorrectos.");
                    }
            }
        });
    }


    public  void mensajito(String mensaje){
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();

    }



}
