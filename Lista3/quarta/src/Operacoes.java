public class Operacoes {
    private double raio;
    private double perimetro;
    private double area;
    private double volume;



    public void Operacoes(Double raio){
        setRaio(raio);
        setPerimetro();
        setArea();
        setVolume();
    }
    

    public void setRaio(Double raio){
        this.raio = raio;
    }

    public void setPerimetro(){
        this.perimetro = 2 * Math.PI * raio;
    }

    public void setArea(){
        this.area = Math.PI * Math.pow(raio, 2);
    }

    public void setVolume(){
        this.volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public Double getRaio(){
        return this.raio;
    }

    public Double getPerimetro(){
        return this.perimetro;
    }

    public Double getArea(){
        return this.area;
    }

    public Double getVolune(){
        return this.volume;
    }

    

    
}
