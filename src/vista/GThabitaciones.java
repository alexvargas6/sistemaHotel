package vista;

public class GThabitaciones {

    /*String*/
    private String nombre;
    private String Ntelefono;
    private String CorreoE;
    private String camas;
    private String tCama;
    private String baños;
    private String Hextras;
    private String Hnombre;

    /*booleanos*/
    private boolean first = true;

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    
    public String getHnombre() {
        return Hnombre;
    }

    public void setHnombre(String Hnombre) {
        this.Hnombre = Hnombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNtelefono() {
        return Ntelefono;
    }

    public void setNtelefono(String Ntelefono) {
        this.Ntelefono = Ntelefono;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getCamas() {
        return camas;
    }

    public void setCamas(String camas) {
        this.camas = camas;
    }

    public String getTcama() {
        return tCama;
    }

    public void setTcama(String tCama) {
        this.tCama = tCama;
    }

    public String getBaños() {
        return baños;
    }

    public void setBaños(String baños) {
        this.baños = baños;
    }

    public String getHextras() {
        return Hextras;
    }

    public void setHextras(String Hextras) {
        this.Hextras = Hextras;
    }
}
