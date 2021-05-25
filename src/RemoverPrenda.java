public class RemoverPrenda extends Propuesta{

    void validar(Guardarropa guardarropa){
        guardarropa.removePrenda(prenda);
    }
    void deshacer(Guardarropa guardarropa){
        guardarropa.agregarPrenda(prenda);
    }
}
