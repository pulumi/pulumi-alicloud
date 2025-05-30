// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.esa;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CacheReserveInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final CacheReserveInstanceArgs Empty = new CacheReserveInstanceArgs();

    /**
     * Automatic payment.
     * 
     */
    @Import(name="autoPay")
    private @Nullable Output<Boolean> autoPay;

    /**
     * @return Automatic payment.
     * 
     */
    public Optional<Output<Boolean>> autoPay() {
        return Optional.ofNullable(this.autoPay);
    }

    /**
     * Whether to auto-renew:
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return Whether to auto-renew:
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * Cache holding area
     * - `HK`: Hong Kong, China
     * - `CN`: Mainland China
     * 
     */
    @Import(name="crRegion")
    private @Nullable Output<String> crRegion;

    /**
     * @return Cache holding area
     * - `HK`: Hong Kong, China
     * - `CN`: Mainland China
     * 
     */
    public Optional<Output<String>> crRegion() {
        return Optional.ofNullable(this.crRegion);
    }

    /**
     * Specifies whether to enable auto payment.
     * 
     */
    @Import(name="paymentType", required=true)
    private Output<String> paymentType;

    /**
     * @return Specifies whether to enable auto payment.
     * 
     */
    public Output<String> paymentType() {
        return this.paymentType;
    }

    /**
     * Purchase period (unit: month).
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return Purchase period (unit: month).
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * Cache retention specification (unit: GB).
     * 
     */
    @Import(name="quotaGb")
    private @Nullable Output<Integer> quotaGb;

    /**
     * @return Cache retention specification (unit: GB).
     * 
     */
    public Optional<Output<Integer>> quotaGb() {
        return Optional.ofNullable(this.quotaGb);
    }

    private CacheReserveInstanceArgs() {}

    private CacheReserveInstanceArgs(CacheReserveInstanceArgs $) {
        this.autoPay = $.autoPay;
        this.autoRenew = $.autoRenew;
        this.crRegion = $.crRegion;
        this.paymentType = $.paymentType;
        this.period = $.period;
        this.quotaGb = $.quotaGb;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CacheReserveInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CacheReserveInstanceArgs $;

        public Builder() {
            $ = new CacheReserveInstanceArgs();
        }

        public Builder(CacheReserveInstanceArgs defaults) {
            $ = new CacheReserveInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoPay Automatic payment.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(@Nullable Output<Boolean> autoPay) {
            $.autoPay = autoPay;
            return this;
        }

        /**
         * @param autoPay Automatic payment.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            return autoPay(Output.of(autoPay));
        }

        /**
         * @param autoRenew Whether to auto-renew:
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew Whether to auto-renew:
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param crRegion Cache holding area
         * - `HK`: Hong Kong, China
         * - `CN`: Mainland China
         * 
         * @return builder
         * 
         */
        public Builder crRegion(@Nullable Output<String> crRegion) {
            $.crRegion = crRegion;
            return this;
        }

        /**
         * @param crRegion Cache holding area
         * - `HK`: Hong Kong, China
         * - `CN`: Mainland China
         * 
         * @return builder
         * 
         */
        public Builder crRegion(String crRegion) {
            return crRegion(Output.of(crRegion));
        }

        /**
         * @param paymentType Specifies whether to enable auto payment.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType Specifies whether to enable auto payment.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param period Purchase period (unit: month).
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period Purchase period (unit: month).
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param quotaGb Cache retention specification (unit: GB).
         * 
         * @return builder
         * 
         */
        public Builder quotaGb(@Nullable Output<Integer> quotaGb) {
            $.quotaGb = quotaGb;
            return this;
        }

        /**
         * @param quotaGb Cache retention specification (unit: GB).
         * 
         * @return builder
         * 
         */
        public Builder quotaGb(Integer quotaGb) {
            return quotaGb(Output.of(quotaGb));
        }

        public CacheReserveInstanceArgs build() {
            if ($.paymentType == null) {
                throw new MissingRequiredPropertyException("CacheReserveInstanceArgs", "paymentType");
            }
            return $;
        }
    }

}
