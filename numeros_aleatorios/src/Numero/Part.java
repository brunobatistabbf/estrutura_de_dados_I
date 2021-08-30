public class Part {
    Part proxima;
    Part anterior;
    Object elemento;

    public Part(Object elemento) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    public Part(Part proxima, Object elemento) {
        this.proxima = proxima;
        this.elemento = elemento;
        this.anterior = null;
    }

    public Part getProxima() {
        return this.proxima;
    }

    public void setProxima(Part proxima) {
        this.proxima = proxima;
    }

    public Part getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Part anterior) {
        this.anterior = anterior;
    }

    public Object getElemento() {
        return this.elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

}
