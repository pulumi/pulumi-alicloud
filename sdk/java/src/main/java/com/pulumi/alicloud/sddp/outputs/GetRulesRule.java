// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.sddp.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRulesRule {
    /**
     * @return Sensitive Data Identification Rules for the Type of. Valid values:
     * 
     */
    private Integer category;
    /**
     * @return Sensitive Data Identification Rules Belongs Type Name.
     * 
     */
    private String categoryName;
    /**
     * @return Sensitive Data Identification Rules the Content.
     * 
     */
    private String content;
    /**
     * @return The Content Classification.
     * 
     */
    private String contentCategory;
    /**
     * @return Sensitive Data Identification Rules the Creation Time of the Number of Milliseconds.
     * 
     */
    private String createTime;
    /**
     * @return Sensitive Data Identification Rules of Type. Valid values:
     * 
     */
    private Integer customType;
    /**
     * @return Sensitive Data Identification a Description of the Rule Information.
     * 
     */
    private String description;
    /**
     * @return Sensitive Data Identification Rules, Founder of Account Display Name.
     * 
     */
    private String displayName;
    /**
     * @return Sensitive Data Identification Rules to the Modified Time of the Number of Milliseconds.
     * 
     */
    private String gmtModified;
    /**
     * @return The ID of the Rule.
     * 
     */
    private String id;
    /**
     * @return Sensitive Data Identification Rules, Founder Of Account Login.
     * 
     */
    private String loginName;
    /**
     * @return The Primary Key.
     * 
     */
    private String majorKey;
    /**
     * @return The name of rule.
     * 
     */
    private String name;
    /**
     * @return Product Code.
     * 
     */
    private String productCode;
    /**
     * @return Product ID. Valid values:
     * 
     */
    private String productId;
    /**
     * @return Sensitive Data Identification Rules of Risk Level ID. Valid values:
     * 
     */
    private String riskLevelId;
    /**
     * @return Sensitive Data Identification Rules the Risk Level of. S1: Weak Risk Level S2: Moderate Risk Level S3: High Risk Level S4: the Highest Risk Level.
     * 
     */
    private String riskLevelName;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String ruleId;
    /**
     * @return Triggered the Alarm Conditions.
     * 
     */
    private String statExpress;
    /**
     * @return Sensitive Data Identification Rules Detection State of.
     * 
     */
    private Integer status;
    /**
     * @return The Target.
     * 
     */
    private String target;
    /**
     * @return The User ID.
     * 
     */
    private String userId;
    /**
     * @return The Level of Risk. Valid values:
     * 
     */
    private Integer warnLevel;

    private GetRulesRule() {}
    /**
     * @return Sensitive Data Identification Rules for the Type of. Valid values:
     * 
     */
    public Integer category() {
        return this.category;
    }
    /**
     * @return Sensitive Data Identification Rules Belongs Type Name.
     * 
     */
    public String categoryName() {
        return this.categoryName;
    }
    /**
     * @return Sensitive Data Identification Rules the Content.
     * 
     */
    public String content() {
        return this.content;
    }
    /**
     * @return The Content Classification.
     * 
     */
    public String contentCategory() {
        return this.contentCategory;
    }
    /**
     * @return Sensitive Data Identification Rules the Creation Time of the Number of Milliseconds.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Sensitive Data Identification Rules of Type. Valid values:
     * 
     */
    public Integer customType() {
        return this.customType;
    }
    /**
     * @return Sensitive Data Identification a Description of the Rule Information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Sensitive Data Identification Rules, Founder of Account Display Name.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Sensitive Data Identification Rules to the Modified Time of the Number of Milliseconds.
     * 
     */
    public String gmtModified() {
        return this.gmtModified;
    }
    /**
     * @return The ID of the Rule.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Sensitive Data Identification Rules, Founder Of Account Login.
     * 
     */
    public String loginName() {
        return this.loginName;
    }
    /**
     * @return The Primary Key.
     * 
     */
    public String majorKey() {
        return this.majorKey;
    }
    /**
     * @return The name of rule.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Product Code.
     * 
     */
    public String productCode() {
        return this.productCode;
    }
    /**
     * @return Product ID. Valid values:
     * 
     */
    public String productId() {
        return this.productId;
    }
    /**
     * @return Sensitive Data Identification Rules of Risk Level ID. Valid values:
     * 
     */
    public String riskLevelId() {
        return this.riskLevelId;
    }
    /**
     * @return Sensitive Data Identification Rules the Risk Level of. S1: Weak Risk Level S2: Moderate Risk Level S3: High Risk Level S4: the Highest Risk Level.
     * 
     */
    public String riskLevelName() {
        return this.riskLevelName;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String ruleId() {
        return this.ruleId;
    }
    /**
     * @return Triggered the Alarm Conditions.
     * 
     */
    public String statExpress() {
        return this.statExpress;
    }
    /**
     * @return Sensitive Data Identification Rules Detection State of.
     * 
     */
    public Integer status() {
        return this.status;
    }
    /**
     * @return The Target.
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The User ID.
     * 
     */
    public String userId() {
        return this.userId;
    }
    /**
     * @return The Level of Risk. Valid values:
     * 
     */
    public Integer warnLevel() {
        return this.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer category;
        private String categoryName;
        private String content;
        private String contentCategory;
        private String createTime;
        private Integer customType;
        private String description;
        private String displayName;
        private String gmtModified;
        private String id;
        private String loginName;
        private String majorKey;
        private String name;
        private String productCode;
        private String productId;
        private String riskLevelId;
        private String riskLevelName;
        private String ruleId;
        private String statExpress;
        private Integer status;
        private String target;
        private String userId;
        private Integer warnLevel;
        public Builder() {}
        public Builder(GetRulesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.categoryName = defaults.categoryName;
    	      this.content = defaults.content;
    	      this.contentCategory = defaults.contentCategory;
    	      this.createTime = defaults.createTime;
    	      this.customType = defaults.customType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.gmtModified = defaults.gmtModified;
    	      this.id = defaults.id;
    	      this.loginName = defaults.loginName;
    	      this.majorKey = defaults.majorKey;
    	      this.name = defaults.name;
    	      this.productCode = defaults.productCode;
    	      this.productId = defaults.productId;
    	      this.riskLevelId = defaults.riskLevelId;
    	      this.riskLevelName = defaults.riskLevelName;
    	      this.ruleId = defaults.ruleId;
    	      this.statExpress = defaults.statExpress;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
    	      this.userId = defaults.userId;
    	      this.warnLevel = defaults.warnLevel;
        }

        @CustomType.Setter
        public Builder category(Integer category) {
            if (category == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "category");
            }
            this.category = category;
            return this;
        }
        @CustomType.Setter
        public Builder categoryName(String categoryName) {
            if (categoryName == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "categoryName");
            }
            this.categoryName = categoryName;
            return this;
        }
        @CustomType.Setter
        public Builder content(String content) {
            if (content == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "content");
            }
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentCategory(String contentCategory) {
            if (contentCategory == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "contentCategory");
            }
            this.contentCategory = contentCategory;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder customType(Integer customType) {
            if (customType == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "customType");
            }
            this.customType = customType;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder gmtModified(String gmtModified) {
            if (gmtModified == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "gmtModified");
            }
            this.gmtModified = gmtModified;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder loginName(String loginName) {
            if (loginName == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "loginName");
            }
            this.loginName = loginName;
            return this;
        }
        @CustomType.Setter
        public Builder majorKey(String majorKey) {
            if (majorKey == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "majorKey");
            }
            this.majorKey = majorKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder productCode(String productCode) {
            if (productCode == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "productCode");
            }
            this.productCode = productCode;
            return this;
        }
        @CustomType.Setter
        public Builder productId(String productId) {
            if (productId == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "productId");
            }
            this.productId = productId;
            return this;
        }
        @CustomType.Setter
        public Builder riskLevelId(String riskLevelId) {
            if (riskLevelId == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "riskLevelId");
            }
            this.riskLevelId = riskLevelId;
            return this;
        }
        @CustomType.Setter
        public Builder riskLevelName(String riskLevelName) {
            if (riskLevelName == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "riskLevelName");
            }
            this.riskLevelName = riskLevelName;
            return this;
        }
        @CustomType.Setter
        public Builder ruleId(String ruleId) {
            if (ruleId == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "ruleId");
            }
            this.ruleId = ruleId;
            return this;
        }
        @CustomType.Setter
        public Builder statExpress(String statExpress) {
            if (statExpress == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "statExpress");
            }
            this.statExpress = statExpress;
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder target(String target) {
            if (target == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "target");
            }
            this.target = target;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "userId");
            }
            this.userId = userId;
            return this;
        }
        @CustomType.Setter
        public Builder warnLevel(Integer warnLevel) {
            if (warnLevel == null) {
              throw new MissingRequiredPropertyException("GetRulesRule", "warnLevel");
            }
            this.warnLevel = warnLevel;
            return this;
        }
        public GetRulesRule build() {
            final var _resultValue = new GetRulesRule();
            _resultValue.category = category;
            _resultValue.categoryName = categoryName;
            _resultValue.content = content;
            _resultValue.contentCategory = contentCategory;
            _resultValue.createTime = createTime;
            _resultValue.customType = customType;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.gmtModified = gmtModified;
            _resultValue.id = id;
            _resultValue.loginName = loginName;
            _resultValue.majorKey = majorKey;
            _resultValue.name = name;
            _resultValue.productCode = productCode;
            _resultValue.productId = productId;
            _resultValue.riskLevelId = riskLevelId;
            _resultValue.riskLevelName = riskLevelName;
            _resultValue.ruleId = ruleId;
            _resultValue.statExpress = statExpress;
            _resultValue.status = status;
            _resultValue.target = target;
            _resultValue.userId = userId;
            _resultValue.warnLevel = warnLevel;
            return _resultValue;
        }
    }
}
