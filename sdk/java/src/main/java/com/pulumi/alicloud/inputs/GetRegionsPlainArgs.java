// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionsPlainArgs Empty = new GetRegionsPlainArgs();

    /**
     * Set to true to match only the region configured in the provider.
     * 
     */
    @Import(name="current")
    private @Nullable Boolean current;

    /**
     * @return Set to true to match only the region configured in the provider.
     * 
     */
    public Optional<Boolean> current() {
        return Optional.ofNullable(this.current);
    }

    /**
     * The name of the region to select, such as `eu-central-1`.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the region to select, such as `eu-central-1`.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     * &gt; **NOTE:** You will get an error if you set `current` to true and `name` to a different value from the one you configured in the provider.
     * It is better to either use `name` or `current`, but not both at the same time.
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     * &gt; **NOTE:** You will get an error if you set `current` to true and `name` to a different value from the one you configured in the provider.
     * It is better to either use `name` or `current`, but not both at the same time.
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    private GetRegionsPlainArgs() {}

    private GetRegionsPlainArgs(GetRegionsPlainArgs $) {
        this.current = $.current;
        this.name = $.name;
        this.outputFile = $.outputFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionsPlainArgs $;

        public Builder() {
            $ = new GetRegionsPlainArgs();
        }

        public Builder(GetRegionsPlainArgs defaults) {
            $ = new GetRegionsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param current Set to true to match only the region configured in the provider.
         * 
         * @return builder
         * 
         */
        public Builder current(@Nullable Boolean current) {
            $.current = current;
            return this;
        }

        /**
         * @param name The name of the region to select, such as `eu-central-1`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * &gt; **NOTE:** You will get an error if you set `current` to true and `name` to a different value from the one you configured in the provider.
         * It is better to either use `name` or `current`, but not both at the same time.
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public GetRegionsPlainArgs build() {
            return $;
        }
    }

}