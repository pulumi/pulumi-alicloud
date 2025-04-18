// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class LoadBalancerLoadBalancerBillingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoadBalancerLoadBalancerBillingConfigArgs Empty = new LoadBalancerLoadBalancerBillingConfigArgs();

    /**
     * Pay Type
     * 
     */
    @Import(name="payType", required=true)
    private Output<String> payType;

    /**
     * @return Pay Type
     * 
     */
    public Output<String> payType() {
        return this.payType;
    }

    private LoadBalancerLoadBalancerBillingConfigArgs() {}

    private LoadBalancerLoadBalancerBillingConfigArgs(LoadBalancerLoadBalancerBillingConfigArgs $) {
        this.payType = $.payType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoadBalancerLoadBalancerBillingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoadBalancerLoadBalancerBillingConfigArgs $;

        public Builder() {
            $ = new LoadBalancerLoadBalancerBillingConfigArgs();
        }

        public Builder(LoadBalancerLoadBalancerBillingConfigArgs defaults) {
            $ = new LoadBalancerLoadBalancerBillingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param payType Pay Type
         * 
         * @return builder
         * 
         */
        public Builder payType(Output<String> payType) {
            $.payType = payType;
            return this;
        }

        /**
         * @param payType Pay Type
         * 
         * @return builder
         * 
         */
        public Builder payType(String payType) {
            return payType(Output.of(payType));
        }

        public LoadBalancerLoadBalancerBillingConfigArgs build() {
            if ($.payType == null) {
                throw new MissingRequiredPropertyException("LoadBalancerLoadBalancerBillingConfigArgs", "payType");
            }
            return $;
        }
    }

}
