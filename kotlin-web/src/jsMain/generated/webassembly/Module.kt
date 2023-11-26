// Automatically generated - do not modify!

@file:JsQualifier("WebAssembly")

package webassembly

import js.buffer.ArrayBuffer
import js.buffer.BufferSource
import js.core.ReadonlyArray

/** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Module) */
external class Module(
    bytes: BufferSource,
) {
    companion object {
        /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Module/customSections_static) */
        fun customSections(
            moduleObject: Module,
            sectionName: String,
        ): ReadonlyArray<ArrayBuffer>

        /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Module/exports_static) */
        fun exports(moduleObject: Module): ReadonlyArray<ModuleExportDescriptor>

        /** [MDN Reference](https://developer.mozilla.org/docs/WebAssembly/JavaScript_interface/Module/imports_static) */
        fun imports(moduleObject: Module): ReadonlyArray<ModuleImportDescriptor>
    }
}
