package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        String tipoDocumento;
        String documento;
        String nombre;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        Integer idFiador;
        String nombreFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;
        boolean tieneLicenciaElConductor;
        String tipoDeCompra;

        Scanner leer=new Scanner(System.in);

        //proceso//
        System.out.println("*******************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("*******************");

        System.out.println("Apreciado cliente, usted cuenta con licencia?.");
        tieneLicenciaElConductor=leer.nextBoolean();

        //primera pregunta o decision//

        //1. PREGUNTA. SI TIENE LICENCIA//
        if (tieneLicenciaElConductor){

            System.out.print("Nombre del cliente: ");
            nombre=leer.nextLine();
            leer.nextLine();

            System.out.print("Apellido del cliente: ");
            apellidos=leer.nextLine();

            System.out.print("Tipo de documento: ");
            tipoDocumento= leer.nextLine();

            System.out.print("numero documento: ");
            documento=leer.nextLine();

            System.out.print("Ingrese el numero de telefono: ");
            telefonoMovil=leer.nextLine();

            System.out.print("ingrese numero fijo: ");
            telefonoFijo=leer.nextLine();

            System.out.println("Ingrese la direccion del lugar de residencia: ");
            direccion=leer.nextLine();

            System.out.println("Documento fiador: ");
            documentoFiador=leer.nextLine();

            System.out.println("Nombre del fiador: ");
            nombreFiador=leer.nextLine();

            System.out.println("Nuestras motocicletas: ");
            System.out.println("1. yamaha szr-125---$9000000");
            System.out.println("2. yamaha crypton fi---$8000000");
            System.out.println("3. yamaha xtz125---$10500000");
            System.out.println("4. yamaha mt10---$72000000");
            System.out.println("5. yamaha NMAX300---$34000000");

            Integer motoSeleccionada;
            System.out.print("Dijite la motocicleta que desea: ");
            motoSeleccionada=leer.nextInt();

            Integer valorMoto=0;

            //2. PREGUNTA. LO QUIERE A CREDITO?//
            System.out.println("Dijite /credito o /contado para continuar su compra");
            leer.nextLine();

            tipoDeCompra=leer.nextLine().toLowerCase();

            if (tipoDeCompra.equals("credito")) {
                //le pregunto por % a financiar//
                double procentajeCredito;
            }

                System.out.println("INgresa el porcentaje a financiar");
                procentajeCredito=leer.nextDouble();
                System.out.println("Entraremos a financiarlo.");

                if (procentajeCredito==1.0) {
                    Double valorIntereses = 0.25;
                    valorTotalMoto = valorMoto + (valorMoto * valorIntereses);


                    
                }else if (procentajeCredito==0.7){
                    Double valorIntereses=0.15;
                    
                } else if (procentajeCredito==0.5) {
                    Double valorIntereses=0.7;



            }else {
                System.out.println("Exelente, le daremos un descuento del 10%");
            }



        }else{
            //NO TIENE LICENCIA//
            System.out.println("Apreciado usuario, no podemos continuar la transaccion.");
            System.out.println("Lo invitamos a tramitar su licencia, vuelva pronto.");

        }

        if (motoSeleccionada==1){

            valormoto=90000000.0;

        }else if (motoseleccionada==2){

            valormoto=8000000.0;

        }else if (motoseleccioonada==3){

            valormoto=10500000.0;

        } else if (motoseleccionada) {

            valormoto=72000000.0;

        }else if (motoseleccionada){

            valormoto=34000000.0;

        }


    }
}