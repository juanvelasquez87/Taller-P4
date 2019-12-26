package punto;

/**
 * Esta clase representa un punto en 3 dimensiones
 * @author Juan Velasquez
 */
public class P3 extends P2 {
    //Atributos
    private int z;

    /**
     * construye un objeto de tipo P3
     */
    public P3(){
        super();
        this.z = 0;
    }

    /**
     * crea un objeto de tipo P3
     * @param x coordenada x
     * @param y coordenada y
     * @param z coordenada z
     */

    public P3(int x, int y, int z){

        super(x,y);
        this.z = z;
    }

    /**
     * crea un objeto de tipo P3
     * @param p2 objeto tipo P2
     * @param z coordenada z
     */

    public P3(P2 p2, int z){
        super(p2);
        this.z = z;
    }

    public P3(P3 p3){
        this(p3.getX(), p3.getY(), p3.getZ());
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int z){
        this.z = z;
    }

    public double calcularDistancia(int x, int y, int z){
        double dist;
        double calculoX = Math.pow(getX() - x,2);
        double calculoY = Math.pow(getY() - y,2);
        double calculoz = Math.pow(this.z - z,2);
        dist = Math.sqrt(calculoX+calculoY+calculoz);
        return dist;
    }

    public double calcularDistancia(P2 p2, int z){
        return calcularDistancia(p2.getX(), p2.getY(), z);
    }

    public double calcularDistancia(P3 p3){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ());
    }

    public String toString(){
        String s = super.toString() + " z: "+ this.z;
        return s;
    }
}
