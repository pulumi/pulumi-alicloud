// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DesktopArgs extends com.pulumi.resources.ResourceArgs {

    public static final DesktopArgs Empty = new DesktopArgs();

    /**
     * The amount of the Desktop.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<Integer> amount;

    /**
     * @return The amount of the Desktop.
     * 
     */
    public Optional<Output<Integer>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
     * 
     */
    @Import(name="autoPay")
    private @Nullable Output<Boolean> autoPay;

    /**
     * @return The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> autoPay() {
        return Optional.ofNullable(this.autoPay);
    }

    /**
     * The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
     * 
     */
    @Import(name="autoRenew")
    private @Nullable Output<Boolean> autoRenew;

    /**
     * @return The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
     * 
     */
    public Optional<Output<Boolean>> autoRenew() {
        return Optional.ofNullable(this.autoRenew);
    }

    /**
     * The bundle id of the Desktop.
     * 
     */
    @Import(name="bundleId", required=true)
    private Output<String> bundleId;

    /**
     * @return The bundle id of the Desktop.
     * 
     */
    public Output<String> bundleId() {
        return this.bundleId;
    }

    /**
     * The desktop name of the Desktop.
     * 
     */
    @Import(name="desktopName")
    private @Nullable Output<String> desktopName;

    /**
     * @return The desktop name of the Desktop.
     * 
     */
    public Optional<Output<String>> desktopName() {
        return Optional.ofNullable(this.desktopName);
    }

    /**
     * The desktop type of the Desktop.
     * 
     */
    @Import(name="desktopType")
    private @Nullable Output<String> desktopType;

    /**
     * @return The desktop type of the Desktop.
     * 
     */
    public Optional<Output<String>> desktopType() {
        return Optional.ofNullable(this.desktopType);
    }

    /**
     * The desktop end user id of the Desktop.
     * 
     */
    @Import(name="endUserIds")
    private @Nullable Output<List<String>> endUserIds;

    /**
     * @return The desktop end user id of the Desktop.
     * 
     */
    public Optional<Output<List<String>>> endUserIds() {
        return Optional.ofNullable(this.endUserIds);
    }

    /**
     * The hostname of the Desktop.
     * 
     */
    @Import(name="hostName")
    private @Nullable Output<String> hostName;

    /**
     * @return The hostname of the Desktop.
     * 
     */
    public Optional<Output<String>> hostName() {
        return Optional.ofNullable(this.hostName);
    }

    /**
     * The ID of the Simple Office Site.
     * 
     */
    @Import(name="officeSiteId", required=true)
    private Output<String> officeSiteId;

    /**
     * @return The ID of the Simple Office Site.
     * 
     */
    public Output<String> officeSiteId() {
        return this.officeSiteId;
    }

    /**
     * The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     * 
     */
    @Import(name="paymentType")
    private @Nullable Output<String> paymentType;

    /**
     * @return The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
     * 
     */
    public Optional<Output<String>> paymentType() {
        return Optional.ofNullable(this.paymentType);
    }

    /**
     * The period of the Desktop.
     * 
     */
    @Import(name="period")
    private @Nullable Output<Integer> period;

    /**
     * @return The period of the Desktop.
     * 
     */
    public Optional<Output<Integer>> period() {
        return Optional.ofNullable(this.period);
    }

    /**
     * The period unit of the Desktop.
     * 
     */
    @Import(name="periodUnit")
    private @Nullable Output<String> periodUnit;

    /**
     * @return The period unit of the Desktop.
     * 
     */
    public Optional<Output<String>> periodUnit() {
        return Optional.ofNullable(this.periodUnit);
    }

    /**
     * The policy group id of the Desktop.
     * 
     */
    @Import(name="policyGroupId", required=true)
    private Output<String> policyGroupId;

    /**
     * @return The policy group id of the Desktop.
     * 
     */
    public Output<String> policyGroupId() {
        return this.policyGroupId;
    }

    /**
     * The root disk size gib of the Desktop.
     * 
     */
    @Import(name="rootDiskSizeGib")
    private @Nullable Output<Integer> rootDiskSizeGib;

    /**
     * @return The root disk size gib of the Desktop.
     * 
     */
    public Optional<Output<Integer>> rootDiskSizeGib() {
        return Optional.ofNullable(this.rootDiskSizeGib);
    }

    /**
     * The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The stopped mode of the Desktop.
     * 
     */
    @Import(name="stoppedMode")
    private @Nullable Output<String> stoppedMode;

    /**
     * @return The stopped mode of the Desktop.
     * 
     */
    public Optional<Output<String>> stoppedMode() {
        return Optional.ofNullable(this.stoppedMode);
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
     * The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
     * 
     */
    @Import(name="userAssignMode")
    private @Nullable Output<String> userAssignMode;

    /**
     * @return The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
     * 
     */
    public Optional<Output<String>> userAssignMode() {
        return Optional.ofNullable(this.userAssignMode);
    }

    /**
     * The user disk size gib of the Desktop.
     * 
     */
    @Import(name="userDiskSizeGib")
    private @Nullable Output<Integer> userDiskSizeGib;

    /**
     * @return The user disk size gib of the Desktop.
     * 
     */
    public Optional<Output<Integer>> userDiskSizeGib() {
        return Optional.ofNullable(this.userDiskSizeGib);
    }

    private DesktopArgs() {}

    private DesktopArgs(DesktopArgs $) {
        this.amount = $.amount;
        this.autoPay = $.autoPay;
        this.autoRenew = $.autoRenew;
        this.bundleId = $.bundleId;
        this.desktopName = $.desktopName;
        this.desktopType = $.desktopType;
        this.endUserIds = $.endUserIds;
        this.hostName = $.hostName;
        this.officeSiteId = $.officeSiteId;
        this.paymentType = $.paymentType;
        this.period = $.period;
        this.periodUnit = $.periodUnit;
        this.policyGroupId = $.policyGroupId;
        this.rootDiskSizeGib = $.rootDiskSizeGib;
        this.status = $.status;
        this.stoppedMode = $.stoppedMode;
        this.tags = $.tags;
        this.userAssignMode = $.userAssignMode;
        this.userDiskSizeGib = $.userDiskSizeGib;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DesktopArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DesktopArgs $;

        public Builder() {
            $ = new DesktopArgs();
        }

        public Builder(DesktopArgs defaults) {
            $ = new DesktopArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amount The amount of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder amount(@Nullable Output<Integer> amount) {
            $.amount = amount;
            return this;
        }

        /**
         * @param amount The amount of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder amount(Integer amount) {
            return amount(Output.of(amount));
        }

        /**
         * @param autoPay The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(@Nullable Output<Boolean> autoPay) {
            $.autoPay = autoPay;
            return this;
        }

        /**
         * @param autoPay The auto-pay of the Desktop whether to pay automatically. values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoPay(Boolean autoPay) {
            return autoPay(Output.of(autoPay));
        }

        /**
         * @param autoRenew The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(@Nullable Output<Boolean> autoRenew) {
            $.autoRenew = autoRenew;
            return this;
        }

        /**
         * @param autoRenew The auto-renewal of the Desktop whether to renew automatically. It takes effect only when the parameter ChargeType is set to PrePaid. values: `true`, `false`.
         * 
         * @return builder
         * 
         */
        public Builder autoRenew(Boolean autoRenew) {
            return autoRenew(Output.of(autoRenew));
        }

        /**
         * @param bundleId The bundle id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder bundleId(Output<String> bundleId) {
            $.bundleId = bundleId;
            return this;
        }

        /**
         * @param bundleId The bundle id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder bundleId(String bundleId) {
            return bundleId(Output.of(bundleId));
        }

        /**
         * @param desktopName The desktop name of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopName(@Nullable Output<String> desktopName) {
            $.desktopName = desktopName;
            return this;
        }

        /**
         * @param desktopName The desktop name of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopName(String desktopName) {
            return desktopName(Output.of(desktopName));
        }

        /**
         * @param desktopType The desktop type of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopType(@Nullable Output<String> desktopType) {
            $.desktopType = desktopType;
            return this;
        }

        /**
         * @param desktopType The desktop type of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder desktopType(String desktopType) {
            return desktopType(Output.of(desktopType));
        }

        /**
         * @param endUserIds The desktop end user id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder endUserIds(@Nullable Output<List<String>> endUserIds) {
            $.endUserIds = endUserIds;
            return this;
        }

        /**
         * @param endUserIds The desktop end user id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder endUserIds(List<String> endUserIds) {
            return endUserIds(Output.of(endUserIds));
        }

        /**
         * @param endUserIds The desktop end user id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder endUserIds(String... endUserIds) {
            return endUserIds(List.of(endUserIds));
        }

        /**
         * @param hostName The hostname of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder hostName(@Nullable Output<String> hostName) {
            $.hostName = hostName;
            return this;
        }

        /**
         * @param hostName The hostname of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder hostName(String hostName) {
            return hostName(Output.of(hostName));
        }

        /**
         * @param officeSiteId The ID of the Simple Office Site.
         * 
         * @return builder
         * 
         */
        public Builder officeSiteId(Output<String> officeSiteId) {
            $.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * @param officeSiteId The ID of the Simple Office Site.
         * 
         * @return builder
         * 
         */
        public Builder officeSiteId(String officeSiteId) {
            return officeSiteId(Output.of(officeSiteId));
        }

        /**
         * @param paymentType The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(@Nullable Output<String> paymentType) {
            $.paymentType = paymentType;
            return this;
        }

        /**
         * @param paymentType The payment type of the Desktop. Valid values: `PayAsYouGo`, `Subscription`. Default to `PayAsYouGo`.
         * 
         * @return builder
         * 
         */
        public Builder paymentType(String paymentType) {
            return paymentType(Output.of(paymentType));
        }

        /**
         * @param period The period of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder period(@Nullable Output<Integer> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The period of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder period(Integer period) {
            return period(Output.of(period));
        }

        /**
         * @param periodUnit The period unit of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(@Nullable Output<String> periodUnit) {
            $.periodUnit = periodUnit;
            return this;
        }

        /**
         * @param periodUnit The period unit of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder periodUnit(String periodUnit) {
            return periodUnit(Output.of(periodUnit));
        }

        /**
         * @param policyGroupId The policy group id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupId(Output<String> policyGroupId) {
            $.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * @param policyGroupId The policy group id of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder policyGroupId(String policyGroupId) {
            return policyGroupId(Output.of(policyGroupId));
        }

        /**
         * @param rootDiskSizeGib The root disk size gib of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskSizeGib(@Nullable Output<Integer> rootDiskSizeGib) {
            $.rootDiskSizeGib = rootDiskSizeGib;
            return this;
        }

        /**
         * @param rootDiskSizeGib The root disk size gib of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder rootDiskSizeGib(Integer rootDiskSizeGib) {
            return rootDiskSizeGib(Output.of(rootDiskSizeGib));
        }

        /**
         * @param status The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param stoppedMode The stopped mode of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder stoppedMode(@Nullable Output<String> stoppedMode) {
            $.stoppedMode = stoppedMode;
            return this;
        }

        /**
         * @param stoppedMode The stopped mode of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder stoppedMode(String stoppedMode) {
            return stoppedMode(Output.of(stoppedMode));
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
         * @param userAssignMode The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
         * 
         * @return builder
         * 
         */
        public Builder userAssignMode(@Nullable Output<String> userAssignMode) {
            $.userAssignMode = userAssignMode;
            return this;
        }

        /**
         * @param userAssignMode The user assign mode of the Desktop. Valid values: `ALL`, `PER_USER`. Default to `ALL`.
         * 
         * @return builder
         * 
         */
        public Builder userAssignMode(String userAssignMode) {
            return userAssignMode(Output.of(userAssignMode));
        }

        /**
         * @param userDiskSizeGib The user disk size gib of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder userDiskSizeGib(@Nullable Output<Integer> userDiskSizeGib) {
            $.userDiskSizeGib = userDiskSizeGib;
            return this;
        }

        /**
         * @param userDiskSizeGib The user disk size gib of the Desktop.
         * 
         * @return builder
         * 
         */
        public Builder userDiskSizeGib(Integer userDiskSizeGib) {
            return userDiskSizeGib(Output.of(userDiskSizeGib));
        }

        public DesktopArgs build() {
            if ($.bundleId == null) {
                throw new MissingRequiredPropertyException("DesktopArgs", "bundleId");
            }
            if ($.officeSiteId == null) {
                throw new MissingRequiredPropertyException("DesktopArgs", "officeSiteId");
            }
            if ($.policyGroupId == null) {
                throw new MissingRequiredPropertyException("DesktopArgs", "policyGroupId");
            }
            return $;
        }
    }

}