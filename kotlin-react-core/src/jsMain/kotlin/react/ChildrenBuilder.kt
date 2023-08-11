@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
    "EXTENSION_FUNCTION_IN_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package react

import js.core.ReadonlyArray
import js.core.Symbol
import js.core.jso

// child array
private val CHILD_ARRAY: Symbol = Symbol("@@child-array")

private inline var ChildrenBuilder.childArray: ReadonlyArray<ReactNode?>?
    get() = asDynamic()[CHILD_ARRAY]
    set(value) {
        asDynamic()[CHILD_ARRAY] = value
    }

fun ChildrenBuilder.getChildArray(): ReadonlyArray<ReactNode?>? =
    asDynamic()[CHILD_ARRAY]

fun Props.getChildArray(): ReadonlyArray<ReactNode?>? =
    asDynamic()[CHILD_ARRAY]

// default key
private val DEFAULT_KEY: Symbol = Symbol("@@default-key")

private inline fun ChildrenBuilder.getDefaultKey(): Key? =
    asDynamic()[DEFAULT_KEY]

// for compiler plugins
private fun setDefaultKey(
    builder: ChildrenBuilder,
    key: Key,
) {
    builder.asDynamic()[DEFAULT_KEY] = key
}

sealed external interface ChildrenBuilder {
    inline operator fun ReactNode?.unaryPlus() {
        addChildNode(this)
    }

    inline operator fun String?.unaryPlus() {
        addChildNode(ReactNode(this))
    }

    inline operator fun Char.unaryPlus() {
        addChildNode(ReactNode(this))
    }

    inline fun <P : Props> child(
        type: ElementType<P>,
        props: P,
    ) {
        addChild(type, props)
    }

    inline operator fun <P : Props> ElementType<P>.invoke() {
        addChild(this)
    }

    inline operator fun <P : Props> ElementType<P>.invoke(
        noinline block: @ReactDsl P.() -> Unit,
    ) {
        addChild(
            type = this,
            block = block,
        )
    }

    inline operator fun <T> Provider<T>.invoke(
        value: T,
        noinline block: @ReactDsl ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            provider = this,
            value = value,
            block = block,
        )
    }

    inline operator fun <T> Context<T>.invoke(
        value: T,
        noinline block: @ReactDsl ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            context = this,
            value = value,
            block = block,
        )
    }

    inline operator fun <T : Any> RequiredContext<T>.invoke(
        value: T,
        noinline block: @ReactDsl ChildrenBuilder.() -> Unit,
    ) {
        addChild(
            context = this,
            value = value,
            block = block,
        )
    }
}

@PublishedApi
internal fun ChildrenBuilder.addChildNode(
    node: ReactNode?,
) {
    if (childArray != null) {
        childArray.asDynamic().push(node)
    } else {
        childArray = arrayOf(node)
    }
}

private fun <P : Props> ChildrenBuilder.addChildElement(
    type: ElementType<P>,
    props: P? = null,
    children: ReadonlyArray<ReactNode?>? = null,
) {
    val element = if (children != null) {
        createElement(
            type = type,
            props = props,
            children = children,
        )
    } else {
        createElement(
            type = type,
            props = props,
        )
    }

    addChildNode(element)
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
) {
    addChildElement(
        type = type,
    )
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
    props: P,
) {
    addChildElement(
        type = type,
        props = props,
    )
}

@PublishedApi
internal fun <P : Props> ChildrenBuilder.addChild(
    type: ElementType<P>,
    block: P.() -> Unit,
) {
    val props: P = jso(block)

    addChildElement(
        type = type,
        props = props,
        children = props.getChildArray(),
    )
}

@PublishedApi
internal fun <T> ChildrenBuilder.addChild(
    provider: Provider<T>,
    value: T,
    block: @ReactDsl ChildrenBuilder.() -> Unit,
) {
    addChild(
        type = provider,
        block = {
            this.value = value
            block()
        }
    )
}

@PublishedApi
internal fun <T> ChildrenBuilder.addChild(
    context: Context<T>,
    value: T,
    block: @ReactDsl ChildrenBuilder.() -> Unit,
) {
    addChild(
        provider = context.Provider,
        value = value,
        block = block,
    )
}

@PublishedApi
internal fun <T : Any> ChildrenBuilder.addChild(
    context: RequiredContext<T>,
    value: T,
    block: @ReactDsl ChildrenBuilder.() -> Unit,
) {
    addChild(
        provider = context.Provider,
        value = value,
        block = block,
    )
}
