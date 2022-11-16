// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AliasState extends com.pulumi.resources.ResourceArgs {

    public static final AliasState Empty = new AliasState();

    /**
     * The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     * 
     */
    @Import(name="aliasName")
    private @Nullable Output<String> aliasName;

    /**
     * @return The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     * 
     */
    public Optional<Output<String>> aliasName() {
        return Optional.ofNullable(this.aliasName);
    }

    /**
     * The id of the key.
     * 
     */
    @Import(name="keyId")
    private @Nullable Output<String> keyId;

    /**
     * @return The id of the key.
     * 
     */
    public Optional<Output<String>> keyId() {
        return Optional.ofNullable(this.keyId);
    }

    private AliasState() {}

    private AliasState(AliasState $) {
        this.aliasName = $.aliasName;
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AliasState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AliasState $;

        public Builder() {
            $ = new AliasState();
        }

        public Builder(AliasState defaults) {
            $ = new AliasState(Objects.requireNonNull(defaults));
        }

        /**
         * @param aliasName The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(@Nullable Output<String> aliasName) {
            $.aliasName = aliasName;
            return this;
        }

        /**
         * @param aliasName The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
         * 
         * @return builder
         * 
         */
        public Builder aliasName(String aliasName) {
            return aliasName(Output.of(aliasName));
        }

        /**
         * @param keyId The id of the key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(@Nullable Output<String> keyId) {
            $.keyId = keyId;
            return this;
        }

        /**
         * @param keyId The id of the key.
         * 
         * @return builder
         * 
         */
        public Builder keyId(String keyId) {
            return keyId(Output.of(keyId));
        }

        public AliasState build() {
            return $;
        }
    }

}