package com.example.android.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class principal extends AppCompatActivity {
    private EditText txtCantidad;
    private Spinner cmbSexo,cmbTipo,cmbMarca;
    private TextView resultado;
    private  String opcSexo[],opcTipo[],opcMarca[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}
