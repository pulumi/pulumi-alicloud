// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudcontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPricesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPricesArgs Empty = new GetPricesArgs();

    /**
     * This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
     * 
     */
    @Import(name="desireAttributes")
    private @Nullable Output<Map<String,String>> desireAttributes;

    /**
     * @return This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
     * 
     */
    public Optional<Output<Map<String,String>>> desireAttributes() {
        return Optional.ofNullable(this.desireAttributes);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    @Import(name="product", required=true)
    private Output<String> product;

    /**
     * @return The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    public Output<String> product() {
        return this.product;
    }

    /**
     * Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    @Import(name="resourceCode", required=true)
    private Output<String> resourceCode;

    /**
     * @return Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    public Output<String> resourceCode() {
        return this.resourceCode;
    }

    private GetPricesArgs() {}

    private GetPricesArgs(GetPricesArgs $) {
        this.desireAttributes = $.desireAttributes;
        this.outputFile = $.outputFile;
        this.product = $.product;
        this.resourceCode = $.resourceCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPricesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPricesArgs $;

        public Builder() {
            $ = new GetPricesArgs();
        }

        public Builder(GetPricesArgs defaults) {
            $ = new GetPricesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desireAttributes This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
         * 
         * @return builder
         * 
         */
        public Builder desireAttributes(@Nullable Output<Map<String,String>> desireAttributes) {
            $.desireAttributes = desireAttributes;
            return this;
        }

        /**
         * @param desireAttributes This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
         * 
         * @return builder
         * 
         */
        public Builder desireAttributes(Map<String,String> desireAttributes) {
            return desireAttributes(Output.of(desireAttributes));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param product The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder product(Output<String> product) {
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
         * @param resourceCode Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder resourceCode(Output<String> resourceCode) {
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

        public GetPricesArgs build() {
            if ($.product == null) {
                throw new MissingRequiredPropertyException("GetPricesArgs", "product");
            }
            if ($.resourceCode == null) {
                throw new MissingRequiredPropertyException("GetPricesArgs", "resourceCode");
            }
            return $;
        }
    }

}
