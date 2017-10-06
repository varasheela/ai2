import java.util.ArrayList;

/**
 * Created by vara.sheela on 10/3/2017.
 */

/*Initialize parameters np, nc, F, and CR
* np = population size
* nc = number of cycles = 100
* CR = Crossover recombination probability [0,1] 0.5
* F = differential weight recommended 0.8
Initialize population X_(j,i)^((1)), j = 1, …, d, i = 1, …, np
For k = 1 to nc
	X^((0))=X^((1))
	For i = 1 to np
		Generate integer random numbers r0, r1, r2{1, …, np} while r0 ≠ r1 ≠ r2 ≠ i
		Compute the mutant vector V=X_r0^((0))+F(X_r1^((0) )−X_r2^((0) ))
		For j = 1 to d
			generate a uniform random number u from [0, 1)
			if u < CR then U_j=V_j else U_j=X_(j,i)^((0))
		End for
	if f(U)<f(X_i^((0) )) then X_i^((1) )= U else X_i^((1) )= X_i^((0) )
	End for
End for*/

public class DiffEvolution {

    private ArrayList NP;
    private int NC;
    private double F;
    private double CR;
    private double x;
    private double y;

    public ArrayList getNP() {
        return NP;
    }

    public void setNP(ArrayList NP) {
        this.NP = NP;
    }

    public int getNC() {
        return NC;
    }

    public void setNC(int NC) {
        this.NC = NC;
    }

    public double getF() {
        return F;
    }

    public void setF(double f) {
        F = f;
    }

    public double getCR() {
        return CR;
    }

    public void setCR(double CR) {
        this.CR = 0.5;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void reInitiate() {
        this.NP = new ArrayList();
    }

    private double ackley(double x, double y) {
        double variable1 = 0.5 * Math.pow(x, 2) + Math.pow(y, 2);
        variable1 = -0.2 * Math.sqrt(variable1);
        variable1 = -20 * Math.pow(Math.E, variable1);
        double variable2 = 0.5 * (Math.cos(y * 2 * Math.PI) + Math.cos(x * 2 * Math.PI));
        variable2 = Math.pow(Math.E, variable2);
        return variable1 - variable2;
    }


    public void AddNP(){
        for (int i = 0; i<40; i++)
            NP.add((Math.random() * 10) - 5);
        System.out.println(NP);
    }


}






