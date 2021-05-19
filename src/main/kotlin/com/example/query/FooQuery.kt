package com.example.query

import com.example.model.Foo
import com.expediagroup.graphql.server.operations.Query
import org.springframework.stereotype.Service

@Service
class FooQuery : Query {
    fun foo(bar: String, baz: Int? = null): Foo = Foo(bar, baz)
}