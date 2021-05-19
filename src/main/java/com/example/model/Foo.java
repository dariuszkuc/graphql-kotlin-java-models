package com.example.model;

import javax.annotation.Nullable;

public class Foo {

    private final String bar;
    @Nullable
    private final Integer baz;

    public Foo(String bar, @Nullable Integer baz) {
        this.bar = bar;
        this.baz = baz;
    }

    public String getBar() {
        return bar;
    }

    @Nullable
    public Integer getBaz() {
        return baz;
    }
}
