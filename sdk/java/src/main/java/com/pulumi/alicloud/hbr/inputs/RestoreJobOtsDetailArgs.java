// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestoreJobOtsDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestoreJobOtsDetailArgs Empty = new RestoreJobOtsDetailArgs();

    /**
     * Whether to overwrite the existing table storage recovery task. Valid values: `true`, `false`.
     * 
     */
    @Import(name="overwriteExisting")
    private @Nullable Output<Boolean> overwriteExisting;

    /**
     * @return Whether to overwrite the existing table storage recovery task. Valid values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> overwriteExisting() {
        return Optional.ofNullable(this.overwriteExisting);
    }

    private RestoreJobOtsDetailArgs() {}

    private RestoreJobOtsDetailArgs(RestoreJobOtsDetailArgs $) {
        this.overwriteExisting = $.overwriteExisting;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestoreJobOtsDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestoreJobOtsDetailArgs $;

        public Builder() {
            $ = new RestoreJobOtsDetailArgs();
        }

        public Builder(RestoreJobOtsDetailArgs defaults) {
            $ = new RestoreJobOtsDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param overwriteExisting Whether to overwrite the existing table storage recovery task. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder overwriteExisting(@Nullable Output<Boolean> overwriteExisting) {
            $.overwriteExisting = overwriteExisting;
            return this;
        }

        /**
         * @param overwriteExisting Whether to overwrite the existing table storage recovery task. Valid values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder overwriteExisting(Boolean overwriteExisting) {
            return overwriteExisting(Output.of(overwriteExisting));
        }

        public RestoreJobOtsDetailArgs build() {
            return $;
        }
    }

}
