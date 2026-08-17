package quiz_paises_api;

public class Paises {
        private String nomePais;
        private String continente;
        private String capital;
        private String codigoIso;

    public Paises() {

    }

    public Paises(String nomePais, String continente, String capital, String codigoIso) {
        this.nomePais = nomePais;
        this.continente = continente;
        this.capital = capital;
        this.codigoIso = codigoIso.toLowerCase();
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }
}

