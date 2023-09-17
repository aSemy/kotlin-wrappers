package node.crypto


@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface DecipherCCM : Decipher {
    fun setAuthTag(buffer: js.buffer.ArrayBufferView): Unit /* this */
    fun setAAD(buffer: js.buffer.ArrayBufferView, options: DecipherCCMSetAADOptions): Unit /* this */
}