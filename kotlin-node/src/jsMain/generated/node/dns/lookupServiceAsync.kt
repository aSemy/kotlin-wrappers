@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Resolves the given `address` and `port` into a host name and service using
 * the operating system's underlying `getnameinfo` implementation.
 *
 * If `address` is not a valid IP address, a `TypeError` will be thrown.
 * The `port` will be coerced to a number. If it is not a legal port, a `TypeError`will be thrown.
 *
 * On error, the `Promise` is rejected with an `Error` object, where `err.code`is the error code.
 *
 * ```js
 * const dnsPromises = require('dns').promises;
 * dnsPromises.lookupService('127.0.0.1', 22).then((result) => {
 *   console.log(result.hostname, result.service);
 *   // Prints: localhost ssh
 * });
 * ```
 * @since v10.6.0
 */

@JsName("lookupService")
external fun lookupServiceAsync(address: String, port: Double): Promise<LookupServiceResultPayload>
