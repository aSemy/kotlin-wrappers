// Generated by Karakum - do not modify it manually!


package node

import js.typedarrays.Uint8Array
import node.events.EventEmitter


@Suppress("INTERFACE_WITH_SUPERCLASS")

external interface WritableStream : EventEmitter {
    var writable: Boolean
    fun write(
        buffer: Uint8Array,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit = definedExternally,
    ): Boolean

    fun write(
        buffer: String,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit = definedExternally,
    ): Boolean

    fun write(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: (err: Throwable /* JsError */? /* use undefined for default */) -> Unit = definedExternally,
    ): Boolean

    fun end(cb: () -> Unit = definedExternally): Unit /* this */
    fun end(data: String, cb: () -> Unit = definedExternally): Unit /* this */

    fun end(data: Uint8Array, cb: () -> Unit = definedExternally): Unit /* this */
    fun end(
        str: String,
        encoding: node.buffer.BufferEncoding = definedExternally,
        cb: () -> Unit = definedExternally,
    ): Unit /* this */
}
