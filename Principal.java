package ProyectoVentanilla;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Metodos lista=new Metodos();
        Scanner leer=new Scanner(System.in);
        String VIP="VIP-",COMUN="Común-";
        int VoC,elegir,primerIngreso=0,numUsuario=0;
        Object usuario;
        boolean si=true;
        do{
            System.out.println("\u001B[46;30mMenú");
            System.out.println("1.- Nuevo Cliente");
            System.out.println("2.- Pasar a ventanilla");
            System.out.println("3.- Mostrar colas");
            System.out.println("4.- Terminar una ventanilla");
            System.out.println("5.- Salir");
            elegir=leer.nextInt();
            switch(elegir){
                case 1:
                    if(primerIngreso==0){
                        VoC=(int)(Math.random()*2);
                        numUsuario=(int)(Math.random()*10+1);
                        if(VoC==0){
                            usuario=VIP+numUsuario;
                            lista.IngresarV(usuario);
                            numUsuario++;
                        }else{
                            usuario=COMUN+numUsuario;
                            lista.IngresarC(usuario);
                            numUsuario++;
                        }
                        primerIngreso++;
                    }else{
                        VoC=(int)(Math.random()*2);
                        if(VoC==0){
                            usuario=VIP+numUsuario;
                            lista.IngresarV(usuario);
                            numUsuario++;
                        }else{
                            usuario=COMUN+numUsuario;
                            lista.IngresarC(usuario);
                            numUsuario++;
                        }
                        primerIngreso++;
                    }
                    System.out.println("\033[43mUn Cliente Nuevo se Formo");
                    lista.mostrarV();
                    lista.mostrarC();
                    break;
                case 2:
                    System.out.println("\033[43mZona de Ventanillas");
                    lista.IngresoVentanillaV();
                    lista.IngresoVentanillaC();
                    lista.mostrarVentanillas();
                    break;
                case 3:
                    System.out.println("\033[43mClientes en Fila");
                    lista.mostrarV();
                    lista.mostrarC();
                    break;
                case 4:
                    System.out.println("\033[43mZona de Ventanillas");
                    lista.SalirVentanilla();
                    break;
                default:
                    si=false;
                    break;
            }
        }while(si);
    }
}
