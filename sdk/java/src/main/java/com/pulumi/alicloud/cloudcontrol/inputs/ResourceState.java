// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudcontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceState extends com.pulumi.resources.ResourceArgs {

    public static final ResourceState Empty = new ResourceState();

    /**
     * Resource attributes specified when a user creates or updates a resource.
     * 
     */
    @Import(name="desireAttributes")
    private @Nullable Output<String> desireAttributes;

    /**
     * @return Resource attributes specified when a user creates or updates a resource.
     * 
     */
    public Optional<Output<String>> desireAttributes() {
        return Optional.ofNullable(this.desireAttributes);
    }

    /**
     * The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    /**
     * @return The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * The collection of properties for the resource.
     * 
     */
    @Import(name="resourceAttributes")
    private @Nullable Output<String> resourceAttributes;

    /**
     * @return The collection of properties for the resource.
     * 
     */
    public Optional<Output<String>> resourceAttributes() {
        return Optional.ofNullable(this.resourceAttributes);
    }

    /**
     * Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    @Import(name="resourceCode")
    private @Nullable Output<String> resourceCode;

    /**
     * @return Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    public Optional<Output<String>> resourceCode() {
        return Optional.ofNullable(this.resourceCode);
    }

    /**
     * If there is a parent resource, you need to enter the id of the parent resource, for example, in the VPC::VSwtich resource, you need to enter the id of the VPC: vpc-dexadfe3r4ad. If there are more than one level of parent resources, you need to use `:` to split.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return If there is a parent resource, you need to enter the id of the parent resource, for example, in the VPC::VSwtich resource, you need to enter the id of the VPC: vpc-dexadfe3r4ad. If there are more than one level of parent resources, you need to use `:` to split.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    private ResourceState() {}

    private ResourceState(ResourceState $) {
        this.desireAttributes = $.desireAttributes;
        this.product = $.product;
        this.resourceAttributes = $.resourceAttributes;
        this.resourceCode = $.resourceCode;
        this.resourceId = $.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceState $;

        public Builder() {
            $ = new ResourceState();
        }

        public Builder(ResourceState defaults) {
            $ = new ResourceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param desireAttributes Resource attributes specified when a user creates or updates a resource.
         * 
         * @return builder
         * 
         */
        public Builder desireAttributes(@Nullable Output<String> desireAttributes) {
            $.desireAttributes = desireAttributes;
            return this;
        }

        /**
         * @param desireAttributes Resource attributes specified when a user creates or updates a resource.
         * 
         * @return builder
         * 
         */
        public Builder desireAttributes(String desireAttributes) {
            return desireAttributes(Output.of(desireAttributes));
        }

        /**
         * @param product The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param resourceAttributes The collection of properties for the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceAttributes(@Nullable Output<String> resourceAttributes) {
            $.resourceAttributes = resourceAttributes;
            return this;
        }

        /**
         * @param resourceAttributes The collection of properties for the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceAttributes(String resourceAttributes) {
            return resourceAttributes(Output.of(resourceAttributes));
        }

        /**
         * @param resourceCode Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder resourceCode(@Nullable Output<String> resourceCode) {
            $.resourceCode = resourceCode;
            return this;
        }

        /**
         * @param resourceCode Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder resourceCode(String resourceCode) {
            return resourceCode(Output.of(resourceCode));
        }

        /**
         * @param resourceId If there is a parent resource, you need to enter the id of the parent resource, for example, in the VPC::VSwtich resource, you need to enter the id of the VPC: vpc-dexadfe3r4ad. If there are more than one level of parent resources, you need to use `:` to split.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId If there is a parent resource, you need to enter the id of the parent resource, for example, in the VPC::VSwtich resource, you need to enter the id of the VPC: vpc-dexadfe3r4ad. If there are more than one level of parent resources, you need to use `:` to split.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        public ResourceState build() {
            return $;
        }
    }

}
