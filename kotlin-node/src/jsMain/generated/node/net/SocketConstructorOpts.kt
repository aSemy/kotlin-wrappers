// Automatically generated - do not modify!

package node.net

import web.abort.AbortSignal

sealed external interface SocketConstructorOpts {
    var fd: Number?
    var allowHalfOpen: Boolean?
    var readable: Boolean?
    var writable: Boolean?
    var signal: AbortSignal?
}