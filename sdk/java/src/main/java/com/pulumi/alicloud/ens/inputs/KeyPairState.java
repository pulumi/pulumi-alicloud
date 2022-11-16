// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyPairState extends com.pulumi.resources.ResourceArgs {

    public static final KeyPairState Empty = new KeyPairState();

    /**
     * The name of the key pair.
     * 
     */
    @Import(name="keyPairName")
    private @Nullable Output<String> keyPairName;

    /**
     * @return The name of the key pair.
     * 
     */
    public Optional<Output<String>> keyPairName() {
        return Optional.ofNullable(this.keyPairName);
    }

    /**
     * The version number.
     * 
     */
    @Import(name="version")
    private @Nullable Output<String> version;

    /**
     * @return The version number.
     * 
     */
    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private KeyPairState() {}

    private KeyPairState(KeyPairState $) {
        this.keyPairName = $.keyPairName;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KeyPairState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KeyPairState $;

        public Builder() {
            $ = new KeyPairState();
        }

        public Builder(KeyPairState defaults) {
            $ = new KeyPairState(Objects.requireNonNull(defaults));
        }

        /**
         * @param keyPairName The name of the key pair.
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            $.keyPairName = keyPairName;
            return this;
        }

        /**
         * @param keyPairName The name of the key pair.
         * 
         * @return builder
         * 
         */
        public Builder keyPairName(String keyPairName) {
            return keyPairName(Output.of(keyPairName));
        }

        /**
         * @param version The version number.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version The version number.
         * 
         * @return builder
         * 
         */
        public Builder version(String version) {
            return version(Output.of(version));
        }

        public KeyPairState build() {
            return $;
        }
    }

}