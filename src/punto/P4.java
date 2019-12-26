package punto;

public class P4 extends P3 {
    private int j;

    /**
     * construye un objeto de tipo P3
     */
    public P4(){
        super();
        this.j= 0;
    }

    /**
     * crea un objeto de tipo P3
     * @param x coordenada x
     * @param y coordenada y
     * @param z coordenada z
     */

    public P4(int x, int y, int z, int j){

        super(x,y,z);
        this.j = j;
    }



    public P4(P3 p3, int j){
        super(p3);
        this.j = j;
    }

    public P4(P4 p4){
        this(p4.getX(), p4.getY(), p4.getZ(), p4.getJ());
    }

    public int getJ() {
        return this.j;
    }

    public void setJ(int j){
        this.j = j;
    }

    public double calcularDistancia(int x, int y, int z, int j){
        double dist;
        double calculoX = Math.pow(getX() - x,2);
        double calculoY = Math.pow(getY() - y,2);
        double calculoz = Math.pow(getZ() - z,2);
        double calculoj = Math.pow(this.j - j,2);
        dist = Math.sqrt(calculoX+calculoY+calculoz+calculoj);
        return dist;
    }

    public double calcularDistancia(P3 p3, int j){
        return calcularDistancia(p3.getX(), p3.getY(), p3.getZ(), j);
    }

    public double calcularDistancia(P4 p4){
        return calcularDistancia(p4.getX(), p4.getY(), p4.getZ(), p4.getJ());
    }

    public String toString(){
        String s = super.toString() + " j: "+ this.j;
        return s;
    }


}
