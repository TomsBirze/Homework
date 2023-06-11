package io.codelex.oop.summary.lazyBox;

import java.util.function.Supplier;

public class LazyBox<T> {
    private T contents;
    private Supplier<T> initializer;
    private boolean isInitialized;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    public T get() {
        if (!isInitialized) {
            contents = initializer.get();
            isInitialized = true;
        }
        return contents;
    }
}
