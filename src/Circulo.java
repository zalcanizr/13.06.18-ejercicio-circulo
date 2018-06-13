public class Circulo {


    private double area;
    private double perimetro;
    private double radio;




    public Circulo(double rad){

        radio=rad;
    }

    public double calculaArea(){

        area=0;
        area =radio*radio*Math.PI;
        return area;
    }

    public double calcularPerimetro(){

        perimetro=2*radio*Math.PI;
    }
}
