// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFileCrc64ChecksumArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFileCrc64ChecksumArgs Empty = new GetFileCrc64ChecksumArgs();

    /**
     * The name of the file to be computed crc64 checksum.
     * 
     */
    @Import(name="filename", required=true)
    private Output<String> filename;

    /**
     * @return The name of the file to be computed crc64 checksum.
     * 
     */
    public Output<String> filename() {
        return this.filename;
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetFileCrc64ChecksumArgs() {}

    private GetFileCrc64ChecksumArgs(GetFileCrc64ChecksumArgs $) {
        this.filename = $.filename;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFileCrc64ChecksumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFileCrc64ChecksumArgs $;

        public Builder() {
            $ = new GetFileCrc64ChecksumArgs();
        }

        public Builder(GetFileCrc64ChecksumArgs defaults) {
            $ = new GetFileCrc64ChecksumArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filename The name of the file to be computed crc64 checksum.
         * 
         * @return builder
         * 
         */
        public Builder filename(Output<String> filename) {
            $.filename = filename;
            return this;
        }

        /**
         * @param filename The name of the file to be computed crc64 checksum.
         * 
         * @return builder
         * 
         */
        public Builder filename(String filename) {
            return filename(Output.of(filename));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public GetFileCrc64ChecksumArgs build() {
            $.filename = Objects.requireNonNull($.filename, "expected parameter 'filename' to be non-null");
            return $;
        }
    }

}