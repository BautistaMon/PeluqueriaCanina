
package com.mycompany.peluqueriacanina.logica;


import com.mycompany.peluqueriacanina.persistencia.ControladoraPer;
import java.util.List;



public class ControladoraLog {
    
    ControladoraPer  controlPersis = new ControladoraPer();

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        //creamos dueño asignamos sus valores
        Duenio duenio =new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        //creamos la mascota con valores
        
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setColor(color);
        masco.setRaza(raza);
        masco.setAlergico(alergico);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
         
        
    
}

    public void borrarMascota(int num_cliente) {
       controlPersis.borrarMascota (num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
      return controlPersis.traerMascota(num_cliente);
    
}

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        
        controlPersis.modificarMascota(masco);
        
        Duenio dueno = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        dueno.setCelDuenio(celDuenio);
        dueno.setNombre(nombreDuenio);
        
        
        this.modificarDuenio(dueno);
       
    }

    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
        
}

    private void modificarDuenio(Duenio dueno) {
       controlPersis.modificarDuenio(dueno);
    }
}

       
    

   

    
        
    

