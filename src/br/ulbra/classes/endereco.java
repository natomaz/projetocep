package br.ulbra.classes;
public class endereco {
    String logradouro;
    String bairro;
    String localidade;
    String uf;
    
    public String getLogradouro() {
    return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }
      
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + '}';
    }    
}
