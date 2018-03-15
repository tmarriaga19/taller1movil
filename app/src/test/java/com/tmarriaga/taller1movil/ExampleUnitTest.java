package com.tmarriaga.taller1movil;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void cuero_martillo_oro_usd(){
        double  cant = 5, tasa =3200.00;
        int op_material=0,op_dije=0,op_tipo=0,op_moneda=0;
        double res = metodo.totalPago(op_material,op_dije,op_tipo,op_moneda,cant,tasa);
        assertEquals(500,res,0 );
    }

    @Test
    public void cuero_martillo_niquel_usd(){
        double  cant = 5, tasa =3200.00;
        int op_material=0,op_dije=0,op_tipo=3,op_moneda=0;
        double res = metodo.totalPago(op_material,op_dije,op_tipo,op_moneda,cant,tasa);
        assertEquals(350,res,0 );
    }

    @Test
    public void cuero_ancla_ororosado_usd(){
        double  cant = 5, tasa =3200.00;
        int op_material=0,op_dije=1,op_tipo=1,op_moneda=0;
        double res = metodo.totalPago(op_material,op_dije,op_tipo,op_moneda,cant,tasa);
        assertEquals(600,res,0 );
    }

    @Test
    public void cuerda_martillo_plata_pesos(){
        double  cant = 5, tasa =3200.00;
        int op_material=1,op_dije=0,op_tipo=2,op_moneda=1;
        double res = metodo.totalPago(op_material,op_dije,op_tipo,op_moneda,cant,tasa);
        assertEquals(1120000,res,0 );
    }

    @Test
    public void cuerda_martillo_niquel_pesos(){
        double  cant = 5, tasa =3200.00;
        int op_material=1,op_dije=0,op_tipo=3,op_moneda=1;
        double res = metodo.totalPago(op_material,op_dije,op_tipo,op_moneda,cant,tasa);
        assertEquals(800000,res,0 );
    }




}