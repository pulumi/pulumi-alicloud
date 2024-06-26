// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ros.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsArgs Empty = new GetRegionsArgs();

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

    private GetRegionsArgs() {}

    private GetRegionsArgs(GetRegionsArgs $) {
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsArgs $;

        public Builder() {
            $ = new GetRegionsArgs();
        }

        public Builder(GetRegionsArgs defaults) {
            $ = new GetRegionsArgs(Objects.requireNonNull(defaults));
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

        public GetRegionsArgs build() {
            return $;
        }
    }

}
