public class CajaRegistradora {
     ImpresoraFiscal impresora;
    public CajaRegistradora(ImpresoraFiscal impresora) {
        this.impresora = impresora;
    }
        public void cerrarVenta(Factura factura) {
            impresora.imprimirDocumento(factura);
    }
}
