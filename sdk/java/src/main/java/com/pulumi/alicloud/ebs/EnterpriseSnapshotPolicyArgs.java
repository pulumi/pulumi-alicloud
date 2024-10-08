// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ebs;

import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyCrossRegionCopyInfoArgs;
import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyRetainRuleArgs;
import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyScheduleArgs;
import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicySpecialRetainRulesArgs;
import com.pulumi.alicloud.ebs.inputs.EnterpriseSnapshotPolicyStorageRuleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnterpriseSnapshotPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnterpriseSnapshotPolicyArgs Empty = new EnterpriseSnapshotPolicyArgs();

    /**
     * Snapshot replication information. See `cross_region_copy_info` below.
     * 
     */
    @Import(name="crossRegionCopyInfo")
    private @Nullable Output<EnterpriseSnapshotPolicyCrossRegionCopyInfoArgs> crossRegionCopyInfo;

    /**
     * @return Snapshot replication information. See `cross_region_copy_info` below.
     * 
     */
    public Optional<Output<EnterpriseSnapshotPolicyCrossRegionCopyInfoArgs>> crossRegionCopyInfo() {
        return Optional.ofNullable(this.crossRegionCopyInfo);
    }

    /**
     * Description information representing the resource.
     * 
     */
    @Import(name="desc")
    private @Nullable Output<String> desc;

    /**
     * @return Description information representing the resource.
     * 
     */
    public Optional<Output<String>> desc() {
        return Optional.ofNullable(this.desc);
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="enterpriseSnapshotPolicyName", required=true)
    private Output<String> enterpriseSnapshotPolicyName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> enterpriseSnapshotPolicyName() {
        return this.enterpriseSnapshotPolicyName;
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
     * Snapshot retention policy representing resources. See `retain_rule` below.
     * 
     */
    @Import(name="retainRule", required=true)
    private Output<EnterpriseSnapshotPolicyRetainRuleArgs> retainRule;

    /**
     * @return Snapshot retention policy representing resources. See `retain_rule` below.
     * 
     */
    public Output<EnterpriseSnapshotPolicyRetainRuleArgs> retainRule() {
        return this.retainRule;
    }

    /**
     * The scheduling plan that represents the resource. See `schedule` below.
     * 
     */
    @Import(name="schedule", required=true)
    private Output<EnterpriseSnapshotPolicyScheduleArgs> schedule;

    /**
     * @return The scheduling plan that represents the resource. See `schedule` below.
     * 
     */
    public Output<EnterpriseSnapshotPolicyScheduleArgs> schedule() {
        return this.schedule;
    }

    /**
     * Snapshot special retention rules. See `special_retain_rules` below.
     * 
     */
    @Import(name="specialRetainRules")
    private @Nullable Output<EnterpriseSnapshotPolicySpecialRetainRulesArgs> specialRetainRules;

    /**
     * @return Snapshot special retention rules. See `special_retain_rules` below.
     * 
     */
    public Optional<Output<EnterpriseSnapshotPolicySpecialRetainRulesArgs>> specialRetainRules() {
        return Optional.ofNullable(this.specialRetainRules);
    }

    /**
     * The status of the resource.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Snapshot storage policy. See `storage_rule` below.
     * 
     */
    @Import(name="storageRule")
    private @Nullable Output<EnterpriseSnapshotPolicyStorageRuleArgs> storageRule;

    /**
     * @return Snapshot storage policy. See `storage_rule` below.
     * 
     */
    public Optional<Output<EnterpriseSnapshotPolicyStorageRuleArgs>> storageRule() {
        return Optional.ofNullable(this.storageRule);
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Represents the target type of resource binding.
     * 
     */
    @Import(name="targetType", required=true)
    private Output<String> targetType;

    /**
     * @return Represents the target type of resource binding.
     * 
     */
    public Output<String> targetType() {
        return this.targetType;
    }

    private EnterpriseSnapshotPolicyArgs() {}

    private EnterpriseSnapshotPolicyArgs(EnterpriseSnapshotPolicyArgs $) {
        this.crossRegionCopyInfo = $.crossRegionCopyInfo;
        this.desc = $.desc;
        this.enterpriseSnapshotPolicyName = $.enterpriseSnapshotPolicyName;
        this.resourceGroupId = $.resourceGroupId;
        this.retainRule = $.retainRule;
        this.schedule = $.schedule;
        this.specialRetainRules = $.specialRetainRules;
        this.status = $.status;
        this.storageRule = $.storageRule;
        this.tags = $.tags;
        this.targetType = $.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnterpriseSnapshotPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnterpriseSnapshotPolicyArgs $;

        public Builder() {
            $ = new EnterpriseSnapshotPolicyArgs();
        }

        public Builder(EnterpriseSnapshotPolicyArgs defaults) {
            $ = new EnterpriseSnapshotPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossRegionCopyInfo Snapshot replication information. See `cross_region_copy_info` below.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionCopyInfo(@Nullable Output<EnterpriseSnapshotPolicyCrossRegionCopyInfoArgs> crossRegionCopyInfo) {
            $.crossRegionCopyInfo = crossRegionCopyInfo;
            return this;
        }

        /**
         * @param crossRegionCopyInfo Snapshot replication information. See `cross_region_copy_info` below.
         * 
         * @return builder
         * 
         */
        public Builder crossRegionCopyInfo(EnterpriseSnapshotPolicyCrossRegionCopyInfoArgs crossRegionCopyInfo) {
            return crossRegionCopyInfo(Output.of(crossRegionCopyInfo));
        }

        /**
         * @param desc Description information representing the resource.
         * 
         * @return builder
         * 
         */
        public Builder desc(@Nullable Output<String> desc) {
            $.desc = desc;
            return this;
        }

        /**
         * @param desc Description information representing the resource.
         * 
         * @return builder
         * 
         */
        public Builder desc(String desc) {
            return desc(Output.of(desc));
        }

        /**
         * @param enterpriseSnapshotPolicyName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSnapshotPolicyName(Output<String> enterpriseSnapshotPolicyName) {
            $.enterpriseSnapshotPolicyName = enterpriseSnapshotPolicyName;
            return this;
        }

        /**
         * @param enterpriseSnapshotPolicyName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder enterpriseSnapshotPolicyName(String enterpriseSnapshotPolicyName) {
            return enterpriseSnapshotPolicyName(Output.of(enterpriseSnapshotPolicyName));
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
         * @param retainRule Snapshot retention policy representing resources. See `retain_rule` below.
         * 
         * @return builder
         * 
         */
        public Builder retainRule(Output<EnterpriseSnapshotPolicyRetainRuleArgs> retainRule) {
            $.retainRule = retainRule;
            return this;
        }

        /**
         * @param retainRule Snapshot retention policy representing resources. See `retain_rule` below.
         * 
         * @return builder
         * 
         */
        public Builder retainRule(EnterpriseSnapshotPolicyRetainRuleArgs retainRule) {
            return retainRule(Output.of(retainRule));
        }

        /**
         * @param schedule The scheduling plan that represents the resource. See `schedule` below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(Output<EnterpriseSnapshotPolicyScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule The scheduling plan that represents the resource. See `schedule` below.
         * 
         * @return builder
         * 
         */
        public Builder schedule(EnterpriseSnapshotPolicyScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        /**
         * @param specialRetainRules Snapshot special retention rules. See `special_retain_rules` below.
         * 
         * @return builder
         * 
         */
        public Builder specialRetainRules(@Nullable Output<EnterpriseSnapshotPolicySpecialRetainRulesArgs> specialRetainRules) {
            $.specialRetainRules = specialRetainRules;
            return this;
        }

        /**
         * @param specialRetainRules Snapshot special retention rules. See `special_retain_rules` below.
         * 
         * @return builder
         * 
         */
        public Builder specialRetainRules(EnterpriseSnapshotPolicySpecialRetainRulesArgs specialRetainRules) {
            return specialRetainRules(Output.of(specialRetainRules));
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param storageRule Snapshot storage policy. See `storage_rule` below.
         * 
         * @return builder
         * 
         */
        public Builder storageRule(@Nullable Output<EnterpriseSnapshotPolicyStorageRuleArgs> storageRule) {
            $.storageRule = storageRule;
            return this;
        }

        /**
         * @param storageRule Snapshot storage policy. See `storage_rule` below.
         * 
         * @return builder
         * 
         */
        public Builder storageRule(EnterpriseSnapshotPolicyStorageRuleArgs storageRule) {
            return storageRule(Output.of(storageRule));
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetType Represents the target type of resource binding.
         * 
         * @return builder
         * 
         */
        public Builder targetType(Output<String> targetType) {
            $.targetType = targetType;
            return this;
        }

        /**
         * @param targetType Represents the target type of resource binding.
         * 
         * @return builder
         * 
         */
        public Builder targetType(String targetType) {
            return targetType(Output.of(targetType));
        }

        public EnterpriseSnapshotPolicyArgs build() {
            if ($.enterpriseSnapshotPolicyName == null) {
                throw new MissingRequiredPropertyException("EnterpriseSnapshotPolicyArgs", "enterpriseSnapshotPolicyName");
            }
            if ($.retainRule == null) {
                throw new MissingRequiredPropertyException("EnterpriseSnapshotPolicyArgs", "retainRule");
            }
            if ($.schedule == null) {
                throw new MissingRequiredPropertyException("EnterpriseSnapshotPolicyArgs", "schedule");
            }
            if ($.targetType == null) {
                throw new MissingRequiredPropertyException("EnterpriseSnapshotPolicyArgs", "targetType");
            }
            return $;
        }
    }

}
