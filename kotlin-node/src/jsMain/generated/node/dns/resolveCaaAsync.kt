@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve `CAA` records for the `hostname`. On success,
 * the `Promise` is resolved with an array of objects containing available
 * certification authority authorization records available for the `hostname`(e.g. `[{critical: 0, iodef: 'mailto:pki@example.com'},{critical: 128, issue: 'pki.example.com'}]`).
 * @since v15.0.0, v14.17.0
 */

@JsName("resolveCaa")
external fun resolveCaaAsync(hostname: String): Promise<js.core.ReadonlyArray<CaaRecord>>
