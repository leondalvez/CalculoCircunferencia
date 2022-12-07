/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package calculocircunferencia;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author Leonardo Alvez
 */
public class CalculoCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos un objeto del tipo servicio 
        CircunferenciaServicio cs = new CircunferenciaServicio();

        /// Instanciamos un objeto circunferencia para alojar el retorno 
        /// de lo construido en la clase de servicio.
        Circunferencia c1 = cs.crearCircu();
        
        cs.area(c1);
        cs.perimetro(c1);
        
        
                
    }

}
