// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DdosCooInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DdosCooInstanceArgs Empty = new DdosCooInstanceArgs();

    /**
     * The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    @Import(name="addressType")
    private @Nullable Output<String> addressType;

    /**
     * @return The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    public Optional<Output<String>> addressType() {
        return Optional.ofNullable(this.addressType);
    }

    /**
     * Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<String> bandwidth;

    /**
     * @return Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    public Optional<Output<String>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The mitigation plan of the instance. Valid values:
     * 
     */
    @Import(name="bandwidthMode")
    private @Nullable Output<String> bandwidthMode;

    /**
     * @return The mitigation plan of the instance. Valid values:
     * 
     */
    public Optional<Output<String>> bandwidthMode() {
        return Optional.ofNullable(this.bandwidthMode);
    }

    /**
     * Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    @Import(name="baseBandwidth")
    private @Nullable Output<String> baseBandwidth;

    /**
     * @return Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    public Optional<Output<String>> baseBandwidth() {
        return Optional.ofNullable(this.baseBandwidth);
    }

    /**
     * Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Import(name="domainCount", required=true)
    private Output<String> domainCount;

    /**
     * @return Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    public Output<String> domainCount() {
        return this.domainCount;
    }

    /**
     * The mitigation plan of the instance. Default value: `coop`. Valid values:
     * 
     */
    @Import(name="editionSale")
    private @Nullable Output<String> editionSale;

    /**
     * @return The mitigation plan of the instance. Default value: `coop`. Valid values:
     * 
     */
    public Optional<Output<String>> editionSale() {
        return Optional.ofNullable(this.editionSale);
    }

    /**
     * The function plan of the instance. Valid values:
     * 
     */
    @Import(name="functionVersion")
    private @Nullable Output<String> functionVersion;

    /**
     * @return The function plan of the instance. Valid values:
     * 
     */
    public Optional<Output<String>> functionVersion() {
        return Optional.ofNullable(this.functionVersion);
    }

    /**
     * The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
     * 
     */
    @Import(name="modifyType")
    private @Nullable Output<String> modifyType;

    /**
     * @return The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
     * 
     */
    public Optional<Output<String>> modifyType() {
        return Optional.ofNullable(this.modifyType);
    }

    /**
     * Name of the instance. This name can have a string of `1` to `64` characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the instance. This name can have a string of `1` to `64` characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
     * 
     */
    @Import(name="normalBandwidth")
    private @Nullable Output<String> normalBandwidth;

    /**
     * @return The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
     * 
     */
    public Optional<Output<String>> normalBandwidth() {
        return Optional.ofNullable(this.normalBandwidth);
    }

    /**
     * The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
     * 
     */
    @Import(name="normalQps")
    private @Nullable Output<String> normalQps;

    /**
     * @return The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
     * 
     */
    public Optional<Output<String>> normalQps() {
        return Optional.ofNullable(this.normalQps);
    }

    /**
     * The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    @Import(name="portCount", required=true)
    private Output<String> portCount;

    /**
     * @return Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
     * 
     */
    public Output<String> portCount() {
        return this.portCount;
    }

    /**
     * The mitigation plan of the instance. Valid values:
     * 
     */
    @Import(name="productPlan")
    private @Nullable Output<String> productPlan;

    /**
     * @return The mitigation plan of the instance. Valid values:
     * 
     */
    public Optional<Output<String>> productPlan() {
        return Optional.ofNullable(this.productPlan);
    }

    /**
     * The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
     * 
     */
    @Import(name="productType")
    private @Nullable Output<String> productType;

    /**
     * @return The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
     * 
     */
    public Optional<Output<String>> productType() {
        return Optional.ofNullable(this.productType);
    }

    /**
     * Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    @Import(name="serviceBandwidth")
    private @Nullable Output<String> serviceBandwidth;

    /**
     * @return Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
     * 
     */
    public Optional<Output<String>> serviceBandwidth() {
        return Optional.ofNullable(this.serviceBandwidth);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DdosCooInstanceArgs() {}

    private DdosCooInstanceArgs(DdosCooInstanceArgs $) {
        this.addressType = $.addressType;
        this.bandwidth = $.bandwidth;
        this.bandwidthMode = $.bandwidthMode;
        this.baseBandwidth = $.baseBandwidth;
        this.domainCount = $.domainCount;
        this.editionSale = $.editionSale;
        this.functionVersion = $.functionVersion;
        this.modifyType = $.modifyType;
        this.name = $.name;
        this.normalBandwidth = $.normalBandwidth;
        this.normalQps = $.normalQps;
        this.period = $.period;
        this.portCount = $.portCount;
        this.productPlan = $.productPlan;
        this.productType = $.productType;
        this.serviceBandwidth = $.serviceBandwidth;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DdosCooInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DdosCooInstanceArgs $;

        public Builder() {
            $ = new DdosCooInstanceArgs();
        }

        public Builder(DdosCooInstanceArgs defaults) {
            $ = new DdosCooInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressType The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(@Nullable Output<String> addressType) {
            $.addressType = addressType;
            return this;
        }

        /**
         * @param addressType The IP version of the IP address. Default value: `Ipv4`. Valid values: `Ipv4`, `Ipv6`. **NOTE:** `address_type` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder addressType(String addressType) {
            return addressType(Output.of(addressType));
        }

        /**
         * @param bandwidth Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<String> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth Elastic defend bandwidth of the instance. This value must be larger than the base defend bandwidth. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(String bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param bandwidthMode The mitigation plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder bandwidthMode(@Nullable Output<String> bandwidthMode) {
            $.bandwidthMode = bandwidthMode;
            return this;
        }

        /**
         * @param bandwidthMode The mitigation plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder bandwidthMode(String bandwidthMode) {
            return bandwidthMode(Output.of(bandwidthMode));
        }

        /**
         * @param baseBandwidth Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder baseBandwidth(@Nullable Output<String> baseBandwidth) {
            $.baseBandwidth = baseBandwidth;
            return this;
        }

        /**
         * @param baseBandwidth Base defend bandwidth of the instance. Valid values: `30`, `60`, `100`, `300`, `400`, `500`, `600`. The unit is Gbps. Only support upgrade. **NOTE:** `base_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder baseBandwidth(String baseBandwidth) {
            return baseBandwidth(Output.of(baseBandwidth));
        }

        /**
         * @param domainCount Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder domainCount(Output<String> domainCount) {
            $.domainCount = domainCount;
            return this;
        }

        /**
         * @param domainCount Domain retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder domainCount(String domainCount) {
            return domainCount(Output.of(domainCount));
        }

        /**
         * @param editionSale The mitigation plan of the instance. Default value: `coop`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder editionSale(@Nullable Output<String> editionSale) {
            $.editionSale = editionSale;
            return this;
        }

        /**
         * @param editionSale The mitigation plan of the instance. Default value: `coop`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder editionSale(String editionSale) {
            return editionSale(Output.of(editionSale));
        }

        /**
         * @param functionVersion The function plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder functionVersion(@Nullable Output<String> functionVersion) {
            $.functionVersion = functionVersion;
            return this;
        }

        /**
         * @param functionVersion The function plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder functionVersion(String functionVersion) {
            return functionVersion(Output.of(functionVersion));
        }

        /**
         * @param modifyType The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
         * 
         * @return builder
         * 
         */
        public Builder modifyType(@Nullable Output<String> modifyType) {
            $.modifyType = modifyType;
            return this;
        }

        /**
         * @param modifyType The type of modification. Valid values: `UPGRADE`, `DOWNGRADE`.
         * 
         * @return builder
         * 
         */
        public Builder modifyType(String modifyType) {
            return modifyType(Output.of(modifyType));
        }

        /**
         * @param name Name of the instance. This name can have a string of `1` to `64` characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the instance. This name can have a string of `1` to `64` characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param normalBandwidth The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder normalBandwidth(@Nullable Output<String> normalBandwidth) {
            $.normalBandwidth = normalBandwidth;
            return this;
        }

        /**
         * @param normalBandwidth The clean bandwidth provided by the instance. **NOTE:** `normal_bandwidth` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_bandwidth` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder normalBandwidth(String normalBandwidth) {
            return normalBandwidth(Output.of(normalBandwidth));
        }

        /**
         * @param normalQps The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder normalQps(@Nullable Output<String> normalQps) {
            $.normalQps = normalQps;
            return this;
        }

        /**
         * @param normalQps The clean QPS provided by the instance. **NOTE:** `normal_qps` is valid only when `product_type` is set to `ddosDip`. From version 1.248.0, `normal_qps` can be modified.
         * 
         * @return builder
         * 
         */
        public Builder normalQps(String normalQps) {
            return normalQps(Output.of(normalQps));
        }

        /**
         * @param period The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The duration that you will buy DdosCoo instance (in month). Valid values: [1~9], `12`, `24`, `36`. Default value: `1`. At present, the provider does not support modify `period`.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param portCount Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder portCount(Output<String> portCount) {
            $.portCount = portCount;
            return this;
        }

        /**
         * @param portCount Port retransmission rule count of the instance. At least 50. Increase 5 per step, such as 55, 60, 65. Only support upgrade.
         * 
         * @return builder
         * 
         */
        public Builder portCount(String portCount) {
            return portCount(Output.of(portCount));
        }

        /**
         * @param productPlan The mitigation plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productPlan(@Nullable Output<String> productPlan) {
            $.productPlan = productPlan;
            return this;
        }

        /**
         * @param productPlan The mitigation plan of the instance. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productPlan(String productPlan) {
            return productPlan(Output.of(productPlan));
        }

        /**
         * @param productType The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productType(@Nullable Output<String> productType) {
            $.productType = productType;
            return this;
        }

        /**
         * @param productType The product type for purchasing DDOSCOO instances used to differ different account type. Default value: `ddoscoo`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder productType(String productType) {
            return productType(Output.of(productType));
        }

        /**
         * @param serviceBandwidth Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder serviceBandwidth(@Nullable Output<String> serviceBandwidth) {
            $.serviceBandwidth = serviceBandwidth;
            return this;
        }

        /**
         * @param serviceBandwidth Business bandwidth of the instance. At leaset 100. Increased 100 per step, such as 100, 200, 300. The unit is Mbps. Only support upgrade. **NOTE:** `service_bandwidth` is valid only when `product_type` is set to `ddoscoo` or `ddoscoo_intl`.
         * 
         * @return builder
         * 
         */
        public Builder serviceBandwidth(String serviceBandwidth) {
            return serviceBandwidth(Output.of(serviceBandwidth));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public DdosCooInstanceArgs build() {
            if ($.domainCount == null) {
                throw new MissingRequiredPropertyException("DdosCooInstanceArgs", "domainCount");
            }
            if ($.portCount == null) {
                throw new MissingRequiredPropertyException("DdosCooInstanceArgs", "portCount");
            }
            return $;
        }
    }

}
