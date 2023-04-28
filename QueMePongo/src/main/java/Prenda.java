import Enum.*;


public class Prenda {
        private  tipoPrenda tipo;
        private material m;

        private colorPrimario colorP;

        private colorSecundario colorS;

        private trama t;



        public Prenda(tipoPrenda tipo, material m,colorPrimario colorP,colorSecundario colorS,trama t) {

              //  verificarNulos(tipo,m,colorP);

                this.tipo = tipo;
                this.m = m;
                this.colorP = colorP;
                this.colorS= colorS;
                this.t=t;

        }
/*
        public boolean verificarNulos(tipoPrenda tipo, material m,colorPrimario colorP){
                if(tipo==null || m==null || colorP==null){
                       throw new NullPointerException("La prenda le faltan datos");
                }
                return true;
        }

 */
        @Override
        public String toString() {
                return "Prenda{" +
                        "tipo=" + tipo +
                        ", categoria=" + tipo.getCate() +
                        ", m=" + m +
                        ", colorP=" + colorP +

                        '}';
        }

        public void setT(trama t) {
                this.t = t;
        }

        public void setColorS(colorSecundario colorS) {
                this.colorS = colorS;
        }

        public tipoPrenda getTipo() {
                return tipo;
        }

        public colorPrimario getColorP() {
                return colorP;
        }


}
