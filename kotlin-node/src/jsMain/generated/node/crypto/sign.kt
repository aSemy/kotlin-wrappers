@file:JsModule("node:crypto")

package node.crypto

import node.buffer.Buffer

/**
 * Calculates and returns the signature for `data` using the given private key and
 * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
 * dependent upon the key type (especially Ed25519 and Ed448).
 *
 * If `key` is not a `KeyObject`, this function behaves as if `key` had been
 * passed to {@link createPrivateKey}. If it is an object, the following
 * additional properties can be passed:
 *
 * If the `callback` function is provided this function uses libuv's threadpool.
 * @since v12.0.0
 */
external fun sign(algorithm: String?, data: js.buffer.ArrayBufferView, key: KeyLike): Buffer

external fun sign(algorithm: String?, data: js.buffer.ArrayBufferView, key: SignKeyObjectInput): Buffer

external fun sign(algorithm: String?, data: js.buffer.ArrayBufferView, key: SignPrivateKeyInput): Buffer

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: KeyLike,
    callback: (error: Error?, data: Buffer) -> Unit,
)

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: SignKeyObjectInput,
    callback: (error: Error?, data: Buffer) -> Unit,
): Unit

external fun sign(
    algorithm: String?,
    data: js.buffer.ArrayBufferView,
    key: SignPrivateKeyInput,
    callback: (error: Error?, data: Buffer) -> Unit,
): Unit