package node.tls


sealed external interface PxfObject {
    /**
     * PFX or PKCS12 encoded private key and certificate chain.
     */
    var buf: Any /* string | Buffer */

    /**
     * Optional passphrase.
     */
    var passphrase: String?
}