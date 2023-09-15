@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Performs a reverse DNS query that resolves an IPv4 or IPv6 address to an
 * array of host names.
 *
 * On error, the `Promise` is rejected with an `Error` object, where `err.code`is one of the `DNS error codes`.
 * @since v10.6.0
 */

@JsName("reverse")
external fun reverseAsync(ip: String): Promise<js.core.ReadonlyArray<String>>
