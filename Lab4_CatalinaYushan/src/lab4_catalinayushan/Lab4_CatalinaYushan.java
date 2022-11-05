package lab4_catalinayushan;

import java.util.Scanner;

import java.util.Random;

public class Lab4_CatalinaYushan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        
        boolean choice=true;
        System.out.println("Hola, bienvenido al menu!");
        System.out.println("1. Fallout Words");
        System.out.println("2. Rodatcripne");
        System.out.println("3. Alpha");
        System.out.println("4.Salir");

        System.out.println("Presione el numero que desea realizar: ");
        
         switch(opcion){
            case 1:
                Fallout_Words();
                break;
            case 2:
                Rodat_cripne();
                break;
            case 3:
                is_alpha();
                break;
            case 4:
                System.out.println("Adios! No vuelvas, por favor");
            default:
        }
        
       
    }
    public static boolean Fallout_Words (){
        Scanner input = new Scanner(System.in);
        int lives = 5;
        System.out.println("Bienvenido a Fallout Words! Ingrese una de las palabras de la lista y intenta entrar al sistema!");
        System.out.println("La lista de palabras es:");
        System.out.println("1. Comer");
        System.out.println("2. Jugar");
        System.out.println("3. Salta");
        System.out.println("4. Llora");
        System.out.println("5. Muere");
        System.out.println("6. Unida");
        System.out.println("7. Venti");
        System.out.println("8. Llama");
        System.out.println("9. Eevee");
        System.out.println("10.Local");
        
        System.out.println("Ingresa una de las palabras de la listas: ");
        int max = 10;
        int min = 1;
        int palabra = input.nextInt();
        int Ramdom = new Random().nextInt((max - min) + 1) + min;
       
        
        for (int i = 0; i < 10; i++) {
      
        }else{
        System.out.println("Utiliza una palabra de la lista" +
"        
        }
            
        }
        
    public static void Rodat_cripne(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nueva password: ");
        String password = input.nextLine();
        String Pause = password.toLowerCase();
        String empty = "";
        
        for (int q = Pause.length()-1; q >= 0; q--){
            empty=empty+Pause.charAt(q);
            System.out.println(");
            
            
        }
            
        }
        
    
            
        
        
    }
    
    public static void is_alpha(String words){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese una palabra o oracion: ");
        String palabra = input.nextLine();
        String acumuladorWords = "";
        
   
        
    }
        
    
        
        

        
  
    
    
    
        

