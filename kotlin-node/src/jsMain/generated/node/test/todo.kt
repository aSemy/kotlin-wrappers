// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * Shorthand for marking a test as `TODO`, same as `test([name], { todo: true }[, fn])`.
 * @since v18.17.0
 */

@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Unit>


@JsName("todo")
external fun todoAsync(name: String = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("todo")
external fun todoAsync(options: TestOptions = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("todo")
external fun todoAsync(fn: TestFn = definedExternally): Promise<Unit>
