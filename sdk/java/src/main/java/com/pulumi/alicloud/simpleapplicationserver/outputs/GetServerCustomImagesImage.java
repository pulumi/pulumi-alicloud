// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.simpleapplicationserver.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerCustomImagesImage {
    /**
     * @return The first ID of the resource.
     * 
     */
    private String customImageId;
    /**
     * @return The name of the resource.
     * 
     */
    private String customImageName;
    /**
     * @return Image description information.
     * 
     */
    private String description;
    /**
     * @return The ID of the Custom Image.
     * 
     */
    private String id;
    /**
     * @return The type of operating system used by the Mirror. Valid values: `Linux`, `Windows`.
     * 
     */
    private String platform;

    private GetServerCustomImagesImage() {}
    /**
     * @return The first ID of the resource.
     * 
     */
    public String customImageId() {
        return this.customImageId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String customImageName() {
        return this.customImageName;
    }
    /**
     * @return Image description information.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Custom Image.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The type of operating system used by the Mirror. Valid values: `Linux`, `Windows`.
     * 
     */
    public String platform() {
        return this.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerCustomImagesImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String customImageId;
        private String customImageName;
        private String description;
        private String id;
        private String platform;
        public Builder() {}
        public Builder(GetServerCustomImagesImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customImageId = defaults.customImageId;
    	      this.customImageName = defaults.customImageName;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.platform = defaults.platform;
        }

        @CustomType.Setter
        public Builder customImageId(String customImageId) {
            if (customImageId == null) {
              throw new MissingRequiredPropertyException("GetServerCustomImagesImage", "customImageId");
            }
            this.customImageId = customImageId;
            return this;
        }
        @CustomType.Setter
        public Builder customImageName(String customImageName) {
            if (customImageName == null) {
              throw new MissingRequiredPropertyException("GetServerCustomImagesImage", "customImageName");
            }
            this.customImageName = customImageName;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetServerCustomImagesImage", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServerCustomImagesImage", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder platform(String platform) {
            if (platform == null) {
              throw new MissingRequiredPropertyException("GetServerCustomImagesImage", "platform");
            }
            this.platform = platform;
            return this;
        }
        public GetServerCustomImagesImage build() {
            final var _resultValue = new GetServerCustomImagesImage();
            _resultValue.customImageId = customImageId;
            _resultValue.customImageName = customImageName;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.platform = platform;
            return _resultValue;
        }
    }
}