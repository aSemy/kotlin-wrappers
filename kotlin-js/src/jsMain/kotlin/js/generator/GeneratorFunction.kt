package js.generator

import js.array.JsTuple
import js.function.JsFunction

sealed external interface GeneratorFunction<in A : JsTuple, out R : Generator<*, *, *>>
    : JsFunction<A, R>
