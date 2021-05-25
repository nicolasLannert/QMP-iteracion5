public class Usuario {

    void propuestaNuevaPrenda(Prenda prenda, Guardarropa guardarropa){
        guardarropa.nuevaPropuesta(new AgregarPrenda(prenda));
    }

    void propuestaSacarPrenda(Prenda prenda, Guardarropa guardarropa){
        guardarropa.nuevaPropuesta(new RemoverPrenda(prenda));
    }
}
