// Generated by Karakum - do not modify it manually!

package remix.run.router

import web.form.FormData


sealed external interface NavigationStatesSubmitting {
    var state: String /* "submitting" */
    var location: Location<*>
    var formMethod: FormMethod
    var formAction: String
    var formEncType: FormEncType
    var formData: FormData?
    var json: JsonValue
    var text: String?
}
