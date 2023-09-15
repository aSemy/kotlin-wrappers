@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve text queries (`TXT` records) for the`hostname`. On success, the `Promise` is resolved with a two-dimensional array
 * of the text records available for `hostname` (e.g.`[ ['v=spf1 ip4:0.0.0.0 ', '~all' ] ]`). Each sub-array contains TXT chunks of
 * one record. Depending on the use case, these could be either joined together or
 * treated separately.
 * @since v10.6.0
 */

@JsName("resolveTxt")
external fun resolveTxtAsync(hostname: String): Promise<js.core.ReadonlyArray<js.core.ReadonlyArray<String>>>
