package ai.vektor.ktor.binder.annotations

@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class QueryParam(val paramName: String)
