// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BucketReplicationPrefixSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketReplicationPrefixSetArgs Empty = new BucketReplicationPrefixSetArgs();

    /**
     * The list of object key name prefix identifying one or more objects to which the rule applies.
     * 
     * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
     * 
     */
    @Import(name="prefixes", required=true)
    private Output<List<String>> prefixes;

    /**
     * @return The list of object key name prefix identifying one or more objects to which the rule applies.
     * 
     * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
     * 
     */
    public Output<List<String>> prefixes() {
        return this.prefixes;
    }

    private BucketReplicationPrefixSetArgs() {}

    private BucketReplicationPrefixSetArgs(BucketReplicationPrefixSetArgs $) {
        this.prefixes = $.prefixes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketReplicationPrefixSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketReplicationPrefixSetArgs $;

        public Builder() {
            $ = new BucketReplicationPrefixSetArgs();
        }

        public Builder(BucketReplicationPrefixSetArgs defaults) {
            $ = new BucketReplicationPrefixSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param prefixes The list of object key name prefix identifying one or more objects to which the rule applies.
         * 
         * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefixes(Output<List<String>> prefixes) {
            $.prefixes = prefixes;
            return this;
        }

        /**
         * @param prefixes The list of object key name prefix identifying one or more objects to which the rule applies.
         * 
         * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefixes(List<String> prefixes) {
            return prefixes(Output.of(prefixes));
        }

        /**
         * @param prefixes The list of object key name prefix identifying one or more objects to which the rule applies.
         * 
         * `NOTE`: The prefix must be less than or equal to 1024 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder prefixes(String... prefixes) {
            return prefixes(List.of(prefixes));
        }

        public BucketReplicationPrefixSetArgs build() {
            if ($.prefixes == null) {
                throw new MissingRequiredPropertyException("BucketReplicationPrefixSetArgs", "prefixes");
            }
            return $;
        }
    }

}