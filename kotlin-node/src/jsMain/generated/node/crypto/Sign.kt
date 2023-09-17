@file:JsModule("node:crypto")

package node.crypto

import node.buffer.Buffer

/**
 * The `Sign` class is a utility for generating signatures. It can be used in one
 * of two ways:
 *
 * * As a writable `stream`, where data to be signed is written and the `sign.sign()` method is used to generate and return the signature, or
 * * Using the `sign.update()` and `sign.sign()` methods to produce the
 * signature.
 *
 * The {@link createSign} method is used to create `Sign` instances. The
 * argument is the string name of the hash function to use. `Sign` objects are not
 * to be created directly using the `new` keyword.
 *
 * Example: Using `Sign` and `Verify` objects as streams:
 *
 * ```js
 * const {
 *   generateKeyPairSync,
 *   createSign,
 *   createVerify
 * } = await import('crypto');
 *
 * const { privateKey, publicKey } = generateKeyPairSync('ec', {
 *   namedCurve: 'sect239k1'
 * });
 *
 * const sign = createSign('SHA256');
 * sign.write('some data to sign');
 * sign.end();
 * const signature = sign.sign(privateKey, 'hex');
 *
 * const verify = createVerify('SHA256');
 * verify.write('some data to sign');
 * verify.end();
 * console.log(verify.verify(publicKey, signature, 'hex'));
 * // Prints: true
 * ```
 *
 * Example: Using the `sign.update()` and `verify.update()` methods:
 *
 * ```js
 * const {
 *   generateKeyPairSync,
 *   createSign,
 *   createVerify
 * } = await import('crypto');
 *
 * const { privateKey, publicKey } = generateKeyPairSync('rsa', {
 *   modulusLength: 2048,
 * });
 *
 * const sign = createSign('SHA256');
 * sign.update('some data to sign');
 * sign.end();
 * const signature = sign.sign(privateKey);
 *
 * const verify = createVerify('SHA256');
 * verify.update('some data to sign');
 * verify.end();
 * console.log(verify.verify(publicKey, signature));
 * // Prints: true
 * ```
 * @since v0.1.92
 */

external class Sign : node.stream.Writable {
    /**
     * Updates the `Sign` content with the given `data`, the encoding of which
     * is given in `inputEncoding`.
     * If `encoding` is not provided, and the `data` is a string, an
     * encoding of `'utf8'` is enforced. If `data` is a `Buffer`, `TypedArray`, or`DataView`, then `inputEncoding` is ignored.
     *
     * This can be called many times with new data as it is streamed.
     * @since v0.1.92
     * @param inputEncoding The `encoding` of the `data` string.
     */
    fun update(data: BinaryLike): Unit /* this */
    fun update(data: String, inputEncoding: Encoding): Unit /* this */

    /**
     * Calculates the signature on all the data passed through using either `sign.update()` or `sign.write()`.
     *
     * If `privateKey` is not a `KeyObject`, this function behaves as if`privateKey` had been passed to {@link createPrivateKey}. If it is an
     * object, the following additional properties can be passed:
     *
     * If `outputEncoding` is provided a string is returned; otherwise a `Buffer` is returned.
     *
     * The `Sign` object can not be again used after `sign.sign()` method has been
     * called. Multiple calls to `sign.sign()` will result in an error being thrown.
     * @since v0.1.92
     */
    fun sign(privateKey: KeyLike): Buffer

    fun sign(privateKey: SignKeyObjectInput): Buffer

    fun sign(privateKey: SignPrivateKeyInput): Buffer
    fun sign(privateKey: KeyLike, outputFormat: BinaryToTextEncoding): String

    fun sign(privateKey: SignKeyObjectInput, outputFormat: BinaryToTextEncoding): String

    fun sign(privateKey: SignPrivateKeyInput, outputFormat: BinaryToTextEncoding): String
}