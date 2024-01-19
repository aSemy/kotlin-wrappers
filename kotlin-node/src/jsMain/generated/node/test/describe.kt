// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * @since v18.6.0
 * @param name The name of the suite, which is displayed when reporting suite results.
 *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
 * @param options Configuration options for the suite
 * @param fn The function under suite. Default: A no-op function.
 */

@JsName("describe")
external fun describeAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<Unit>


@JsName("describe")
external fun describeAsync(name: String = definedExternally, fn: SuiteFn = definedExternally): Promise<Unit>


@JsName("describe")
external fun describeAsync(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): Promise<Unit>


@JsName("describe")
external fun describeAsync(fn: SuiteFn = definedExternally): Promise<Unit>
