import java.time.LocalDate;

public class VentaConTarjeta extends Venta{
    private int cuotas;
    private int coeficienteFijo;

    public VentaConTarjeta() {
    }

    public VentaConTarjeta(int código, LocalDate fecha, int cuotas, int coeficienteFijo) {
        super(código, fecha);
        this.cuotas = cuotas;
        this.coeficienteFijo = coeficienteFijo;
    }
    public Double calcularPrecioConTarjeta(Double precioPrenda){
        return (cuotas*coeficienteFijo+precioPrenda*0.01)+precioPrenda;
    }

    @Override
    public void addLista(Prenda p) {
        getPrendaL().add(p);
        setCantidad(1);
        calcularPrecioBase(calcularPrecioConTarjeta(p.calcularPrecio()));
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public void setCoeficienteFijo(int coeficienteFijo) {
        this.coeficienteFijo = coeficienteFijo;
    }

    public int getCuotas() {
        return cuotas;
    }

    public int getCoeficienteFijo() {
        return coeficienteFijo;
    }
}
