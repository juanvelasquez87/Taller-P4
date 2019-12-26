package punto;

/**
 * Esta clase representa un punto en 2D con las coordenadas x y y.
 * @author Juan Velasquez
 */
public class P2 {

    //Atributos
    private int x;
    private int y;

    /**
     * Este constructor crea una instancia del objeto P2
     */

    public P2(){
        this.x = this.y = 0;
    }

    /**
     * Crea una instancia del objeto P2
     * @param x coordenada x
     * @param y coordenada y
     */

    public P2(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Crea una instancia del objeto P2
     * @param p2 es un objeto de punto de dos dimensiones (P2)
     */
    public P2(P2 p2){

        this.x = p2.getX();
        this.y = p2.getY();
    }

    /**
     * retorna el valor de X
     * @return coordenanda X
     */

    public int getX(){

        return this.x;
    }

    /**
     * Asigna el valor de X
     */
    public void setX(){

        this.x = x;

    }

    /**
     * retorna el valor de Y
     * @return coordenada Y
     */

    public int getY(){

        return this.y;
    }

    /**
     * Asigna el valor de Y
     * @param y coordenada Y
     */
    public void setY(int y){
        this.y = y;
    }

    /**
     * calcula la distancia entre los puntos
     * @param x coordenada x del otro punto
     * @param y coordenada y del otro punto
     * @return Distancia
     */

    public double calcularDistancia(int x, int y){
        double d;
        double calculoX = Math.pow(this.x - x,2);
        double calculoY = Math.pow(this.y - y,2);
        d = Math.sqrt(calculoX+calculoY);
        return d;
    }

    /**
     * calcula la distancia de dos puntos de un objeto
     * @param p2 objeto tipo P2
     * @return Distancia(d)
     */

    public double calcularDistancia(P2 p2){
        return this.calcularDistancia(p2.getX(),p2.getY());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("x: ").append(this.x).append("y: ").append(this.y);
        return sb.toString();
    }



}
