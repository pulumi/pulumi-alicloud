// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ga;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class AccessLogArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLogArgs Empty = new AccessLogArgs();

    /**
     * The ID of the global acceleration instance.
     * 
     */
    @Import(name="acceleratorId", required=true)
    private Output<String> acceleratorId;

    /**
     * @return The ID of the global acceleration instance.
     * 
     */
    public Output<String> acceleratorId() {
        return this.acceleratorId;
    }

    /**
     * The ID of the endpoint group instance.
     * 
     */
    @Import(name="endpointGroupId", required=true)
    private Output<String> endpointGroupId;

    /**
     * @return The ID of the endpoint group instance.
     * 
     */
    public Output<String> endpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * The ID of the listener.
     * 
     */
    @Import(name="listenerId", required=true)
    private Output<String> listenerId;

    /**
     * @return The ID of the listener.
     * 
     */
    public Output<String> listenerId() {
        return this.listenerId;
    }

    /**
     * The name of the Log Store.
     * 
     */
    @Import(name="slsLogStoreName", required=true)
    private Output<String> slsLogStoreName;

    /**
     * @return The name of the Log Store.
     * 
     */
    public Output<String> slsLogStoreName() {
        return this.slsLogStoreName;
    }

    /**
     * The name of the Log Service project.
     * 
     */
    @Import(name="slsProjectName", required=true)
    private Output<String> slsProjectName;

    /**
     * @return The name of the Log Service project.
     * 
     */
    public Output<String> slsProjectName() {
        return this.slsProjectName;
    }

    /**
     * The region ID of the Log Service project.
     * 
     */
    @Import(name="slsRegionId", required=true)
    private Output<String> slsRegionId;

    /**
     * @return The region ID of the Log Service project.
     * 
     */
    public Output<String> slsRegionId() {
        return this.slsRegionId;
    }

    private AccessLogArgs() {}

    private AccessLogArgs(AccessLogArgs $) {
        this.acceleratorId = $.acceleratorId;
        this.endpointGroupId = $.endpointGroupId;
        this.listenerId = $.listenerId;
        this.slsLogStoreName = $.slsLogStoreName;
        this.slsProjectName = $.slsProjectName;
        this.slsRegionId = $.slsRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLogArgs $;

        public Builder() {
            $ = new AccessLogArgs();
        }

        public Builder(AccessLogArgs defaults) {
            $ = new AccessLogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorId The ID of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(Output<String> acceleratorId) {
            $.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * @param acceleratorId The ID of the global acceleration instance.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorId(String acceleratorId) {
            return acceleratorId(Output.of(acceleratorId));
        }

        /**
         * @param endpointGroupId The ID of the endpoint group instance.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupId(Output<String> endpointGroupId) {
            $.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * @param endpointGroupId The ID of the endpoint group instance.
         * 
         * @return builder
         * 
         */
        public Builder endpointGroupId(String endpointGroupId) {
            return endpointGroupId(Output.of(endpointGroupId));
        }

        /**
         * @param listenerId The ID of the listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(Output<String> listenerId) {
            $.listenerId = listenerId;
            return this;
        }

        /**
         * @param listenerId The ID of the listener.
         * 
         * @return builder
         * 
         */
        public Builder listenerId(String listenerId) {
            return listenerId(Output.of(listenerId));
        }

        /**
         * @param slsLogStoreName The name of the Log Store.
         * 
         * @return builder
         * 
         */
        public Builder slsLogStoreName(Output<String> slsLogStoreName) {
            $.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * @param slsLogStoreName The name of the Log Store.
         * 
         * @return builder
         * 
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            return slsLogStoreName(Output.of(slsLogStoreName));
        }

        /**
         * @param slsProjectName The name of the Log Service project.
         * 
         * @return builder
         * 
         */
        public Builder slsProjectName(Output<String> slsProjectName) {
            $.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * @param slsProjectName The name of the Log Service project.
         * 
         * @return builder
         * 
         */
        public Builder slsProjectName(String slsProjectName) {
            return slsProjectName(Output.of(slsProjectName));
        }

        /**
         * @param slsRegionId The region ID of the Log Service project.
         * 
         * @return builder
         * 
         */
        public Builder slsRegionId(Output<String> slsRegionId) {
            $.slsRegionId = slsRegionId;
            return this;
        }

        /**
         * @param slsRegionId The region ID of the Log Service project.
         * 
         * @return builder
         * 
         */
        public Builder slsRegionId(String slsRegionId) {
            return slsRegionId(Output.of(slsRegionId));
        }

        public AccessLogArgs build() {
            if ($.acceleratorId == null) {
                throw new MissingRequiredPropertyException("AccessLogArgs", "acceleratorId");
            }
            if ($.endpointGroupId == null) {
                throw new MissingRequiredPropertyException("AccessLogArgs", "endpointGroupId");
            }
            if ($.listenerId == null) {
                throw new MissingRequiredPropertyException("AccessLogArgs", "listenerId");
            }
            if ($.slsLogStoreName == null) {
                throw new MissingRequiredPropertyException("AccessLogArgs", "slsLogStoreName");
            }
            if ($.slsProjectName == null) {
                throw new MissingRequiredPropertyException("AccessLogArgs", "slsProjectName");
            }
            if ($.slsRegionId == null) {
                throw new MissingRequiredPropertyException("AccessLogArgs", "slsRegionId");
            }
            return $;
        }
    }

}
