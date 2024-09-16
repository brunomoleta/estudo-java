package tests;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author roberto.dinamite
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}