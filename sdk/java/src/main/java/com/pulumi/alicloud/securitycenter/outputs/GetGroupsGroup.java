// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.securitycenter.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupsGroup {
    /**
     * @return GroupFlag, &#39;0&#39; mean default group(created by system), &#39;1&#39; means customer defined group.
     * 
     */
    private final Integer groupFlag;
    /**
     * @return The ID of Group.
     * 
     */
    private final String groupId;
    /**
     * @return The name of Group.
     * 
     */
    private final String groupName;
    /**
     * @return The ID of the Group(same as the group_id).
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetGroupsGroup(
        @CustomType.Parameter("groupFlag") Integer groupFlag,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("groupName") String groupName,
        @CustomType.Parameter("id") String id) {
        this.groupFlag = groupFlag;
        this.groupId = groupId;
        this.groupName = groupName;
        this.id = id;
    }

    /**
     * @return GroupFlag, &#39;0&#39; mean default group(created by system), &#39;1&#39; means customer defined group.
     * 
     */
    public Integer groupFlag() {
        return this.groupFlag;
    }
    /**
     * @return The ID of Group.
     * 
     */
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The name of Group.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The ID of the Group(same as the group_id).
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer groupFlag;
        private String groupId;
        private String groupName;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupFlag = defaults.groupFlag;
    	      this.groupId = defaults.groupId;
    	      this.groupName = defaults.groupName;
    	      this.id = defaults.id;
        }

        public Builder groupFlag(Integer groupFlag) {
            this.groupFlag = Objects.requireNonNull(groupFlag);
            return this;
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetGroupsGroup build() {
            return new GetGroupsGroup(groupFlag, groupId, groupName, id);
        }
    }
}