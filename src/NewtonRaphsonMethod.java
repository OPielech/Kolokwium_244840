public class NewtonRaphsonMethod {
    private double x0;
    private double relativeError;
    private int maxIteration;
    private ScalarFunction function;

    public NewtonRaphsonMethod(double x0, double relativeError, int maxIteration, ScalarFunction function) {
        this.x0 = x0;
        this.relativeError = relativeError;
        this.maxIteration = maxIteration;
        this.function = function;
    }

    public double solver() {

        int i = 1;
        double ea;
        double et;
        double xn = x0 - function.function(x0) / (Math.PI * x0 * (6 - x0));
        double xn1;
        double[] xns = new double[maxIteration];
        xns[0] = xn;

        do {
            xn1 = xn - function.function(xn) / (-Math.exp(-xn) - 1);
            xns[i] = xn1;
            xn = xn1;

            System.out.println("xn= " + xn);

            ea = Math.abs((xns[i] - xns[i - 1]) / xns[i] * 100);
            System.out.printf("Ea = %.2e%c\n", ea, '%');

            et = Math.abs((xns[i] - 0.56714329) / xns[i] * 100);
            System.out.printf("Et = %.2e%c\n", et, '%');
            i++;
        } while (i < maxIteration && ea >= relativeError);

        return xn;
    }//end of solver
}//end of class

