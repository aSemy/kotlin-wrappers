// Generated by Karakum - do not modify it manually!

package node.test


sealed external interface TestPassDetails {
    /**
     * The duration of the test in milliseconds.
     */
    var duration_ms: Double

    /**
     * The type of the test, used to denote whether this is a suite.
     * @since 18.17.0
     */
    var type: String /* "suite" */?
}
