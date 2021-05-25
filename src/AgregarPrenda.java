public class AgregarPrenda extends Propuesta{

    void validar(Guardarropa guardarropa){
        guardarropa.agregarPrenda(prenda);
    }
    void deshacer(Guardarropa guardarropa){
        guardarropa.removePrenda(prenda);
    }
}
