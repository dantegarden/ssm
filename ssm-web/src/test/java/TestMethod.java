import com.letinvr.common.util.CommonHelper;
import com.letinvr.dao.model.entity.SysCode;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class TestMethod {
    @Test
    public void test() throws Exception {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("codeType", "Order");
        map.put("codeValue", "1");
    }
}
