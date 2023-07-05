package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{background: 'background', outline: 'outline', none: 'none'}/*union*/)""")
sealed external interface TouchBarScrubberOverlayStyle {
    companion object {
        val background: TouchBarScrubberOverlayStyle
        val outline: TouchBarScrubberOverlayStyle
        val none: TouchBarScrubberOverlayStyle
    }
}