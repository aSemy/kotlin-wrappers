@file:JsModule("node:crypto")

package node.crypto

import node.buffer.Buffer

/**
 * Generates a new asymmetric key pair of the given `type`. RSA, RSA-PSS, DSA, EC,
 * Ed25519, Ed448, X25519, X448, and DH are currently supported.
 *
 * If a `publicKeyEncoding` or `privateKeyEncoding` was specified, this function
 * behaves as if `keyObject.export()` had been called on its result. Otherwise,
 * the respective part of the key is returned as a `KeyObject`.
 *
 * It is recommended to encode public keys as `'spki'` and private keys as`'pkcs8'` with encryption for long-term storage:
 *
 * ```js
 * const {
 *   generateKeyPair
 * } = await import('crypto');
 *
 * generateKeyPair('rsa', {
 *   modulusLength: 4096,
 *   publicKeyEncoding: {
 *     type: 'spki',
 *     format: 'pem'
 *   },
 *   privateKeyEncoding: {
 *     type: 'pkcs8',
 *     format: 'pem',
 *     cipher: 'aes-256-cbc',
 *     passphrase: 'top secret'
 *   }
 * }, (err, publicKey, privateKey) => {
 *   // Handle errors and use the generated key pair.
 * });
 * ```
 *
 * On completion, `callback` will be called with `err` set to `undefined` and`publicKey` / `privateKey` representing the generated key pair.
 *
 * If this method is invoked as its `util.promisify()` ed version, it returns
 * a `Promise` for an `Object` with `publicKey` and `privateKey` properties.
 * @since v10.12.0
 * @param type Must be `'rsa'`, `'rsa-pss'`, `'dsa'`, `'ec'`, `'ed25519'`, `'ed448'`, `'x25519'`, `'x448'`, or `'dh'`.
 */
external fun generateKeyPair(
    type: KeyType.rsa,
    options: RSAKeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsa,
    options: RSAKeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsa,
    options: RSAKeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsa,
    options: RSAKeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsa,
    options: RSAKeyPairKeyObjectOptions,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.rsaPss,
    options: RSAPSSKeyPairKeyObjectOptions,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.dsa,
    options: DSAKeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.dsa,
    options: DSAKeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.dsa,
    options: DSAKeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.dsa,
    options: DSAKeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.dsa,
    options: DSAKeyPairKeyObjectOptions,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ec,
    options: ECKeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ec,
    options: ECKeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ec,
    options: ECKeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ec,
    options: ECKeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ec,
    options: ECKeyPairKeyObjectOptions,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed25519,
    options: ED25519KeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed25519,
    options: ED25519KeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed25519,
    options: ED25519KeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed25519,
    options: ED25519KeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed25519,
    options: ED25519KeyPairKeyObjectOptions?,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed448,
    options: ED448KeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed448,
    options: ED448KeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed448,
    options: ED448KeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed448,
    options: ED448KeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.ed448,
    options: ED448KeyPairKeyObjectOptions?,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x25519,
    options: X25519KeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x25519,
    options: X25519KeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x25519,
    options: X25519KeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x25519,
    options: X25519KeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x25519,
    options: X25519KeyPairKeyObjectOptions?,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x448,
    options: X448KeyPairPemPemOptions,
    callback: (err: Error?, publicKey: String, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x448,
    options: X448KeyPairPemDerOptions,
    callback: (err: Error?, publicKey: String, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x448,
    options: X448KeyPairDerPemOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: String) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x448,
    options: X448KeyPairDerDerOptions,
    callback: (err: Error?, publicKey: Buffer, privateKey: Buffer) -> Unit,
): Unit

external fun generateKeyPair(
    type: KeyType.x448,
    options: X448KeyPairKeyObjectOptions?,
    callback: (err: Error?, publicKey: KeyObject, privateKey: KeyObject) -> Unit,
): Unit