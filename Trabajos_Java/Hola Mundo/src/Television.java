
public class Television {
        private boolean estaEncendido=false;
        private int canal;
        private int volumen;
        public static int contador= 0;
        
        public static void mensaje() {
        	System.out.println("metodo estatico");
        }
        public Television(int volumen) {
        	this.volumen = volumen;
        	contador++;
        }
        public Television(int volumen, int canal) {
        	this.volumen = volumen;
        	this.canal = canal;
        	contador++;
        }
		public void setVolumen(int volumenParam) {
        	volumen = volumenParam;
        }
        
        public int getVolumen() {
            return volumen;
        }
        public boolean getEstaEncendido() {
        	return estaEncendido;
        }
        
        public void encender() {
            estaEncendido = true;
        }
    
        public void apagar(){
            estaEncendido = false;
        }    
        public void subirVolumen(){
        	if(estaEncendido && volumen <100 )
            volumen++;
        }    
        public void bajarVolumen(){
        	if(estaEncendido && volumen >0 )
            volumen--;
        }    
        public void aumentarCanal(){
        	if(estaEncendido && canal <100 )
            canal++;
        }
        public void disminuirCanal(){
            if(estaEncendido && canal >0 )
            canal--;
        }
}
