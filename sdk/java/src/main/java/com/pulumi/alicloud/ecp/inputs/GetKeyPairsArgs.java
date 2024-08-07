// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyPairsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPairsArgs Empty = new GetKeyPairsArgs();

    /**
     * A list of Key Pair IDs. Its element value is same as Key Pair Name.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Key Pair IDs. Its element value is same as Key Pair Name.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The Private Key of the Fingerprint.
     * 
     */
    @Import(name="keyPairFingerPrint")
    private @Nullable Output<String> keyPairFingerPrint;

    /**
     * @return The Private Key of the Fingerprint.
     * 
     */
    public Optional<Output<String>> keyPairFingerPrint() {
        return Optional.ofNullable(this.keyPairFingerPrint);
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

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetKeyPairsArgs() {}

    private GetKeyPairsArgs(GetKeyPairsArgs $) {
        this.ids = $.ids;
        this.keyPairFingerPrint = $.keyPairFingerPrint;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
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
         * @param ids A list of Key Pair IDs. Its element value is same as Key Pair Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Key Pair IDs. Its element value is same as Key Pair Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Key Pair IDs. Its element value is same as Key Pair Name.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param keyPairFingerPrint The Private Key of the Fingerprint.
         * 
         * @return builder
         * 
         */
        public Builder keyPairFingerPrint(@Nullable Output<String> keyPairFingerPrint) {
            $.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }

        /**
         * @param keyPairFingerPrint The Private Key of the Fingerprint.
         * 
         * @return builder
         * 
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            return keyPairFingerPrint(Output.of(keyPairFingerPrint));
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

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetKeyPairsArgs build() {
            return $;
        }
    }

}
