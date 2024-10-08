// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudstoragegateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayArgs Empty = new GatewayArgs();

    /**
     * The description of the gateway.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the gateway.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The specification of the gateway. Valid values: `Basic`, `Standard`,`Enhanced`,`Advanced`.
     * 
     */
    @Import(name="gatewayClass")
    private @Nullable Output<String> gatewayClass;

    /**
     * @return The specification of the gateway. Valid values: `Basic`, `Standard`,`Enhanced`,`Advanced`.
     * 
     */
    public Optional<Output<String>> gatewayClass() {
        return Optional.ofNullable(this.gatewayClass);
    }

    /**
     * The name of the gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
    private Output<String> gatewayName;

    /**
     * @return The name of the gateway.
     * 
     */
    public Output<String> gatewayName() {
        return this.gatewayName;
    }

    /**
     * The location of the gateway. Valid values: `Cloud`, `On_Premise`.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The location of the gateway. Valid values: `Cloud`, `On_Premise`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The Payment type of gateway. Valid values: `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The Payment type of gateway. Valid values: `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The public network bandwidth of gateway. Default value: `5`. Valid values: `5` to `200`.
     * 
     */
    @Import(name="publicNetworkBandwidth")
    private @Nullable Output<Integer> publicNetworkBandwidth;

    /**
     * @return The public network bandwidth of gateway. Default value: `5`. Valid values: `5` to `200`.
     * 
     */
    public Optional<Output<Integer>> publicNetworkBandwidth() {
        return Optional.ofNullable(this.publicNetworkBandwidth);
    }

    /**
     * The reason detail of gateway.
     * 
     */
    @Import(name="reasonDetail")
    private @Nullable Output<String> reasonDetail;

    /**
     * @return The reason detail of gateway.
     * 
     */
    public Optional<Output<String>> reasonDetail() {
        return Optional.ofNullable(this.reasonDetail);
    }

    /**
     * The reason type when user deletes the gateway.
     * 
     */
    @Import(name="reasonType")
    private @Nullable Output<String> reasonType;

    /**
     * @return The reason type when user deletes the gateway.
     * 
     */
    public Optional<Output<String>> reasonType() {
        return Optional.ofNullable(this.reasonType);
    }

    /**
     * Whether to release the gateway due to expiration.
     * 
     */
    @Import(name="releaseAfterExpiration")
    private @Nullable Output<Boolean> releaseAfterExpiration;

    /**
     * @return Whether to release the gateway due to expiration.
     * 
     */
    public Optional<Output<Boolean>> releaseAfterExpiration() {
        return Optional.ofNullable(this.releaseAfterExpiration);
    }

    /**
     * The ID of the gateway cluster.
     * 
     */
    @Import(name="storageBundleId", required=true)
    private Output<String> storageBundleId;

    /**
     * @return The ID of the gateway cluster.
     * 
     */
    public Output<String> storageBundleId() {
        return this.storageBundleId;
    }

    /**
     * The type of the gateway. Valid values: `File`, `Iscsi`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the gateway. Valid values: `File`, `Iscsi`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The ID of the vSwitch.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return The ID of the vSwitch.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GatewayArgs() {}

    private GatewayArgs(GatewayArgs $) {
        this.description = $.description;
        this.gatewayClass = $.gatewayClass;
        this.gatewayName = $.gatewayName;
        this.location = $.location;
        this.paymentType = $.paymentType;
        this.publicNetworkBandwidth = $.publicNetworkBandwidth;
        this.reasonDetail = $.reasonDetail;
        this.reasonType = $.reasonType;
        this.releaseAfterExpiration = $.releaseAfterExpiration;
        this.storageBundleId = $.storageBundleId;
        this.type = $.type;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayArgs $;

        public Builder() {
            $ = new GatewayArgs();
        }

        public Builder(GatewayArgs defaults) {
            $ = new GatewayArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param gatewayClass The specification of the gateway. Valid values: `Basic`, `Standard`,`Enhanced`,`Advanced`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayClass(@Nullable Output<String> gatewayClass) {
            $.gatewayClass = gatewayClass;
            return this;
        }

        /**
         * @param gatewayClass The specification of the gateway. Valid values: `Basic`, `Standard`,`Enhanced`,`Advanced`.
         * 
         * @return builder
         * 
         */
        public Builder gatewayClass(String gatewayClass) {
            return gatewayClass(Output.of(gatewayClass));
        }

        /**
         * @param gatewayName The name of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(Output<String> gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param gatewayName The name of the gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            return gatewayName(Output.of(gatewayName));
        }

        /**
         * @param location The location of the gateway. Valid values: `Cloud`, `On_Premise`.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the gateway. Valid values: `Cloud`, `On_Premise`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param paymentType The Payment type of gateway. Valid values: `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The Payment type of gateway. Valid values: `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param publicNetworkBandwidth The public network bandwidth of gateway. Default value: `5`. Valid values: `5` to `200`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkBandwidth(@Nullable Output<Integer> publicNetworkBandwidth) {
            $.publicNetworkBandwidth = publicNetworkBandwidth;
            return this;
        }

        /**
         * @param publicNetworkBandwidth The public network bandwidth of gateway. Default value: `5`. Valid values: `5` to `200`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkBandwidth(Integer publicNetworkBandwidth) {
            return publicNetworkBandwidth(Output.of(publicNetworkBandwidth));
        }

        /**
         * @param reasonDetail The reason detail of gateway.
         * 
         * @return builder
         * 
         */
        public Builder reasonDetail(@Nullable Output<String> reasonDetail) {
            $.reasonDetail = reasonDetail;
            return this;
        }

        /**
         * @param reasonDetail The reason detail of gateway.
         * 
         * @return builder
         * 
         */
        public Builder reasonDetail(String reasonDetail) {
            return reasonDetail(Output.of(reasonDetail));
        }

        /**
         * @param reasonType The reason type when user deletes the gateway.
         * 
         * @return builder
         * 
         */
        public Builder reasonType(@Nullable Output<String> reasonType) {
            $.reasonType = reasonType;
            return this;
        }

        /**
         * @param reasonType The reason type when user deletes the gateway.
         * 
         * @return builder
         * 
         */
        public Builder reasonType(String reasonType) {
            return reasonType(Output.of(reasonType));
        }

        /**
         * @param releaseAfterExpiration Whether to release the gateway due to expiration.
         * 
         * @return builder
         * 
         */
        public Builder releaseAfterExpiration(@Nullable Output<Boolean> releaseAfterExpiration) {
            $.releaseAfterExpiration = releaseAfterExpiration;
            return this;
        }

        /**
         * @param releaseAfterExpiration Whether to release the gateway due to expiration.
         * 
         * @return builder
         * 
         */
        public Builder releaseAfterExpiration(Boolean releaseAfterExpiration) {
            return releaseAfterExpiration(Output.of(releaseAfterExpiration));
        }

        /**
         * @param storageBundleId The ID of the gateway cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageBundleId(Output<String> storageBundleId) {
            $.storageBundleId = storageBundleId;
            return this;
        }

        /**
         * @param storageBundleId The ID of the gateway cluster.
         * 
         * @return builder
         * 
         */
        public Builder storageBundleId(String storageBundleId) {
            return storageBundleId(Output.of(storageBundleId));
        }

        /**
         * @param type The type of the gateway. Valid values: `File`, `Iscsi`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the gateway. Valid values: `File`, `Iscsi`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param vswitchId The ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId The ID of the vSwitch.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public GatewayArgs build() {
            if ($.gatewayName == null) {
                throw new MissingRequiredPropertyException("GatewayArgs", "gatewayName");
            }
            if ($.location == null) {
                throw new MissingRequiredPropertyException("GatewayArgs", "location");
            }
            if ($.storageBundleId == null) {
                throw new MissingRequiredPropertyException("GatewayArgs", "storageBundleId");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("GatewayArgs", "type");
            }
            return $;
        }
    }

}
