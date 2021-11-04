import org.junit.Assert.*;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class test {
    @Test
    public void somethingLook () throws IOException {
        main search = new main();
        search.read();
        HashMap<String, Integer> map = search.listAmount();
        assertEquals(56, (int)map.get("the"));
    }


}
