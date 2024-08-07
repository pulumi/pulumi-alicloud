// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeyVersionsVersion {
    /**
     * @return Date and time when the key version was created (UTC time).
     * 
     */
    private String createTime;
    /**
     * @return (Removed from v1.124.4) It has been removed and using `create_time` instead.
     * 
     */
    private String creationDate;
    /**
     * @return ID of the KMS KeyVersion resource.
     * 
     */
    private String id;
    /**
     * @return The id of kms key.
     * 
     */
    private String keyId;
    /**
     * @return ID of the key version.
     * 
     */
    private String keyVersionId;

    private GetKeyVersionsVersion() {}
    /**
     * @return Date and time when the key version was created (UTC time).
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return (Removed from v1.124.4) It has been removed and using `create_time` instead.
     * 
     */
    public String creationDate() {
        return this.creationDate;
    }
    /**
     * @return ID of the KMS KeyVersion resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The id of kms key.
     * 
     */
    public String keyId() {
        return this.keyId;
    }
    /**
     * @return ID of the key version.
     * 
     */
    public String keyVersionId() {
        return this.keyVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyVersionsVersion defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String creationDate;
        private String id;
        private String keyId;
        private String keyVersionId;
        public Builder() {}
        public Builder(GetKeyVersionsVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.creationDate = defaults.creationDate;
    	      this.id = defaults.id;
    	      this.keyId = defaults.keyId;
    	      this.keyVersionId = defaults.keyVersionId;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetKeyVersionsVersion", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder creationDate(String creationDate) {
            if (creationDate == null) {
              throw new MissingRequiredPropertyException("GetKeyVersionsVersion", "creationDate");
            }
            this.creationDate = creationDate;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetKeyVersionsVersion", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder keyId(String keyId) {
            if (keyId == null) {
              throw new MissingRequiredPropertyException("GetKeyVersionsVersion", "keyId");
            }
            this.keyId = keyId;
            return this;
        }
        @CustomType.Setter
        public Builder keyVersionId(String keyVersionId) {
            if (keyVersionId == null) {
              throw new MissingRequiredPropertyException("GetKeyVersionsVersion", "keyVersionId");
            }
            this.keyVersionId = keyVersionId;
            return this;
        }
        public GetKeyVersionsVersion build() {
            final var _resultValue = new GetKeyVersionsVersion();
            _resultValue.createTime = createTime;
            _resultValue.creationDate = creationDate;
            _resultValue.id = id;
            _resultValue.keyId = keyId;
            _resultValue.keyVersionId = keyVersionId;
            return _resultValue;
        }
    }
}
