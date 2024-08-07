// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagsTag {
    /**
     * @return The ID of the tag.
     * 
     */
    private String id;
    /**
     * @return The ID of the tag.
     * 
     */
    private String tagId;
    /**
     * @return The name of the tag.
     * 
     */
    private String tagName;

    private GetTagsTag() {}
    /**
     * @return The ID of the tag.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the tag.
     * 
     */
    public String tagId() {
        return this.tagId;
    }
    /**
     * @return The name of the tag.
     * 
     */
    public String tagName() {
        return this.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagsTag defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String tagId;
        private String tagName;
        public Builder() {}
        public Builder(GetTagsTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.tagId = defaults.tagId;
    	      this.tagName = defaults.tagName;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetTagsTag", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder tagId(String tagId) {
            if (tagId == null) {
              throw new MissingRequiredPropertyException("GetTagsTag", "tagId");
            }
            this.tagId = tagId;
            return this;
        }
        @CustomType.Setter
        public Builder tagName(String tagName) {
            if (tagName == null) {
              throw new MissingRequiredPropertyException("GetTagsTag", "tagName");
            }
            this.tagName = tagName;
            return this;
        }
        public GetTagsTag build() {
            final var _resultValue = new GetTagsTag();
            _resultValue.id = id;
            _resultValue.tagId = tagId;
            _resultValue.tagName = tagName;
            return _resultValue;
        }
    }
}
