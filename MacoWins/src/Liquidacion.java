import static Enum.estado.LIQUIDACION;

public class Liquidacion extends Prenda {
    public Liquidacion(Double precio, Enum tipo) {
        super(precio, tipo);
        this.setEstado(LIQUIDACION);
    }

    @Override
    public String toString() {
        return "Liquidacion{" +
                super.toString()+
                "}";
    }

    @Override
    public Double calcularPrecio() {
        return super.calcularPrecio()*0.5;
    }
}
