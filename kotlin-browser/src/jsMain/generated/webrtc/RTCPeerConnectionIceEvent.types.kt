// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package webrtc

import seskar.js.JsValue
import web.events.EventType

sealed external interface RTCPeerConnectionIceEventTypes {
    @JsValue("icecandidate")
    val ICE_CANDIDATE: EventType<RTCPeerConnectionIceEvent>
        get() = definedExternally
}