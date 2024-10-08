// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.tag;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MetaTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetaTagArgs Empty = new MetaTagArgs();

    /**
     * The key of the tag meta tag. key must be 1 to 128 characters in length.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The key of the tag meta tag. key must be 1 to 128 characters in length.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The values of the tag meta tag.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The values of the tag meta tag.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private MetaTagArgs() {}

    private MetaTagArgs(MetaTagArgs $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetaTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetaTagArgs $;

        public Builder() {
            $ = new MetaTagArgs();
        }

        public Builder(MetaTagArgs defaults) {
            $ = new MetaTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param key The key of the tag meta tag. key must be 1 to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The key of the tag meta tag. key must be 1 to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values The values of the tag meta tag.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The values of the tag meta tag.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The values of the tag meta tag.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public MetaTagArgs build() {
            if ($.key == null) {
                throw new MissingRequiredPropertyException("MetaTagArgs", "key");
            }
            if ($.values == null) {
                throw new MissingRequiredPropertyException("MetaTagArgs", "values");
            }
            return $;
        }
    }

}
