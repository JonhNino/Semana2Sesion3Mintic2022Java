package Suscriptor;

public class ClaseSuscriptor {
    //Definicion de los atributos
    private long codigo;
    private String nombre;
    private int estrato;
    private double  consumo;
    ///Definicion metodos
    
    //Constructor

    public ClaseSuscriptor( long codigo, String nombre, int estrato, double consumo ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estrato = estrato;
        this.consumo = consumo;
    }

  
    //Getter's and Setter's

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    public double valorServicio(){
        double valorPagar=0,tarifa_basica=0,valor_consumo;
        switch(this.estrato){
            case 1:
                tarifa_basica=10000;
                break;
            case 2:
                tarifa_basica=15000;
                break;
            case 3:
                tarifa_basica=20000;
                break;
            case 4:
                tarifa_basica=25000;
                break;
            case 5:
                tarifa_basica=30000;
                break;
        }
        valor_consumo=this.consumo*100;
        valorPagar=tarifa_basica+valor_consumo;
        return valorPagar;
    }
    
}
