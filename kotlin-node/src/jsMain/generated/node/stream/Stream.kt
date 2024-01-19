// Generated by Karakum - do not modify it manually!

@file:JsModule("node:stream")

package node.stream

import js.iterable.AsyncIterable
import node.events.EventEmitter


open external class Stream : EventEmitter {
    constructor (opts: ReadableOptions = definedExternally)

    fun <T : node.WritableStream> pipe(destination: T, options: StreamPipeOptions = definedExternally): T
    open fun <T : node.ReadableStream> compose(stream: T, options: StreamComposeOptions = definedExternally): T

    open fun <T : node.ReadableStream> compose(
        stream: ComposeFnParam,
        options: StreamComposeOptions = definedExternally,
    ): T

    open fun <T : node.ReadableStream> compose(
        stream: js.iterable.JsIterable<T>,
        options: StreamComposeOptions = definedExternally,
    ): T

    open fun <T : node.ReadableStream> compose(
        stream: AsyncIterable<T>,
        options: StreamComposeOptions = definedExternally,
    ): T

    companion object

}
