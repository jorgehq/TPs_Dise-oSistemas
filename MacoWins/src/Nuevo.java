import static Enum.estado.NUEVO;

public class Nuevo extends Prenda{
    public Nuevo(Double precio, Enum tipo) {
        super(precio, tipo);
        this.setEstado(NUEVO);
    }

}
