// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import node.asyncHooks.AsyncResource


external class Test : AsyncResource {
    var concurrency: Double
    var nesting: Double
    var only: Boolean
    var reporter: TestsStream
    var runOnlySubtests: Boolean
    var testNumber: Double
    var timeout: Double?
}
