// Generated by Karakum - do not modify it manually!


package node.perfHooks


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface EntryType {
    companion object {
        @seskar.js.JsValue("node")
        val node: EntryType

        @seskar.js.JsValue("mark")
        val mark: EntryType

        @seskar.js.JsValue("measure")
        val measure: EntryType

        @seskar.js.JsValue("gc")
        val gc: EntryType

        @seskar.js.JsValue("function")
        val function: EntryType

        @seskar.js.JsValue("http2")
        val http2: EntryType

        @seskar.js.JsValue("http")
        val http: EntryType
    }
}
