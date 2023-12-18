package org.example;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Mercancia {
    String idMerca;
    String tipoTransporte;

    Date fecha;
    int distancia;
    int mercancia;
    int costo;

    public Mercancia(String idMerca, String tipoTransporte, Date fecha, int distancia, int mercancia, int costo) {
        this.idMerca = idMerca;
        this.tipoTransporte = tipoTransporte;
        this.fecha = fecha;
        this.distancia = distancia;
        this.mercancia = mercancia;
        this.costo = costo;
    }
}
class Inventario {
private List <Mercancia> inventario;

public Inventario(){
    this.inventario= new ArrayList<>();
}
    public void asignarMercancia(String idMerca, String tipoTransporte, Date fecha, int distancia, int mercancia, int costo){
    Mercancia nuevaMercancia = new Mercancia(idMerca, tipoTransporte, fecha, distancia, mercancia, costo);
    inventario.add(nuevaMercancia);
    }
    public void mercanciaTerrestre(String idMerca, String tipoTransporte, Date fecha, int distancia, int mercancia, int costo){
        Mercancia nuevaMercancia = new Mercancia(idMerca, tipoTransporte, fecha, distancia, mercancia, costo);
        if (tipoTransporte.equals("terrestre")){
            if (mercancia<=500){
                System.out.println("Tu costo de envio es de 50");
            }else {
                if (mercancia>500){
                    System.out.println("tu costo de envio es de 40");
                }
            }
            System.out.println("Transporte correcto amigo");
        }else {
            System.out.println("transporte incorrecto");
        }
        System.out.println("Tu id es: " + idMerca+ "tu transporte es: "+ tipoTransporte + "Tu fecha es" + fecha + "TU distancia es: "+distancia +"tu mercancia es:" + mercancia + "y tu costo es de: " +costo);
    }
    public void mercanciaMaritima(String idMerca, String tipoTransporte, Date fecha, int distancia, int mercancia, int costo){
        Mercancia nuevaMercancia = new Mercancia(idMerca, tipoTransporte, fecha, distancia, mercancia, costo);
        if (tipoTransporte.equals("maritima")){
            if (mercancia<=500){
                System.out.println("Tu costo de envio es de 100 pesos");
            } else{
                if (mercancia>500) {
                System.out.println("Tu costo de envio es de 80 pesos");
            }
        }
            System.out.println("Transporte correcto amigo");
        }else {
            System.out.println("transporte incorrecto");
        }
    }
    public void mercanciaAerea(String idMerca, String tipoTransporte, Date fecha, int distancia, int mercancia, int costo){
        Mercancia nuevaMercancia = new Mercancia(idMerca, tipoTransporte, fecha, distancia, mercancia, costo);
        if (tipoTransporte.equals("aerea")){
            System.out.println("Transporte correcto amigo");
        }else {
            System.out.println("transporte incorrecto");
        }
    }
}
public class Main {
    public static void main(String[] args) {

    }

}