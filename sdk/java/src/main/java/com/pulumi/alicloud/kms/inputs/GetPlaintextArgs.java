// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPlaintextArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPlaintextArgs Empty = new GetPlaintextArgs();

    /**
     * The ciphertext to be decrypted.
     * 
     */
    @Import(name="ciphertextBlob", required=true)
    private Output<String> ciphertextBlob;

    /**
     * @return The ciphertext to be decrypted.
     * 
     */
    public Output<String> ciphertextBlob() {
        return this.ciphertextBlob;
    }

    /**
     * (Optional) The Encryption context. If you specify this parameter in the Encrypt or GenerateDataKey API operation, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     * 
     */
    @Import(name="encryptionContext")
    private @Nullable Output<Map<String,String>> encryptionContext;

    /**
     * @return (Optional) The Encryption context. If you specify this parameter in the Encrypt or GenerateDataKey API operation, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
     * 
     */
    public Optional<Output<Map<String,String>>> encryptionContext() {
        return Optional.ofNullable(this.encryptionContext);
    }

    private GetPlaintextArgs() {}

    private GetPlaintextArgs(GetPlaintextArgs $) {
        this.ciphertextBlob = $.ciphertextBlob;
        this.encryptionContext = $.encryptionContext;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPlaintextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPlaintextArgs $;

        public Builder() {
            $ = new GetPlaintextArgs();
        }

        public Builder(GetPlaintextArgs defaults) {
            $ = new GetPlaintextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ciphertextBlob The ciphertext to be decrypted.
         * 
         * @return builder
         * 
         */
        public Builder ciphertextBlob(Output<String> ciphertextBlob) {
            $.ciphertextBlob = ciphertextBlob;
            return this;
        }

        /**
         * @param ciphertextBlob The ciphertext to be decrypted.
         * 
         * @return builder
         * 
         */
        public Builder ciphertextBlob(String ciphertextBlob) {
            return ciphertextBlob(Output.of(ciphertextBlob));
        }

        /**
         * @param encryptionContext (Optional) The Encryption context. If you specify this parameter in the Encrypt or GenerateDataKey API operation, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
         * 
         * @return builder
         * 
         */
        public Builder encryptionContext(@Nullable Output<Map<String,String>> encryptionContext) {
            $.encryptionContext = encryptionContext;
            return this;
        }

        /**
         * @param encryptionContext (Optional) The Encryption context. If you specify this parameter in the Encrypt or GenerateDataKey API operation, it is also required when you call the Decrypt API operation. For more information, see [Encryption Context](https://www.alibabacloud.com/help/doc-detail/42975.htm).
         * 
         * @return builder
         * 
         */
        public Builder encryptionContext(Map<String,String> encryptionContext) {
            return encryptionContext(Output.of(encryptionContext));
        }

        public GetPlaintextArgs build() {
            if ($.ciphertextBlob == null) {
                throw new MissingRequiredPropertyException("GetPlaintextArgs", "ciphertextBlob");
            }
            return $;
        }
    }

}