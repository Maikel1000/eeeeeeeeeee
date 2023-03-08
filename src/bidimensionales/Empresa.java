/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidimensionales;

import com.miltxonborda.utilidades.Utilidadess;

/**
 *
 * @author maike
 */
public class Empresa {
    Personal [] personas;
    Categoria[] categorias;
    Proyecto [] proyectos;
    String [] situciaones;
    
    
    public void pedirDatos(){
        String nombre;
        int [] meses;
    //poner variables
        for (int per = 0; per <personas.length ; per++) {
            nombre=Utilidadess.pedirNombre("introduce nombre de operario");
            meses = new int [12];
            for (int m = 0; m < meses.length; m++) {
                meses[m]=Utilidadess.pedirNumeroEntero("mes", 0);
            }
            personas[per]=new Personal(nombre,meses);//guardar datos (nombre, meses)        }
    
    
    }
    
    }
    
    
    
    
}

