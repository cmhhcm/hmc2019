package com.hmc.si;

import java.util.List;

public interface ObjectTransformer<F, T> {
    T transform(F object);

    List<T> transform(List<F> objects);

    T transform(F object, TransformerContext context);

    List<T> transform(List<F> objects, TransformerContext context);
}
