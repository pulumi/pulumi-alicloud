// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProtocolsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetProtocolsArgs Empty = new GetProtocolsArgs();

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The file system type. Valid Values: `Performance` and `Capacity`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The file system type. Valid Values: `Performance` and `Capacity`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * String to filter results by zone id.
     * 
     */
    @Import(name="zoneId")
    private @Nullable Output<String> zoneId;

    /**
     * @return String to filter results by zone id.
     * 
     */
    public Optional<Output<String>> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    private GetProtocolsArgs() {}

    private GetProtocolsArgs(GetProtocolsArgs $) {
        this.outputFile = $.outputFile;
        this.type = $.type;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProtocolsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProtocolsArgs $;

        public Builder() {
            $ = new GetProtocolsArgs();
        }

        public Builder(GetProtocolsArgs defaults) {
            $ = new GetProtocolsArgs(Objects.requireNonNull(defaults));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param type The file system type. Valid Values: `Performance` and `Capacity`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The file system type. Valid Values: `Performance` and `Capacity`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param zoneId String to filter results by zone id.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(@Nullable Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId String to filter results by zone id.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public GetProtocolsArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}