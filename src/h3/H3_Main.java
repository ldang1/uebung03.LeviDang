package h3;

public class H3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 5;
        int fix = 2;
        int wartend = 12;
        boolean istVoll = false;

        int freiePlaetze = max - fix;

        if (freiePlaetze > 0 && wartend > 0) {
            int zuVergeben = Math.min(freiePlaetze, wartend);
            fix += zuVergeben;
            wartend -= zuVergeben;
        }

        istVoll = (fix == max);

        System.out.println("Maximale Plätze: " + max);
        System.out.println("Fixplätze: " + fix);
        System.out.println("Warteliste: " + wartend);
        System.out.println("Ist voll: " + istVoll);
	}

}
