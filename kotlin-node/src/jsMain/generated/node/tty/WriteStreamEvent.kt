// Generated by Karakum - do not modify it manually!

package node.tty


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface WriteStreamEvent : node.events.EventType {
    sealed interface RESIZE : WriteStreamEvent

    companion object {
        @seskar.js.JsValue("resize")
        val RESIZE: RESIZE
    }
}