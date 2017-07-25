public class HRServices {
    public HRServices() {
    }

    public void eligibleForPromotion(String Perfect) {
        if (Perfect.equals("Graduate traniee G")) {
            System.out.println("Eligible for promotion");
        }
        else {
            System.out.println("NOT Eligible for promotion");
        }
    }

    public String changeDesignation(String desig) {

        String newDesig = desig + "+";
        return newDesig;
    }
}