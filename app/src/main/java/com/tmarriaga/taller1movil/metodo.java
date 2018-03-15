package com.tmarriaga.taller1movil;

/**
 * Created by tmarriaga on 14/03/2018.
 */

public class metodo {

    public static double totalPago(int op_material,int op_dije,int op_tipo,int op_moneda,Double cant,double tasa){
        double valorPago=10.00;
        switch (op_material){
            case 0:/*Cuero*/
                switch (op_dije){
                    case 0:/*Martillo*/
                        switch (op_tipo){
                            case 0: /*Oro*/
                                    if(op_moneda==0){ /*Usd*/
                                        valorPago = 100 * cant;
                                    } else { /*Pesos*/
                                        valorPago = 100 * cant * tasa;
                                    }
                                break;
                            case 1: /*Oro Rosado*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 100 * cant;
                                } else {/*Pesos*/
                                    valorPago = 100 * cant * tasa;
                                }
                                break;
                            case 2: /*plata*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 80 * cant;
                                } else {/*Pesos*/
                                    valorPago = 80 * cant * tasa;
                                }
                                break;
                            case 3: /*niquel*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 70 * cant;
                                } else {/*Pesos*/
                                    valorPago = 70 * cant * tasa;
                                }
                                break;
                        }
                        break;
                    case 1: /*Ancla*/
                        switch (op_tipo){
                            case 0: /*Oro*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 120 * cant;
                                } else { /*Pesos*/
                                    valorPago = 120 * cant * tasa;
                                }
                                break;
                            case 1: /*Oro Rosado*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 120 * cant;
                                } else {/*Pesos*/
                                    valorPago = 120 * cant * tasa;
                                }
                                break;
                            case 2: /*plata*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 100 * cant;
                                } else {/*Pesos*/
                                    valorPago = 100 * cant * tasa;
                                }
                                break;
                            case 3: /*niquel*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 90 * cant;
                                } else {/*Pesos*/
                                    valorPago = 90 * cant * tasa;
                                }
                                break;
                        }
                        break;
                }
                break;
            case 1: /*Cuerda*/
                switch (op_dije){
                    case 0:/*Martillo*/
                        switch (op_tipo){
                            case 0: /*Oro*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 90 * cant;
                                } else { /*Pesos*/
                                    valorPago = 90 * cant * tasa;
                                }
                                break;
                            case 1: /*Oro Rosado*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 90 * cant;
                                } else {/*Pesos*/
                                    valorPago = 90 * cant * tasa;
                                }
                                break;
                            case 2: /*plata*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 70 * cant;
                                } else {/*Pesos*/
                                    valorPago = 70 * cant * tasa;
                                }
                                break;
                            case 3: /*niquel*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 50 * cant;
                                } else {/*Pesos*/
                                    valorPago = 50 * cant * tasa;
                                }
                                break;
                        }
                        break;
                    case 1: /*Ancla*/
                        switch (op_tipo){
                            case 0: /*Oro*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 110 * cant;
                                } else { /*Pesos*/
                                    valorPago = 110 * cant * tasa;
                                }
                                break;
                            case 1: /*Oro Rosado*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 110 * cant;
                                } else {/*Pesos*/
                                    valorPago = 110 * cant * tasa;
                                }
                                break;
                            case 2: /*plata*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 90 * cant;
                                } else {/*Pesos*/
                                    valorPago = 90 * cant * tasa;
                                }
                                break;
                            case 3: /*niquel*/
                                if(op_moneda==0){ /*Usd*/
                                    valorPago = 80 * cant;
                                } else {/*Pesos*/
                                    valorPago = 80 * cant * tasa;
                                }
                                break;
                        }
                        break;
                }
                break;
        }

        return  valorPago;
    }
}
