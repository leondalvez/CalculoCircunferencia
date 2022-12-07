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

package Servicio;

import Entidad.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class CircunferenciaServicio {
    
    
    public Circunferencia crearCircu() {
        
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el radio");
        c1.setRadios(leer.nextDouble());
        
        
        return c1;
    }
    
    
    public void area(Circunferencia c1){
        Double area =  ((c1.getRadios() * c1.getRadios()) * PI);
        
        System.out.println("El área es: " + area);
  
    }
    
    public void perimetro(Circunferencia c1){
        Double perimetro = ((2 * PI) * c1.getRadios());
        
        System.out.println("El Perímetro es: " + perimetro);
    }
}
