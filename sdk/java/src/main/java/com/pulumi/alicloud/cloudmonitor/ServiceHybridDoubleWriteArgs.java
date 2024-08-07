// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ServiceHybridDoubleWriteArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHybridDoubleWriteArgs Empty = new ServiceHybridDoubleWriteArgs();

    /**
     * Target Namespace.
     * 
     */
    @Import(name="namespace", required=true)
    private Output<String> namespace;

    /**
     * @return Target Namespace.
     * 
     */
    public Output<String> namespace() {
        return this.namespace;
    }

    /**
     * Source Namespace.
     * 
     */
    @Import(name="sourceNamespace", required=true)
    private Output<String> sourceNamespace;

    /**
     * @return Source Namespace.
     * 
     */
    public Output<String> sourceNamespace() {
        return this.sourceNamespace;
    }

    /**
     * Source UserId.
     * 
     */
    @Import(name="sourceUserId", required=true)
    private Output<String> sourceUserId;

    /**
     * @return Source UserId.
     * 
     */
    public Output<String> sourceUserId() {
        return this.sourceUserId;
    }

    /**
     * Target UserId.
     * 
     */
    @Import(name="userId", required=true)
    private Output<String> userId;

    /**
     * @return Target UserId.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }

    private ServiceHybridDoubleWriteArgs() {}

    private ServiceHybridDoubleWriteArgs(ServiceHybridDoubleWriteArgs $) {
        this.namespace = $.namespace;
        this.sourceNamespace = $.sourceNamespace;
        this.sourceUserId = $.sourceUserId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHybridDoubleWriteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHybridDoubleWriteArgs $;

        public Builder() {
            $ = new ServiceHybridDoubleWriteArgs();
        }

        public Builder(ServiceHybridDoubleWriteArgs defaults) {
            $ = new ServiceHybridDoubleWriteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace Target Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Target Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param sourceNamespace Source Namespace.
         * 
         * @return builder
         * 
         */
        public Builder sourceNamespace(Output<String> sourceNamespace) {
            $.sourceNamespace = sourceNamespace;
            return this;
        }

        /**
         * @param sourceNamespace Source Namespace.
         * 
         * @return builder
         * 
         */
        public Builder sourceNamespace(String sourceNamespace) {
            return sourceNamespace(Output.of(sourceNamespace));
        }

        /**
         * @param sourceUserId Source UserId.
         * 
         * @return builder
         * 
         */
        public Builder sourceUserId(Output<String> sourceUserId) {
            $.sourceUserId = sourceUserId;
            return this;
        }

        /**
         * @param sourceUserId Source UserId.
         * 
         * @return builder
         * 
         */
        public Builder sourceUserId(String sourceUserId) {
            return sourceUserId(Output.of(sourceUserId));
        }

        /**
         * @param userId Target UserId.
         * 
         * @return builder
         * 
         */
        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId Target UserId.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public ServiceHybridDoubleWriteArgs build() {
            if ($.namespace == null) {
                throw new MissingRequiredPropertyException("ServiceHybridDoubleWriteArgs", "namespace");
            }
            if ($.sourceNamespace == null) {
                throw new MissingRequiredPropertyException("ServiceHybridDoubleWriteArgs", "sourceNamespace");
            }
            if ($.sourceUserId == null) {
                throw new MissingRequiredPropertyException("ServiceHybridDoubleWriteArgs", "sourceUserId");
            }
            if ($.userId == null) {
                throw new MissingRequiredPropertyException("ServiceHybridDoubleWriteArgs", "userId");
            }
            return $;
        }
    }

}
