// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDynamicTagGroupsGroupMatchExpress {
    /**
     * @return The tag value. The Tag value must be used in conjunction with the tag value matching method TagValueMatchFunction.
     * 
     */
    private String tagValue;
    /**
     * @return Matching method of tag value. Valid values: `all`, `startWith`,`endWith`,`contains`,`notContains`,`equals`.
     * 
     */
    private String tagValueMatchFunction;

    private GetDynamicTagGroupsGroupMatchExpress() {}
    /**
     * @return The tag value. The Tag value must be used in conjunction with the tag value matching method TagValueMatchFunction.
     * 
     */
    public String tagValue() {
        return this.tagValue;
    }
    /**
     * @return Matching method of tag value. Valid values: `all`, `startWith`,`endWith`,`contains`,`notContains`,`equals`.
     * 
     */
    public String tagValueMatchFunction() {
        return this.tagValueMatchFunction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDynamicTagGroupsGroupMatchExpress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tagValue;
        private String tagValueMatchFunction;
        public Builder() {}
        public Builder(GetDynamicTagGroupsGroupMatchExpress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tagValue = defaults.tagValue;
    	      this.tagValueMatchFunction = defaults.tagValueMatchFunction;
        }

        @CustomType.Setter
        public Builder tagValue(String tagValue) {
            if (tagValue == null) {
              throw new MissingRequiredPropertyException("GetDynamicTagGroupsGroupMatchExpress", "tagValue");
            }
            this.tagValue = tagValue;
            return this;
        }
        @CustomType.Setter
        public Builder tagValueMatchFunction(String tagValueMatchFunction) {
            if (tagValueMatchFunction == null) {
              throw new MissingRequiredPropertyException("GetDynamicTagGroupsGroupMatchExpress", "tagValueMatchFunction");
            }
            this.tagValueMatchFunction = tagValueMatchFunction;
            return this;
        }
        public GetDynamicTagGroupsGroupMatchExpress build() {
            final var _resultValue = new GetDynamicTagGroupsGroupMatchExpress();
            _resultValue.tagValue = tagValue;
            _resultValue.tagValueMatchFunction = tagValueMatchFunction;
            return _resultValue;
        }
    }
}