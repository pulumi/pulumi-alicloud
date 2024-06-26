// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudsso.outputs;

import com.pulumi.alicloud.cloudsso.outputs.GetUsersUserMfaDevice;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUsersUser {
    /**
     * @return The create time of the user.
     * 
     */
    private String createTime;
    /**
     * @return The description of user.
     * 
     */
    private String description;
    /**
     * @return The ID of the Directory.
     * 
     */
    private String directoryId;
    /**
     * @return The display name of user.
     * 
     */
    private String displayName;
    /**
     * @return The User&#39;s Contact Email Address.
     * 
     */
    private String email;
    /**
     * @return The first name of user.
     * 
     */
    private String firstName;
    /**
     * @return The ID of the User.
     * 
     */
    private String id;
    /**
     * @return The last name of user.
     * 
     */
    private String lastName;
    /**
     * @return The List of MFA Device for User.
     * 
     */
    private List<GetUsersUserMfaDevice> mfaDevices;
    /**
     * @return ProvisionType.
     * 
     */
    private String provisionType;
    /**
     * @return User status. Valid values: `Enabled` and `Disabled`.
     * 
     */
    private String status;
    /**
     * @return The User ID of the group.
     * 
     */
    private String userId;
    /**
     * @return The name of user.
     * 
     */
    private String userName;

    private GetUsersUser() {}
    /**
     * @return The create time of the user.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of user.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The display name of user.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The User&#39;s Contact Email Address.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The first name of user.
     * 
     */
    public String firstName() {
        return this.firstName;
    }
    /**
     * @return The ID of the User.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The last name of user.
     * 
     */
    public String lastName() {
        return this.lastName;
    }
    /**
     * @return The List of MFA Device for User.
     * 
     */
    public List<GetUsersUserMfaDevice> mfaDevices() {
        return this.mfaDevices;
    }
    /**
     * @return ProvisionType.
     * 
     */
    public String provisionType() {
        return this.provisionType;
    }
    /**
     * @return User status. Valid values: `Enabled` and `Disabled`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The User ID of the group.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The name of user.
     * 
     */
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String directoryId;
        private String displayName;
        private String email;
        private String firstName;
        private String id;
        private String lastName;
        private List<GetUsersUserMfaDevice> mfaDevices;
        private String provisionType;
        private String status;
        private String userId;
        private String userName;
        public Builder() {}
        public Builder(GetUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.directoryId = defaults.directoryId;
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.id = defaults.id;
    	      this.lastName = defaults.lastName;
    	      this.mfaDevices = defaults.mfaDevices;
    	      this.provisionType = defaults.provisionType;
    	      this.status = defaults.status;
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            if (directoryId == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "directoryId");
            }
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            if (email == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "email");
            }
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            if (firstName == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "firstName");
            }
            this.firstName = firstName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            if (lastName == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "lastName");
            }
            this.lastName = lastName;
            return this;
        }
        @CustomType.Setter
        public Builder mfaDevices(List<GetUsersUserMfaDevice> mfaDevices) {
            if (mfaDevices == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "mfaDevices");
            }
            this.mfaDevices = mfaDevices;
            return this;
        }
        public Builder mfaDevices(GetUsersUserMfaDevice... mfaDevices) {
            return mfaDevices(List.of(mfaDevices));
        }
        @CustomType.Setter
        public Builder provisionType(String provisionType) {
            if (provisionType == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "provisionType");
            }
            this.provisionType = provisionType;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "userId");
            }
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            if (userName == null) {
              throw new MissingRequiredPropertyException("GetUsersUser", "userName");
            }
            this.userName = userName;
            return this;
        }
        public GetUsersUser build() {
            final var _resultValue = new GetUsersUser();
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.directoryId = directoryId;
            _resultValue.displayName = displayName;
            _resultValue.email = email;
            _resultValue.firstName = firstName;
            _resultValue.id = id;
            _resultValue.lastName = lastName;
            _resultValue.mfaDevices = mfaDevices;
            _resultValue.provisionType = provisionType;
            _resultValue.status = status;
            _resultValue.userId = userId;
            _resultValue.userName = userName;
            return _resultValue;
        }
    }
}
