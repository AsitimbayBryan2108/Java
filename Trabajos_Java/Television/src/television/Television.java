package television;

public class Television {
        private boolean estaEncendido=false;
        private int canal;
        private int volumen;

        public void encender() {
            estaEncendido = true;
        }
    
        public void apagar(){
            estaEncendido = false;
        }    
        public void subirVolumen(){
            if(estaEncendido)
            volumen++;
        }    
        public void bajarVolumen(){
            if(estaEncendido)
            volumen--;
        }    
        public void aumentarCanal(){
            if(estaEncendido)
            canal++;
        }
        public void disminuirCanal(){
            if(estaEncendido)
            canal--;
        }
}

