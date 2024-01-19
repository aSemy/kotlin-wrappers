// Generated by Karakum - do not modify it manually!


package node.stream

import web.abort.AbortSignal


sealed external interface ArrayOptions {
    /** the maximum concurrent invocations of `fn` to call on the stream at once. **Default: 1**. */
    var concurrency: Double?

    /** allows destroying the stream if the signal is aborted. */
    var signal: AbortSignal?
}
