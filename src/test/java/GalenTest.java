import com.luckincoffee.role.Ash;
import com.luckincoffee.role.Galen;
import com.luckincoffee.role.Katerina;
import com.luckincoffee.strategy.impl.MonomerAttack;
import org.junit.Test;

/**
 * @author 陈志雄
 * @version V1.0
 * @Description
 * @Package PACKAGE_NAME
 * @date 2024/6/3 2:00
 */
public class GalenTest {
    @Test
    public void galenTest(){
        Galen galen = new Galen(new MonomerAttack());
        galen.attack();
    }
    @Test
    public void ashTest(){
        Ash ash = new Ash(new MonomerAttack());
        ash.attack();
    }
    @Test
    public void katerinaTest(){
        Katerina katerina = new Katerina(new MonomerAttack());
        katerina.attack();
    }
}
