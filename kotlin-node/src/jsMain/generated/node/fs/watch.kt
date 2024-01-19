// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs


/**
 * Watch for changes on `filename`, where `filename` is either a file or a
 * directory.
 *
 * The second argument is optional. If `options` is provided as a string, it
 * specifies the `encoding`. Otherwise `options` should be passed as an object.
 *
 * The listener callback gets two arguments `(eventType, filename)`. `eventType`is either `'rename'` or `'change'`, and `filename` is the name of the file
 * which triggered the event.
 *
 * On most platforms, `'rename'` is emitted whenever a filename appears or
 * disappears in the directory.
 *
 * The listener callback is attached to the `'change'` event fired by `fs.FSWatcher`, but it is not the same thing as the `'change'` value of`eventType`.
 *
 * If a `signal` is passed, aborting the corresponding AbortController will close
 * the returned `fs.FSWatcher`.
 * @since v0.5.10
 * @param listener
 */
external fun watch(
    filename: PathLike,
    options: WatchBufferOptions,
    listener: WatchListener<node.buffer.Buffer> = definedExternally,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: String, /* "buffer" */
    listener: WatchListener<node.buffer.Buffer> = definedExternally,
): FSWatcher

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(
    filename: PathLike,
    options: WatchOptions? = definedExternally,
    listener: WatchListener<String> = definedExternally,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: node.buffer.BufferEncoding? = definedExternally,
    listener: WatchListener<String> = definedExternally,
): FSWatcher

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
 * If `encoding` is not supplied, the default of `'utf8'` is used.
 * If `persistent` is not supplied, the default of `true` is used.
 * If `recursive` is not supplied, the default of `false` is used.
 */
external fun watch(
    filename: PathLike,
    options: WatchOptions,
    listener: WatchListener<Any /* string | Buffer */> = definedExternally,
): FSWatcher

external fun watch(
    filename: PathLike,
    options: String,
    listener: WatchListener<Any /* string | Buffer */> = definedExternally,
): FSWatcher

/**
 * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
 * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
 */
external fun watch(filename: PathLike, listener: WatchListener<String> = definedExternally): FSWatcher
