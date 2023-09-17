package node.crypto


sealed external interface SecureHeapUsage {
    /**
     * The total allocated secure heap size as specified using the `--secure-heap=n` command-line flag.
     */
    var total: Double

    /**
     * The minimum allocation from the secure heap as specified using the `--secure-heap-min` command-line flag.
     */
    var min: Double

    /**
     * The total number of bytes currently allocated from the secure heap.
     */
    var used: Double

    /**
     * The calculated ratio of `used` to `total` allocated bytes.
     */
    var utilization: Double
}