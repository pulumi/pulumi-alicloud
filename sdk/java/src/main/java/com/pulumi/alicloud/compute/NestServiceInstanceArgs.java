// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.compute;

import com.pulumi.alicloud.compute.inputs.NestServiceInstanceCommodityArgs;
import com.pulumi.alicloud.compute.inputs.NestServiceInstanceOperationMetadataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NestServiceInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final NestServiceInstanceArgs Empty = new NestServiceInstanceArgs();

    /**
     * The order information of cloud market. See `commodity` below.
     * 
     */
    @Import(name="commodity")
    private @Nullable Output<NestServiceInstanceCommodityArgs> commodity;

    /**
     * @return The order information of cloud market. See `commodity` below.
     * 
     */
    public Optional<Output<NestServiceInstanceCommodityArgs>> commodity() {
        return Optional.ofNullable(this.commodity);
    }

    /**
     * Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
     * 
     */
    @Import(name="enableInstanceOps")
    private @Nullable Output<Boolean> enableInstanceOps;

    /**
     * @return Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
     * 
     */
    public Optional<Output<Boolean>> enableInstanceOps() {
        return Optional.ofNullable(this.enableInstanceOps);
    }

    /**
     * Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
     * 
     */
    @Import(name="enableUserPrometheus")
    private @Nullable Output<Boolean> enableUserPrometheus;

    /**
     * @return Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
     * 
     */
    public Optional<Output<Boolean>> enableUserPrometheus() {
        return Optional.ofNullable(this.enableUserPrometheus);
    }

    /**
     * The configuration of O&amp;M. See `operation_metadata` below.
     * 
     */
    @Import(name="operationMetadata")
    private @Nullable Output<NestServiceInstanceOperationMetadataArgs> operationMetadata;

    /**
     * @return The configuration of O&amp;M. See `operation_metadata` below.
     * 
     */
    public Optional<Output<NestServiceInstanceOperationMetadataArgs>> operationMetadata() {
        return Optional.ofNullable(this.operationMetadata);
    }

    /**
     * The parameters entered by the deployment service instance.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return The parameters entered by the deployment service instance.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The ID of the resource group.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * The ID of the service.
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return The ID of the service.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     * The name of the Service Instance.
     * 
     */
    @Import(name="serviceInstanceName")
    private @Nullable Output<String> serviceInstanceName;

    /**
     * @return The name of the Service Instance.
     * 
     */
    public Optional<Output<String>> serviceInstanceName() {
        return Optional.ofNullable(this.serviceInstanceName);
    }

    /**
     * The version of the service.
     * 
     */
    @Import(name="serviceVersion", required=true)
    private Output<String> serviceVersion;

    /**
     * @return The version of the service.
     * 
     */
    public Output<String> serviceVersion() {
        return this.serviceVersion;
    }

    /**
     * The name of the specification.
     * 
     */
    @Import(name="specificationName")
    private @Nullable Output<String> specificationName;

    /**
     * @return The name of the specification.
     * 
     */
    public Optional<Output<String>> specificationName() {
        return Optional.ofNullable(this.specificationName);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The name of the template.
     * 
     */
    @Import(name="templateName")
    private @Nullable Output<String> templateName;

    /**
     * @return The name of the template.
     * 
     */
    public Optional<Output<String>> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    private NestServiceInstanceArgs() {}

    private NestServiceInstanceArgs(NestServiceInstanceArgs $) {
        this.commodity = $.commodity;
        this.enableInstanceOps = $.enableInstanceOps;
        this.enableUserPrometheus = $.enableUserPrometheus;
        this.operationMetadata = $.operationMetadata;
        this.parameters = $.parameters;
        this.paymentType = $.paymentType;
        this.resourceGroupId = $.resourceGroupId;
        this.serviceId = $.serviceId;
        this.serviceInstanceName = $.serviceInstanceName;
        this.serviceVersion = $.serviceVersion;
        this.specificationName = $.specificationName;
        this.tags = $.tags;
        this.templateName = $.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NestServiceInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NestServiceInstanceArgs $;

        public Builder() {
            $ = new NestServiceInstanceArgs();
        }

        public Builder(NestServiceInstanceArgs defaults) {
            $ = new NestServiceInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commodity The order information of cloud market. See `commodity` below.
         * 
         * @return builder
         * 
         */
        public Builder commodity(@Nullable Output<NestServiceInstanceCommodityArgs> commodity) {
            $.commodity = commodity;
            return this;
        }

        /**
         * @param commodity The order information of cloud market. See `commodity` below.
         * 
         * @return builder
         * 
         */
        public Builder commodity(NestServiceInstanceCommodityArgs commodity) {
            return commodity(Output.of(commodity));
        }

        /**
         * @param enableInstanceOps Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder enableInstanceOps(@Nullable Output<Boolean> enableInstanceOps) {
            $.enableInstanceOps = enableInstanceOps;
            return this;
        }

        /**
         * @param enableInstanceOps Whether the service instance has the O&amp;M function. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder enableInstanceOps(Boolean enableInstanceOps) {
            return enableInstanceOps(Output.of(enableInstanceOps));
        }

        /**
         * @param enableUserPrometheus Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder enableUserPrometheus(@Nullable Output<Boolean> enableUserPrometheus) {
            $.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * @param enableUserPrometheus Whether Prometheus monitoring is enabled. Default value: `false`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            return enableUserPrometheus(Output.of(enableUserPrometheus));
        }

        /**
         * @param operationMetadata The configuration of O&amp;M. See `operation_metadata` below.
         * 
         * @return builder
         * 
         */
        public Builder operationMetadata(@Nullable Output<NestServiceInstanceOperationMetadataArgs> operationMetadata) {
            $.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * @param operationMetadata The configuration of O&amp;M. See `operation_metadata` below.
         * 
         * @return builder
         * 
         */
        public Builder operationMetadata(NestServiceInstanceOperationMetadataArgs operationMetadata) {
            return operationMetadata(Output.of(operationMetadata));
        }

        /**
         * @param parameters The parameters entered by the deployment service instance.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters entered by the deployment service instance.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param paymentType The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The type of payment. Valid values: `Permanent`, `Subscription`, `PayAsYouGo`, `CustomFixTime`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The ID of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param serviceId The ID of the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId The ID of the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param serviceInstanceName The name of the Service Instance.
         * 
         * @return builder
         * 
         */
        public Builder serviceInstanceName(@Nullable Output<String> serviceInstanceName) {
            $.serviceInstanceName = serviceInstanceName;
            return this;
        }

        /**
         * @param serviceInstanceName The name of the Service Instance.
         * 
         * @return builder
         * 
         */
        public Builder serviceInstanceName(String serviceInstanceName) {
            return serviceInstanceName(Output.of(serviceInstanceName));
        }

        /**
         * @param serviceVersion The version of the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(Output<String> serviceVersion) {
            $.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * @param serviceVersion The version of the service.
         * 
         * @return builder
         * 
         */
        public Builder serviceVersion(String serviceVersion) {
            return serviceVersion(Output.of(serviceVersion));
        }

        /**
         * @param specificationName The name of the specification.
         * 
         * @return builder
         * 
         */
        public Builder specificationName(@Nullable Output<String> specificationName) {
            $.specificationName = specificationName;
            return this;
        }

        /**
         * @param specificationName The name of the specification.
         * 
         * @return builder
         * 
         */
        public Builder specificationName(String specificationName) {
            return specificationName(Output.of(specificationName));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param templateName The name of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateName(@Nullable Output<String> templateName) {
            $.templateName = templateName;
            return this;
        }

        /**
         * @param templateName The name of the template.
         * 
         * @return builder
         * 
         */
        public Builder templateName(String templateName) {
            return templateName(Output.of(templateName));
        }

        public NestServiceInstanceArgs build() {
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("NestServiceInstanceArgs", "serviceId");
            }
            if ($.serviceVersion == null) {
                throw new MissingRequiredPropertyException("NestServiceInstanceArgs", "serviceVersion");
            }
            return $;
        }
    }

}