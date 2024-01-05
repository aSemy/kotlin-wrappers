// Generated by Karakum - do not modify it manually!


package node.perfHooks


sealed external interface MarkOptions {
    /**
     * Additional optional detail to include with the mark.
     */
    var detail: Any?

    /**
     * An optional timestamp to be used as the mark time.
     * @default `performance.now()`.
     */
    var startTime: Double?
}
