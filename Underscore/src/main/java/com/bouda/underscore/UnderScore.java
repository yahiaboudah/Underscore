package com.bouda.underscore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public class UnderScore {

    private static final int BAD_KEY_TYPE = 1;
    private static final int BAD_VAL_TYPE = 2;

    private static String thisNotThat(Class dis, Class that, Object val){
        return String.format(
                "Type %s was provided instead of %s for value: %s",
                dis.toString(), that.toString(), val.toString()
        );
    }

    @SuppressWarnings("All")
    public static <K, V> HashMap<K, V> _(K k, V v, Object... r) throws UnderscoreException {
        Class KClass = k.getClass();
        Class VClass = v.getClass();

        List<Object> A = new ArrayList<>(Arrays.asList(r));
        int L = A.size(), i = -2;
        if(L % 2 == 1) A.remove(L---1);

        HashMap<K, V> M = new HashMap<>();
        M.put(k, v);
        Object F, S;

        while ((i += 2) < L){
            F = A.get(i);
            S = A.get(i+1);

            if(!KClass.isInstance(F))
                throw new UnderscoreException(String.valueOf(BAD_KEY_TYPE), thisNotThat(F.getClass(), KClass, F));
            if(!VClass.isInstance(S))
                throw new UnderscoreException(String.valueOf(BAD_VAL_TYPE), thisNotThat(S.getClass(), VClass, S));

            M.put((K) F, (V) S);
        }
        return M;
    }

    public static <K> Callable<K>[] __(Callable<K>... args){ return args; }

    public static <T> T[] __(T... args){
        return args;
    }
}
