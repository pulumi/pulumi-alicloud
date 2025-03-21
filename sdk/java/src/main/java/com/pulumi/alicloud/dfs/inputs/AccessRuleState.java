// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessRuleState extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleState Empty = new AccessRuleState();

    /**
     * Permission group resource ID. You must specify the permission group ID when creating a permission rule.
     * 
     */
    @Import(name="accessGroupId")
    private @Nullable Output<String> accessGroupId;

    /**
     * @return Permission group resource ID. You must specify the permission group ID when creating a permission rule.
     * 
     */
    public Optional<Output<String>> accessGroupId() {
        return Optional.ofNullable(this.accessGroupId);
    }

    /**
     * The unique identity of the permission rule, which is used to retrieve the permission rule for a specific day in the permission group.
     * 
     */
    @Import(name="accessRuleId")
    private @Nullable Output<String> accessRuleId;

    /**
     * @return The unique identity of the permission rule, which is used to retrieve the permission rule for a specific day in the permission group.
     * 
     */
    public Optional<Output<String>> accessRuleId() {
        return Optional.ofNullable(this.accessRuleId);
    }

    /**
     * Permission rule resource creation time.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Permission rule resource creation time.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * Permission rule description.  No more than 32 characters in length.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Permission rule description.  No more than 32 characters in length.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IP address or network segment of the authorized object.
     * 
     */
    @Import(name="networkSegment")
    private @Nullable Output<String> networkSegment;

    /**
     * @return The IP address or network segment of the authorized object.
     * 
     */
    public Optional<Output<String>> networkSegment() {
        return Optional.ofNullable(this.networkSegment);
    }

    /**
     * Permission rule priority. When the same authorization object matches multiple rules, the high-priority rule takes effect. Value range: 1~100,1 is the highest priority.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Permission rule priority. When the same authorization object matches multiple rules, the high-priority rule takes effect. Value range: 1~100,1 is the highest priority.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * The read and write permissions of the authorized object on the file system. Value: RDWR: readable and writable RDONLY: Read only.
     * 
     */
    @Import(name="rwAccessType")
    private @Nullable Output<String> rwAccessType;

    /**
     * @return The read and write permissions of the authorized object on the file system. Value: RDWR: readable and writable RDONLY: Read only.
     * 
     */
    public Optional<Output<String>> rwAccessType() {
        return Optional.ofNullable(this.rwAccessType);
    }

    private AccessRuleState() {}

    private AccessRuleState(AccessRuleState $) {
        this.accessGroupId = $.accessGroupId;
        this.accessRuleId = $.accessRuleId;
        this.createTime = $.createTime;
        this.description = $.description;
        this.networkSegment = $.networkSegment;
        this.priority = $.priority;
        this.rwAccessType = $.rwAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleState $;

        public Builder() {
            $ = new AccessRuleState();
        }

        public Builder(AccessRuleState defaults) {
            $ = new AccessRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupId Permission group resource ID. You must specify the permission group ID when creating a permission rule.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupId(@Nullable Output<String> accessGroupId) {
            $.accessGroupId = accessGroupId;
            return this;
        }

        /**
         * @param accessGroupId Permission group resource ID. You must specify the permission group ID when creating a permission rule.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupId(String accessGroupId) {
            return accessGroupId(Output.of(accessGroupId));
        }

        /**
         * @param accessRuleId The unique identity of the permission rule, which is used to retrieve the permission rule for a specific day in the permission group.
         * 
         * @return builder
         * 
         */
        public Builder accessRuleId(@Nullable Output<String> accessRuleId) {
            $.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * @param accessRuleId The unique identity of the permission rule, which is used to retrieve the permission rule for a specific day in the permission group.
         * 
         * @return builder
         * 
         */
        public Builder accessRuleId(String accessRuleId) {
            return accessRuleId(Output.of(accessRuleId));
        }

        /**
         * @param createTime Permission rule resource creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Permission rule resource creation time.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description Permission rule description.  No more than 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Permission rule description.  No more than 32 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param networkSegment The IP address or network segment of the authorized object.
         * 
         * @return builder
         * 
         */
        public Builder networkSegment(@Nullable Output<String> networkSegment) {
            $.networkSegment = networkSegment;
            return this;
        }

        /**
         * @param networkSegment The IP address or network segment of the authorized object.
         * 
         * @return builder
         * 
         */
        public Builder networkSegment(String networkSegment) {
            return networkSegment(Output.of(networkSegment));
        }

        /**
         * @param priority Permission rule priority. When the same authorization object matches multiple rules, the high-priority rule takes effect. Value range: 1~100,1 is the highest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Permission rule priority. When the same authorization object matches multiple rules, the high-priority rule takes effect. Value range: 1~100,1 is the highest priority.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rwAccessType The read and write permissions of the authorized object on the file system. Value: RDWR: readable and writable RDONLY: Read only.
         * 
         * @return builder
         * 
         */
        public Builder rwAccessType(@Nullable Output<String> rwAccessType) {
            $.rwAccessType = rwAccessType;
            return this;
        }

        /**
         * @param rwAccessType The read and write permissions of the authorized object on the file system. Value: RDWR: readable and writable RDONLY: Read only.
         * 
         * @return builder
         * 
         */
        public Builder rwAccessType(String rwAccessType) {
            return rwAccessType(Output.of(rwAccessType));
        }

        public AccessRuleState build() {
            return $;
        }
    }

}
