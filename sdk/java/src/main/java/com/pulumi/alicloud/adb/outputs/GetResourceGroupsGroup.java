// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceGroupsGroup {
    /**
     * @return Creation time.
     * 
     */
    private String createTime;
    /**
     * @return DBClusterId
     * 
     */
    private String dbClusterId;
    /**
     * @return The name of the resource pool, which cannot exceed 64 bytes in length.
     * 
     */
    private String groupName;
    /**
     * @return Query type, value description:
     * * **etl**: Batch query mode.
     * * **interactive**: interactive Query mode
     * * **default_type**: the default query mode.
     * 
     */
    private String groupType;
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;db_cluster_id&gt;:&lt;group_name&gt;`.
     * 
     */
    private String id;
    /**
     * @return The number of nodes. The default number of nodes is 0. The number of nodes must be less than or equal to the number of nodes whose resource name is USER_DEFAULT.
     * 
     */
    private Integer nodeNum;
    /**
     * @return Binding User.
     * 
     */
    private String user;

    private GetResourceGroupsGroup() {}
    /**
     * @return Creation time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return DBClusterId
     * 
     */
    public String dbClusterId() {
        return this.dbClusterId;
    }
    /**
     * @return The name of the resource pool, which cannot exceed 64 bytes in length.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return Query type, value description:
     * * **etl**: Batch query mode.
     * * **interactive**: interactive Query mode
     * * **default_type**: the default query mode.
     * 
     */
    public String groupType() {
        return this.groupType;
    }
    /**
     * @return The `key` of the resource supplied above.The value is formulated as `&lt;db_cluster_id&gt;:&lt;group_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The number of nodes. The default number of nodes is 0. The number of nodes must be less than or equal to the number of nodes whose resource name is USER_DEFAULT.
     * 
     */
    public Integer nodeNum() {
        return this.nodeNum;
    }
    /**
     * @return Binding User.
     * 
     */
    public String user() {
        return this.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupsGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String dbClusterId;
        private String groupName;
        private String groupType;
        private String id;
        private Integer nodeNum;
        private String user;
        public Builder() {}
        public Builder(GetResourceGroupsGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.dbClusterId = defaults.dbClusterId;
    	      this.groupName = defaults.groupName;
    	      this.groupType = defaults.groupType;
    	      this.id = defaults.id;
    	      this.nodeNum = defaults.nodeNum;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder dbClusterId(String dbClusterId) {
            if (dbClusterId == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "dbClusterId");
            }
            this.dbClusterId = dbClusterId;
            return this;
        }
        @CustomType.Setter
        public Builder groupName(String groupName) {
            if (groupName == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "groupName");
            }
            this.groupName = groupName;
            return this;
        }
        @CustomType.Setter
        public Builder groupType(String groupType) {
            if (groupType == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "groupType");
            }
            this.groupType = groupType;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder nodeNum(Integer nodeNum) {
            if (nodeNum == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "nodeNum");
            }
            this.nodeNum = nodeNum;
            return this;
        }
        @CustomType.Setter
        public Builder user(String user) {
            if (user == null) {
              throw new MissingRequiredPropertyException("GetResourceGroupsGroup", "user");
            }
            this.user = user;
            return this;
        }
        public GetResourceGroupsGroup build() {
            final var _resultValue = new GetResourceGroupsGroup();
            _resultValue.createTime = createTime;
            _resultValue.dbClusterId = dbClusterId;
            _resultValue.groupName = groupName;
            _resultValue.groupType = groupType;
            _resultValue.id = id;
            _resultValue.nodeNum = nodeNum;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
