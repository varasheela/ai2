/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        for(String arg: args) {
            System.out.println( arg.toString() );
        }

        //HillClimbingSearch hillClimbingSearch = new HillClimbingSearch();
        //hillClimbingSearch.process();
        DiffEvolution diffEvolution = new DiffEvolution();
        diffEvolution.reInitiate();
        diffEvolution.AddNP();

        System.out.println(new App().getGreeting());
    }
}
