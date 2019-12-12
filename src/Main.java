public class Main {
    public static void main(String[] args) {
//        new RegulaFalsi(0,5,0.001,1000,0.6, x->Math.PI*Math.pow(x,2)*((9-x)/3)-30).solver();
//        new FixedPointsIteration(5,0.01,1000, x->Math.PI*Math.pow(x,2)*((9-x)/3)-30).solver();
        new NewtonRaphsonMethod(5, 0.01, 1000, x -> Math.PI * Math.pow(x, 2) * ((9 - x) / 3) - 30).solver();
//        new SecandMethod(5,0.001,1000, x->Math.PI*Math.pow(x,2)*((9-x)/3)-30).solver();


    }//end of main
}//end of class
