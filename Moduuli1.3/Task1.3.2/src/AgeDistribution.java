public class AgeDistribution {
    public static void main(String[] args) {
        final int REITERATIONS = 10000; // Kuinka monta "opiskelijaa" halutaan luoda ja jakaa.
        final int MAXAGE = 30; // Maksimi ikä opiskelijoille

        int agedistribution[][] = {
                {50, 19, 23},  		// 50 %		// This line matches to random numbers 1..50,  gives age 19 - 23
                {75, 24, 25},  		// 25 %    	// This line matches to random numbers 51..75, gives age 24 - 25
                {90, 26, 27},		// 15 %    	// This line matches to random numbers 76..90, gives age 26 - 27
                {95, 28, 29},    	// 5 %     // This line matches to random numbers 91..95, gives age 28 - 29
                {100, MAXAGE, MAXAGE}   // 5 %     // This line matches to random numbers 96..100, gives age 30
        };

        int generatedAges[] = new int[MAXAGE+1]; // Jokainen listan alkio vastaa ikää.

        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; 	// generate a random number 1..100 -> we get the row which gives the age

            int j = 0;
            while (x > agedistribution[j][0]) { // search for the correct row to get the matching age
                j++; }

            int minAge = agedistribution[j][1]; // Get the minimum age of the row
            int maxAge = agedistribution[j][2]; // Get the maximum age of the row
            int age = (int) (Math.random() * (maxAge - minAge + 1) + minAge); // Generate a random age form minAge to maxAge of the row.
            // System.out.println("Min age: " + minAge + ", Max age: " + maxAge + " ---> Age: " + age);

            generatedAges[age]++; // In the generated ages, find the correct position ---> increment it (by one)
        }

        System.out.println("Age  count     %-share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100 );
            }
        }
    }
}
