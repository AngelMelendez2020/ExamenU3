package ProyectoVentanilla;

public class Metodos {

    Nodo raizV, cimaV, raizC, cimaC;
    int tamV = 0, tamC = 0;
    String v1 = "Ventanilla 1:", v2 = "Ventanilla 2:", v3 = "Ventanilla 3:";
    int tv1, tv2, tv3;

    public void IngresarV(Object nom) {
        Nodo nodoV = new Nodo(nom);
        if (tamV == 0) {
            cimaV = nodoV;
            raizV = nodoV;
            tamV++;
        } else if (tamV == 1) {
            cimaV = nodoV;
            raizV.siguiente = cimaV;
            tamV++;
        } else {
            cimaV.siguiente = nodoV;
            cimaV = nodoV;
            tamV++;
        }
    }

    public void IngresarC(Object nom) {
        Nodo nodoC = new Nodo(nom);
        if (tamC == 0) {
            cimaC = nodoC;
            raizC = nodoC;
            tamC++;
        } else if (tamC == 1) {
            cimaC = nodoC;
            raizC.siguiente = cimaC;
            tamC++;
        } else {
            cimaC.siguiente = nodoC;
            cimaC = nodoC;
            tamC++;
        }
    }

    public void mostrarV() {
        if (tamV == 0) {
            System.out.println("ColaVIP: ");
        } else {
            Nodo revisaV = raizV;
            System.out.print("ColaVIP: ");
            while (revisaV != null) {
                System.out.print(revisaV.cliente + "  ");
                revisaV = revisaV.siguiente;
            }
            System.out.println("");
        }
    }

    public void mostrarC() {
        if (tamC == 0) {
            System.out.println("ColaComún: ");
        } else {
            Nodo revisaC = raizC;
            System.out.print("ColaComún : ");
            while (revisaC != null) {
                System.out.print(revisaC.cliente + "  ");
                revisaC = revisaC.siguiente;
            }
            System.out.println("");
        }
    }

    public void IngresoVentanillaV() {
        if (tamV == 0) {
            System.out.println("No existe ningún cliente en la cola VIP");
        } else if (tv1 == 0 && tv2 == 0 & tv3 == 0) {
            if (tamV == 1) {
                v1 = v1 + raizV.cliente;
                raizV = null;
                cimaV = null;
                tamV--;
                tv1++;
            } else if (tamV == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        v1 = v1 + raizV.cliente;
                        raizV = raizV.siguiente;
                        tamV--;
                        tv1++;
                    } else {
                        v2 = v2 + raizV.cliente;
                        raizV = null;
                        cimaV = null;
                        tamV--;
                        tv2++;
                    }
                }
            } else if (tamV == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        v1 = v1 + raizV.cliente;
                        raizV = raizV.siguiente;
                        tamV--;
                        tv1++;
                    } else if (i == 1) {
                        v2 = v2 + raizV.cliente;
                        raizV = raizV.siguiente;
                        tamV--;
                        tv2++;
                    } else {
                        v3 = v3 + raizV.cliente;
                        raizV = null;
                        cimaV = null;
                        tamV--;
                        tv3++;
                    }
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        v1 = v1 + raizV.cliente;
                        raizV = raizV.siguiente;
                        tamV--;
                        tv1++;
                    } else if (i == 1) {
                        v2 = v2 + raizV.cliente;
                        raizV = raizV.siguiente;
                        tamV--;
                        tv2++;
                    } else {
                        v3 = v3 + raizV.cliente;
                        raizV = raizV.siguiente;
                        tamV--;
                        tv3++;
                    }
                }
            }
        } else {
            String sv1[] = v1.split(":");
            String sv2[] = v2.split(":");
            String sv3[] = v3.split(":");
            if (sv1.length == 1 && sv2.length == 1) {
                if (tamV == 1) {
                    v1 = v1 + raizV.cliente;
                    raizV = null;
                    cimaV = null;
                    tamV--;
                    tv1++;
                } else if (tamV == 2) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv1++;
                        } else {
                            v2 = v2 + raizV.cliente;
                            raizV = null;
                            cimaV = null;
                            tamV--;
                            tv2++;
                        }
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv1++;
                        } else {
                            v2 = v2 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv2++;
                        }
                    }
                }
            } else if (sv1.length == 1 && sv3.length == 1) {
                if (tamV == 1) {
                    v1 = v1 + raizV.cliente;
                    raizV = null;
                    cimaV = null;
                    tamV--;
                    tv1++;
                } else if (tamV == 2) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv1++;
                        } else {
                            v3 = v3 + raizV.cliente;
                            raizV = null;
                            cimaV = null;
                            tamV--;
                            tv3++;
                        }
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv1++;
                        } else {
                            v3 = v3 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv3++;
                        }
                    }
                }
            } else if (sv2.length == 1 && sv3.length == 1) {
                if (tamV == 1) {
                    v2 = v2 + raizV.cliente;
                    raizV = null;
                    cimaV = null;
                    tamV--;
                    tv2++;
                } else if (tamV == 2) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v2 = v2 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv2++;
                        } else {
                            v3 = v3 + raizV.cliente;
                            raizV = null;
                            cimaV = null;
                            tamV--;
                            tv3++;
                        }
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v2 = v2 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv2++;
                        } else {
                            v3 = v3 + raizV.cliente;
                            raizV = raizV.siguiente;
                            tamV--;
                            tv3++;
                        }
                    }
                }
            } else if (sv1.length == 1) {
                if (tamV == 1) {
                    v1 = v1 + raizV.cliente;
                    raizV = null;
                    cimaV = null;
                    tamV--;
                    tv1++;
                } else {
                    v1 = v1 + raizV.cliente;
                    raizV = raizV.siguiente;
                    tamV--;
                    tv1++;
                }
            } else if (sv2.length == 1) {
                if (tamV == 1) {
                    v2 = v2 + raizV.cliente;
                    raizV = null;
                    cimaV = null;
                    tamV--;
                    tv2++;
                } else {
                    v2 = v2 + raizV.cliente;
                    raizV = raizV.siguiente;
                    tamV--;
                    tv2++;
                }
            } else if (sv3.length == 1) {
                if (tamV == 1) {
                    v3 = v3 + raizV.cliente;
                    raizV = null;
                    cimaV = null;
                    tamV--;
                    tv3++;
                } else {
                    v3 = v3 + raizV.cliente;
                    raizV = raizV.siguiente;
                    tamV--;
                    tv3++;
                }
            } else {
                System.out.println("Todas las ventanillas están ocupadas. No puede ingresar un cliente VIP");
            }
        }
    }

    public void IngresoVentanillaC() {
        if (tamC == 0) {
            System.out.println("No existe ningún cliente en la cola común");
        } else if (tv1 == 0 && tv2 == 0 & tv3 == 0) {
            if (tamC == 1) {
                v1 = v1 + raizC.cliente;
                raizC = null;
                cimaC = null;
                tamC--;
                tv1++;
            } else if (tamC == 2) {
                for (int i = 0; i < 2; i++) {
                    if (i == 0) {
                        v1 = v1 + raizC.cliente;
                        raizC = raizC.siguiente;
                        tamC--;
                        tv1++;
                    } else {
                        v2 = v2 + raizC.cliente;
                        raizC = null;
                        cimaC = null;
                        tamC--;
                        tv2++;
                    }
                }
            } else if (tamC == 3) {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        v1 = v1 + raizC.cliente;
                        raizC = raizC.siguiente;
                        tamV--;
                        tv1++;
                    } else if (i == 1) {
                        v2 = v2 + raizC.cliente;
                        raizC = raizC.siguiente;
                        tamC--;
                        tv2++;
                    } else {
                        v3 = v3 + raizC.cliente;
                        raizC = null;
                        cimaC = null;
                        tamC--;
                        tv3++;
                    }
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        v1 = v1 + raizC.cliente;
                        raizC = raizC.siguiente;
                        tamC--;
                        tv1++;
                    } else if (i == 1) {
                        v2 = v2 + raizC.cliente;
                        raizC = raizC.siguiente;
                        tamC--;
                        tv2++;
                    } else {
                        v3 = v3 + raizC.cliente;
                        raizC = raizC.siguiente;
                        tamC--;
                        tv3++;
                    }
                }
            }
        } else {
            String sv1[] = v1.split(":");
            String sv2[] = v2.split(":");
            String sv3[] = v3.split(":");
            if (sv1.length == 1 && sv2.length == 1) {
                if (tamC == 1) {
                    v1 = v1 + raizC.cliente;
                    raizC = null;
                    cimaC = null;
                    tamC--;
                    tv1++;
                } else if (tamC == 2) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv1++;
                        } else {
                            v2 = v2 + raizC.cliente;
                            raizC = null;
                            cimaC = null;
                            tamC--;
                            tv2++;
                        }
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv1++;
                        } else {
                            v2 = v2 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv2++;
                        }
                    }
                }
            } else if (sv1.length == 1 && sv3.length == 1) {
                if (tamC == 1) {
                    v1 = v1 + raizC.cliente;
                    raizC = null;
                    cimaC = null;
                    tamC--;
                    tv1++;
                } else if (tamC == 2) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv1++;
                        } else {
                            v3 = v3 + raizC.cliente;
                            raizC = null;
                            cimaC = null;
                            tamC--;
                            tv3++;
                        }
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v1 = v1 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv1++;
                        } else {
                            v3 = v3 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv3++;
                        }
                    }
                }
            } else if (sv2.length == 1 && sv3.length == 1) {
                if (tamC == 1) {
                    v2 = v2 + raizC.cliente;
                    raizC = null;
                    cimaC = null;
                    tamC--;
                    tv2++;
                } else if (tamC == 2) {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v2 = v2 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv2++;
                        } else {
                            v3 = v3 + raizC.cliente;
                            raizC = null;
                            cimaC = null;
                            tamC--;
                            tv3++;
                        }
                    }
                } else {
                    for (int i = 0; i < 2; i++) {
                        if (i == 0) {
                            v2 = v2 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv2++;
                        } else {
                            v3 = v3 + raizC.cliente;
                            raizC = raizC.siguiente;
                            tamC--;
                            tv3++;
                        }
                    }
                }
            } else if (sv1.length == 1) {
                if (tamC == 1) {
                    v1 = v1 + raizC.cliente;
                    raizC = null;
                    cimaC = null;
                    tamC--;
                    tv1++;
                } else {
                    v1 = v1 + raizC.cliente;
                    raizC = raizC.siguiente;
                    tamC--;
                    tv1++;
                }
            } else if (sv2.length == 1) {
                if (tamC == 1) {
                    v2 = v2 + raizC.cliente;
                    raizC = null;
                    cimaC = null;
                    tamC--;
                    tv2++;
                } else {
                    v2 = v2 + raizC.cliente;
                    raizC = raizC.siguiente;
                    tamC--;
                    tv2++;
                }
            } else if (sv3.length == 1) {
                if (tamC == 1) {
                    v3 = v3 + raizC.cliente;
                    raizC = null;
                    cimaC = null;
                    tamC--;
                    tv3++;
                } else {
                    v3 = v3 + raizC.cliente;
                    raizC = raizC.siguiente;
                    tamC--;
                    tv3++;
                }
            } else {
                System.out.println("Todas las ventanillas están ocupadas. No puede entrar un cliente Común");
            }
        }
    }

    public void mostrarVentanillas() {
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
    
    public void SalirVentanilla(){
        String sv1[]=v1.split(":");
        String sv2[]=v2.split(":");
        String sv3[]=v3.split(":");
        if(sv1.length==2 && sv2.length==2 && sv3.length==2){
            int op=(int)(Math.random()*3+1);
            switch(op){
                case 1:
                    v1="Ventanilla 1:";
                    System.out.println(v1+"Salió cliente");
                    System.out.println(v2);
                    System.out.println(v3);
                    tv1--;
                    break;
                case 2:
                    v2="Ventanilla 2:";
                    System.out.println(v2+"Salió cliente");
                    System.out.println(v1);
                    System.out.println(v3);
                    tv2--;
                    break;
                case 3:
                    v3="Ventanilla 3:";
                    System.out.println(v3+"Salió cliente");
                    System.out.println(v1);
                    System.out.println(v2);
                    tv3--;
                    break;
            }
        }else if(sv1.length==2 && sv2.length==2){
             int op=(int)(Math.random()*2+1);
            switch(op){
                case 1:
                    v1="Ventanilla 1:";
                    System.out.println(v1+"Salió cliente");
                    System.out.println(v2);
                    System.out.println(v3);
                    tv1--;
                    break;
                case 2:
                    v2="Ventanilla 2:";
                    System.out.println(v2+"Salió cliente");
                    System.out.println(v1);
                    System.out.println(v3);
                    tv2--;
                    break;
            }
        }else if(sv1.length==2 && sv3.length==2){
            int op=(int)(Math.random()*2+1);
            switch(op){
                case 1:
                    v1="Ventanilla 1:";
                    System.out.println(v1+"Salió cliente");
                    System.out.println(v2);
                    System.out.println(v3);
                    tv1--;
                    break;
                case 2:
                    v3="Ventanilla 3:";
                    System.out.println(v3+"Salió cliente");
                    System.out.println(v1);
                    System.out.println(v2);
                    tv3--;
                    break;
            }
        }else if(sv2.length==2 && sv3.length==2){
            int op=(int)(Math.random()*2+1);
            switch(op){
                case 1:
                    v2="Ventanilla 2:";
                    System.out.println(v2+"Salió cliente");
                    System.out.println(v1);
                    System.out.println(v3);
                    tv2--;
                    break;
                case 2:
                    v3="Ventanilla 3:";
                    System.out.println(v3+"Salió cliente");
                    System.out.println(v1);
                    System.out.println(v2);
                    tv3--;
                    break;
            }
        }else if(sv1.length==2){
            v1="Ventanilla 1:";
            System.out.println(v1+"Salió cliente");
            System.out.println(v2);
            System.out.println(v3);
            tv1--;
        }else if(sv2.length==2){
            v2="Ventanilla 2:";
            System.out.println(v2+"Salió cliente");
            System.out.println(v1);
            System.out.println(v3);
            tv2--;
        }else if(sv3.length==2){
            v3="Ventanilla 3:";
            System.out.println(v3+"Salió cliente");
            System.out.println(v1);
            System.out.println(v2);
            tv3--;
        }else{
            System.out.println("Las ventanillas están desocupadas");
            System.out.println(v1);
            System.out.println(v2);
            System.out.println(v3);
        }
    }
}
