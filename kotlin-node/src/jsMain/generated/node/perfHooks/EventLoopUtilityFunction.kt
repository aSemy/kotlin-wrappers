// Generated by Karakum - do not modify it manually!


package node.perfHooks


/**
 * @param util1 The result of a previous call to eventLoopUtilization()
 * @param util2 The result of a previous call to eventLoopUtilization() prior to util1
 */
typealias EventLoopUtilityFunction = (util1: EventLoopUtilization? /* use undefined for default */, util2: EventLoopUtilization? /* use undefined for default */) -> EventLoopUtilization