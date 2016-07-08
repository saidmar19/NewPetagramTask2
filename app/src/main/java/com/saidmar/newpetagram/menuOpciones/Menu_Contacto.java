package com.saidmar.newpetagram.menuOpciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saidmar.newpetagram.R;

public class Menu_Contacto extends AppCompatActivity {

    public EditText nombre;
    public EditText correo;
    public EditText mensaje;
    public Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__contacto);

        final EditText nombre = (EditText)findViewById(R.id.et_nombre);
        final EditText correo = (EditText)findViewById(R.id.et_correo);
        final EditText mensaje = (EditText)findViewById(R.id.et_mensaje);
        final Button btnContact = (Button)findViewById(R.id.btn_contact);


        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Menu_Contacto.this,getResources().getString(R.string.toast_contact), Toast.LENGTH_LONG).show();

                nombre.setText(null);
                correo.setText(null);
                mensaje.setText(null);
            }
        });
    }
}
