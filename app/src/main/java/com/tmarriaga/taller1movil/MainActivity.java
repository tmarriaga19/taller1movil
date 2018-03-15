package com.tmarriaga.taller1movil;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText cantidad;
    private TextView resultado;
    private Resources recursos;
    private Spinner sp_material,sp_dije,sp_tipo,sp_moneda;
    private String ls_material[],ls_dije[],ls_tipo[],ls_moneda[];
    private Double trm = 3200.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cantidad = findViewById(R.id.txtcantidad);
        resultado = findViewById(R.id.lblresultado);

        recursos = this.getResources();

        sp_material = findViewById(R.id.cmbmaterial);
        ls_material = recursos.getStringArray(R.array.listamaterial);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ls_material);
        sp_material.setAdapter(adapter);
        sp_material.setSelection(-1);

        sp_dije = findViewById(R.id.cmbdije);
        ls_dije = recursos.getStringArray(R.array.listadije);
        ArrayAdapter<String> adapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ls_dije);
        sp_dije.setAdapter(adapter1);

        sp_tipo = findViewById(R.id.cmbtipo);
        ls_tipo = recursos.getStringArray(R.array.listatipo);
        ArrayAdapter<String> adapter2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ls_tipo);
        sp_tipo.setAdapter(adapter2);

        sp_moneda = findViewById(R.id.cmbmoneda);
        ls_moneda = recursos.getStringArray(R.array.listamoneda);
        ArrayAdapter<String> adapter3 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ls_moneda);
        sp_moneda.setAdapter(adapter3);

    }

    private boolean validar(){
        if (cantidad.getText().toString().isEmpty() ){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error_numero1));
            return false;
        }

        if ( Double.parseDouble(cantidad.getText().toString()) <= 0 ){
            cantidad.requestFocus();
            cantidad.setError(recursos.getString(R.string.error_numero1));
            return false;
        }

        return  true;
    }

    public void calcular(View v){
        double cant;
        resultado.setText("");

        int op_material,op_dije,op_tipo,op_moneda;

        op_material=sp_material.getSelectedItemPosition();
        op_dije=sp_dije.getSelectedItemPosition();
        op_tipo=sp_tipo.getSelectedItemPosition();
        op_moneda=sp_moneda.getSelectedItemPosition();

        if (validar()){
            cant=Double.parseDouble(cantidad.getText().toString());
            double valores = metodo.totalPago(op_material,op_dije,op_tipo,op_moneda,cant,trm);
            resultado.setText(""+String.format("%.2f",valores));
        }

    }

}
