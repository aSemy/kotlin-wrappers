// Generated by Karakum - do not modify it manually!

package electron.core


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface AppEvent {
    sealed interface ACCESSIBILITY_SUPPORT_CHANGED : node.events.LegacyEventType
    sealed interface ACTIVATE : node.events.LegacyEventType
    sealed interface ACTIVITY_WAS_CONTINUED : node.events.LegacyEventType
    sealed interface BEFORE_QUIT : node.events.LegacyEventType
    sealed interface BROWSER_WINDOW_BLUR : node.events.LegacyEventType
    sealed interface BROWSER_WINDOW_CREATED : node.events.LegacyEventType
    sealed interface BROWSER_WINDOW_FOCUS : node.events.LegacyEventType
    sealed interface CERTIFICATE_ERROR : node.events.LegacyEventType
    sealed interface CHILD_PROCESS_GONE : node.events.LegacyEventType
    sealed interface CONTINUE_ACTIVITY : node.events.LegacyEventType
    sealed interface CONTINUE_ACTIVITY_ERROR : node.events.LegacyEventType
    sealed interface DID_BECOME_ACTIVE : node.events.LegacyEventType
    sealed interface DID_RESIGN_ACTIVE : node.events.LegacyEventType
    sealed interface GPU_INFO_UPDATE : node.events.LegacyEventType
    sealed interface LOGIN : node.events.LegacyEventType
    sealed interface NEW_WINDOW_FOR_TAB : node.events.LegacyEventType
    sealed interface OPEN_FILE : node.events.LegacyEventType
    sealed interface OPEN_URL : node.events.LegacyEventType
    sealed interface QUIT : node.events.LegacyEventType
    sealed interface READY : node.events.LegacyEventType
    sealed interface RENDER_PROCESS_GONE : node.events.LegacyEventType
    sealed interface SECOND_INSTANCE : node.events.LegacyEventType
    sealed interface SELECT_CLIENT_CERTIFICATE : node.events.LegacyEventType
    sealed interface SESSION_CREATED : node.events.LegacyEventType
    sealed interface UPDATE_ACTIVITY_STATE : node.events.LegacyEventType
    sealed interface WEB_CONTENTS_CREATED : node.events.LegacyEventType
    sealed interface WILL_CONTINUE_ACTIVITY : node.events.LegacyEventType
    sealed interface WILL_FINISH_LAUNCHING : node.events.LegacyEventType
    sealed interface WILL_QUIT : node.events.LegacyEventType
    sealed interface WINDOW_ALL_CLOSED : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("accessibility-support-changed")
        val ACCESSIBILITY_SUPPORT_CHANGED: ACCESSIBILITY_SUPPORT_CHANGED

        @seskar.js.JsValue("activate")
        val ACTIVATE: ACTIVATE

        @seskar.js.JsValue("activity-was-continued")
        val ACTIVITY_WAS_CONTINUED: ACTIVITY_WAS_CONTINUED

        @seskar.js.JsValue("before-quit")
        val BEFORE_QUIT: BEFORE_QUIT

        @seskar.js.JsValue("browser-window-blur")
        val BROWSER_WINDOW_BLUR: BROWSER_WINDOW_BLUR

        @seskar.js.JsValue("browser-window-created")
        val BROWSER_WINDOW_CREATED: BROWSER_WINDOW_CREATED

        @seskar.js.JsValue("browser-window-focus")
        val BROWSER_WINDOW_FOCUS: BROWSER_WINDOW_FOCUS

        @seskar.js.JsValue("certificate-error")
        val CERTIFICATE_ERROR: CERTIFICATE_ERROR

        @seskar.js.JsValue("child-process-gone")
        val CHILD_PROCESS_GONE: CHILD_PROCESS_GONE

        @seskar.js.JsValue("continue-activity")
        val CONTINUE_ACTIVITY: CONTINUE_ACTIVITY

        @seskar.js.JsValue("continue-activity-error")
        val CONTINUE_ACTIVITY_ERROR: CONTINUE_ACTIVITY_ERROR

        @seskar.js.JsValue("did-become-active")
        val DID_BECOME_ACTIVE: DID_BECOME_ACTIVE

        @seskar.js.JsValue("did-resign-active")
        val DID_RESIGN_ACTIVE: DID_RESIGN_ACTIVE

        @seskar.js.JsValue("gpu-info-update")
        val GPU_INFO_UPDATE: GPU_INFO_UPDATE

        @seskar.js.JsValue("login")
        val LOGIN: LOGIN

        @seskar.js.JsValue("new-window-for-tab")
        val NEW_WINDOW_FOR_TAB: NEW_WINDOW_FOR_TAB

        @seskar.js.JsValue("open-file")
        val OPEN_FILE: OPEN_FILE

        @seskar.js.JsValue("open-url")
        val OPEN_URL: OPEN_URL

        @seskar.js.JsValue("quit")
        val QUIT: QUIT

        @seskar.js.JsValue("ready")
        val READY: READY

        @seskar.js.JsValue("render-process-gone")
        val RENDER_PROCESS_GONE: RENDER_PROCESS_GONE

        @seskar.js.JsValue("second-instance")
        val SECOND_INSTANCE: SECOND_INSTANCE

        @seskar.js.JsValue("select-client-certificate")
        val SELECT_CLIENT_CERTIFICATE: SELECT_CLIENT_CERTIFICATE

        @seskar.js.JsValue("session-created")
        val SESSION_CREATED: SESSION_CREATED

        @seskar.js.JsValue("update-activity-state")
        val UPDATE_ACTIVITY_STATE: UPDATE_ACTIVITY_STATE

        @seskar.js.JsValue("web-contents-created")
        val WEB_CONTENTS_CREATED: WEB_CONTENTS_CREATED

        @seskar.js.JsValue("will-continue-activity")
        val WILL_CONTINUE_ACTIVITY: WILL_CONTINUE_ACTIVITY

        @seskar.js.JsValue("will-finish-launching")
        val WILL_FINISH_LAUNCHING: WILL_FINISH_LAUNCHING

        @seskar.js.JsValue("will-quit")
        val WILL_QUIT: WILL_QUIT

        @seskar.js.JsValue("window-all-closed")
        val WINDOW_ALL_CLOSED: WINDOW_ALL_CLOSED
    }
}
