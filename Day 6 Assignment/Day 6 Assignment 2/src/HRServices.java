public class HRServices {
    public HRServices() {
    }

    public void eligibleForPromotion(String Perfect) {
        /**
         * Arpit's Comments: 
         * 1) Method parameter names should be in camel case Perfect should be perfect
         */
        if (Perfect.equals("Graduate traniee G")) {
            System.out.println("Eligible for promotion");
        }
        else {
            System.out.println("NOT Eligible for promotion");
        }
    }

    public String changeDesignation(String desig) {
        /**
         * Arpit's Comments: 
         * 1) Method parameter names should be proper and logical, like here we could have used designation in place of desig
         * same for newDesig --> It should be newDesignation
         */
        String newDesig = desig + "+";
        return newDesig;
    }
}
