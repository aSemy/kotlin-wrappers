@file:JsModule("node:dns/promises")

package node.dns

import js.promise.Promise

/**
 * Uses the DNS protocol to resolve mail exchange records (`MX` records) for the`hostname`. On success, the `Promise` is resolved with an array of objects
 * containing both a `priority` and `exchange` property (e.g.`[{priority: 10, exchange: 'mx.example.com'}, ...]`).
 * @since v10.6.0
 */

@JsName("resolveMx")
external fun resolveMxAsync(hostname: String): Promise<js.core.ReadonlyArray<MxRecord>>
