@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve name server records (`NS` records) for the`hostname`. On success, the `Promise` is resolved with an array of name server
 * records available for `hostname` (e.g.`['ns1.example.com', 'ns2.example.com']`).
 * @since v10.6.0
 */

@JsName("resolveNs")
external fun resolveNsAsync(hostname: String): Promise<js.core.ReadonlyArray<String>>
