package h2;

public class H2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jahr = 2024;     
        boolean schalt;

        
        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            schalt = true;
        } else {
            schalt = false;
        }

        // Ausgabe des Ergebnisses
        System.out.println("Jahr: " + jahr);
        System.out.println("Schaltjahr: " + schalt);
	}

}
