public class HillClimbingSearch
{
    private double x;
    private double y;
    private double ackley;


    public double getX() {
        return x;
    }

    public void setX( double x ) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY( double y ) {
        this.y = y;
    }

    public double getAckley() {
        return ackley;
    }

    public void setAckley( double ackley ) {
        this.ackley = ackley;
    }

    public HillClimbingSearch()
    {
        reInitiate();
    }

    private void reInitiate() {
        x = (Math.random() * 10) - 5;
        y = (Math.random() * 10) - 5;
        ackley = ackley( x, y );
    }

    public void process() {
        for(int i = 0; i <=100; i++) {
            reInitiate();
            for ( int j = 0; j <= 100; j++ ) {
                double newX      = getNewValue( getX() );
                double newY      = getNewValue( getY() );
                double newAckley = ackley( newX, newY );
                if ( newAckley < getAckley() ) {
                    setX( newX );
                    setY( newY );
                    setAckley( newAckley );
                }
            }
            System.out.println( ackley );
        }
    }

    private void printXAndY() {
        System.out.println(x + "," + y + "," + ackley);
    }

    private double getNewValue(double oldValue) {
        return ((Math.random() - 0.5)* 0.1 + oldValue);
    }

    private double ackley( double x, double y) {
        double variable1 = 0.5 * Math.pow(x, 2) + Math.pow(y, 2);
        variable1 = -0.2 * Math.sqrt(variable1);
        variable1 = -20 * Math.pow(Math.E, variable1);
        double variable2 = 0.5 * (Math.cos(y * 2 * Math.PI) + Math.cos(x * 2 * Math.PI));
        variable2 = Math.pow(Math.E, variable2);
        return variable1 - variable2;
    }


}
