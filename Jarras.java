public class Jarra {
//variables de instancia
	private int cantidad;
	private int capacidad;
//constructor
	public Jarra(int capacidadInicial){
		if(capacidadInicial<=0){
			throw new RuntimeException("ERROR: no se pueden crear jarras con capacidad menor" +
					"o igual que cero.");
		}
		this.capacidad=capacidadInicial;
	}
//  metodos
<<<<<<< HEAD
<<<<<<< HEAD
        public void llena(){
		this.cantidad=this.capacidad;
	}
	public void vacia(){
		this.cantidad=0;
	}

=======
              1
              2
              
     public void llenaDesde(Jarra j){
         while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
          	this.cantidad++;
          	j.cantidad--;
          }
         }
          	
        public String toString(){
          return ("("+this.capacidad+","+this.cantidad+")");
         }
>>>>>>> e507090c5a5b4e3c9a9143ab6b84267fef714630
=======
        public void llena(){
		this.cantidad=this.capacidad;
	}
public void vacia(){
		this.cantidad=0;
	}

>>>>>>> cf7c7216a60faca6c00685a670fd2b43fcbf1e7d

        public void metodoComunitario(){ 
// Comentario incluido para pruebas 
           System.out.println("Aqui escribimos todos");
         }


