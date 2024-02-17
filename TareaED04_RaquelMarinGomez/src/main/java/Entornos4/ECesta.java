package Entornos4;

public class ECesta {

    /*Propiedades de la Clase eCesta*/
    private String comercio;

    private double bono;

    private String usuario;
    
    private double extra; 

    /* Constructor sin argumentos */
    public ECesta() {

    }

    /*Constructor con parámetros*/
    public ECesta(String c, double b, String u) {

        comercio = c;

        bono = b + 10;

        usuario = u;
        
        extra = 10;

    }

    
    
    /*Método para fijar el comercio*/
    public void AsignarComercio(String nombre) {

        comercio = nombre;

    }

    /* Método que indica el usuario de la cesta electrónica */
    public String Titular() {

        return usuario;

    }

    /*Método de consulta de bonificación*/
    public double bonificacion() {

        return bono;

    }

    /* Método para actualizar el bono */
    public void ActualizarBono(double n) throws Exception {

        if (n < 0) {
            throw new Exception("No es posible actualizar bono");
        }

        bono = bono + n;

    }

    /* Método para comprar */
    public void comprar(double total) throws Exception {

        if (total <= 0) {
            throw new Exception("Imposible la compra");
        }

        if (bonificacion() < total) {
            throw new Exception("Su bono es insuficiente para la compra");
        }

        bono = bono - total;

    }

    /*Método que me devuelve el usuario de la cesta*/
    public String identificacionUsuario() {

        return usuario;

    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

}
