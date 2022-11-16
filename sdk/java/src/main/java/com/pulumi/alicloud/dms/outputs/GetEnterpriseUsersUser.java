// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnterpriseUsersUser {
    /**
     * @return The Alibaba Cloud unique ID (UID) of the user.
     * 
     */
    private final String id;
    /**
     * @return The DingTalk number or mobile number of the user.
     * 
     */
    private final String mobile;
    /**
     * @return The nickname of the user.
     * 
     */
    private final String nickName;
    /**
     * @return The Alibaba Cloud unique ID (UID) of the parent account if the user corresponds to a Resource Access Management (RAM) user.
     * 
     */
    private final Integer parentUid;
    /**
     * @return The list ids of the role that the user plays.
     * 
     */
    private final List<Integer> roleIds;
    /**
     * @return The list names of the role that he user plays.
     * 
     */
    private final List<String> roleNames;
    /**
     * @return The status of the user.
     * 
     */
    private final String status;
    private final String uid;
    /**
     * @return The ID of the user.
     * 
     */
    private final String userId;
    /**
     * @return The nickname of the user.
     * 
     */
    private final String userName;

    @CustomType.Constructor
    private GetEnterpriseUsersUser(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("mobile") String mobile,
        @CustomType.Parameter("nickName") String nickName,
        @CustomType.Parameter("parentUid") Integer parentUid,
        @CustomType.Parameter("roleIds") List<Integer> roleIds,
        @CustomType.Parameter("roleNames") List<String> roleNames,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("uid") String uid,
        @CustomType.Parameter("userId") String userId,
        @CustomType.Parameter("userName") String userName) {
        this.id = id;
        this.mobile = mobile;
        this.nickName = nickName;
        this.parentUid = parentUid;
        this.roleIds = roleIds;
        this.roleNames = roleNames;
        this.status = status;
        this.uid = uid;
        this.userId = userId;
        this.userName = userName;
    }

    /**
     * @return The Alibaba Cloud unique ID (UID) of the user.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The DingTalk number or mobile number of the user.
     * 
     */
    public String mobile() {
        return this.mobile;
    }
    /**
     * @return The nickname of the user.
     * 
     */
    public String nickName() {
        return this.nickName;
    }
    /**
     * @return The Alibaba Cloud unique ID (UID) of the parent account if the user corresponds to a Resource Access Management (RAM) user.
     * 
     */
    public Integer parentUid() {
        return this.parentUid;
    }
    /**
     * @return The list ids of the role that the user plays.
     * 
     */
    public List<Integer> roleIds() {
        return this.roleIds;
    }
    /**
     * @return The list names of the role that he user plays.
     * 
     */
    public List<String> roleNames() {
        return this.roleNames;
    }
    /**
     * @return The status of the user.
     * 
     */
    public String status() {
        return this.status;
    }
    public String uid() {
        return this.uid;
    }
    /**
     * @return The ID of the user.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The nickname of the user.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnterpriseUsersUser defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String mobile;
        private String nickName;
        private Integer parentUid;
        private List<Integer> roleIds;
        private List<String> roleNames;
        private String status;
        private String uid;
        private String userId;
        private String userName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnterpriseUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.mobile = defaults.mobile;
    	      this.nickName = defaults.nickName;
    	      this.parentUid = defaults.parentUid;
    	      this.roleIds = defaults.roleIds;
    	      this.roleNames = defaults.roleNames;
    	      this.status = defaults.status;
    	      this.uid = defaults.uid;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder mobile(String mobile) {
            this.mobile = Objects.requireNonNull(mobile);
            return this;
        }
        public Builder nickName(String nickName) {
            this.nickName = Objects.requireNonNull(nickName);
            return this;
        }
        public Builder parentUid(Integer parentUid) {
            this.parentUid = Objects.requireNonNull(parentUid);
            return this;
        }
        public Builder roleIds(List<Integer> roleIds) {
            this.roleIds = Objects.requireNonNull(roleIds);
            return this;
        }
        public Builder roleIds(Integer... roleIds) {
            return roleIds(List.of(roleIds));
        }
        public Builder roleNames(List<String> roleNames) {
            this.roleNames = Objects.requireNonNull(roleNames);
            return this;
        }
        public Builder roleNames(String... roleNames) {
            return roleNames(List.of(roleNames));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }        public GetEnterpriseUsersUser build() {
            return new GetEnterpriseUsersUser(id, mobile, nickName, parentUid, roleIds, roleNames, status, uid, userId, userName);
        }
    }
}