#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.main;

/**
 * Esta clase se encarga de que el error "Error: JavaFX runtime components are
 * missing, and are required to run this application" no aparezca.
 */
public class RunApp {

    public static void main(String[] args) {
        App.main(args);
    }
}
