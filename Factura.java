public class Factura {
    private int numero;
    private String cliente;
    private ItemFactura item1;
    private ItemFactura item2;
    private ItemFactura item3;

    public Factura(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void agregarItem(ItemFactura item) {
        if (item == null) {
            return;
        }
        if (item1 == null) {
            item1 = item;
        } else if (item2 == null) {
            item2 = item;
        } else if (item3 == null) {
            item3 = item;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public ItemFactura getItem1() {
        return item1;
    }

    public ItemFactura getItem2() {
        return item2;
    }

    public ItemFactura getItem3() {
        return item3;
    }
}
