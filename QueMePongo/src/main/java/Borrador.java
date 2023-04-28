import Enum.*;
public class Borrador {
    private tipoPrenda tipo;
    private material m;

    private colorPrimario colorP;

    private colorSecundario colorS;

    private trama t;

    public Borrador() {

    }
    public Prenda crearPrenda(){
        try{
            verificarNulos(tipo,m,colorP);
            return new Prenda(tipo,m,colorP,colorS,t);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    public void setTipo(tipoPrenda tipo) {

        this.tipo = tipo;
    }

    public void setM(material m) {

        this.m = m;
    }

    public void setColorP(colorPrimario colorP) {

        this.colorP = colorP;
    }

    public void setColorS(colorSecundario colorS) {
        this.colorS = colorS;
    }

    public void setT(trama t) {
       if (t==null){
           this.t=trama.LISA;
       }else{
           this.t=t;
       }
    }
    public void verificarNulos(tipoPrenda tipo, material m,colorPrimario colorP){

        if(tipo==null || m==null || colorP==null){
            throw new NullPointerException("La prenda le faltan datos");
        }

    }

}
