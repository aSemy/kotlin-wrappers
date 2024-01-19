// Generated by Karakum - do not modify it manually!


package node.stream

import node.events.Abortable


sealed external interface StreamOptions<T : Stream> : Abortable {
    var emitClose: Boolean?
    var highWaterMark: Double?
    var objectMode: Boolean?
    fun construct(/* this: T, */ callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit): Unit
    fun destroy(
        /* this: T, */ error: Throwable /* JsError */?,
        callback: (error: Throwable /* JsError */? /* use undefined for default */) -> Unit,
    ): Unit

    var autoDestroy: Boolean?
}
