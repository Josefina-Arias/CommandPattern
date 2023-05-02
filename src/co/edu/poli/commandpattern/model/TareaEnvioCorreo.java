package co.edu.poli.commandpattern.model;

public class TareaEnvioCorreo implements TareaProducto  {
 
    @Override
    public void ejecutar(Producto producto) {
        System.out.println(producto.getNombre() +"enviado por correo") ;
         
    }

}
