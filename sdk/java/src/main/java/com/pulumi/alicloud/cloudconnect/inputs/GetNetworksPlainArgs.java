// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudconnect.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksPlainArgs Empty = new GetNetworksPlainArgs();

    /**
     * A list of CCN instances IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of CCN instances IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter CCN instances by name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter CCN instances by name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable String outputFile;

    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetNetworksPlainArgs() {}

    private GetNetworksPlainArgs(GetNetworksPlainArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksPlainArgs $;

        public Builder() {
            $ = new GetNetworksPlainArgs();
        }

        public Builder(GetNetworksPlainArgs defaults) {
            $ = new GetNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of CCN instances IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of CCN instances IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter CCN instances by name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetNetworksPlainArgs build() {
            return $;
        }
    }

}
