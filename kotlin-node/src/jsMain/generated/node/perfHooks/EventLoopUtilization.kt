// Generated by Karakum - do not modify it manually!


package node.perfHooks


sealed external interface EventLoopUtilization {
    var idle: Double
    var active: Double
    var utilization: Double
}
