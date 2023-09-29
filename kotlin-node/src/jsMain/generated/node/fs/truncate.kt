@file:JsModule("node:fs")

package node.fs


/**
 * Truncates the file. No arguments other than a possible exception are
 * given to the completion callback. A file descriptor can also be passed as the
 * first argument. In this case, `fs.ftruncate()` is called.
 *
 * ```js
 * import { truncate } from 'fs';
 * // Assuming that 'path/file.txt' is a regular file.
 * truncate('path/file.txt', (err) => {
 *   if (err) throw err;
 *   console.log('path/file.txt was truncated');
 * });
 * ```
 *
 * Passing a file descriptor is deprecated and may result in an error being thrown
 * in the future.
 *
 * See the POSIX [`truncate(2)`](http://man7.org/linux/man-pages/man2/truncate.2.html) documentation for more details.
 * @since v0.8.6
 * @param [len=0]
 */
external fun truncate(path: PathLike, len: Double?, callback: NoParamCallback): Unit

/**
 * Asynchronous truncate(2) - Truncate a file to a specified length.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 */
external fun truncate(path: PathLike, callback: NoParamCallback): Unit