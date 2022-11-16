// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ens.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyPairsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPairsArgs Empty = new GetKeyPairsArgs();

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
     * A regex string to filter results by Key Pair name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Key Pair name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The version number.
     * 
     */
    @Import(name="version", required=true)
    private Output<String> version;

    /**
     * @return The version number.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    private GetKeyPairsArgs() {}

    private GetKeyPairsArgs(GetKeyPairsArgs $) {
        this.keyPairName = $.keyPairName;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyPairsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyPairsArgs $;

        public Builder() {
            $ = new GetKeyPairsArgs();
        }

        public Builder(GetKeyPairsArgs defaults) {
            $ = new GetKeyPairsArgs(Objects.requireNonNull(defaults));
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
         * @param nameRegex A regex string to filter results by Key Pair name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Key Pair name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param version The version number.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<String> version) {
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

        public GetKeyPairsArgs build() {
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}