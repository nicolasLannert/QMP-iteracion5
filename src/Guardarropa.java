import java.util.List;

public class Guardarropa {

    List<Prenda> prendas;
    Usuario duenio;
    List<Usuario> usuarioAcceso;
    List<Propuesta> propuestas;

    void agregarPrenda(Prenda prenda){
        prendas.add(prenda);
    }
    void removePrenda(Prenda prenda){
        prendas.remove(prenda);
    }

    void nuevaPropuesta(Propuesta propuesta){
        propuestas.add(propuesta);
    }
    void aceptarPropuesta(Propuesta propuesta){
        propuesta.validar(this);
    }

    void deshacerPropuesta(Propuesta propuesta){
        propuesta.deshacer(this);
    }

    void removePropuesta(Propuesta propuesta){
        propuestas.remove(propuesta);
    }

}
