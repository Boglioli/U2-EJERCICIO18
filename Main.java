public class Main {
    public static void main(String[] args) {
        ImpresoraFiscal fiscal = new ImpresoraFiscal();
        CajaRegistradora caja = new CajaRegistradora(fiscal);

        Factura factura = new Factura(1001, "Juan Perez");
        factura.agregarItem(new ItemFactura("Hamburguesa", 2, 5000));
        factura.agregarItem(new ItemFactura("Gaseosa", 2, 1500));
        factura.agregarItem(new ItemFactura("Papas", 1, 2500));

        caja.cerrarVenta(factura);
    }
}
