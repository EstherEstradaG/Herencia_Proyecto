package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here
       Scanner sc = new Scanner(System.in);

        Rectangulo Rec = new Rectangulo();
        Cuadrado Cua = new Cuadrado();
        TrianguloIsosceles TrianIsos = new TrianguloIsosceles();
        TrianguloEscaleno TrianEsca = new TrianguloEscaleno();
        TrianguloEquilatero TrianEqui = new TrianguloEquilatero();
        Circulo Cir = new Circulo();




        System.out.println("------------Bienvenido al menu principal------------");
        System.out.println();
        System.out.println("- 1. Ver una figura con sus datos creados");
        System.out.println("- 2. Sacar el area o perimetro de la figura que desee ");
        System.out.println("Escribir la opcion");
        int opcion = sc.nextInt();


        if (opcion == 1){
           do {
               System.out.println("-----Bienvenido al menu de figuras predeterminadas-----");
               System.out.println();
               System.out.println("---Ver Datos de la figura---");
               System.out.println();
               System.out.println("1. Cuadrado");
               System.out.println("2. Triangulo Isosceles");
               System.out.println("3. Rectangulo");
               System.out.println("4. Triangulo Escaleno");
               System.out.println("5. Triangulo Equilatero");
               System.out.println("6. Circulo");
               System.out.println();
               System.out.println("Escribir la opcion");
               opcion = sc.nextInt();

               if (opcion == 1) {
                   Cua.datosCuadrado();
                   System.out.println("---------------------------");
                   System.out.println("---------------------------");
                   System.out.println("Desea continuar o salir");
                   System.out.println("1. continuar");
                   System.out.println("0. salir");
                   opcion = sc.nextInt();
               }

               if (opcion == 2) {
                   TrianIsos.datosTrianIsos();
                   System.out.println("---------------------------");
                   System.out.println("---------------------------");
                   System.out.println("Desea continuar o salir");
                   System.out.println("1. continuar");
                   System.out.println("0. salir");
                   opcion = sc.nextInt();
               }

               if (opcion == 3) {
                   Rec.datosRectangulo();
                   System.out.println("---------------------------");
                   System.out.println("---------------------------");
                   System.out.println("Desea continuar o salir");
                   System.out.println("1. continuar");
                   System.out.println("0. salir");
                   opcion = sc.nextInt();
               }

               if (opcion == 4) {
                   TrianEsca.datosTrianEsca();
                   System.out.println("---------------------------");
                   System.out.println("---------------------------");
                   System.out.println("Desea continuar o salir");
                   System.out.println("1. continuar");
                   System.out.println("0. salir");
                   opcion = sc.nextInt();
               }

               if (opcion == 5) {
                   TrianEqui.datosTrianEqui();
                   System.out.println("---------------------------");
                   System.out.println("---------------------------");
                   System.out.println("Desea continuar o salir");
                   System.out.println("1. continuar");
                   System.out.println("0. salir");
                   opcion = sc.nextInt();
               }

               if (opcion == 6) {
                   Cir.datosCirculo();
                   System.out.println("---------------------------");
                   System.out.println("---------------------------");
                   System.out.println("Desea continuar o salir");
                   System.out.println("1. continuar");
                   System.out.println("0. salir");
                   opcion = sc.nextInt();
               }


           }while (opcion != 0);
        }


        if (opcion==2) {

            System.out.println("-----Bienvenido al menu de sacar el area o perimetro-----");
            System.out.println();
            System.out.println("- Si deseas sacar el area, escribe 1");
            System.out.println("- si deseas sacar el perimetro, escribe 2");
            System.out.println("- Si deseas salir, escribe 0");
            System.out.println();
            System.out.println("Escribe tu decision");
            opcion = sc.nextInt();


            if (opcion == 1) {
                do {
                    System.out.println("-----Escoge la figura que quieres sacar el area-----");
                    System.out.println();
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Triangulo Isosceles");
                    System.out.println("3. Rectangulo");
                    System.out.println("4. Triangulo Escaleno");
                    System.out.println("5. Triangulo Equilatero");
                    System.out.println("6. Circulo");
                    System.out.println("0. Salir");
                    System.out.println();
                    System.out.println("Escribe la opcion");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        Cua.areaCuadrado();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 2) {
                        TrianIsos.areaTrianIsos();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 3) {
                        Rec.areaRectangulo();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 4) {
                        TrianEsca.areaTrianEsca();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 5) {
                        TrianEqui.areaTrianEqui();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }


                    if (opcion == 6) {
                        Cir.areaCirculo();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }
                }while(opcion != 0);
            }

            if (opcion == 2) {
                do {
                    System.out.println("-----Escoge la figura que quieres sacar el Perimetro-----");
                    System.out.println();
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Triangulo Isosceles");
                    System.out.println("3. Rectangulo");
                    System.out.println("4. Triangulo Escaleno");
                    System.out.println("5. Triangulo Equilatero");
                    System.out.println("6. Circulo");
                    System.out.println("0. Salir");
                    System.out.println();
                    System.out.println("Escribe la opcion");
                    opcion = sc.nextInt();

                    if (opcion == 1) {
                        Cua.perimetroCuadrado();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 2) {
                        TrianIsos.perimetroTrianIsos();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 3) {
                        Rec.perimetroRectangulo();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 4) {
                        TrianEsca.perimetroTrianEsca();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 5) {
                        TrianEqui.perimetroTrianEqui();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                    if (opcion == 6) {
                        Cir.perimetroCirculo();
                        System.out.println("---------------------------");
                        System.out.println("---------------------------");
                        System.out.println("Desea continuar o salir");
                        System.out.println("1. continuar");
                        System.out.println("0. salir");
                        opcion = sc.nextInt();
                    }

                }while(opcion != 0);
            }

            if (opcion == 0) {
                System.out.println("-------------Ha salido correctamente-------------");
            }
        }


    }
}
