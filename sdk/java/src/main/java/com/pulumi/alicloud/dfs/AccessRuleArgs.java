// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dfs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleArgs Empty = new AccessRuleArgs();

    /**
     * Permission group resource ID. You must specify the permission group ID when creating a permission rule.
     * 
     */
    @Import(name="accessGroupId", required=true)
    private Output<String> accessGroupId;

    /**
     * @return Permission group resource ID. You must specify the permission group ID when creating a permission rule.
     * 
     */
    public Output<String> accessGroupId() {
        return this.accessGroupId;
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
    @Import(name="networkSegment", required=true)
    private Output<String> networkSegment;

    /**
     * @return The IP address or network segment of the authorized object.
     * 
     */
    public Output<String> networkSegment() {
        return this.networkSegment;
    }

    /**
     * Permission rule priority. When the same authorization object matches multiple rules, the high-priority rule takes effect. Value range: 1~100,1 is the highest priority.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    /**
     * @return Permission rule priority. When the same authorization object matches multiple rules, the high-priority rule takes effect. Value range: 1~100,1 is the highest priority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * The read and write permissions of the authorized object on the file system. Value: RDWR: readable and writable RDONLY: Read only.
     * 
     */
    @Import(name="rwAccessType", required=true)
    private Output<String> rwAccessType;

    /**
     * @return The read and write permissions of the authorized object on the file system. Value: RDWR: readable and writable RDONLY: Read only.
     * 
     */
    public Output<String> rwAccessType() {
        return this.rwAccessType;
    }

    private AccessRuleArgs() {}

    private AccessRuleArgs(AccessRuleArgs $) {
        this.accessGroupId = $.accessGroupId;
        this.description = $.description;
        this.networkSegment = $.networkSegment;
        this.priority = $.priority;
        this.rwAccessType = $.rwAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleArgs $;

        public Builder() {
            $ = new AccessRuleArgs();
        }

        public Builder(AccessRuleArgs defaults) {
            $ = new AccessRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupId Permission group resource ID. You must specify the permission group ID when creating a permission rule.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupId(Output<String> accessGroupId) {
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
        public Builder networkSegment(Output<String> networkSegment) {
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
        public Builder priority(Output<Integer> priority) {
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
        public Builder rwAccessType(Output<String> rwAccessType) {
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

        public AccessRuleArgs build() {
            if ($.accessGroupId == null) {
                throw new MissingRequiredPropertyException("AccessRuleArgs", "accessGroupId");
            }
            if ($.networkSegment == null) {
                throw new MissingRequiredPropertyException("AccessRuleArgs", "networkSegment");
            }
            if ($.priority == null) {
                throw new MissingRequiredPropertyException("AccessRuleArgs", "priority");
            }
            if ($.rwAccessType == null) {
                throw new MissingRequiredPropertyException("AccessRuleArgs", "rwAccessType");
            }
            return $;
        }
    }

}