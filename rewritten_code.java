import java.util.Scanner;

public class Main{
    static String nome;
    static String scelta1 = "Inizia";
    static String scelta2 = "Inventario";
    static String scelta3 = "Esci";
    static int scelta;
    static int classe;
    static boolean giocoIniziato = false;
    static int ps_arciere = 15;
    static int forza_arciere = 15;
    static int vigore_arciere = 20;
    static int ps_fante = 20;
    static int forza_fante = 25;
    static int vigore_fante = 15;
    static String cavallo;
    
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)){
            
            System.out.print("Inserisci nome eroe: ");
            nome = input.nextLine();
        }
    }
            
    public static void menu(){
                System.out.println("Benvenuto/a "+nome);
                System.out.println("1. "+scelta1);
                System.out.println("2. "+scelta2);
                System.out.println("3. "+scelta3);
                scelta = input.nextInt();
            }
            public static void scegli_classe(){
            
            switch (scelta){
                case 1:
                System.out.println("Inventari non ancora disponibili");
                break;
                
                case 2:
                System.out.pritnln("Uscita dal gioco");
                break;
                
               case 3:
                   System.out.println("Scegli la tua classe:");
                   System.out.pritl("1. Arciere (support)");
                   System.out.println("2. Fante (tank, hai un cavallo)");
                   System.out.println("3. Speziale (healer)");
                   System.out.println("4. Duellante (DPS)");
                   System.out.println("Inserisci la tua scelta (numero): ");
                   classe = input.nextInt();
                   input.nextLine();
                   break;
            }
            switch (classe){
                case 1:
                System.out.println("Hai scelto l'arciere");
                System.out.println("Punti salute: " + ps_arciere + "\nforza: " + forza_arciere + "\nVigore: " + vigore_arciere);
                System.out.println("La tua arma è un arco da guerra");
                giocoIniziato = true;
                break;
                
                case 2:
                System.out.println("Hai scelto il fante");
                System.out.println("Punti salute: " + ps_fante + "\nforza: " + forza_fante + "\nVigore: " + vigore_fante);
                System.out.println("La tua arma è una lancia ed hai un cavallo");
                System.out.print("Scegli il nome del cavallo: ");
                cavallo = input.nextLine();
                System.out.println("Il tuo cavallo si chiama: " + cavallo);
                giocoIniziato = true;
                break;
                
                case 3:
                int ps = 10;
                int forza = 10;
                int vigore = 10;
                System.out.println("Hai scelto lo speziale");
                System.out.println("Punti salute: " + ps + "\nforza: " + forza + "\nVigore: " + vigore);
                System.out.println("La tua arma è un pugnale");
                giocoIniziato = true;
                break;
                
                case 4:
                int ps = 20;
                int forza = 15;
                int vigore = 10;
                System.out.println("Hai scelto il duellante");
                System.out.println("Punti salute: " + ps + "\nforza: " + forza + "\nVigore: " + vigore);
                System.out.println("La tua arma è un fioretto");
                giocoIniziato = true;
                break;
                    
                    default:
                    System.out.println("Scelta classe non valida.");
            }
            break;
    }
}
