import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Registro {
    private List <Venta> ventaL;


    public Registro() {
        ventaL=new ArrayList<Venta>();
    }

    public Registro(List ventaL) {
        this.ventaL = ventaL;
    }

    public void addLista(Venta venta){
        ventaL.add(venta);
    }

    public Double sumatoriaDeVentasDelDia(LocalDate fecha){

        Double sumatoria=0.0;
        for(Venta o:ventaL){
            if(o.fechaCMP(fecha)==0){
                sumatoria+=o.getPrecioTotal();
            }
        }
        return sumatoria;
    }
    public void mostrarVentas(){
        for(Venta v:ventaL){
            System.out.println(v.toString());
        }

    }

}
