import LibreriaV2.*;

public class main {
    public static void main(String[] args) {
        InterfaceMetodosComunes miSalida,misalida2,misalida3,miEntrada1,miEntrada2;
        miSalida=FactoriaS.getProductoSalida(FactoriaS.CONSOLA);
        miSalida.visualizar("Hola");
        misalida2=FactoriaS.getProductoSalida(FactoriaS.VENTANA);
        misalida2.visualizar("Adios");
        misalida3=FactoriaS.getProductoSalida(FactoriaS.IMPRESORA);
        misalida3.visualizar("Imprimiendo por impresora");
        miEntrada1= FactoriaE.getProductoEntrada(FactoriaE.CONSOLA);
        miEntrada1.introducirDatos();
        miEntrada2=FactoriaE.getProductoEntrada(FactoriaE.VENTANA);
        miEntrada2.introducirDatos();
    }
}
