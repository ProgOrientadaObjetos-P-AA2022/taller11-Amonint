
package taller11;

public class MenudelDia extends Menu{
    
    private double valorBebida;
    private double valorPostre;

    public MenudelDia(){
        
    }
    public MenudelDia(String nombrePl, double valorinicialM,double vpostre, double vbebida){
        super(nombrePl, valorinicialM);
        valorPostre=vpostre;
        valorBebida=vbebida;
    }

    public void establecerValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void establecerValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double obtenerValorPostre() {
        return valorPostre;
    }

    public double obtenerValorBebida() {
        return valorBebida;
    }
    
    
    @Override
    public void calcularvalorMenuTotal() {
        valorMenu=valorinicialMenu+valorPostre+valorBebida;
    }
    public double obtenerValorcancelartotal(){
        return valorMenu;
    }

    @Override
    public String toString() {
        String cadena=String.format("Menu del día\n%s",super.toString());
        cadena=String.format("%s"
                + "Valor Postre:%.2f\n"
                + "Valor Bebida:%.2f\n"
                + "Valor Menu:%.2f\n",cadena,
                obtenerValorPostre(),
                obtenerValorBebida(),
                obtenerValorMenu());
        return cadena;
    }
    
    
}
