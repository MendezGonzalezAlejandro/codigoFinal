/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigoFinal;

/**
 *
 * @author mende
 */
public class Cuadrupla {

   String nombre;
   String op1;
   String op2;
   String res;

    public Cuadrupla(String n, String p1, String p2, String r) {
        nombre = n;
        op1 = p1;
        op2 = p2;
        res = r;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOp1() {
        return op1;
    }

    public String getOp2() {
        return op2;
    }

    public String getRes() {
        return res;
    }

}
