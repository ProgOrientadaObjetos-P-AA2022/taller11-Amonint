
package taller11;

public class MenuNiños extends Menu{
    private double valorPorcionHelada;
    private double valorPorcionPastel;
    public MenuNiños(){
        
    }
    public MenuNiños(String nombrePl, double valorinicialM, double vph, double vpp){
        super(nombrePl, valorinicialM);
        valorPorcionHelada=vph;
        valorPorcionPastel=vpp;
    }

    public void establecerValorPorcionHelada(double valorPorcionHelada) {
        this.valorPorcionHelada = valorPorcionHelada;
    }

    public void establecerValorPorcionPastel(double valorPorcionPastel) {
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public double obtenerValorPorcionHelada() {
        return valorPorcionHelada;
    }

    public double obtenerValorPorcionPastel() {
        return valorPorcionPastel;
    }
    

    @Override
    public void calcularvalorMenuTotal() {
        valorMenu=valorinicialMenu+valorPorcionHelada+valorPorcionPastel;
    }
    public double obtenervalorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu de Niños\n%s", super.toString());
        cadena=String.format("%s"
                + "Valor Porcion Helado:%.2f\n"
                + "Valor Porcion Pastel:%.2f\n"
                + "Valor Menu:%.2f\n", cadena,
                obtenerValorPorcionHelada(),
                obtenerValorPorcionPastel(),
                obtenerValorMenu()
                );
        return cadena;
    }
    
    
}
