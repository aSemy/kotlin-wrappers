// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface PushNotificationsEvent {
    sealed interface RECEIVED_APNS_NOTIFICATION : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("received-apns-notification")
        val RECEIVED_APNS_NOTIFICATION: RECEIVED_APNS_NOTIFICATION
    }
}
