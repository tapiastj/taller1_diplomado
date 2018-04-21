package com.example.android.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import static com.example.android.taller1.core.Calculate.cotizar;

public class principal extends AppCompatActivity {
    private EditText txtCantidad;
    private Spinner cmbSexo,cmbTipo,cmbMarca;
    private TextView resultado;
    private  String opcSexo[],opcTipo[],opcMarca[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtCantidad = findViewById(R.id.txtCantidad);
        cmbSexo = findViewById(R.id.cmbSexo);
        cmbTipo = findViewById(R.id.cmbTipo);
        cmbMarca = findViewById(R.id.cmbMarca);
        resultado = findViewById(R.id.lblResultado);

        opcSexo = this.getResources().getStringArray(R.array.opcSexo);
        ArrayAdapter<String> adapterSexo = new ArrayAdapter(this,android.R.layout.simple_spinner_item,opcSexo);
        cmbSexo.setAdapter(adapterSexo);

        opcTipo = this.getResources().getStringArray(R.array.opcTipo);
        ArrayAdapter<String> adapterTipo = new ArrayAdapter(this,android.R.layout.simple_spinner_item,opcTipo);
        cmbTipo.setAdapter(adapterTipo);

        opcMarca = this.getResources().getStringArray(R.array.opcMarca);
        ArrayAdapter<String> adapterMarca = new ArrayAdapter(this,android.R.layout.simple_spinner_item,opcMarca);
        cmbMarca.setAdapter(adapterMarca);
    }

    public void realizarCotizacion(View v){
        int sexoSeleccionado,tipoSeleccionado,marcaSeleccionada,cantidadIngresada,resultadoCotizacion = 0;
        if(validar()){
            sexoSeleccionado = cmbSexo.getSelectedItemPosition();
            tipoSeleccionado = cmbTipo.getSelectedItemPosition();
            marcaSeleccionada = cmbMarca.getSelectedItemPosition();
            cantidadIngresada = Integer.parseInt(txtCantidad.getText().toString());
            resultadoCotizacion = cotizar(sexoSeleccionado,tipoSeleccionado,marcaSeleccionada,cantidadIngresada);
            this.resultado.setText(""+resultadoCotizacion);
        }
    }

    public boolean validar(){

        if (txtCantidad.getText().toString().isEmpty()){
            txtCantidad.setError(this.getResources().getString(R.string.error));
            txtCantidad.requestFocus();
            return false;
        }

        return true;
    }


    public void limpiar(View v){
        this.resultado.setText("");
        this.txtCantidad.setText("");
        this.cmbSexo.setSelection(0);
        this.cmbTipo.setSelection(0);
        this.cmbMarca.setSelection(0);
        this.cmbSexo.requestFocus();
    }
}
