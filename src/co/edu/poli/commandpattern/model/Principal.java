package co.edu.poli.commandpattern.model;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperTarea st= new SuperTarea();
        SuperTarea st1 = new SuperTarea();
        
        st.addTarea(new ValidarProducto());
        st.addTarea(new TareaEnvioCorreo());
        
        st1.addTarea(new TareaImprimirProducto());
        st1.addTarea(new ValidarProducto());
         
        GestorTarea gt= new GestorTarea();
        Producto p= new Producto(1,"tablet ",99);
        
        Producto p1 = new Producto(2, "Celular ", 80);
         
        gt.ejecutar(st, p);
        
        gt.ejecutar(st1, p1);
 
	}

}
