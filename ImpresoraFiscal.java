public class ImpresoraFiscal {
    public void imprimirDocumento(Factura factura) {
        System.out.println("=== TICKET ===");
        System.out.println("factura: " + factura.getNumero());
        System.out.println("cliente: " + factura.getCliente());

        if (factura.getItem1() != null) {
            ItemFactura item = factura.getItem1();
            System.out.println(item.getDescripcion() + " - $" + item.getPrecioUnitario() + " x " + item.getCantidad() + " = $" + item.calcularSubtotal());
        }
        if (factura.getItem2() != null) {
            ItemFactura item = factura.getItem2();
            System.out.println(item.getDescripcion() + " - $" + item.getPrecioUnitario() + " x " + item.getCantidad() + " = $" + item.calcularSubtotal());
        }
        if (factura.getItem3() != null) {
            ItemFactura item = factura.getItem3();
            System.out.println(item.getDescripcion() + " - $" + item.getPrecioUnitario() + " x " + item.getCantidad() + " = $" + item.calcularSubtotal());
        }

        System.out.println("=============");
    }
}


































