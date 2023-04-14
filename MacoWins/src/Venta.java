import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
   private int Código;
    private LocalDate fecha;
    private List<Prenda> prendaL;
    private int cantidad;
    private Double precioTotal;

    public Venta() {
    }

    public Venta(int código, LocalDate fecha) {
        Código = código;
        this.fecha = fecha;
        this.prendaL = new ArrayList<Prenda>();
        this.cantidad = 0;
        this.precioTotal = 0.0;
    }
    public void calcularPrecioBase(Double precioPrenda) {
        precioTotal+=precioPrenda;

    }
    public void addLista(Prenda p){
        prendaL.add(p);
        setCantidad(1);
        calcularPrecioBase(p.calcularPrecio());
    }
    public void mostrarProductos(){
        for(Prenda p:prendaL){
            System.out.println(p.toString());
        }
    }
    public int fechaCMP(LocalDate buscar){
        return fecha.compareTo(buscar);
    }


    @Override
    public String toString() {
        return "Venta{" +
                "Código=" + Código +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                ", precioTotal=" + precioTotal +
                '}';
    }

    public void setCódigo(int código) {
        Código = código;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setPrendaL(List prendaL) {
        this.prendaL = prendaL;
    }

    public void setCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCódigo() {
        return Código;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public List getPrendaL() {
        return prendaL;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }
}
