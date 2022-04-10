package com.bouda.underscore;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ExampleUnitTest {

    private String fact1(){
        return "last computer was a complete piece of garbage.";
    }

    private <T> String BAD_TYPE(T t, String type){
        return String.format(
                "Bad (key:%s) type: [%s] instead of [%s]", t.toString(), t.getClass().getSimpleName(), type
        );
    }

    /*
    @Test
    public void test(){

        HashMap<Object, Object> map = new HashMap<>();
        map.put("wow", 44);
        map.put("78", 45);
        map.put("888", 777);

        _(
                UnderScore.DB_STRUCTURE, true,
                _("key", "value"),
                _("key2", "value2"),
                _("key3", "value3")
        );

        map.forEach((k, v) -> {
            if(!(k instanceof String)) throw new Error(BAD_TYPE(k, "String"));
            if(!(v instanceof Integer)) throw new Error(BAD_TYPE(v, "Integer"));
        });
    }
     */

    private <K> Class<?> tester(Object... r){
        List<Object> A = new ArrayList<>(Arrays.asList(r));
        K k = (K) A.get(0);
        HashMap<?, K> map = new HashMap<>();
        return A.get(0).getClass();
    }

    @Test
    public void isMap() throws UnderscoreException {
        HashMap<String, ?> m = new HashMap<>();
        // m.put("aze", "aze");
        System.out.println(m.toString());
        System.out.println(tester(true, "aze", 45));
    }
}