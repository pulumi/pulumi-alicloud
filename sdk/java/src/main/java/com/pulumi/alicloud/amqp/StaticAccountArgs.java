// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.amqp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class StaticAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final StaticAccountArgs Empty = new StaticAccountArgs();

    /**
     * Access key.
     * 
     */
    @Import(name="accessKey", required=true)
    private Output<String> accessKey;

    /**
     * @return Access key.
     * 
     */
    public Output<String> accessKey() {
        return this.accessKey;
    }

    /**
     * Amqp instance ID.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return Amqp instance ID.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Secret key.
     * 
     */
    @Import(name="secretKey", required=true)
    private Output<String> secretKey;

    /**
     * @return Secret key.
     * 
     */
    public Output<String> secretKey() {
        return this.secretKey;
    }

    private StaticAccountArgs() {}

    private StaticAccountArgs(StaticAccountArgs $) {
        this.accessKey = $.accessKey;
        this.instanceId = $.instanceId;
        this.secretKey = $.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StaticAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StaticAccountArgs $;

        public Builder() {
            $ = new StaticAccountArgs();
        }

        public Builder(StaticAccountArgs defaults) {
            $ = new StaticAccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey Access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey Access key.
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param instanceId Amqp instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId Amqp instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param secretKey Secret key.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey Secret key.
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        public StaticAccountArgs build() {
            $.accessKey = Objects.requireNonNull($.accessKey, "expected parameter 'accessKey' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.secretKey = Objects.requireNonNull($.secretKey, "expected parameter 'secretKey' to be non-null");
            return $;
        }
    }

}