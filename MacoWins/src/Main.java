import java.time.LocalDate;
import java.util.Date;

import static Enum.tipo.PANTALON;
import static Enum.tipo.SACO;

public class Main {
    public static void main(String[] args) {
        Promocion p= new Promocion(200.0,SACO,50.0);
        Liquidacion l= new Liquidacion(400.0,PANTALON);
        Double a=l.calcularPrecio();
        System.out.println(a);
        LocalDate d= LocalDate.now();
        Venta v=new Venta(1,d);
        v.addLista(p);
        v.addLista(l);
        v.mostrarProductos();
        System.out.println(v.getPrecioTotal());
        System.out.println(v.getFecha());
        Registro r= new Registro();
        r.addLista(v);
        r.mostrarVentas();
        System.out.println("Fondos recaudados del dia " +r.sumatoriaDeVentasDelDia(LocalDate.now()));
        VentaConTarjeta vt=new VentaConTarjeta(2,d,6,20);
        vt.addLista(p);
        vt.addLista(l);
        System.out.println("Con tarjeta precio total "+vt.getPrecioTotal());
        r.addLista(vt);
        r.mostrarVentas();
        System.out.println("Fondos recaudados del dia " +r.sumatoriaDeVentasDelDia(LocalDate.now()));
    }
}