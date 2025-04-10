// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudcontrol.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPricesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPricesPlainArgs Empty = new GetPricesPlainArgs();

    /**
     * This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
     * 
     */
    @Import(name="desireAttributes")
    private @Nullable Map<String,String> desireAttributes;

    /**
     * @return This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
     * 
     */
    public Optional<Map<String,String>> desireAttributes() {
        return Optional.ofNullable(this.desireAttributes);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    @Import(name="product", required=true)
    private String product;

    /**
     * @return The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    public String product() {
        return this.product;
    }

    /**
     * Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    @Import(name="resourceCode", required=true)
    private String resourceCode;

    /**
     * @return Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
     * 
     */
    public String resourceCode() {
        return this.resourceCode;
    }

    private GetPricesPlainArgs() {}

    private GetPricesPlainArgs(GetPricesPlainArgs $) {
        this.desireAttributes = $.desireAttributes;
        this.outputFile = $.outputFile;
        this.product = $.product;
        this.resourceCode = $.resourceCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPricesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPricesPlainArgs $;

        public Builder() {
            $ = new GetPricesPlainArgs();
        }

        public Builder(GetPricesPlainArgs defaults) {
            $ = new GetPricesPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param desireAttributes This property represent the detailed configuration of the Resource which you are going to get price.  Give same content as DesireAttributes of the &#39;Resource&#39; Resource when start Create operation. &#39;PaymentType&#39; is necessary when in DesireAttributes.  Here is a probably example when you get the price of SLB LoadBalancer:```json{&#34;LoadBalancerName&#34;: &#34;cc-test&#34;,&#34;Bandwidth&#34;: 6,&#34;PaymentType&#34;: &#34;PayAsYouGo&#34;,&#34;AddressType&#34;: &#34;internet&#34;,&#34;LoadBalancerSpec&#34;: &#34;slb.s3.small&#34;,&#34;InternetChargeType&#34;: &#34;paybybandwidth&#34;} See `DesireAttributes` below.
         * 
         * @return builder
         * 
         */
        public Builder desireAttributes(@Nullable Map<String,String> desireAttributes) {
            $.desireAttributes = desireAttributes;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param product The product Code represents the product to be operated. Currently supported products and resources can be queried at the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            $.product = product;
            return this;
        }

        /**
         * @param resourceCode Resource Code, if there is a parent resource, split with `::`, such as VPC::VSwitch. The supported resource Code can be obtained from the following link: [supported-services-and-resource-types](https://help.aliyun.com/zh/cloud-control-api/product-overview/supported-services-and-resource-types).
         * 
         * @return builder
         * 
         */
        public Builder resourceCode(String resourceCode) {
            $.resourceCode = resourceCode;
            return this;
        }

        public GetPricesPlainArgs build() {
            if ($.product == null) {
                throw new MissingRequiredPropertyException("GetPricesPlainArgs", "product");
            }
            if ($.resourceCode == null) {
                throw new MissingRequiredPropertyException("GetPricesPlainArgs", "resourceCode");
            }
            return $;
        }
    }

}
