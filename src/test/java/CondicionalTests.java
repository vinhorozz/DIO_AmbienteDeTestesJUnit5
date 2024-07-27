import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionalTests {
    static String USER= System.getProperty("user.name");
//criamos uma condição ao passar os parâmetros, sendo que ela será avalida como boolean
    @Test
    // @EnabledOnOs(OS.LINUX)
    // @EnabledOnOs(OS.MAC)
    //@EnabledOnOs({OS.MAC,OS.LINUX})
    //@EnabledOnJre(JRE.JAVA_17)
    @EnabledForJreRange(min= JRE.JAVA_11,max = JRE.JAVA_21)
  //  @EnabledIfEnvironmentVariable(named = "USER", matches = "root")
 // @DisabledIfEnvironmentVariable(named = "USER", matches = "flavi")
    void validarAlgoAtravesDoUsuario(){
        Assertions.assertEquals(10,5+5);
    }

  /*  public static void main(String[] args) {
        System.out.println(USER);
    }
*/

}
