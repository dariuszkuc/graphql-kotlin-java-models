# graphql-kotlin-java-model

Example usage of annotated Java models with `graphql-kotlin-spring-server`.

Java models are annotated with `javax.annotation.Nullable` (from `spotbugs-annotations`) to indicate nullability of an
underlying fields. By default, Java types are marked as [platform types](https://kotlinlang.org/docs/java-interop.html#null-safety-and-platform-types)
and require additional annotation that has a runtime retention to infer nullability.

>NOTE: Jetbrains `Nullable` annotation does not work as its does not have runtime retention.