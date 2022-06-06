package arbolBinario;

public class Auto {
    protected String marca, modelo;
    protected int anio;

    public Auto(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return " Marca:'" + getMarca() + "'" + " Modelo:'" + getModelo() + "'" + ", Año:'" + getAnio() + "'";
    }

}
