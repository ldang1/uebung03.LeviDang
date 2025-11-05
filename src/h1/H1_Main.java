package h1;

public class H1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double guthaben = 50.00 ;
		double monEingang = 10.00 ;
		int rating = 3 ;
		boolean warnhinweis = false ;
		boolean negativ = false ;
		
		if ( guthaben < 0 ) {
			negativ = true;
		} else {
			negativ = false;
		}
		
		if ( guthaben > 0 ) {
			rating = rating + 3;
		}
		
		if ( guthaben == 0) {
			rating = rating + 2;
		}
		
		if ( guthaben < 0 && monEingang >= guthaben ) {
			rating = rating + 1;
		}
		
		if ( guthaben < 0 && monEingang < guthaben ) {
			rating = rating - 1;
		}
		
		if ( guthaben < 0 && monEingang < guthaben && rating < 0) {
			warnhinweis = true;
		} else {
			warnhinweis = false;
			}	
		System.out.print("rating:" + rating);
	}

}
