// Generated by Karakum - do not modify it manually!


package node.crypto


sealed external interface SigningOptions {
    /**
     * @see crypto.constants.RSA_PKCS1_PADDING
     */
    var padding: Double?
    var saltLength: Double?
    var dsaEncoding: DSAEncoding?
}
