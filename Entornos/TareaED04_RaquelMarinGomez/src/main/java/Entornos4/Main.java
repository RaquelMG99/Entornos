package Entornos4;

public class Main {

    public static void main(String[] args) {
        ECesta cesta;

        cesta = new ECesta("Apellidos del alumno", 100, "dni del alumno");

        NuevoMetodo(cesta);

        double bonoactual = cesta.bonificacion();

        System.out.println("Su bono actual es  " + bonoactual);       

    }

    public static void NuevoMetodo(ECesta cesta) {

        try {

            cesta.comprar(50);

        } catch (Exception e) {

            System.out.println("No se puede pagar  ");

        }

        try {

            System.out.println("Solicitar actualización de bono");

            cesta.ActualizarBono(100);

        } catch (Exception e) {

            System.out.println("Error al recargar");

        }
        
        try {

                    System.out.println(" Modificación 1");

                     cesta.ActualizarBono(-50);

                 } catch (Exception e) {

                           System.out.print("Fallo...");

                            }

        
         try {

                    System.out.println(" Modificación 2");

                     cesta.ActualizarBono(500);

                 } catch (Exception e) {

                           System.out.print("Fallo producido.");

                            }
        
        

    }

}
