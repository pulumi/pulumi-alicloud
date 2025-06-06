// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const key = new alicloud.kms.Key("key", {
 *     description: "example key",
 *     isEnabled: true,
 * });
 * const encrypted = alicloud.kms.getCiphertextOutput({
 *     keyId: key.id,
 *     plaintext: "example",
 * });
 * ```
 */
export function getCiphertext(args: GetCiphertextArgs, opts?: pulumi.InvokeOptions): Promise<GetCiphertextResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:kms/getCiphertext:getCiphertext", {
        "encryptionContext": args.encryptionContext,
        "keyId": args.keyId,
        "plaintext": args.plaintext,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiphertext.
 */
export interface GetCiphertextArgs {
    /**
     * The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    encryptionContext?: {[key: string]: string};
    /**
     * The globally unique ID of the CMK.
     */
    keyId: string;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    plaintext: string;
}

/**
 * A collection of values returned by getCiphertext.
 */
export interface GetCiphertextResult {
    /**
     * The ciphertext of the data key encrypted with the primary CMK version.
     */
    readonly ciphertextBlob: string;
    readonly encryptionContext?: {[key: string]: string};
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly keyId: string;
    readonly plaintext: string;
}
/**
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const key = new alicloud.kms.Key("key", {
 *     description: "example key",
 *     isEnabled: true,
 * });
 * const encrypted = alicloud.kms.getCiphertextOutput({
 *     keyId: key.id,
 *     plaintext: "example",
 * });
 * ```
 */
export function getCiphertextOutput(args: GetCiphertextOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetCiphertextResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("alicloud:kms/getCiphertext:getCiphertext", {
        "encryptionContext": args.encryptionContext,
        "keyId": args.keyId,
        "plaintext": args.plaintext,
    }, opts);
}

/**
 * A collection of arguments for invoking getCiphertext.
 */
export interface GetCiphertextOutputArgs {
    /**
     * The Encryption context. If you specify this parameter here, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     */
    encryptionContext?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The globally unique ID of the CMK.
     */
    keyId: pulumi.Input<string>;
    /**
     * The plaintext to be encrypted which must be encoded in Base64.
     */
    plaintext: pulumi.Input<string>;
}
