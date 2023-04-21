import java.util.ArrayList;
import java.util.List;
import Enum.*;
/*
* La clase atuendo tiene dos listas una para las prendas ingresadas y otra para el filtrado de estas.
* Por ahora no se ra necesario la segunda ya que no hay ningun requisito para hacer la filtracion.
* Se crearon dos clases coincidenTipoCategoria y sonNulos para verificar si tiene logica el tipo y su categoria
*  y si no se completo correctamente la informacion de una prenda.
* */
public class Atuendo {
    private List <Prenda> listaP;
    private List <Prenda> atuendoElegido;

    public Atuendo() {
        listaP=new ArrayList<Prenda>();
        atuendoElegido=new ArrayList<Prenda>();
    }

    public void addPrenda(tipoPrenda tp, categoria c,material m, colorPrimario pri){

        try{
            Prenda pre=new Prenda(tp,c,m,pri);
            if(sonNulos(pre)==false){
                throw  new RuntimeException("Faltan completar informacion");
            }
            if(coincideTipoCategoria(pre)==false){
                throw new RuntimeException("Tipo y categoria no son las correctas");
            }else{
                System.out.println("Datos OK");
            }
            listaP.add(pre);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }

    }
    public boolean sonNulos(Prenda pre){
        if(pre.getCate()==null || pre.getTipo()==null || pre.getColorP()==null || pre.getMaterial()==null){
            return false;
        }
        return true;
    }
    public boolean coincideTipoCategoria(Prenda pre){
        switch(pre.getTipo()){
            case CAMISA_MANGA_CORTA:
            case CAMPERA:
            case REMERA: return pre.getCate()==categoria.PARTE_SUPERIOR;

            case PANTALON: return pre.getCate()==categoria.PARTE_INFERIOR;

            case ZAPATOS: return pre.getCate()==categoria.CALZADO;

            case MEDIAS: return pre.getCate()==categoria.CUBRE_PIERNA;

            case ARETE:
            case ANILLO:
            case COLLAR: return pre.getCate()==categoria.ACCESORIOS;

            default:
                break;
        }
        return false;
    }
    public void filtrarPrendasRequisitos(){

    }

    public void  mostrarListaPrendas(){

        for(Prenda p:listaP){
            System.out.println(p.toString());
        }
    }


}
