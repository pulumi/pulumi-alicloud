// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class GatewayZoneConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayZoneConfigArgs Empty = new GatewayZoneConfigArgs();

    /**
     * Availability Zone Options
     * 
     */
    @Import(name="selectOption", required=true)
    private Output<String> selectOption;

    /**
     * @return Availability Zone Options
     * 
     */
    public Output<String> selectOption() {
        return this.selectOption;
    }

    private GatewayZoneConfigArgs() {}

    private GatewayZoneConfigArgs(GatewayZoneConfigArgs $) {
        this.selectOption = $.selectOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayZoneConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayZoneConfigArgs $;

        public Builder() {
            $ = new GatewayZoneConfigArgs();
        }

        public Builder(GatewayZoneConfigArgs defaults) {
            $ = new GatewayZoneConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param selectOption Availability Zone Options
         * 
         * @return builder
         * 
         */
        public Builder selectOption(Output<String> selectOption) {
            $.selectOption = selectOption;
            return this;
        }

        /**
         * @param selectOption Availability Zone Options
         * 
         * @return builder
         * 
         */
        public Builder selectOption(String selectOption) {
            return selectOption(Output.of(selectOption));
        }

        public GatewayZoneConfigArgs build() {
            if ($.selectOption == null) {
                throw new MissingRequiredPropertyException("GatewayZoneConfigArgs", "selectOption");
            }
            return $;
        }
    }

}