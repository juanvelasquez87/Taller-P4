package main;
import punto.P2;
import punto.P3;
import punto.P4;
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
        P4 octavoPunto = new P4();
        P4 novenoPunto = new P4(5,6,7,8);
        P4 decimoPunto = new P4(quintoPunto,8);
        P4 oncePunto = new P4(decimoPunto);


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
        System.out.println(decimoPunto);
        System.out.println(octavoPunto.calcularDistancia(decimoPunto));
        //P2 pruebaLiskov = new P3();
        //((P3)pruebaLiskov).
        //En la prueba de Liskov se hace instancia a los atributos de la herencia padre. la cual seria P2.

    }
}
