public class MaquinaDeCafe {
    Cafetera cafetera;
    Vaso vasosPequeno;
    Vaso vasosMediano;
    Vaso vasosGrande;
    Azucarero azucarero;

    public void setCafetera(Cafetera cafetera) { this.cafetera = cafetera; }
    public Cafetera getCafetera() { return cafetera; }

    public void setVasosPequeno(Vaso vasos) { this.vasosPequeno = vasos; }
    public Vaso getVasosPequeno() { return vasosPequeno; }

    public void setVasosMediano(Vaso vasos) { this.vasosMediano = vasos; }
    public Vaso getVasosMediano() { return vasosMediano; }

    public void setVasosGrande(Vaso vasos) { this.vasosGrande = vasos; }
    public Vaso getVasosGrande() { return vasosGrande; }

    public void setAzucarero(Azucarero azucarero) { this.azucarero = azucarero; }
    public Azucarero getAzucarero() { return azucarero; }

    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso) {
            case "pequeno": return vasosPequeno;
            case "mediano": return vasosMediano;
            case "grande":  return vasosGrande;
            default:        return null;
        }
    }

    public String getVasoDeCafe(Vaso vaso, int cantidadDeVasos, int cantidadDeAzucar) {
        if (!vaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }
        int cafeNecesario = vaso.getContenido() * cantidadDeVasos;
        if (!cafetera.hasCafe(cafeNecesario)) {
            return "No hay Cafe";
        }
        if (!azucarero.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar";
        }

        vaso.giveVasos(cantidadDeVasos);
        cafetera.giveCafe(cafeNecesario);
        azucarero.giveAzucar(cantidadDeAzucar);
        return "Felicitaciones";
    }
}
