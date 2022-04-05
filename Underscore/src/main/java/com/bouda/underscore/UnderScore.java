package com.bouda.underscore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public class UnderScore {

    @SuppressWarnings("All")
    public static <K, V> HashMap<K, V> _(K k, V v, Object... r)
    {
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
            if(!(KClass.isInstance(F) && VClass.isInstance(S)))
                throw new Error();

            M.put((K) F, (V) S);
        }
        return M;
    }

    public static <K> Callable<K>[] __(Callable<K>... args){ return args; }

    public static <T> T[] __(T... args){
        return args;
    }
}
