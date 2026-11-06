
package com.mycompany.ejerciciodecolassinlibrerias;

public class Ejerciciodecolassinlibrerias {

    public static void main(String[] args) {
        System.out.println("Hola Browm, Ejercicio de cola sin libreria");
        simple(); 
        circular();
        prioridad();
        doble();
               
        
    }
    static void simple(){
           System.out.println("orimero en llegar y primero ensalir(FIFO");
           encolarsimple("Ana"); 
           encolarsimple("Luis"); 
           encolarsimple("marta");
        
                                                                                               
        
    }
    static void prioridad(){
        
    }
    static void circular(){
        
    }
    static void doble(){
        
    }
    
    //operaciones propias : arreglos, imdices y ciclos ; sin utilizacion de clases ni librerias
    private static final String[] datosSimple = new String[5]; 
    private static int cantidadsimple=0;
        static void encolarsimple(String nombres){
            if(cantidadsimple == datosSimple.length)throw new IllegalStateException("Cola llena");
            
            datosSimple[cantidadsimple++]=nombres;
        }
                static String Desencolarsimple(String nombres){
                    if (cantidadsimple==0)return null;
                    String primero = datosSimple[0];
                    for (int i =0; i<cantidadsimple - 1; i ++) datosSimple[i]=datosSimple[i + 1];
                       datosSimple[--cantidadsimple]=null;
                       return primero;
                }
                  static void AgregarIniciosimple(String nombres){
                      if (cantidadsimple == datosSimple.length)throw new IllegalStateException("Cola llena");
                        for (int i =0; i<cantidadsimple - 1; i ++) datosSimple[i]=datosSimple[i + 1];
                        datosSimple[0]=nombres;
                        cantidadsimple++;
                  }
                  
                  static String retirarfinalsimple(){
                  if(cantidadsimple==0) return null;
                  String ultimo = datosSimple[--cantidadsimple];
                  datosSimple[cantidadsimple]=null;
                  return ultimo;
                  } 
                  
                  private static final String [] datoscircular= new String[3];
                  private static int frentecircular=0; 
                  private static int fincircular=0; 
                  private static int cantidadcircular=0; 
                  
                      public static void Encolarcircular(String nombres) {
                       if (cantidadcircular == datoscircular.length)throw new IllegalStateException("Cola llena");
                        datoscircular[fincircular]=nombres;
                        fincircular=(fincircular+1) % datoscircular.length;
                        cantidadcircular++;
                      }
                      
                        static String desencolarcircular() {               
                            
                        if (cantidadcircular==0)return null;
                        String primero = datoscircular[frentecircular];
                        datoscircular[frentecircular]=null;
                        frentecircular=(frentecircular+1)% datoscircular.length;
                        cantidadcircular--;
                        return primero;
                        }
                  private static final Integer[] datosprioridad = new Integer[5];
                  private static int cantidadpreoridad=0; 
                  static void Encolarprioridad(int prioridad){
                      
                  if (cantidadpreoridad == datosprioridad.length)throw new IllegalStateException("Cola llena");
                  datosprioridad[cantidadpreoridad++]= prioridad; 
                      
                  }
                  static Integer Desencolarprioridad(){
                      if(cantidadpreoridad==0)return null;
                      int mejor=0;
                      for(int i= 1 ; i<cantidadpreoridad ; i++){
                         
                          if (datosprioridad[i]<datosprioridad[mejor]) mejor=i;
                      }
                     Integer resultado = datosprioridad[mejor];
                      for(int i= mejor ; i<cantidadpreoridad - 1 ; i++) 
                     datosprioridad[i]=datosprioridad[i+1];
                      datosprioridad[--cantidadpreoridad] =null;
                          return resultado;
                          
                   
                  }
                     

}
