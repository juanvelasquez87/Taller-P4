package main;
import punto.P2;
import punto.P3;
import figura.Cubo;
import figura.Triangulo;

public class Principal {
    public static void main(String[] args) {

        P2 punto2 = new P2();
        P2 segundoPunto = new P2(1, 2);
        P2 tercerPunto = new P2(segundoPunto);
        P3 cuartoPunto = new P3();
        P3 quintoPunto = new P3(1, 2, 3);
        P3 sextoPunto = new P3(segundoPunto, 2);
        P3 septimoPunto = new P3(quintoPunto);

        Triangulo equilatero = new Triangulo();
        equilatero.setPunto1(punto2);
        equilatero.setPunto2(segundoPunto);
        equilatero.setPunto3(tercerPunto);

        Cubo cube = new Cubo();
        cube.getVertices()[0] = new P3(7, 8, 9);
        cube.getVertices()[1] = septimoPunto;
        cube.getVertices()[2] = sextoPunto;
        cube.getVertices()[3] = quintoPunto;

        P3[] a = cube.getVertices();
        for(P3 p:a){
            System.out.println(p);
        }
        System.out.println(punto2.calcularDistancia(1,1));
        System.out.println(punto2.calcularDistancia(segundoPunto));
        System.out.println(cuartoPunto);
        System.out.println(quintoPunto);

        //P2 pruebaLiskov = new P3();
        //((P3)pruebaLiskov).
        //En la prueba de Liskov se hace instancia a los atributos de la herencia padre. la cual seria P2.

    }
}
