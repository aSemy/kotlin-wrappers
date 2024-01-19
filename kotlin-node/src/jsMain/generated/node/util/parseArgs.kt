// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util


//// parseArgs
/**
 * Provides a high-level API for command-line argument parsing. Takes a
 * specification for the expected arguments and returns a structured object
 * with the parsed values and positionals.
 *
 * `config` provides arguments for parsing and configures the parser. It
 * supports the following properties:
 *
 *   - `args` The array of argument strings. **Default:** `process.argv` with
 *     `execPath` and `filename` removed.
 *   - `options` Arguments known to the parser. Keys of `options` are the long
 *     names of options and values are objects accepting the following properties:
 *
 *     - `type` Type of argument, which must be either `boolean` (for options
 *        which do not take values) or `string` (for options which do).
 *     - `multiple` Whether this option can be provided multiple
 *       times. If `true`, all values will be collected in an array. If
 *       `false`, values for the option are last-wins. **Default:** `false`.
 *     - `short` A single character alias for the option.
 *     - `default` The default option value when it is not set by args. It
 *       must be of the same type as the `type` property. When `multiple`
 *       is `true`, it must be an array.
 *
 *   - `strict`: Whether an error should be thrown when unknown arguments
 *     are encountered, or when arguments are passed that do not match the
 *     `type` configured in `options`. **Default:** `true`.
 *   - `allowPositionals`: Whether this command accepts positional arguments.
 *     **Default:** `false` if `strict` is `true`, otherwise `true`.
 *   - `tokens`: Whether tokens {boolean} Return the parsed tokens. This is useful
 *     for extending the built-in behavior, from adding additional checks through
 *     to reprocessing the tokens in different ways.
 *     **Default:** `false`.
 *
 * @returns The parsed command line arguments:
 *
 *   - `values` A mapping of parsed option names with their string
 *     or boolean values.
 *   - `positionals` Positional arguments.
 *   - `tokens` Detailed parse information (only if `tokens` was specified).
 */
external fun <T : ParseArgsConfig> parseArgs(config: T = definedExternally): ParsedResults<T>
