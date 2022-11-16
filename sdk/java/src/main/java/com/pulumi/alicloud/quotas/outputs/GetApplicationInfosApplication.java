// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quotas.outputs;

import com.pulumi.alicloud.quotas.outputs.GetApplicationInfosApplicationDimension;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetApplicationInfosApplication {
    private final String applicationId;
    private final String approveValue;
    private final String auditReason;
    private final Double desireValue;
    private final List<GetApplicationInfosApplicationDimension> dimensions;
    private final String effectiveTime;
    private final String expireTime;
    private final String id;
    private final Integer noticeType;
    private final String productCode;
    private final String quotaActionCode;
    private final String quotaDescription;
    private final String quotaName;
    private final String quotaUnit;
    private final String reason;
    private final String status;

    @CustomType.Constructor
    private GetApplicationInfosApplication(
        @CustomType.Parameter("applicationId") String applicationId,
        @CustomType.Parameter("approveValue") String approveValue,
        @CustomType.Parameter("auditReason") String auditReason,
        @CustomType.Parameter("desireValue") Double desireValue,
        @CustomType.Parameter("dimensions") List<GetApplicationInfosApplicationDimension> dimensions,
        @CustomType.Parameter("effectiveTime") String effectiveTime,
        @CustomType.Parameter("expireTime") String expireTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("noticeType") Integer noticeType,
        @CustomType.Parameter("productCode") String productCode,
        @CustomType.Parameter("quotaActionCode") String quotaActionCode,
        @CustomType.Parameter("quotaDescription") String quotaDescription,
        @CustomType.Parameter("quotaName") String quotaName,
        @CustomType.Parameter("quotaUnit") String quotaUnit,
        @CustomType.Parameter("reason") String reason,
        @CustomType.Parameter("status") String status) {
        this.applicationId = applicationId;
        this.approveValue = approveValue;
        this.auditReason = auditReason;
        this.desireValue = desireValue;
        this.dimensions = dimensions;
        this.effectiveTime = effectiveTime;
        this.expireTime = expireTime;
        this.id = id;
        this.noticeType = noticeType;
        this.productCode = productCode;
        this.quotaActionCode = quotaActionCode;
        this.quotaDescription = quotaDescription;
        this.quotaName = quotaName;
        this.quotaUnit = quotaUnit;
        this.reason = reason;
        this.status = status;
    }

    public String applicationId() {
        return this.applicationId;
    }
    public String approveValue() {
        return this.approveValue;
    }
    public String auditReason() {
        return this.auditReason;
    }
    public Double desireValue() {
        return this.desireValue;
    }
    public List<GetApplicationInfosApplicationDimension> dimensions() {
        return this.dimensions;
    }
    public String effectiveTime() {
        return this.effectiveTime;
    }
    public String expireTime() {
        return this.expireTime;
    }
    public String id() {
        return this.id;
    }
    public Integer noticeType() {
        return this.noticeType;
    }
    public String productCode() {
        return this.productCode;
    }
    public String quotaActionCode() {
        return this.quotaActionCode;
    }
    public String quotaDescription() {
        return this.quotaDescription;
    }
    public String quotaName() {
        return this.quotaName;
    }
    public String quotaUnit() {
        return this.quotaUnit;
    }
    public String reason() {
        return this.reason;
    }
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApplicationInfosApplication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;
        private String approveValue;
        private String auditReason;
        private Double desireValue;
        private List<GetApplicationInfosApplicationDimension> dimensions;
        private String effectiveTime;
        private String expireTime;
        private String id;
        private Integer noticeType;
        private String productCode;
        private String quotaActionCode;
        private String quotaDescription;
        private String quotaName;
        private String quotaUnit;
        private String reason;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApplicationInfosApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.approveValue = defaults.approveValue;
    	      this.auditReason = defaults.auditReason;
    	      this.desireValue = defaults.desireValue;
    	      this.dimensions = defaults.dimensions;
    	      this.effectiveTime = defaults.effectiveTime;
    	      this.expireTime = defaults.expireTime;
    	      this.id = defaults.id;
    	      this.noticeType = defaults.noticeType;
    	      this.productCode = defaults.productCode;
    	      this.quotaActionCode = defaults.quotaActionCode;
    	      this.quotaDescription = defaults.quotaDescription;
    	      this.quotaName = defaults.quotaName;
    	      this.quotaUnit = defaults.quotaUnit;
    	      this.reason = defaults.reason;
    	      this.status = defaults.status;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder approveValue(String approveValue) {
            this.approveValue = Objects.requireNonNull(approveValue);
            return this;
        }
        public Builder auditReason(String auditReason) {
            this.auditReason = Objects.requireNonNull(auditReason);
            return this;
        }
        public Builder desireValue(Double desireValue) {
            this.desireValue = Objects.requireNonNull(desireValue);
            return this;
        }
        public Builder dimensions(List<GetApplicationInfosApplicationDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(GetApplicationInfosApplicationDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = Objects.requireNonNull(effectiveTime);
            return this;
        }
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder noticeType(Integer noticeType) {
            this.noticeType = Objects.requireNonNull(noticeType);
            return this;
        }
        public Builder productCode(String productCode) {
            this.productCode = Objects.requireNonNull(productCode);
            return this;
        }
        public Builder quotaActionCode(String quotaActionCode) {
            this.quotaActionCode = Objects.requireNonNull(quotaActionCode);
            return this;
        }
        public Builder quotaDescription(String quotaDescription) {
            this.quotaDescription = Objects.requireNonNull(quotaDescription);
            return this;
        }
        public Builder quotaName(String quotaName) {
            this.quotaName = Objects.requireNonNull(quotaName);
            return this;
        }
        public Builder quotaUnit(String quotaUnit) {
            this.quotaUnit = Objects.requireNonNull(quotaUnit);
            return this;
        }
        public Builder reason(String reason) {
            this.reason = Objects.requireNonNull(reason);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetApplicationInfosApplication build() {
            return new GetApplicationInfosApplication(applicationId, approveValue, auditReason, desireValue, dimensions, effectiveTime, expireTime, id, noticeType, productCode, quotaActionCode, quotaDescription, quotaName, quotaUnit, reason, status);
        }
    }
}